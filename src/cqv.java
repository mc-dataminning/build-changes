public class cqv extends cqx {
   public cqv(bvr<? extends cqv> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqv(dhi $$0, bwg $$1, cxp $$2) {
      super(bvr.bk, $$1, $$0, $$2);
   }

   public cqv(dhi $$0, double $$1, double $$2, double $$3, cxp $$4) {
      super(bvr.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxl m() {
      return cxt.ra;
   }

   private lq s() {
      cxp $$0 = this.l();
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
   protected void a(fbv $$0) {
      super.a($$0);
      bvk $$1 = $$0.a();
      int $$2 = $$1 instanceof cmg ? 3 : 0;
      $$1.a(this.dX().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fbw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, (byte)3);
         this.at();
      }
   }
}
