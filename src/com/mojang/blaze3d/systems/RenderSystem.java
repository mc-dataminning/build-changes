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
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.slf4j.Logger;

@exl
public class RenderSystem {
   static final Logger LOGGER = LogUtils.getLogger();
   private static final ConcurrentLinkedQueue<eyd> recordingQueue = Queues.newConcurrentLinkedQueue();
   private static final ezv RENDER_THREAD_TESSELATOR = new ezv(1536);
   private static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
   private static boolean isReplayingQueue;
   @Nullable
   private static Thread gameThread;
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
   private static fab vertexSorting = fab.a;
   private static fab savedVertexSorting = fab.a;
   private static final Matrix4fStack modelViewStack = new Matrix4fStack(16);
   private static Matrix4f modelViewMatrix = new Matrix4f();
   private static Matrix4f textureMatrix = new Matrix4f();
   private static final int[] shaderTextures = new int[12];
   private static final float[] shaderColor = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private static float shaderGlintAlpha = 1.0F;
   private static float shaderFogStart;
   private static float shaderFogEnd = 1.0F;
   private static final float[] shaderFogColor = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   private static ezg shaderFogShape = ezg.a;
   private static final Vector3f[] shaderLightDirections = new Vector3f[2];
   private static float shaderGameTime;
   private static float shaderLineWidth = 1.0F;
   private static String apiDescription = "Unknown";
   @Nullable
   private static gdx shader;
   private static final AtomicLong pollEventsWaitStart = new AtomicLong();
   private static final AtomicBoolean pollingEvents = new AtomicBoolean(false);

   public static void initRenderThread() {
      if (renderThread == null && gameThread != Thread.currentThread()) {
         renderThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == renderThread;
   }

   public static boolean isOnRenderThreadOrInit() {
      return isInInit || isOnRenderThread();
   }

   public static void initGameThread(boolean $$0) {
      boolean $$1 = renderThread == Thread.currentThread();
      if (gameThread == null && renderThread != null && $$1 != $$0) {
         gameThread = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean isOnGameThread() {
      return true;
   }

   public static void assertInInitPhase() {
      if (!isInInitPhase()) {
         throw constructThreadException();
      }
   }

   public static void assertOnGameThreadOrInit() {
      if (!isInInit && !isOnGameThread()) {
         throw constructThreadException();
      }
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

   public static void assertOnGameThread() {
      if (!isOnGameThread()) {
         throw constructThreadException();
      }
   }

   private static IllegalStateException constructThreadException() {
      return new IllegalStateException("Rendersystem called from wrong thread");
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void recordRenderCall(eyd $$0) {
      recordingQueue.add($$0);
   }

   private static void pollEvents() {
      pollEventsWaitStart.set(ac.c());
      pollingEvents.set(true);
      GLFW.glfwPollEvents();
      pollingEvents.set(false);
   }

   public static boolean isFrozenAtPollEvents() {
      return pollingEvents.get() && ac.c() - pollEventsWaitStart.get() > 200L;
   }

   public static void flipFrame(long $$0) {
      pollEvents();
      replayQueue();
      ezv.b().d().g();
      GLFW.glfwSwapBuffers($$0);
      pollEvents();
   }

   public static void replayQueue() {
      isReplayingQueue = true;

      while (!recordingQueue.isEmpty()) {
         eyd $$0 = recordingQueue.poll();
         $$0.execute();
      }

      isReplayingQueue = false;
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
      assertOnGameThreadOrInit();
      GlStateManager._enableDepthTest();
   }

   public static void enableScissor(int $$0, int $$1, int $$2, int $$3) {
      assertOnGameThreadOrInit();
      GlStateManager._enableScissorTest();
      GlStateManager._scissorBox($$0, $$1, $$2, $$3);
   }

   public static void disableScissor() {
      assertOnGameThreadOrInit();
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

   public static void logicOp(GlStateManager.g $$0) {
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
      assertOnGameThreadOrInit();
      GlStateManager._deleteTexture($$0);
   }

   public static void bindTextureForSetup(int $$0) {
      bindTexture($$0);
   }

   public static void bindTexture(int $$0) {
      GlStateManager._bindTexture($$0);
   }

   public static void viewport(int $$0, int $$1, int $$2, int $$3) {
      assertOnGameThreadOrInit();
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
      assertOnGameThreadOrInit();
      GlStateManager._clearDepth($$0);
   }

   public static void clearColor(float $$0, float $$1, float $$2, float $$3) {
      assertOnGameThreadOrInit();
      GlStateManager._clearColor($$0, $$1, $$2, $$3);
   }

   public static void clearStencil(int $$0) {
      assertOnRenderThread();
      GlStateManager._clearStencil($$0);
   }

   public static void clear(int $$0, boolean $$1) {
      assertOnGameThreadOrInit();
      GlStateManager._clear($$0, $$1);
   }

   public static void setShaderFogStart(float $$0) {
      assertOnRenderThread();
      _setShaderFogStart($$0);
   }

   private static void _setShaderFogStart(float $$0) {
      shaderFogStart = $$0;
   }

   public static float getShaderFogStart() {
      assertOnRenderThread();
      return shaderFogStart;
   }

   public static void setShaderGlintAlpha(double $$0) {
      setShaderGlintAlpha((float)$$0);
   }

   public static void setShaderGlintAlpha(float $$0) {
      assertOnRenderThread();
      _setShaderGlintAlpha($$0);
   }

   private static void _setShaderGlintAlpha(float $$0) {
      shaderGlintAlpha = $$0;
   }

   public static float getShaderGlintAlpha() {
      assertOnRenderThread();
      return shaderGlintAlpha;
   }

   public static void setShaderFogEnd(float $$0) {
      assertOnRenderThread();
      _setShaderFogEnd($$0);
   }

   private static void _setShaderFogEnd(float $$0) {
      shaderFogEnd = $$0;
   }

   public static float getShaderFogEnd() {
      assertOnRenderThread();
      return shaderFogEnd;
   }

   public static void setShaderFogColor(float $$0, float $$1, float $$2, float $$3) {
      assertOnRenderThread();
      _setShaderFogColor($$0, $$1, $$2, $$3);
   }

   public static void setShaderFogColor(float $$0, float $$1, float $$2) {
      setShaderFogColor($$0, $$1, $$2, 1.0F);
   }

   private static void _setShaderFogColor(float $$0, float $$1, float $$2, float $$3) {
      shaderFogColor[0] = $$0;
      shaderFogColor[1] = $$1;
      shaderFogColor[2] = $$2;
      shaderFogColor[3] = $$3;
   }

   public static float[] getShaderFogColor() {
      assertOnRenderThread();
      return shaderFogColor;
   }

   public static void setShaderFogShape(ezg $$0) {
      assertOnRenderThread();
      _setShaderFogShape($$0);
   }

   private static void _setShaderFogShape(ezg $$0) {
      shaderFogShape = $$0;
   }

   public static ezg getShaderFogShape() {
      assertOnRenderThread();
      return shaderFogShape;
   }

   public static void setShaderLights(Vector3f $$0, Vector3f $$1) {
      assertOnRenderThread();
      _setShaderLights($$0, $$1);
   }

   public static void _setShaderLights(Vector3f $$0, Vector3f $$1) {
      shaderLightDirections[0] = $$0;
      shaderLightDirections[1] = $$1;
   }

   public static void setupShaderLights(gdx $$0) {
      assertOnRenderThread();
      if ($$0.g != null) {
         $$0.g.a(shaderLightDirections[0]);
      }

      if ($$0.h != null) {
         $$0.h.a(shaderLightDirections[1]);
      }
   }

   public static void setShaderColor(float $$0, float $$1, float $$2, float $$3) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> _setShaderColor($$0, $$1, $$2, $$3));
      } else {
         _setShaderColor($$0, $$1, $$2, $$3);
      }
   }

   private static void _setShaderColor(float $$0, float $$1, float $$2, float $$3) {
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
      if (!isOnRenderThread()) {
         recordRenderCall(() -> shaderLineWidth = $$0);
      } else {
         shaderLineWidth = $$0;
      }
   }

   public static float getShaderLineWidth() {
      assertOnRenderThread();
      return shaderLineWidth;
   }

   public static void pixelStore(int $$0, int $$1) {
      assertOnGameThreadOrInit();
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
      assertInInitPhase();
      return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
   }

   public static String getApiDescription() {
      return apiDescription;
   }

   public static azt.a initBackendSystem() {
      assertInInitPhase();
      return GLX._initGlfw()::getAsLong;
   }

   public static void initRenderer(int $$0, boolean $$1) {
      assertInInitPhase();
      GLX._init($$0, $$1);
      apiDescription = GLX.getOpenGLVersionString();
   }

   public static void setErrorCallback(GLFWErrorCallbackI $$0) {
      assertInInitPhase();
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
      assertInInitPhase();
      GlStateManager._clearDepth(1.0);
      GlStateManager._enableDepthTest();
      GlStateManager._depthFunc(515);
      projectionMatrix.identity();
      savedProjectionMatrix.identity();
      modelViewMatrix.identity();
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

   public static void glBindBuffer(int $$0, IntSupplier $$1) {
      GlStateManager._glBindBuffer($$0, $$1.getAsInt());
   }

   public static void glBindVertexArray(Supplier<Integer> $$0) {
      GlStateManager._glBindVertexArray($$0.get());
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

   public static void setupOverlayColor(IntSupplier $$0, int $$1) {
      assertOnRenderThread();
      int $$2 = $$0.getAsInt();
      setShaderTexture(1, $$2);
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

   public static void glGenBuffers(Consumer<Integer> $$0) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> $$0.accept(GlStateManager._glGenBuffers()));
      } else {
         $$0.accept(GlStateManager._glGenBuffers());
      }
   }

   public static void glGenVertexArrays(Consumer<Integer> $$0) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> $$0.accept(GlStateManager._glGenVertexArrays()));
      } else {
         $$0.accept(GlStateManager._glGenVertexArrays());
      }
   }

   public static ezv renderThreadTesselator() {
      assertOnRenderThread();
      return RENDER_THREAD_TESSELATOR;
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(
         GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
      );
   }

   @Deprecated
   public static void runAsFancy(Runnable $$0) {
      boolean $$1 = ffa.O();
      if (!$$1) {
         $$0.run();
      } else {
         ffd<fet> $$2 = ffa.Q().m.j();
         fet $$3 = $$2.c();
         $$2.a(fet.b);
         $$0.run();
         $$2.a($$3);
      }
   }

   public static void setShader(Supplier<gdx> $$0) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> shader = $$0.get());
      } else {
         shader = $$0.get();
      }
   }

   @Nullable
   public static gdx getShader() {
      assertOnRenderThread();
      return shader;
   }

   public static void setShaderTexture(int $$0, alb $$1) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> _setShaderTexture($$0, $$1));
      } else {
         _setShaderTexture($$0, $$1);
      }
   }

   public static void _setShaderTexture(int $$0, alb $$1) {
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         gov $$2 = ffa.Q().aa();
         gof $$3 = $$2.b($$1);
         shaderTextures[$$0] = $$3.a();
      }
   }

   public static void setShaderTexture(int $$0, int $$1) {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> _setShaderTexture($$0, $$1));
      } else {
         _setShaderTexture($$0, $$1);
      }
   }

   public static void _setShaderTexture(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         shaderTextures[$$0] = $$1;
      }
   }

   public static int getShaderTexture(int $$0) {
      assertOnRenderThread();
      return $$0 >= 0 && $$0 < shaderTextures.length ? shaderTextures[$$0] : 0;
   }

   public static void setProjectionMatrix(Matrix4f $$0, fab $$1) {
      Matrix4f $$2 = new Matrix4f($$0);
      if (!isOnRenderThread()) {
         recordRenderCall(() -> {
            projectionMatrix = $$2;
            vertexSorting = $$1;
         });
      } else {
         projectionMatrix = $$2;
         vertexSorting = $$1;
      }
   }

   public static void setTextureMatrix(Matrix4f $$0) {
      Matrix4f $$1 = new Matrix4f($$0);
      if (!isOnRenderThread()) {
         recordRenderCall(() -> textureMatrix = $$1);
      } else {
         textureMatrix = $$1;
      }
   }

   public static void resetTextureMatrix() {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> textureMatrix.identity());
      } else {
         textureMatrix.identity();
      }
   }

   public static void applyModelViewMatrix() {
      Matrix4f $$0 = new Matrix4f(modelViewStack);
      if (!isOnRenderThread()) {
         recordRenderCall(() -> modelViewMatrix = $$0);
      } else {
         modelViewMatrix = $$0;
      }
   }

   public static void backupProjectionMatrix() {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> _backupProjectionMatrix());
      } else {
         _backupProjectionMatrix();
      }
   }

   private static void _backupProjectionMatrix() {
      savedProjectionMatrix = projectionMatrix;
      savedVertexSorting = vertexSorting;
   }

   public static void restoreProjectionMatrix() {
      if (!isOnRenderThread()) {
         recordRenderCall(() -> _restoreProjectionMatrix());
      } else {
         _restoreProjectionMatrix();
      }
   }

   private static void _restoreProjectionMatrix() {
      projectionMatrix = savedProjectionMatrix;
      vertexSorting = savedVertexSorting;
   }

   public static Matrix4f getProjectionMatrix() {
      assertOnRenderThread();
      return projectionMatrix;
   }

   public static Matrix4f getModelViewMatrix() {
      assertOnRenderThread();
      return modelViewMatrix;
   }

   public static Matrix4fStack getModelViewStack() {
      return modelViewStack;
   }

   public static Matrix4f getTextureMatrix() {
      assertOnRenderThread();
      return textureMatrix;
   }

   public static RenderSystem.a getSequentialBuffer(ezy.b $$0) {
      assertOnRenderThread();

      return switch ($$0) {
         case h -> sharedSequentialQuad;
         case a -> sharedSequentialLines;
         default -> sharedSequential;
      };
   }

   public static void setShaderGameTime(long $$0, float $$1) {
      float $$2 = ((float)($$0 % 24000L) + $$1) / 24000.0F;
      if (!isOnRenderThread()) {
         recordRenderCall(() -> shaderGameTime = $$2);
      } else {
         shaderGameTime = $$2;
      }
   }

   public static float getShaderGameTime() {
      assertOnRenderThread();
      return shaderGameTime;
   }

   public static fab getVertexSorting() {
      assertOnRenderThread();
      return vertexSorting;
   }

   public static final class a {
      private final int a;
      private final int b;
      private final RenderSystem.a.a c;
      private int d;
      private ezy.a e = ezy.a.a;
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
         if (this.d == 0) {
            this.d = GlStateManager._glGenBuffers();
         }

         GlStateManager._glBindBuffer(34963, this.d);
         this.c($$0);
      }

      private void c(int $$0) {
         if (!this.a($$0)) {
            $$0 = ayu.d($$0 * 2, this.b);
            RenderSystem.LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", this.f, $$0);
            int $$1 = $$0 / this.b;
            int $$2 = $$1 * this.a;
            ezy.a $$3 = ezy.a.a($$2);
            int $$4 = ayu.d($$0 * $$3.d, 4);
            GlStateManager._glBufferData(34963, (long)$$4, 35048);
            ByteBuffer $$5 = GlStateManager._glMapBuffer(34963, 35001);
            if ($$5 == null) {
               throw new RuntimeException("Failed to map GL buffer");
            } else {
               this.e = $$3;
               it.unimi.dsi.fastutil.ints.IntConsumer $$6 = this.a($$5);

               for (int $$7 = 0; $$7 < $$0; $$7 += this.b) {
                  this.c.accept($$6, $$7 * this.a / this.b);
               }

               GlStateManager._glUnmapBuffer(34963);
               this.f = $$0;
            }
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

      public ezy.a a() {
         return this.e;
      }

      interface a {
         void accept(it.unimi.dsi.fastutil.ints.IntConsumer var1, int var2);
      }
   }
}
