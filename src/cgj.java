import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgj implements dey {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cgj.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cgj() {
      this.c = cgj.a.c;
   }

   @Override
   public int a(arp $$0, boolean $$1, boolean $$2) {
      if (!$$0.T() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? cgj.a.b : cgj.a.c;
         }

         if (this.c == cgj.a.c) {
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
                  this.c = cgj.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cgj.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(arp $$0) {
      for (cou $$1 : $$0.y()) {
         if (!$$1.Y_()) {
            jh $$2 = $$1.dv();
            if ($$0.c($$2) && !$$0.t($$2).a(axb.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azm.d(azm.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azm.d(azm.a($$4) * 32.0F);
                  if (this.a($$0, new jh(this.f, this.g, this.h)) != null) {
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

   private void b(arp $$0) {
      ezy $$1 = this.a($$0, new jh(this.f, this.g, this.h));
      if ($$1 != null) {
         cmr $$2;
         try {
            $$2 = new cmr($$0);
            $$2.a($$0, $$0.d_($$2.dv()), bur.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ezy a(arp $$0, jh $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(ebq.a.b, $$3, $$4);
         jh $$6 = new jh($$3, $$5, $$4);
         if ($$0.c($$6) && cly.b(bus.bK, $$0, bur.h, $$6, $$0.A)) {
            return ezy.c($$6);
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
