import java.util.EnumSet;

public class cbz extends cbt {
   private final bux a;
   private buv b;
   private final float c;

   public cbz(bux $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cbt.a.c, cbt.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cZ()) {
         return false;
      } else {
         this.b = this.a.m();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aJ() ? false : this.a.ea().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aJ();
   }

   @Override
   public void d() {
      ezh $$0 = this.a.dA();
      ezh $$1 = new ezh(this.b.dC() - this.a.dC(), 0.0, this.b.dI() - this.a.dI());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
