import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.jtracy.TracyClient;
import javax.annotation.Nullable;

public class fde implements AutoCloseable {
   private static final int a = 320;
   private static final int b = 180;
   private static final int c = 4;
   private int d;
   private int e;
   private int f;
   private int g;
   private final fed h = new fee(320, 180, false);
   private final fdo i = new fdo(fdm.c, fdn.f, 0);
   @Nullable
   private fdp j;
   private int k;
   private boolean l;

   private void a(int $$0, int $$1) {
      float $$2 = (float)$$0 / (float)$$1;
      if ($$0 > 320) {
         $$0 = 320;
         $$1 = (int)(320.0F / $$2);
      }

      if ($$1 > 180) {
         $$0 = (int)(180.0F * $$2);
         $$1 = 180;
      }

      $$0 = $$0 / 4 * 4;
      $$1 = $$1 / 4 * 4;
      if (this.f != $$0 || this.g != $$1) {
         this.f = $$0;
         this.g = $$1;
         this.h.a($$0, $$1);
         this.i.a($$0 * $$1 * 4);
         if (this.j != null) {
            this.j.close();
            this.j = null;
         }
      }
   }

   public void a(fed $$0) {
      if (this.j == null && !this.l) {
         this.l = true;
         if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
         }

         GlStateManager._glBindFramebuffer(36009, this.h.h);
         GlStateManager._glBindFramebuffer(36008, $$0.h);
         GlStateManager._glBlitFrameBuffer(0, 0, $$0.c, $$0.d, 0, 0, this.f, this.g, 16384, 9729);
         GlStateManager._glBindFramebuffer(36008, 0);
         GlStateManager._glBindFramebuffer(36009, 0);
         this.i.b();
         GlStateManager._glBindFramebuffer(36008, this.h.h);
         GlStateManager._readPixels(0, 0, this.f, this.g, 6408, 5121, 0L);
         GlStateManager._glBindFramebuffer(36008, 0);
         this.j = new fdp();
         this.k = 0;
      }
   }

   public void a() {
      if (this.j != null) {
         if (this.j.a(0L)) {
            this.j = null;

            try (fdo.a $$0 = this.i.a()) {
               if ($$0 != null) {
                  TracyClient.frameImage($$0.a(), this.f, this.g, this.k, true);
               }
            }
         }
      }
   }

   public void b() {
      this.k++;
      this.l = false;
      TracyClient.markFrame();
   }

   @Override
   public void close() {
      if (this.j != null) {
         this.j.close();
         this.j = null;
      }

      this.i.close();
      this.h.a();
   }
}
