import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cei {
   public static final cei a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<btr> g;

   private cei(boolean $$0) {
      this.c = $$0;
   }

   public static cei a() {
      return new cei(true);
   }

   public static cei b() {
      return new cei(false);
   }

   public cei c() {
      cei $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cei a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cei d() {
      this.e = false;
      return this;
   }

   public cei e() {
      this.f = false;
      return this;
   }

   public cei a(@Nullable Predicate<btr> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable btr $$0, btr $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eu()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.et() || $$1.dP().al() == bqt.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ak()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.du(), $$1.dw(), $$1.dA());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof btt $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
