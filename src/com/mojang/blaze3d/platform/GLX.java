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
import javax.annotation.Nullable;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

@fhq
public class GLX {
   private static final Logger LOGGER = LogUtils.getLogger();
   @Nullable
   private static String cpuInfo;

   public static int _getRefreshRate(fkk $$0) {
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
      fkk.a(($$0x, $$1x) -> {
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

   public static boolean _shouldClose(fkk $$0) {
      return GLFW.glfwWindowShouldClose($$0.h());
   }

   public static String _getCpuInfo() {
      if (cpuInfo == null) {
         cpuInfo = "<unknown>";

         try {
            CentralProcessor $$0 = new SystemInfo().getHardware().getProcessor();
            cpuInfo = String.format(Locale.ROOT, "%dx %s", $$0.getLogicalProcessorCount(), $$0.getProcessorIdentifier().getName()).replaceAll("\\s+", " ");
         } catch (Throwable var1) {
         }
      }

      return cpuInfo;
   }

   public static <T> T make(Supplier<T> $$0) {
      return $$0.get();
   }

   public static <T> T make(T $$0, Consumer<T> $$1) {
      $$1.accept($$0);
      return $$0;
   }
}
