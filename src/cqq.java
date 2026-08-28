public class cqq extends cqs {
   public cqq(bvm<? extends cqq> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqq(dha $$0, bwb $$1, cxk $$2) {
      super(bvm.bk, $$1, $$0, $$2);
   }

   public cqq(dha $$0, double $$1, double $$2, double $$3, cxk $$4) {
      super(bvm.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxg m() {
      return cxo.ra;
   }

   private lq s() {
      cxk $$0 = this.l();
      return (lq)(!$$0.f() && !$$0.a(this.m()) ? new lo(ls.S, $$0) : ls.X);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lq $$1 = this.s();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      bvf $$1 = $$0.a();
      int $$2 = $$1 instanceof cmb ? 3 : 0;
      $$1.a(this.dW().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
