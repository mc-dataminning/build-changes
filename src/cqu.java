public class cqu extends cqw {
   public cqu(bvq<? extends cqu> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqu(dhh $$0, bwf $$1, cxo $$2) {
      super(bvq.bk, $$1, $$0, $$2);
   }

   public cqu(dhh $$0, double $$1, double $$2, double $$3, cxo $$4) {
      super(bvq.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxk m() {
      return cxs.ra;
   }

   private lq s() {
      cxo $$0 = this.l();
      return (lq)(!$$0.f() && !$$0.a(this.m()) ? new lo(ls.S, $$0) : ls.X);
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
   protected void a(fbu $$0) {
      super.a($$0);
      bvj $$1 = $$0.a();
      int $$2 = $$1 instanceof cmf ? 3 : 0;
      $$1.a(this.dX().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, (byte)3);
         this.at();
      }
   }
}
