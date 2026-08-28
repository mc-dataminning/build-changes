package com.mojang.blaze3d.systems;

import com.google.common.collect.Queues;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fds
public class RenderSystem {
   static final Logger LOGGER = LogUtils.getLogger();
   private static final ConcurrentLinkedQueue<feu> recordingQueue = Queues.newConcurrentLinkedQueue();
   private static final fgn RENDER_THREAD_TESSELATOR = new fgn(1536);
   private static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
   @Nullable
   private static Thread renderThread;
   private static int MAX_SUPPORTED_TEXTURE_SIZE = -1;
   private static boolean isInInit;
   private static double lastDrawTime = Double.MIN_VALUE;
   private static final RenderSystem.a sharedSequential = new RenderSystem.a(1, 1, IntConsumer::accept);
   private static final RenderSystem.a sharedSequentialQuad = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1 + 0);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1 + 0);
   });
   private static final RenderSystem.a sharedSequentialLines = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1 + 0);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 1);
   });
   private static Matrix4f projectionMatrix = new Matrix4f();
   private static Matrix4f savedProjectionMatrix = new Matrix4f();
   private static fgt vertexSorting = fgt.a;
   private static fgt savedVertexSorting = fgt.a;
   private static final Matrix4fStack modelViewStack = new Matrix4fStack(16);
   private static Matrix4f textureMatrix = new Matrix4f();
   private static final int[] shaderTextures = new int[12];
   private static final float[] shaderColor = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private static float shaderGlintAlpha = 1.0F;
   private static gks shaderFog = gks.a;
   private static final Vector3f[] shaderLightDirections = new Vector3f[2];
   private static float shaderGameTime;
   private static float shaderLineWidth = 1.0F;
   private static String apiDescription = "Unknown";
   @Nullable
   private static gkn shader;
   private static final AtomicLong pollEventsWaitStart = new AtomicLong();
   private static final AtomicBoolean pollingEvents = new AtomicBoolean(false);

   public static void initRenderThread() {
      if (renderThread != null) {
         throw new IllegalStateException("Could not initialize render thread");
      } else {
         renderThread = Thread.currentThread();
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == renderThread;
   }

   public static boolean isOnRenderThreadOrInit() {
      return isInInit || isOnRenderThread();
   }

   public static void assertOnRenderThreadOrInit() {
      if (!isInInit && !isOnRenderThread()) {
         throw constructThreadException();
      }
   }

   public static void assertOnRenderThread() {
      if (!isOnRenderThread()) {
         throw constructThreadException();
      }
   }

   private static IllegalStateException constructThreadException() {
      return new IllegalStateException("Rendersystem called from wrong thread");
   }

   public static void recordRenderCall(feu $$0) {
      recordingQueue.add($$0);
   }

   private static void pollEvents() {
      pollEventsWaitStart.set(ae.c());
      pollingEvents.set(true);
      GLFW.glfwPollEvents();
      pollingEvents.set(false);
   }

   public static boolean isFrozenAtPollEvents() {
      return pollingEvents.get() && ae.c() - pollEventsWaitStart.get() > 200L;
   }

   public static void flipFrame(long $$0, @Nullable fdw $$1) {
      pollEvents();
      replayQueue();
      fgn.b().c();
      GLFW.glfwSwapBuffers($$0);
      if ($$1 != null) {
         $$1.b();
      }

      pollEvents();
   }

   public static void replayQueue() {
      while (!recordingQueue.isEmpty()) {
         feu $$0 = recordingQueue.poll();
         $$0.execute();
      }
   }

   public static void limitDisplayFPS(int $$0) {
      double $$1 = lastDrawTime + 1.0 / (double)$$0;

      double $$2;
      for ($$2 = GLFW.glfwGetTime(); $$2 < $$1; $$2 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout($$1 - $$2);
      }

      lastDrawTime = $$2;
   }

   public static void disableDepthTest() {
      assertOnRenderThread();
      GlStateManager._disableDepthTest();
   }

   public static void enableDepthTest() {
      GlStateManager._enableDepthTest();
   }

   public static void enableScissor(int $$0, int $$1, int $$2, int $$3) {
      GlStateManager._enableScissorTest();
      GlStateManager._scissorBox($$0, $$1, $$2, $$3);
   }

   public static void disableScissor() {
      GlStateManager._disableScissorTest();
   }

   public static void depthFunc(int $$0) {
      assertOnRenderThread();
      GlStateManager._depthFunc($$0);
   }

   public static void depthMask(boolean $$0) {
      assertOnRenderThread();
      GlStateManager._depthMask($$0);
   }

   public static void enableBlend() {
      assertOnRenderThread();
      GlStateManager._enableBlend();
   }

   public static void disableBlend() {
      assertOnRenderThread();
      GlStateManager._disableBlend();
   }

   public static void blendFunc(GlStateManager.SourceFactor $$0, GlStateManager.DestFactor $$1) {
      assertOnRenderThread();
      GlStateManager._blendFunc($$0.value, $$1.value);
   }

   public static void blendFunc(int $$0, int $$1) {
      assertOnRenderThread();
      GlStateManager._blendFunc($$0, $$1);
   }

   public static void blendFuncSeparate(
      GlStateManager.SourceFactor $$0, GlStateManager.DestFactor $$1, GlStateManager.SourceFactor $$2, GlStateManager.DestFactor $$3
   ) {
      assertOnRenderThread();
      GlStateManager._blendFuncSeparate($$0.value, $$1.value, $$2.value, $$3.value);
   }

   public static void blendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
      assertOnRenderThread();
      GlStateManager._blendFuncSeparate($$0, $$1, $$2, $$3);
   }

   public static void blendEquation(int $$0) {
      assertOnRenderThread();
      GlStateManager._blendEquation($$0);
   }

   public static void enableCull() {
      assertOnRenderThread();
      GlStateManager._enableCull();
   }

   public static void disableCull() {
      assertOnRenderThread();
      GlStateManager._disableCull();
   }

   public static void polygonMode(int $$0, int $$1) {
      assertOnRenderThread();
      GlStateManager._polygonMode($$0, $$1);
   }

   public static void enablePolygonOffset() {
      assertOnRenderThread();
      GlStateManager._enablePolygonOffset();
   }

   public static void disablePolygonOffset() {
      assertOnRenderThread();
      GlStateManager._disablePolygonOffset();
   }

   public static void polygonOffset(float $$0, float $$1) {
      assertOnRenderThread();
      GlStateManager._polygonOffset($$0, $$1);
   }

   public static void enableColorLogicOp() {
      assertOnRenderThread();
      GlStateManager._enableColorLogicOp();
   }

   public static void disableColorLogicOp() {
      assertOnRenderThread();
      GlStateManager._disableColorLogicOp();
   }

   public static void logicOp(GlStateManager.h $$0) {
      assertOnRenderThread();
      GlStateManager._logicOp($$0.q);
   }

   public static void activeTexture(int $$0) {
      assertOnRenderThread();
      GlStateManager._activeTexture($$0);
   }

   public static void texParameter(int $$0, int $$1, int $$2) {
      GlStateManager._texParameter($$0, $$1, $$2);
   }

   public static void deleteTexture(int $$0) {
      GlStateManager._deleteTexture($$0);
   }

   public static void bindTextureForSetup(int $$0) {
      bindTexture($$0);
   }

   public static void bindTexture(int $$0) {
      GlStateManager._bindTexture($$0);
   }

   public static void viewport(int $$0, int $$1, int $$2, int $$3) {
      GlStateManager._viewport($$0, $$1, $$2, $$3);
   }

   public static void colorMask(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      assertOnRenderThread();
      GlStateManager._colorMask($$0, $$1, $$2, $$3);
   }

   public static void stencilFunc(int $$0, int $$1, int $$2) {
      assertOnRenderThread();
      GlStateManager._stencilFunc($$0, $$1, $$2);
   }

   public static void stencilMask(int $$0) {
      assertOnRenderThread();
      GlStateManager._stencilMask($$0);
   }

   public static void stencilOp(int $$0, int $$1, int $$2) {
      assertOnRenderThread();
      GlStateManager._stencilOp($$0, $$1, $$2);
   }

   public static void clearDepth(double $$0) {
      GlStateManager._clearDepth($$0);
   }

   public static void clearColor(float $$0, float $$1, float $$2, float $$3) {
      GlStateManager._clearColor($$0, $$1, $$2, $$3);
   }

   public static void clearStencil(int $$0) {
      assertOnRenderThread();
      GlStateManager._clearStencil($$0);
   }

   public static void clear(int $$0) {
      GlStateManager._clear($$0);
   }

   public static void setShaderFog(gks $$0) {
      assertOnRenderThread();
      shaderFog = $$0;
   }

   public static gks getShaderFog() {
      assertOnRenderThread();
      return shaderFog;
   }

   public static void setShaderGlintAlpha(double $$0) {
      setShaderGlintAlpha((float)$$0);
   }

   public static void setShaderGlintAlpha(float $$0) {
      assertOnRenderThread();
      shaderGlintAlpha = $$0;
   }

   public static float getShaderGlintAlpha() {
      assertOnRenderThread();
      return shaderGlintAlpha;
   }

   public static void setShaderLights(Vector3f $$0, Vector3f $$1) {
      assertOnRenderThread();
      shaderLightDirections[0] = $$0;
      shaderLightDirections[1] = $$1;
   }

   public static void setupShaderLights(gkn $$0) {
      assertOnRenderThread();
      if ($$0.f != null) {
         $$0.f.a(shaderLightDirections[0]);
      }

      if ($$0.g != null) {
         $$0.g.a(shaderLightDirections[1]);
      }
   }

   public static void setShaderColor(float $$0, float $$1, float $$2, float $$3) {
      assertOnRenderThread();
      shaderColor[0] = $$0;
      shaderColor[1] = $$1;
      shaderColor[2] = $$2;
      shaderColor[3] = $$3;
   }

   public static float[] getShaderColor() {
      assertOnRenderThread();
      return shaderColor;
   }

   public static void drawElements(int $$0, int $$1, int $$2) {
      assertOnRenderThread();
      GlStateManager._drawElements($$0, $$1, $$2, 0L);
   }

   public static void lineWidth(float $$0) {
      assertOnRenderThread();
      shaderLineWidth = $$0;
   }

   public static float getShaderLineWidth() {
      assertOnRenderThread();
      return shaderLineWidth;
   }

   public static void pixelStore(int $$0, int $$1) {
      GlStateManager._pixelStore($$0, $$1);
   }

   public static void readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, ByteBuffer $$6) {
      assertOnRenderThread();
      GlStateManager._readPixels($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static void getString(int $$0, Consumer<String> $$1) {
      assertOnRenderThread();
      $$1.accept(GlStateManager._getString($$0));
   }

   public static String getBackendDescription() {
      return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
   }

   public static String getApiDescription() {
      return apiDescription;
   }

   public static bbf.a initBackendSystem() {
      return GLX._initGlfw()::getAsLong;
   }

   public static void initRenderer(int $$0, boolean $$1) {
      GLX._init($$0, $$1);
      apiDescription = GLX.getOpenGLVersionString();
   }

   public static void setErrorCallback(GLFWErrorCallbackI $$0) {
      GLX._setGlfwErrorCallback($$0);
   }

   public static void renderCrosshair(int $$0) {
      assertOnRenderThread();
      GLX._renderCrosshair($$0, true, true, true);
   }

   public static String getCapsString() {
      assertOnRenderThread();
      return "Using framebuffer using OpenGL 3.2";
   }

   public static void setupDefaultState(int $$0, int $$1, int $$2, int $$3) {
      GlStateManager._clearDepth(1.0);
      GlStateManager._enableDepthTest();
      GlStateManager._depthFunc(515);
      projectionMatrix.identity();
      savedProjectionMatrix.identity();
      modelViewStack.clear();
      textureMatrix.identity();
      GlStateManager._viewport($$0, $$1, $$2, $$3);
   }

   public static int maxSupportedTextureSize() {
      if (MAX_SUPPORTED_TEXTURE_SIZE == -1) {
         assertOnRenderThreadOrInit();
         int $$0 = GlStateManager._getInteger(3379);

         for (int $$1 = Math.max(32768, $$0); $$1 >= 1024; $$1 >>= 1) {
            GlStateManager._texImage2D(32868, 0, 6408, $$1, $$1, 0, 6408, 5121, null);
            int $$2 = GlStateManager._getTexLevelParameter(32868, 0, 4096);
            if ($$2 != 0) {
               MAX_SUPPORTED_TEXTURE_SIZE = $$1;
               return $$1;
            }
         }

         MAX_SUPPORTED_TEXTURE_SIZE = Math.max($$0, 1024);
         LOGGER.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", MAX_SUPPORTED_TEXTURE_SIZE);
      }

      return MAX_SUPPORTED_TEXTURE_SIZE;
   }

   public static void glBindBuffer(int $$0, int $$1) {
      GlStateManager._glBindBuffer($$0, $$1);
   }

   public static void glBindVertexArray(int $$0) {
      GlStateManager._glBindVertexArray($$0);
   }

   public static void glBufferData(int $$0, ByteBuffer $$1, int $$2) {
      assertOnRenderThreadOrInit();
      GlStateManager._glBufferData($$0, $$1, $$2);
   }

   public static void glDeleteBuffers(int $$0) {
      assertOnRenderThread();
      GlStateManager._glDeleteBuffers($$0);
   }

   public static void glDeleteVertexArrays(int $$0) {
      assertOnRenderThread();
      GlStateManager._glDeleteVertexArrays($$0);
   }

   public static void glUniform1i(int $$0, int $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform1i($$0, $$1);
   }

   public static void glUniform1(int $$0, IntBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform1($$0, $$1);
   }

   public static void glUniform2(int $$0, IntBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform2($$0, $$1);
   }

   public static void glUniform3(int $$0, IntBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform3($$0, $$1);
   }

   public static void glUniform4(int $$0, IntBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform4($$0, $$1);
   }

   public static void glUniform1(int $$0, FloatBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform1($$0, $$1);
   }

   public static void glUniform2(int $$0, FloatBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform2($$0, $$1);
   }

   public static void glUniform3(int $$0, FloatBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform3($$0, $$1);
   }

   public static void glUniform4(int $$0, FloatBuffer $$1) {
      assertOnRenderThread();
      GlStateManager._glUniform4($$0, $$1);
   }

   public static void glUniformMatrix2(int $$0, boolean $$1, FloatBuffer $$2) {
      assertOnRenderThread();
      GlStateManager._glUniformMatrix2($$0, $$1, $$2);
   }

   public static void glUniformMatrix3(int $$0, boolean $$1, FloatBuffer $$2) {
      assertOnRenderThread();
      GlStateManager._glUniformMatrix3($$0, $$1, $$2);
   }

   public static void glUniformMatrix4(int $$0, boolean $$1, FloatBuffer $$2) {
      assertOnRenderThread();
      GlStateManager._glUniformMatrix4($$0, $$1, $$2);
   }

   public static void setupOverlayColor(int $$0, int $$1) {
      assertOnRenderThread();
      setShaderTexture(1, $$0);
   }

   public static void teardownOverlayColor() {
      assertOnRenderThread();
      setShaderTexture(1, 0);
   }

   public static void setupLevelDiffuseLighting(Vector3f $$0, Vector3f $$1) {
      assertOnRenderThread();
      setShaderLights($$0, $$1);
   }

   public static void setupGuiFlatDiffuseLighting(Vector3f $$0, Vector3f $$1) {
      assertOnRenderThread();
      GlStateManager.setupGuiFlatDiffuseLighting($$0, $$1);
   }

   public static void setupGui3DDiffuseLighting(Vector3f $$0, Vector3f $$1) {
      assertOnRenderThread();
      GlStateManager.setupGui3DDiffuseLighting($$0, $$1);
   }

   public static void beginInitialization() {
      isInInit = true;
   }

   public static void finishInitialization() {
      isInInit = false;
      if (!recordingQueue.isEmpty()) {
         replayQueue();
      }

      if (!recordingQueue.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   public static fgn renderThreadTesselator() {
      assertOnRenderThread();
      return RENDER_THREAD_TESSELATOR;
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(
         GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
   }

   public static void overlayBlendFunc() {
      blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
   }

   @Nullable
   public static gkn setShader(glw $$0) {
      assertOnRenderThread();
      gkn $$1 = flz.Q().ab().a($$0);
      shader = $$1;
      return $$1;
   }

   public static void setShader(gkn $$0) {
      assertOnRenderThread();
      shader = $$0;
   }

   public static void clearShader() {
      assertOnRenderThread();
      shader = null;
   }

   @Nullable
   public static gkn getShader() {
      assertOnRenderThread();
      return shader;
   }

   public static void setShaderTexture(int $$0, alz $$1) {
      assertOnRenderThread();
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         hbf $$2 = flz.Q().aa();
         hap $$3 = $$2.a($$1);
         shaderTextures[$$0] = $$3.a();
      }
   }

   public static void setShaderTexture(int $$0, int $$1) {
      assertOnRenderThread();
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         shaderTextures[$$0] = $$1;
      }
   }

   public static int getShaderTexture(int $$0) {
      assertOnRenderThread();
      return $$0 >= 0 && $$0 < shaderTextures.length ? shaderTextures[$$0] : 0;
   }

   public static void setProjectionMatrix(Matrix4f $$0, fgt $$1) {
      assertOnRenderThread();
      projectionMatrix = new Matrix4f($$0);
      vertexSorting = $$1;
   }

   public static void setTextureMatrix(Matrix4f $$0) {
      assertOnRenderThread();
      textureMatrix = new Matrix4f($$0);
   }

   public static void resetTextureMatrix() {
      assertOnRenderThread();
      textureMatrix.identity();
   }

   public static void backupProjectionMatrix() {
      assertOnRenderThread();
      savedProjectionMatrix = projectionMatrix;
      savedVertexSorting = vertexSorting;
   }

   public static void restoreProjectionMatrix() {
      assertOnRenderThread();
      projectionMatrix = savedProjectionMatrix;
      vertexSorting = savedVertexSorting;
   }

   public static Matrix4f getProjectionMatrix() {
      assertOnRenderThread();
      return projectionMatrix;
   }

   public static Matrix4f getModelViewMatrix() {
      assertOnRenderThread();
      return modelViewStack;
   }

   public static Matrix4fStack getModelViewStack() {
      assertOnRenderThread();
      return modelViewStack;
   }

   public static Matrix4f getTextureMatrix() {
      assertOnRenderThread();
      return textureMatrix;
   }

   public static RenderSystem.a getSequentialBuffer(fgq.c $$0) {
      assertOnRenderThread();

      return switch ($$0) {
         case h -> sharedSequentialQuad;
         case a -> sharedSequentialLines;
         default -> sharedSequential;
      };
   }

   public static void setShaderGameTime(long $$0, float $$1) {
      assertOnRenderThread();
      shaderGameTime = ((float)($$0 % 24000L) + $$1) / 24000.0F;
   }

   public static float getShaderGameTime() {
      assertOnRenderThread();
      return shaderGameTime;
   }

   public static fgt getVertexSorting() {
      assertOnRenderThread();
      return vertexSorting;
   }

   public static final class a {
      private final int a;
      private final int b;
      private final RenderSystem.a.a c;
      @Nullable
      private feg d;
      private fgq.b e = fgq.b.a;
      private int f;

      a(int $$0, int $$1, RenderSystem.a.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(int $$0) {
         return $$0 <= this.f;
      }

      public void b(int $$0) {
         if (this.d == null) {
            this.d = new feg(fee.b, fef.a, 0);
         }

         this.d.b();
         this.c($$0);
      }

      private void c(int $$0) {
         if (!this.a($$0)) {
            $$0 = bae.d($$0 * 2, this.b);
            RenderSystem.LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", this.f, $$0);
            int $$1 = $$0 / this.b;
            int $$2 = $$1 * this.a;
            fgq.b $$3 = fgq.b.a($$2);
            int $$4 = bae.d($$0 * $$3.d, 4);
            ByteBuffer $$5 = MemoryUtil.memAlloc($$4);

            try {
               this.e = $$3;
               it.unimi.dsi.fastutil.ints.IntConsumer $$6 = this.a($$5);

               for (int $$7 = 0; $$7 < $$0; $$7 += this.b) {
                  this.c.accept($$6, $$7 * this.a / this.b);
               }

               $$5.flip();
               this.d.a($$4);
               this.d.a($$5, 0);
            } finally {
               MemoryUtil.memFree($$5);
            }

            this.f = $$0;
         }
      }

      private it.unimi.dsi.fastutil.ints.IntConsumer a(ByteBuffer $$0) {
         switch (this.e) {
            case a:
               return $$1 -> $$0.putShort((short)$$1);
            case b:
            default:
               return $$0::putInt;
         }
      }

      public fgq.b a() {
         return this.e;
      }

      interface a {
         void accept(it.unimi.dsi.fastutil.ints.IntConsumer var1, int var2);
      }
   }
}
