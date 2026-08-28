import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfg implements dde {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cfg.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cfg() {
      this.c = cfg.a.c;
   }

   @Override
   public int a(arg $$0, boolean $$1, boolean $$2) {
      if (!$$0.S() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? cfg.a.b : cfg.a.c;
         }

         if (this.c == cfg.a.c) {
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
                  this.c = cfg.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cfg.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(arg $$0) {
      for (cnp $$1 : $$0.x()) {
         if (!$$1.P_()) {
            je $$2 = $$1.ds();
            if ($$0.c($$2) && !$$0.t($$2).a(awr.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azc.d(azc.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azc.d(azc.a($$4) * 32.0F);
                  if (this.a($$0, new je(this.f, this.g, this.h)) != null) {
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

   private void b(arg $$0) {
      eye $$1 = this.a($$0, new je(this.f, this.g, this.h));
      if ($$1 != null) {
         clo $$2;
         try {
            $$2 = new clo($$0);
            $$2.a($$0, $$0.d_($$2.ds()), btp.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private eye a(arg $$0, je $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(dzw.a.b, $$3, $$4);
         je $$6 = new je($$3, $$5, $$4);
         if ($$0.c($$6) && ckv.b(btq.bu, $$0, btp.h, $$6, $$0.z)) {
            return eye.c($$6);
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
