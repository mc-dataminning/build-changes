import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwi implements crs {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private bwi.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public bwi() {
      this.c = bwi.a.c;
   }

   @Override
   public int a(ami $$0, boolean $$1, boolean $$2) {
      if (!$$0.O() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? bwi.a.b : bwi.a.c;
         }

         if (this.c == bwi.a.c) {
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
                  this.c = bwi.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = bwi.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(ami $$0) {
      for (cdz $$1 : $$0.w()) {
         if (!$$1.P_()) {
            hx $$2 = $$1.dn();
            if ($$0.b($$2) && !$$0.s($$2).a(arj.ae)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + atq.d(atq.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + atq.d(atq.a($$4) * 32.0F);
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

   private void b(ami $$0) {
      ejz $$1 = this.a($$0, new hx(this.f, this.g, this.h));
      if ($$1 != null) {
         ccg $$2;
         try {
            $$2 = new ccg($$0);
            $$2.a($$0, $$0.d_($$2.dn()), blp.h, null, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ejz a(ami $$0, hx $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(dmw.a.b, $$3, $$4);
         hx $$6 = new hx($$3, $$5, $$4);
         if ($$0.b($$6) && cbn.b(bkz.bp, $$0, blp.h, $$6, $$0.z)) {
            return ejz.c($$6);
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
