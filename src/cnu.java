public class cnu extends cnw {
   public cnu(bta<? extends cnu> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnu(dby $$0, btp $$1) {
      super(bta.aT, $$1, $$0);
   }

   public cnu(dby $$0, double $$1, double $$2, double $$3) {
      super(bta.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuk u() {
      return cus.qC;
   }

   private lg v() {
      cup $$0 = this.p();
      return (lg)(!$$0.e() && !$$0.a(this.u()) ? new le(li.S, $$0) : li.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lg $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      bsu $$1 = $$0.a();
      int $$2 = $$1 instanceof cjm ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
