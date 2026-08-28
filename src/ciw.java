import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciw implements djl {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private ciw.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public ciw() {
      this.c = ciw.a.c;
   }

   @Override
   public void a(aru $$0, boolean $$1, boolean $$2) {
      if (!$$0.V() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? ciw.a.b : ciw.a.c;
         }

         if (this.c != ciw.a.c) {
            if (!this.b) {
               if (!this.a($$0)) {
                  return;
               }

               this.b = true;
            }

            if (this.e > 0) {
               this.e--;
            } else {
               this.e = 2;
               if (this.d > 0) {
                  this.b($$0);
                  this.d--;
               } else {
                  this.c = ciw.a.c;
               }
            }
         }
      } else {
         this.c = ciw.a.c;
         this.b = false;
      }
   }

   private boolean a(aru $$0) {
      for (crz $$1 : $$0.z()) {
         if (!$$1.Z_()) {
            iw $$2 = $$1.dv();
            if ($$0.c($$2) && !$$0.u($$2).a(axf.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azq.d(azq.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azq.d(azq.a($$4) * 32.0F);
                  if (this.a($$0, new iw(this.f, this.g, this.h)) != null) {
                     this.e = 0;
                     this.d = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void b(aru $$0) {
      ffs $$1 = this.a($$0, new iw(this.f, this.g, this.h));
      if ($$1 != null) {
         cpu $$2;
         try {
            $$2 = new cpu($$0);
            $$2.a($$0, $$0.d_($$2.dv()), bxd.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ffs a(aru $$0, iw $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(ehf.a.b, $$3, $$4);
         iw $$6 = new iw($$3, $$5, $$4);
         if ($$0.c($$6) && cpb.b(bxe.bP, $$0, bxd.h, $$6, $$0.A)) {
            return ffs.c($$6);
         }
      }

      return null;
   }

   static enum a {
      a,
      b,
      c;
   }
}
