import javax.annotation.Nullable;

public class chg {
   public static final chg a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private chg.a g;

   private chg(boolean $$0) {
      this.c = $$0;
   }

   public static chg a() {
      return new chg(true);
   }

   public static chg b() {
      return new chg(false);
   }

   public chg c() {
      chg $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public chg a(double $$0) {
      this.d = $$0;
      return this;
   }

   public chg d() {
      this.e = false;
      return this;
   }

   public chg e() {
      this.f = false;
      return this;
   }

   public chg a(@Nullable chg.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(arn $$0, @Nullable bwr $$1, bwr $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.ez()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ey() || $$0.an() == btn.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.aq()) || $$1.s($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.C($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.i($$2.dA(), $$2.dC(), $$2.dG());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof bwt $$6 && !$$6.P().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(bwr var1, arn var2);
   }
}
