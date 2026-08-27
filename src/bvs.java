import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvs {
   public static final bvs a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<blg> g;

   private bvs(boolean $$0) {
      this.c = $$0;
   }

   public static bvs a() {
      return new bvs(true);
   }

   public static bvs b() {
      return new bvs(false);
   }

   public bvs c() {
      bvs $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bvs a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bvs d() {
      this.e = false;
      return this;
   }

   public bvs e() {
      this.f = false;
      return this;
   }

   public bvs a(@Nullable Predicate<blg> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable blg $$0, blg $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eq()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.ep() || $$1.dN().aj() == biu.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ai()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.ds(), $$1.du(), $$1.dy());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bli $$5 && !$$5.O().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
