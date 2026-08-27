import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buv {
   public static final buv a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bkj> g;

   private buv(boolean $$0) {
      this.c = $$0;
   }

   public static buv a() {
      return new buv(true);
   }

   public static buv b() {
      return new buv(false);
   }

   public buv c() {
      buv $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public buv a(double $$0) {
      this.d = $$0;
      return this;
   }

   public buv d() {
      this.e = false;
      return this;
   }

   public buv e() {
      this.f = false;
      return this;
   }

   public buv a(@Nullable Predicate<bkj> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bkj $$0, bkj $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eo()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.en() || $$1.dL().ai() == bhy.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ag()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dq(), $$1.ds(), $$1.dw());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bkl $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
