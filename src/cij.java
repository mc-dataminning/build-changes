import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cij implements diu {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cij.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cij() {
      this.c = cij.a.c;
   }

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if (!$$0.V() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? cij.a.b : cij.a.c;
         }

         if (this.c != cij.a.c) {
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
                  this.c = cij.a.c;
               }
            }
         }
      } else {
         this.c = cij.a.c;
         this.b = false;
      }
   }

   private boolean a(arq $$0) {
      for (crj $$1 : $$0.z()) {
         if (!$$1.V_()) {
            iv $$2 = $$1.du();
            if ($$0.c($$2) && !$$0.u($$2).a(axb.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azm.d(azm.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azm.d(azm.a($$4) * 32.0F);
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

   private void b(arq $$0) {
      fex $$1 = this.a($$0, new iv(this.f, this.g, this.h));
      if ($$1 != null) {
         cpe $$2;
         try {
            $$2 = new cpe($$0);
            $$2.a($$0, $$0.d_($$2.du()), bwq.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private fex a(arq $$0, iv $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(egn.a.b, $$3, $$4);
         iv $$6 = new iv($$3, $$5, $$4);
         if ($$0.c($$6) && cok.b(bwr.bO, $$0, bwq.h, $$6, $$0.A)) {
            return fex.c($$6);
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
