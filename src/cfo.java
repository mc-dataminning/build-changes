import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfo implements ddv {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cfo.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cfo() {
      this.c = cfo.a.c;
   }

   @Override
   public int a(arj $$0, boolean $$1, boolean $$2) {
      if (!$$0.S() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? cfo.a.b : cfo.a.c;
         }

         if (this.c == cfo.a.c) {
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
                  this.c = cfo.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cfo.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(arj $$0) {
      for (cnx $$1 : $$0.x()) {
         if (!$$1.Q_()) {
            jf $$2 = $$1.ds();
            if ($$0.c($$2) && !$$0.t($$2).a(awu.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azf.d(azf.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azf.d(azf.a($$4) * 32.0F);
                  if (this.a($$0, new jf(this.f, this.g, this.h)) != null) {
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

   private void b(arj $$0) {
      eyw $$1 = this.a($$0, new jf(this.f, this.g, this.h));
      if ($$1 != null) {
         clw $$2;
         try {
            $$2 = new clw($$0);
            $$2.a($$0, $$0.d_($$2.ds()), btx.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private eyw a(arj $$0, jf $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(eao.a.b, $$3, $$4);
         jf $$6 = new jf($$3, $$5, $$4);
         if ($$0.c($$6) && cld.b(bty.bu, $$0, btx.h, $$6, $$0.z)) {
            return eyw.c($$6);
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
