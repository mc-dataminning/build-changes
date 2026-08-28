import java.util.EnumSet;

public class cce extends cby {
   private final bvc a;
   private bva b;
   private final float c;

   public cce(bvc $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cby.a.c, cby.a.a));
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
               return !this.a.aK() ? false : this.a.ea().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aK();
   }

   @Override
   public void d() {
      ezn $$0 = this.a.dA();
      ezn $$1 = new ezn(this.b.dC() - this.a.dC(), 0.0, this.b.dI() - this.a.dI());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
