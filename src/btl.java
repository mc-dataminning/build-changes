import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btl {
   public static final btl a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<biy> g;

   private btl(boolean $$0) {
      this.c = $$0;
   }

   public static btl a() {
      return new btl(true);
   }

   public static btl b() {
      return new btl(false);
   }

   public btl c() {
      btl $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public btl a(double $$0) {
      this.d = $$0;
      return this;
   }

   public btl d() {
      this.e = false;
      return this;
   }

   public btl e() {
      this.f = false;
      return this;
   }

   public btl a(@Nullable Predicate<biy> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable biy $$0, biy $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.en()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.em() || $$1.dK().ai() == bgn.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ag()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dp(), $$1.dr(), $$1.dv());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bja $$5 && !$$5.J().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
