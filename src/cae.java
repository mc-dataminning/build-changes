import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cae {
   public static final cae a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bpo> g;

   private cae(boolean $$0) {
      this.c = $$0;
   }

   public static cae a() {
      return new cae(true);
   }

   public static cae b() {
      return new cae(false);
   }

   public cae c() {
      cae $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cae a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cae d() {
      this.e = false;
      return this;
   }

   public cae e() {
      this.f = false;
      return this;
   }

   public cae a(@Nullable Predicate<bpo> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bpo $$0, bpo $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.er()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eq() || $$1.dM().aj() == bmz.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ai()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dr(), $$1.dt(), $$1.dx());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bpq $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
