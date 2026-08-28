import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgc implements den {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cgc.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cgc() {
      this.c = cgc.a.c;
   }

   @Override
   public int a(arn $$0, boolean $$1, boolean $$2) {
      if (!$$0.S() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? cgc.a.b : cgc.a.c;
         }

         if (this.c == cgc.a.c) {
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
                  this.c = cgc.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cgc.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(arn $$0) {
      for (com $$1 : $$0.x()) {
         if (!$$1.R_()) {
            jh $$2 = $$1.dx();
            if ($$0.c($$2) && !$$0.t($$2).a(awz.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + azk.d(azk.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + azk.d(azk.a($$4) * 32.0F);
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

   private void b(arn $$0) {
      ezn $$1 = this.a($$0, new jh(this.f, this.g, this.h));
      if ($$1 != null) {
         cmk $$2;
         try {
            $$2 = new cmk($$0);
            $$2.a($$0, $$0.d_($$2.dx()), buk.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ezn a(arn $$0, jh $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(ebf.a.b, $$3, $$4);
         jh $$6 = new jh($$3, $$5, $$4);
         if ($$0.c($$6) && clr.b(bul.bu, $$0, buk.h, $$6, $$0.A)) {
            return ezn.c($$6);
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
