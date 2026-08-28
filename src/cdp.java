import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdp {
   public static final cdp a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bsy> g;

   private cdp(boolean $$0) {
      this.c = $$0;
   }

   public static cdp a() {
      return new cdp(true);
   }

   public static cdp b() {
      return new cdp(false);
   }

   public cdp c() {
      cdp $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public cdp a(double $$0) {
      this.d = $$0;
      return this;
   }

   public cdp d() {
      this.e = false;
      return this;
   }

   public cdp e() {
      this.f = false;
      return this;
   }

   public cdp a(@Nullable Predicate<bsy> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bsy $$0, bsy $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.eq()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.ep() || $$1.dP().al() == bqa.a)) {
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

            if (this.e && $$0 instanceof bta $$5 && !$$5.M().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
