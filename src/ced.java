import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ced {
   public static final ced a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<btl> g;

   private ced(boolean $$0) {
      this.c = $$0;
   }

   public static ced a() {
      return new ced(true);
   }

   public static ced b() {
      return new ced(false);
   }

   public ced c() {
      ced $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public ced a(double $$0) {
      this.d = $$0;
      return this;
   }

   public ced d() {
      this.e = false;
      return this;
   }

   public ced e() {
      this.f = false;
      return this;
   }

   public ced a(@Nullable Predicate<btl> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable btl $$0, btl $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.er()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eq() || $$1.dQ().al() == bqn.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.am()) || $$0.s($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.B($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.i($$1.dv(), $$1.dx(), $$1.dB());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof btn $$5 && !$$5.L().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
