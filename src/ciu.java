import javax.annotation.Nullable;

public class ciu {
   public static final ciu a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private ciu.a g;

   private ciu(boolean $$0) {
      this.c = $$0;
   }

   public static ciu a() {
      return new ciu(true);
   }

   public static ciu b() {
      return new ciu(false);
   }

   public ciu c() {
      ciu $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public ciu a(double $$0) {
      this.d = $$0;
      return this;
   }

   public ciu d() {
      this.e = false;
      return this;
   }

   public ciu e() {
      this.f = false;
      return this;
   }

   public ciu a(@Nullable ciu.a $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(asb $$0, @Nullable byf $$1, byf $$2) {
      if ($$1 == $$2) {
         return false;
      } else if (!$$2.eA()) {
         return false;
      } else if (this.g != null && !this.g.test($$2, $$0)) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c && (!$$2.ez() || $$0.an() == buz.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.an()) || $$1.s($$2))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$3 = this.f ? $$2.C($$1) : 1.0;
               double $$4 = Math.max(this.d * $$3, 2.0);
               double $$5 = $$1.h($$2.dA(), $$2.dC(), $$2.dG());
               if ($$5 > $$4 * $$4) {
                  return false;
               }
            }

            if (this.e && $$1 instanceof byh $$6 && !$$6.O().a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   @FunctionalInterface
   public interface a {
      boolean test(byf var1, asb var2);
   }
}
