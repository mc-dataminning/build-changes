import java.util.EnumSet;

public class brm extends bsb {
   private final blp a;

   public brm(blp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.a, bsb.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ci() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean R_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<ht> $$0 = ht.b(
         atm.a(this.a.ds() - 1.0), this.a.dt(), atm.a(this.a.dy() - 1.0), atm.a(this.a.ds() + 1.0), atm.a(this.a.du() + 8.0), atm.a(this.a.dy() + 1.0)
      );
      ht $$1 = null;

      for (ht $$2 : $$0) {
         if (this.a(this.a.dN(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ht.a(this.a.ds(), this.a.du() + 8.0, this.a.dy());
      }

      this.a.N().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new eju((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(blm.a, this.a.dq());
   }

   private boolean a(csd $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cvc.nd)) && $$2.a($$0, $$1, edi.a);
   }
}
