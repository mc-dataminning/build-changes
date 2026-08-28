import java.util.EnumSet;

public class cci extends ccc {
   private final bvg a;
   private bve b;
   private final float c;

   public cci(bvg $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(ccc.a.c, ccc.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.da()) {
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
               return !this.a.aL() ? false : this.a.eb().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aL();
   }

   @Override
   public void d() {
      ezr $$0 = this.a.dB();
      ezr $$1 = new ezr(this.b.dD() - this.a.dD(), 0.0, this.b.dJ() - this.a.dJ());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
