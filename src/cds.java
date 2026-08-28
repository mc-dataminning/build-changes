import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cds {
   public static final cds a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<btb> g;

   private cds(boolean $$0) {
      this.c = $$0;
   }

   public static cds a() {
      return new cds(true);
   }

   public static cds b() {
      return new cds(false);
   }

   public cds c() {
      cds $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cds a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cds d() {
      this.e = false;
      return this;
   }

   public cds e() {
      this.f = false;
      return this;
   }

   public cds a(@Nullable Predicate<btb> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable btb $$0, btb $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.er()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.eq() || $$1.dQ().al() == bqd.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.al()) || $$0.s($$1))) {
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

            if (this.e && $$0 instanceof btd $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
