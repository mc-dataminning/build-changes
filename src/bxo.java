import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxo implements ctk {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private bxo.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public bxo() {
      this.c = bxo.a.c;
   }

   @Override
   public int a(ane $$0, boolean $$1, boolean $$2) {
      if (!$$0.P() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? bxo.a.b : bxo.a.c;
         }

         if (this.c == bxo.a.c) {
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
                  this.c = bxo.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = bxo.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(ane $$0) {
      for (cfq $$1 : $$0.x()) {
         if (!$$1.P_()) {
            hx $$2 = $$1.dl();
            if ($$0.c($$2) && !$$0.t($$2).a(ash.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + aup.d(aup.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + aup.d(aup.a($$4) * 32.0F);
                  if (this.a($$0, new hx(this.f, this.g, this.h)) != null) {
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

   private void b(ane $$0) {
      emc $$1 = this.a($$0, new hx(this.f, this.g, this.h));
      if ($$1 != null) {
         cdp $$2;
         try {
            $$2 = new cdp($$0);
            $$2.a($$0, $$0.d_($$2.dl()), bms.h, null, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private emc a(ane $$0, hx $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(doy.a.b, $$3, $$4);
         hx $$6 = new hx($$3, $$5, $$4);
         if ($$0.c($$6) && ccw.b(bmc.bs, $$0, bms.h, $$6, $$0.z)) {
            return emc.c($$6);
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
