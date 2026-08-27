public class ckx extends ckz {
   public ckx(bqg<? extends ckx> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckx(czg $$0, bqt $$1) {
      super(bqg.aS, $$1, $$0);
   }

   public ckx(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.aS, $$1, $$2, $$3, $$0);
   }

   @Override
   protected crn r() {
      return crv.qB;
   }

   private kl v() {
      crs $$0 = this.p();
      return (kl)(!$$0.d() && !$$0.a(this.r()) ? new kj(kn.R, $$0) : kn.U);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kl $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      bqa $$1 = $$0.a();
      int $$2 = $$1 instanceof cgp ? 3 : 0;
      $$1.a(this.dN().b(this, this.u()), (float)$$2);
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
