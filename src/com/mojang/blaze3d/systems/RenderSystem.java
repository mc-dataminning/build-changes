package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fhq
public class RenderSystem {
   public static final flc SCISSOR_STATE = new flc();
   static final Logger LOGGER = LogUtils.getLogger();
   public static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
   @Nullable
   private static Thread renderThread;
   @Nullable
   private static fla DEVICE;
   private static double lastDrawTime = Double.MIN_VALUE;
   private static final RenderSystem.a sharedSequential = new RenderSystem.a(1, 1, IntConsumer::accept);
   private static final RenderSystem.a sharedSequentialQuad = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1);
   });
   private static final RenderSystem.a sharedSequentialLines = new RenderSystem.a(4, 6, ($$0, $$1) -> {
      $$0.accept($$1);
      $$0.accept($$1 + 1);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 3);
      $$0.accept($$1 + 2);
      $$0.accept($$1 + 1);
   });
   private static Matrix4f projectionMatrix = new Matrix4f();
   private static Matrix4f savedProjectionMatrix = new Matrix4f();
   private static fhu projectionType = fhu.a;
   private static fhu savedProjectionType = fhu.a;
   private static final Matrix4fStack modelViewStack = new Matrix4fStack(16);
   private static Matrix4f textureMatrix = new Matrix4f();
   private static final flh[] shaderTextures = new flh[12];
   private static final float[] shaderColor = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
   private static float shaderGlintAlpha = 1.0F;
   private static gro shaderFog = gro.a;
   private static final Vector3f[] shaderLightDirections = new Vector3f[2];
   private static float shaderGameTime;
   private static final Vector3f modelOffset = new Vector3f();
   private static float shaderLineWidth = 1.0F;
   private static String apiDescription = "Unknown";
   private static final AtomicLong pollEventsWaitStart = new AtomicLong();
   private static final AtomicBoolean pollingEvents = new AtomicBoolean(false);
   @Nullable
   private static fig QUAD_VERTEX_BUFFER;
   private static final aya<RenderSystem.b> PENDING_FENCES = new aya<>();

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

   public static void assertOnRenderThread() {
      if (!isOnRenderThread()) {
         throw constructThreadException();
      }
   }

   private static IllegalStateException constructThreadException() {
      return new IllegalStateException("Rendersystem called from wrong thread");
   }

   private static void pollEvents() {
      pollEventsWaitStart.set(ag.c());
      pollingEvents.set(true);
      GLFW.glfwPollEvents();
      pollingEvents.set(false);
   }

   public static boolean isFrozenAtPollEvents() {
      return pollingEvents.get() && ag.c() - pollEventsWaitStart.get() > 200L;
   }

   public static void flipFrame(long $$0, @Nullable fhw $$1) {
      pollEvents();
      flq.b().c();
      GLFW.glfwSwapBuffers($$0);
      if ($$1 != null) {
         $$1.b();
      }

      pollEvents();
   }

   public static void limitDisplayFPS(int $$0) {
      double $$1 = lastDrawTime + 1.0 / (double)$$0;

      double $$2;
      for ($$2 = GLFW.glfwGetTime(); $$2 < $$1; $$2 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout($$1 - $$2);
      }

      lastDrawTime = $$2;
   }

   public static void enableScissor(int $$0, int $$1, int $$2, int $$3) {
      SCISSOR_STATE.a($$0, $$1, $$2, $$3);
   }

   public static void disableScissor() {
      SCISSOR_STATE.a();
   }

   public static void activeTexture(int $$0) {
      assertOnRenderThread();
      GlStateManager._activeTexture($$0);
   }

   public static void setShaderFog(gro $$0) {
      assertOnRenderThread();
      shaderFog = $$0;
   }

   public static gro getShaderFog() {
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

   public static Vector3f[] getShaderLights() {
      return shaderLightDirections;
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

   public static void lineWidth(float $$0) {
      assertOnRenderThread();
      shaderLineWidth = $$0;
   }

   public static float getShaderLineWidth() {
      assertOnRenderThread();
      return shaderLineWidth;
   }

   public static String getBackendDescription() {
      return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
   }

   public static String getApiDescription() {
      return apiDescription;
   }

   public static bar.a initBackendSystem() {
      return GLX._initGlfw()::getAsLong;
   }

   public static void initRenderer(long $$0, int $$1, boolean $$2, BiFunction<ali, fkw, String> $$3, boolean $$4) {
      DEVICE = new fix($$0, $$1, $$2, $$3, $$4);
      apiDescription = getDevice().c();
   }

   public static void setErrorCallback(GLFWErrorCallbackI $$0) {
      GLX._setGlfwErrorCallback($$0);
   }

   public static String getCapsString() {
      assertOnRenderThread();
      return "Using framebuffer using OpenGL 3.2";
   }

   public static void setupDefaultState() {
      projectionMatrix.identity();
      savedProjectionMatrix.identity();
      modelViewStack.clear();
      textureMatrix.identity();
   }

   public static void setupOverlayColor(@Nullable flh $$0) {
      assertOnRenderThread();
      setShaderTexture(1, $$0);
   }

   public static void teardownOverlayColor() {
      assertOnRenderThread();
      setShaderTexture(1, null);
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

   public static void setShaderTexture(int $$0, @Nullable flh $$1) {
      assertOnRenderThread();
      if ($$0 >= 0 && $$0 < shaderTextures.length) {
         shaderTextures[$$0] = $$1;
      }
   }

   @Nullable
   public static flh getShaderTexture(int $$0) {
      assertOnRenderThread();
      return $$0 >= 0 && $$0 < shaderTextures.length ? shaderTextures[$$0] : null;
   }

   public static void setProjectionMatrix(Matrix4f $$0, fhu $$1) {
      assertOnRenderThread();
      projectionMatrix = new Matrix4f($$0);
      projectionType = $$1;
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
      savedProjectionType = projectionType;
   }

   public static void restoreProjectionMatrix() {
      assertOnRenderThread();
      projectionMatrix = savedProjectionMatrix;
      projectionType = savedProjectionType;
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

   public static RenderSystem.a getSequentialBuffer(fls.c $$0) {
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

   public static fhu getProjectionType() {
      assertOnRenderThread();
      return projectionType;
   }

   public static fig getQuadVertexBuffer(@Nullable Supplier<String> $$0) {
      if (QUAD_VERTEX_BUFFER == null) {
         try (fll $$1 = new fll(flm.e.b() * 4)) {
            flk $$2 = new flk($$1, fls.c.h, flm.e);
            $$2.a(0.0F, 0.0F, 0.0F);
            $$2.a(1.0F, 0.0F, 0.0F);
            $$2.a(1.0F, 1.0F, 0.0F);
            $$2.a(0.0F, 1.0F, 0.0F);

            try (fln $$3 = $$2.b()) {
               QUAD_VERTEX_BUFFER = getDevice().a($$0, fie.a, fif.b, $$3.a());
            }
         }
      }

      return QUAD_VERTEX_BUFFER;
   }

   public static void setModelOffset(float $$0, float $$1, float $$2) {
      assertOnRenderThread();
      modelOffset.set($$0, $$1, $$2);
   }

   public static void resetModelOffset() {
      assertOnRenderThread();
      modelOffset.set(0.0F, 0.0F, 0.0F);
   }

   public static Vector3f getModelOffset() {
      assertOnRenderThread();
      return modelOffset;
   }

   public static void queueFencedTask(Runnable $$0) {
      PENDING_FENCES.addLast(new RenderSystem.b($$0, new fih()));
   }

   public static void executePendingTasks() {
      for (RenderSystem.b $$0 = PENDING_FENCES.peekFirst(); $$0 != null; $$0 = PENDING_FENCES.peekFirst()) {
         if (!$$0.b.a(0L)) {
            return;
         }

         try {
            $$0.a.run();
         } finally {
            $$0.b.close();
         }

         PENDING_FENCES.removeFirst();
      }
   }

   public static fla getDevice() {
      if (DEVICE == null) {
         throw new IllegalStateException("Can't getDevice() before it was initialized");
      } else {
         return DEVICE;
      }
   }

   @Nullable
   public static fla tryGetDevice() {
      return DEVICE;
   }

   public static final class a {
      private final int a;
      private final int b;
      private final RenderSystem.a.a c;
      @Nullable
      private fig d;
      private fls.b e = fls.b.a;
      private int f;

      a(int $$0, int $$1, RenderSystem.a.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(int $$0) {
         return $$0 <= this.f;
      }

      public fig b(int $$0) {
         if (this.d == null) {
            this.d = RenderSystem.getDevice().a(() -> "Auto Storage index buffer", fie.b, fif.a, 0);
         }

         this.c($$0);
         return this.d;
      }

      private void c(int $$0) {
         if (!this.a($$0)) {
            $$0 = azo.d($$0 * 2, this.b);
            RenderSystem.LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", this.f, $$0);
            int $$1 = $$0 / this.b;
            int $$2 = $$1 * this.a;
            fls.b $$3 = fls.b.a($$2);
            int $$4 = azo.d($$0 * $$3.c, 4);
            ByteBuffer $$5 = MemoryUtil.memAlloc($$4);

            try {
               this.e = $$3;
               it.unimi.dsi.fastutil.ints.IntConsumer $$6 = this.a($$5);

               for (int $$7 = 0; $$7 < $$0; $$7 += this.b) {
                  this.c.accept($$6, $$7 * this.a / this.b);
               }

               $$5.flip();
               fkz $$8 = RenderSystem.getDevice().b();
               $$8.a(this.d, $$4);
               $$8.a(this.d, $$5, 0);
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

      public fls.b a() {
         return this.e;
      }

      interface a {
         void accept(it.unimi.dsi.fastutil.ints.IntConsumer var1, int var2);
      }
   }

   static record b(Runnable a, fih b) {
   }
}
