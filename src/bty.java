import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bty {
   public static final bty a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bjm> g;

   private bty(boolean $$0) {
      this.c = $$0;
   }

   public static bty a() {
      return new bty(true);
   }

   public static bty b() {
      return new bty(false);
   }

   public bty c() {
      bty $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bty a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bty d() {
      this.e = false;
      return this;
   }

   public bty e() {
      this.f = false;
      return this;
   }

   public bty a(@Nullable Predicate<bjm> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bjm $$0, bjm $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eo()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.en() || $$1.dL().ai() == bhb.a)) {
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

            if (this.e && $$0 instanceof bjo $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
