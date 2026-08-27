import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdb implements czq {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cdb.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cdb() {
      this.c = cdb.a.c;
   }

   @Override
   public int a(aqh $$0, boolean $$1, boolean $$2) {
      if (!$$0.Q() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? cdb.a.b : cdb.a.c;
         }

         if (this.c == cdb.a.c) {
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
                  this.c = cdb.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cdb.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(aqh $$0) {
      for (clh $$1 : $$0.x()) {
         if (!$$1.N_()) {
            in $$2 = $$1.dn();
            if ($$0.c($$2) && !$$0.t($$2).a(avq.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + axz.d(axz.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + axz.d(axz.a($$4) * 32.0F);
                  if (this.a($$0, new in(this.f, this.g, this.h)) != null) {
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

   private void b(aqh $$0) {
      etp $$1 = this.a($$0, new in(this.f, this.g, this.h));
      if ($$1 != null) {
         cjg $$2;
         try {
            $$2 = new cjg($$0);
            $$2.a($$0, $$0.d_($$2.dn()), bse.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private etp a(aqh $$0, in $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(dvz.a.b, $$3, $$4);
         in $$6 = new in($$3, $$5, $$4);
         if ($$0.c($$6) && cin.b(brn.bt, $$0, bse.h, $$6, $$0.z)) {
            return etp.c($$6);
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
