import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwz {
   public static final bwz a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bml> g;

   private bwz(boolean $$0) {
      this.c = $$0;
   }

   public static bwz a() {
      return new bwz(true);
   }

   public static bwz b() {
      return new bwz(false);
   }

   public bwz c() {
      bwz $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bwz a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bwz d() {
      this.e = false;
      return this;
   }

   public bwz e() {
      this.f = false;
      return this;
   }

   public bwz a(@Nullable Predicate<bml> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bml $$0, bml $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.ep()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eo() || $$1.dM().ak() == bjy.a)) {
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

            if (this.e && $$0 instanceof bmn $$5 && !$$5.O().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
