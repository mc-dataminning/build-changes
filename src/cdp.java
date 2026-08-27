import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdp implements dbn {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cdp.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cdp() {
      this.c = cdp.a.c;
   }

   @Override
   public int a(aqt $$0, boolean $$1, boolean $$2) {
      if (!$$0.R() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? cdp.a.b : cdp.a.c;
         }

         if (this.c == cdp.a.c) {
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
                  this.c = cdp.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = cdp.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(aqt $$0) {
      for (cly $$1 : $$0.x()) {
         if (!$$1.O_()) {
            ir $$2 = $$1.du();
            if ($$0.c($$2) && !$$0.t($$2).a(awd.aj)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + aym.d(aym.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + aym.d(aym.a($$4) * 32.0F);
                  if (this.a($$0, new ir(this.f, this.g, this.h)) != null) {
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

   private void b(aqt $$0) {
      ewu $$1 = this.a($$0, new ir(this.f, this.g, this.h));
      if ($$1 != null) {
         cjx $$2;
         try {
            $$2 = new cjx($$0);
            $$2.a($$0, $$0.d_($$2.du()), bss.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private ewu a(aqt $$0, ir $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(dyu.a.b, $$3, $$4);
         ir $$6 = new ir($$3, $$5, $$4);
         if ($$0.c($$6) && cjd.b(bsb.by, $$0, bss.h, $$6, $$0.A)) {
            return ewu.c($$6);
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
