public class cqm extends cqo {
   public cqm(bvi<? extends cqm> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqm(dgz $$0, bvx $$1, cxg $$2) {
      super(bvi.bk, $$1, $$0, $$2);
   }

   public cqm(dgz $$0, double $$1, double $$2, double $$3, cxg $$4) {
      super(bvi.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxc m() {
      return cxk.rj;
   }

   private lq s() {
      cxg $$0 = this.l();
      return (lq)(!$$0.f() && !$$0.a(this.m()) ? new lo(ls.T, $$0) : ls.Y);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lq $$1 = this.s();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dW().a($$1, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      bvb $$1 = $$0.a();
      int $$2 = $$1 instanceof clx ? 3 : 0;
      $$1.a(this.dX().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, (byte)3);
         this.at();
      }
   }
}
