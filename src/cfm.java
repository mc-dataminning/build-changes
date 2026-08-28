import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfm {
   public static final cfm a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<buv> g;

   private cfm(boolean $$0) {
      this.c = $$0;
   }

   public static cfm a() {
      return new cfm(true);
   }

   public static cfm b() {
      return new cfm(false);
   }

   public cfm c() {
      cfm $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cfm a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cfm d() {
      this.e = false;
      return this;
   }

   public cfm e() {
      this.f = false;
      return this;
   }

   public cfm a(@Nullable Predicate<buv> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable buv $$0, buv $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eA()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.ez() || $$1.dX().am() == brv.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.aq()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.C($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dC(), $$1.dE(), $$1.dI());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bux $$5 && !$$5.Q().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
