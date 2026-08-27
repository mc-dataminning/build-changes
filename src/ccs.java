public class ccs extends ccu {
   public ccs(biw<? extends ccs> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccs(cpx $$0, bji $$1) {
      super(biw.aP, $$1, $$0);
   }

   public ccs(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cjc s() {
      return cjk.pO;
   }

   private iv x() {
      cjh $$0 = this.t();
      return (iv)($$0.b() ? ix.R : new it(ix.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         iv $$1 = this.x();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL().a($$1, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      bis $$1 = $$0.a();
      int $$2 = $$1 instanceof byu ? 3 : 0;
      $$1.a(this.dM().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.ak();
      }
   }
}
