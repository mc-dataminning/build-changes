import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciu implements djj {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private ciu.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public ciu() {
      this.c = ciu.a.c;
   }

   @Override
   public void a(ars $$0, boolean $$1, boolean $$2) {
      if (!$$0.V() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? ciu.a.b : ciu.a.c;
         }

         if (this.c != ciu.a.c) {
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
                  this.c = ciu.a.c;
               }
            }
         }
      } else {
         this.c = ciu.a.c;
         this.b = false;
      }
   }

   private boolean a(ars $$0) {
      for (crx $$1 : $$0.z()) {
         if (!$$1.Z_()) {
            iv $$2 = $$1.dv();
            if ($$0.c($$2) && !$$0.u($$2).a(axd.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azo.d(azo.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azo.d(azo.a($$4) * 32.0F);
                  if (this.a($$0, new iv(this.f, this.g, this.h)) != null) {
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

   private void b(ars $$0) {
      ffq $$1 = this.a($$0, new iv(this.f, this.g, this.h));
      if ($$1 != null) {
         cps $$2;
         try {
            $$2 = new cps($$0);
            $$2.a($$0, $$0.d_($$2.dv()), bxb.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ffq a(ars $$0, iv $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(ehd.a.b, $$3, $$4);
         iv $$6 = new iv($$3, $$5, $$4);
         if ($$0.c($$6) && coz.b(bxc.bP, $$0, bxb.h, $$6, $$0.A)) {
            return ffq.c($$6);
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
