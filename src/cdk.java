import java.util.EnumSet;

public class cdk extends cde {
   private final bwi a;
   private bwg b;
   private final float c;

   public cdk(bwi $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cde.a.c, cde.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cY()) {
         return false;
      } else {
         this.b = this.a.O_();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aJ() ? false : this.a.dZ().a(b(5)) == 0;
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
      fby $$0 = this.a.dz();
      fby $$1 = new fby(this.b.dB() - this.a.dB(), 0.0, this.b.dH() - this.a.dH());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
