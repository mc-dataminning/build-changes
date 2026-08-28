package com.mojang.blaze3d.platform;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

@fdb
public class GLX {
   private static final Logger LOGGER = LogUtils.getLogger();
   private static String cpuInfo;

   public static String getOpenGLVersionString() {
      RenderSystem.assertOnRenderThread();
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
   }

   public static int _getRefreshRate(fey $$0) {
      RenderSystem.assertOnRenderThread();
      long $$1 = GLFW.glfwGetWindowMonitor($$0.h());
      if ($$1 == 0L) {
         $$1 = GLFW.glfwGetPrimaryMonitor();
      }

      GLFWVidMode $$2 = $$1 == 0L ? null : GLFW.glfwGetVideoMode($$1);
      return $$2 == null ? 0 : $$2.refreshRate();
   }

   public static String _getLWJGLVersion() {
      return Version.getVersion();
   }

   public static LongSupplier _initGlfw() {
      fey.a(($$0x, $$1x) -> {
         throw new IllegalStateException(String.format(Locale.ROOT, "GLFW error before init: [0x%X]%s", $$0x, $$1x));
      });
      List<String> $$0 = Lists.newArrayList();
      GLFWErrorCallback $$1 = GLFW.glfwSetErrorCallback(($$1x, $$2) -> {
         String $$3x = $$2 == 0L ? "" : MemoryUtil.memUTF8($$2);
         $$0.add(String.format(Locale.ROOT, "GLFW error during init: [0x%X]%s", $$1x, $$3x));
      });
      if (!GLFW.glfwInit()) {
         throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join($$0));
      } else {
         LongSupplier $$2 = () -> (long)(GLFW.glfwGetTime() * 1.0E9);

         for (String $$3 : $$0) {
            LOGGER.error("GLFW error collected during initialization: {}", $$3);
         }

         RenderSystem.setErrorCallback($$1);
         return $$2;
      }
   }

   public static void _setGlfwErrorCallback(GLFWErrorCallbackI $$0) {
      GLFWErrorCallback $$1 = GLFW.glfwSetErrorCallback($$0);
      if ($$1 != null) {
         $$1.free();
      }
   }

   public static boolean _shouldClose(fey $$0) {
      return GLFW.glfwWindowShouldClose($$0.h());
   }

   public static void _init(int $$0, boolean $$1) {
      try {
         CentralProcessor $$2 = new SystemInfo().getHardware().getProcessor();
         cpuInfo = String.format(Locale.ROOT, "%dx %s", $$2.getLogicalProcessorCount(), $$2.getProcessorIdentifier().getName()).replaceAll("\\s+", " ");
      } catch (Throwable var3) {
      }

      fen.a($$0, $$1);
   }

   public static String _getCpuInfo() {
      return cpuInfo == null ? "<unknown>" : cpuInfo;
   }

   public static void _renderCrosshair(int $$0, boolean $$1, boolean $$2, boolean $$3) {
      if ($$1 || $$2 || $$3) {
         RenderSystem.assertOnRenderThread();
         GlStateManager._depthMask(false);
         GlStateManager._disableCull();
         RenderSystem.setShader(glk.X);
         ffx $$4 = RenderSystem.renderThreadTesselator();
         ffq $$5 = $$4.a(fga.c.a, fft.g);
         RenderSystem.lineWidth(4.0F);
         if ($$1) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-16777216).b(1.0F, 0.0F, 0.0F);
            $$5.a((float)$$0, 0.0F, 0.0F).a(-16777216).b(1.0F, 0.0F, 0.0F);
         }

         if ($$2) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-16777216).b(0.0F, 1.0F, 0.0F);
            $$5.a(0.0F, (float)$$0, 0.0F).a(-16777216).b(0.0F, 1.0F, 0.0F);
         }

         if ($$3) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-16777216).b(0.0F, 0.0F, 1.0F);
            $$5.a(0.0F, 0.0F, (float)$$0).a(-16777216).b(0.0F, 0.0F, 1.0F);
         }

         ffr.a($$5.b());
         RenderSystem.lineWidth(2.0F);
         $$5 = $$4.a(fga.c.a, fft.g);
         if ($$1) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
            $$5.a((float)$$0, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
         }

         if ($$2) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
            $$5.a(0.0F, (float)$$0, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
         }

         if ($$3) {
            $$5.a(0.0F, 0.0F, 0.0F).a(-8421377).b(0.0F, 0.0F, 1.0F);
            $$5.a(0.0F, 0.0F, (float)$$0).a(-8421377).b(0.0F, 0.0F, 1.0F);
         }

         ffr.a($$5.b());
         RenderSystem.lineWidth(1.0F);
         GlStateManager._enableCull();
         GlStateManager._depthMask(true);
      }
   }

   public static <T> T make(Supplier<T> $$0) {
      return $$0.get();
   }

   public static <T> T make(T $$0, Consumer<T> $$1) {
      $$1.accept($$0);
      return $$0;
   }
}
