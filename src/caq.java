import java.util.EnumSet;

public class caq extends cak {
   private final btn a;
   private btl b;
   private final float c;

   public caq(btn $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(cak.a.c, cak.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cS()) {
         return false;
      } else {
         this.b = this.a.p();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g((bsq)this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aF() ? false : this.a.dT().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aF();
   }

   @Override
   public void d() {
      eww $$0 = this.a.dt();
      eww $$1 = new eww(this.b.dv() - this.a.dv(), 0.0, this.b.dB() - this.a.dB());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.n($$1.c, (double)this.c, $$1.e);
   }
}
