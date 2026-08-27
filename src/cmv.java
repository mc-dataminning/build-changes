public class cmv extends cmx {
   public cmv(bsc<? extends cmv> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmv(daz $$0, bsq $$1) {
      super(bsc.aT, $$1, $$0);
   }

   public cmv(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctl u() {
      return ctt.qC;
   }

   private kw v() {
      ctq $$0 = this.p();
      return (kw)(!$$0.e() && !$$0.a(this.u()) ? new ku(ky.S, $$0) : ky.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kw $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(euj $$0) {
      super.a($$0);
      brw $$1 = $$0.a();
      int $$2 = $$1 instanceof cin ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
