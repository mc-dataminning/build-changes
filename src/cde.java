import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cde {
   public static final cde a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bso> g;

   private cde(boolean $$0) {
      this.c = $$0;
   }

   public static cde a() {
      return new cde(true);
   }

   public static cde b() {
      return new cde(false);
   }

   public cde c() {
      cde $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cde a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cde d() {
      this.e = false;
      return this;
   }

   public cde e() {
      this.f = false;
      return this;
   }

   public cde a(@Nullable Predicate<bso> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bso $$0, bso $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eC()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eB() || $$1.dU().al() == bpx.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ak()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dz(), $$1.dB(), $$1.dF());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bsq $$5 && !$$5.K().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
