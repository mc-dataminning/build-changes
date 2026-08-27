import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvk {
   public static final bvk a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bky> g;

   private bvk(boolean $$0) {
      this.c = $$0;
   }

   public static bvk a() {
      return new bvk(true);
   }

   public static bvk b() {
      return new bvk(false);
   }

   public bvk c() {
      bvk $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bvk a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bvk d() {
      this.e = false;
      return this;
   }

   public bvk e() {
      this.f = false;
      return this;
   }

   public bvk a(@Nullable Predicate<bky> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bky $$0, bky $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eo()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.en() || $$1.dL().ai() == bin.a)) {
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

            if (this.e && $$0 instanceof bla $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
