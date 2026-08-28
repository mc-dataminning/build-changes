import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cet implements dbn {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cet.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cet() {
      this.c = cet.a.c;
   }

   @Override
   public int a(arf $$0, boolean $$1, boolean $$2) {
      if (!$$0.R() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? cet.a.b : cet.a.c;
         }

         if (this.c == cet.a.c) {
            return 0;
         } else {
            if (!this.b) {
               if (!this.a($$0)) {
                  return 0;
               }

               this.b = true;
            }

            if (this.e > 0) {
               this.e--;
               return 0;
            } else {
               this.e = 2;
               if (this.d > 0) {
                  this.b($$0);
                  this.d--;
               } else {
                  this.c = cet.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cet.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(arf $$0) {
      for (cmz $$1 : $$0.x()) {
         if (!$$1.N_()) {
            iz $$2 = $$1.dp();
            if ($$0.c($$2) && !$$0.t($$2).a(awo.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + ayz.d(ayz.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + ayz.d(ayz.a($$4) * 32.0F);
                  if (this.a($$0, new iz(this.f, this.g, this.h)) != null) {
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

   private void b(arf $$0) {
      evt $$1 = this.a($$0, new iz(this.f, this.g, this.h));
      if ($$1 != null) {
         cky $$2;
         try {
            $$2 = new cky($$0);
            $$2.a($$0, $$0.d_($$2.dp()), btv.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private evt a(arf $$0, iz $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(dxw.a.b, $$3, $$4);
         iz $$6 = new iz($$3, $$5, $$4);
         if ($$0.c($$6) && ckf.b(btc.bu, $$0, btv.h, $$6, $$0.z)) {
            return evt.c($$6);
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
