import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwd implements crn {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private bwd.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public bwd() {
      this.c = bwd.a.c;
   }

   @Override
   public int a(ame $$0, boolean $$1, boolean $$2) {
      if (!$$0.O() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.z.a(10) == 0 ? bwd.a.b : bwd.a.c;
         }

         if (this.c == bwd.a.c) {
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
                  this.c = bwd.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = bwd.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(ame $$0) {
      for (cdu $$1 : $$0.w()) {
         if (!$$1.O_()) {
            ht $$2 = $$1.dn();
            if ($$0.b($$2) && !$$0.s($$2).a(arf.ae)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.z.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + atm.d(atm.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + atm.d(atm.a($$4) * 32.0F);
                  if (this.a($$0, new ht(this.f, this.g, this.h)) != null) {
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

   private void b(ame $$0) {
      eju $$1 = this.a($$0, new ht(this.f, this.g, this.h));
      if ($$1 != null) {
         ccb $$2;
         try {
            $$2 = new ccb($$0);
            $$2.a($$0, $$0.d_($$2.dn()), blk.h, null, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.z.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private eju a(ame $$0, ht $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.z.a(16) - 8;
         int $$4 = $$1.w() + $$0.z.a(16) - 8;
         int $$5 = $$0.a(dmr.a.b, $$3, $$4);
         ht $$6 = new ht($$3, $$5, $$4);
         if ($$0.b($$6) && cbi.b(bku.bp, $$0, blk.h, $$6, $$0.z)) {
            return eju.c($$6);
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
