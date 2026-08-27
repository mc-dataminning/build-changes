public class cmx extends cmz {
   public cmx(bsb<? extends cmx> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmx(dca $$0, bso $$1) {
      super(bsb.aW, $$1, $$0);
   }

   public cmx(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.aW, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuc r() {
      return cuk.rZ;
   }

   private kz u() {
      cuh $$0 = this.p();
      return (kz)(!$$0.d() && !$$0.a(this.r()) ? new kx(lb.Q, $$0) : lb.U);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kz $$1 = this.u();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU().a($$1, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      brv $$1 = $$0.a();
      int $$2 = $$1 instanceof cil ? 3 : 0;
      $$1.a(this.dX().b(this, this.t()), (float)$$2);
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, (byte)3);
         this.ao();
      }
   }
}
