import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfv {
   public static final cfv a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bve> g;

   private cfv(boolean $$0) {
      this.c = $$0;
   }

   public static cfv a() {
      return new cfv(true);
   }

   public static cfv b() {
      return new cfv(false);
   }

   public cfv c() {
      cfv $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cfv a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cfv d() {
      this.e = false;
      return this;
   }

   public cfv e() {
      this.f = false;
      return this;
   }

   public cfv a(@Nullable Predicate<bve> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bve $$0, bve $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eB()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eA() || $$1.dY().ak() == bse.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ar()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.C($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dD(), $$1.dF(), $$1.dJ());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bvg $$5 && !$$5.Q().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
