import com.mojang.blaze3d.platform.GlStateManager;

public class fcg implements AutoCloseable {
   private long a = GlStateManager._glFenceSync(37143, 0);

   @Override
   public void close() {
      if (this.a != 0L) {
         GlStateManager._glDeleteSync(this.a);
         this.a = 0L;
      }
   }

   public boolean a(long $$0) {
      if (this.a == 0L) {
         return true;
      } else {
         int $$1 = GlStateManager._glClientWaitSync(this.a, 0, $$0);
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
