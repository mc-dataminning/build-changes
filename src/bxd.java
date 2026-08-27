import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxd {
   public static final bxd a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bmo> g;

   private bxd(boolean $$0) {
      this.c = $$0;
   }

   public static bxd a() {
      return new bxd(true);
   }

   public static bxd b() {
      return new bxd(false);
   }

   public bxd c() {
      bxd $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bxd a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bxd d() {
      this.e = false;
      return this;
   }

   public bxd e() {
      this.f = false;
      return this;
   }

   public bxd a(@Nullable Predicate<bmo> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bmo $$0, bmo $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.ep()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eo() || $$1.dL().ak() == bjz.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ai()) || $$0.r($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.A($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dq(), $$1.ds(), $$1.dw());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bmq $$5 && !$$5.O().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
