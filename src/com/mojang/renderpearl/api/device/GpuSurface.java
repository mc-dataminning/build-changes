package com.mojang.renderpearl.api.device;

import com.mojang.renderpearl.api.commands.CommandEncoder;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.util.Collection;
import java.util.Optional;

public interface GpuSurface extends UncheckedAutoCloseable {
   void configure(GpuSurface.Configuration config) throws SurfaceException;

   Optional<GpuSurface.Configuration> currentConfiguration();

   Collection<GpuSurface.PresentMode> supportedPresentModes();

   boolean isSuboptimal();

   boolean isAcquired();

   void acquireNextTexture() throws SurfaceException;

   void blitFromTexture(CommandEncoder commandEncoder, GpuTextureView textureView);

   void present();

   public static record Configuration(int width, int height, GpuSurface.PresentMode presentMode) {
   }

   public static enum PresentMode {
      IMMEDIATE,
      MAILBOX,
      FIFO,
      FIFO_RELAXED;

      private static final GpuSurface.PresentMode[] PRESENT_MODES_VSYNC = new GpuSurface.PresentMode[]{FIFO};
      private static final GpuSurface.PresentMode[] PRESENT_MODES_NO_VSYNC = new GpuSurface.PresentMode[]{IMMEDIATE, MAILBOX, FIFO};

      public static GpuSurface.PresentMode getSupportedVsyncMode(final Collection<GpuSurface.PresentMode> supportedModes, final boolean vsync) {
         GpuSurface.PresentMode[] preferred = vsync ? PRESENT_MODES_VSYNC : PRESENT_MODES_NO_VSYNC;

         for (GpuSurface.PresentMode mode : preferred) {
            if (supportedModes.contains(mode)) {
               return mode;
            }
         }

         throw new IllegalStateException("No supported presentation mode was found");
      }
   }
}
