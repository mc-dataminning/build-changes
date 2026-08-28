package com.mojang.blaze3d.buffers;

import com.mojang.blaze3d.opengl.GlStateManager;

@fic
public class GpuFence implements AutoCloseable {
   private long handle = GlStateManager._glFenceSync(37143, 0);

   @Override
   public void close() {
      if (this.handle != 0L) {
         GlStateManager._glDeleteSync(this.handle);
         this.handle = 0L;
      }
   }

   public boolean awaitCompletion(long $$0) {
      if (this.handle == 0L) {
         return true;
      } else {
         int $$1 = GlStateManager._glClientWaitSync(this.handle, 0, $$0);
         if ($$1 == 37147) {
            return false;
         } else if ($$1 == 37149) {
            throw new IllegalStateException("Failed to complete gpu fence");
         } else {
            return true;
         }
      }
   }
}
