import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bts {
   public static final bts a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bjg> g;

   private bts(boolean $$0) {
      this.c = $$0;
   }

   public static bts a() {
      return new bts(true);
   }

   public static bts b() {
      return new bts(false);
   }

   public bts c() {
      bts $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bts a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bts d() {
      this.e = false;
      return this;
   }

   public bts e() {
      this.f = false;
      return this;
   }

   public bts a(@Nullable Predicate<bjg> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bjg $$0, bjg $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eo()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.en() || $$1.dL().ai() == bgv.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ah()) || $$0.s($$1))) {
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

            if (this.e && $$0 instanceof bji $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
