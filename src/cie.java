public class cie extends cig {
   public cie(bnu<? extends cie> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cie(cvn $$0, bog $$1) {
      super(bnu.aR, $$1, $$0);
   }

   public cie(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cou s() {
      return cpc.qB;
   }

   private jx y() {
      coz $$0 = this.u();
      return (jx)($$0.b() ? jz.T : new jv(jz.Q, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jx $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      bno $$1 = $$0.a();
      int $$2 = $$1 instanceof cdx ? 3 : 0;
      $$1.a(this.dN().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
