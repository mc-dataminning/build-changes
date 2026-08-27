import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btu {
   public static final btu a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bji> g;

   private btu(boolean $$0) {
      this.c = $$0;
   }

   public static btu a() {
      return new btu(true);
   }

   public static btu b() {
      return new btu(false);
   }

   public btu c() {
      btu $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public btu a(double $$0) {
      this.d = $$0;
      return this;
   }

   public btu d() {
      this.e = false;
      return this;
   }

   public btu e() {
      this.f = false;
      return this;
   }

   public btu a(@Nullable Predicate<bji> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bji $$0, bji $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eo()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.en() || $$1.dL().ai() == bgx.a)) {
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

            if (this.e && $$0 instanceof bjk $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
