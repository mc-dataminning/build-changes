public class cpg extends cpi {
   public cpg(bug<? extends cpg> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpg(dev $$0, buv $$1, cvx $$2) {
      super(bug.aT, $$1, $$0, $$2);
   }

   public cpg(dev $$0, double $$1, double $$2, double $$3, cvx $$4) {
      super(bug.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvt o() {
      return cwb.qD;
   }

   private lo q() {
      cvx $$0 = this.m();
      return (lo)(!$$0.f() && !$$0.a(this.o()) ? new lm(lq.S, $$0) : lq.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lo $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dX().a($$1, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      btz $$1 = $$0.a();
      int $$2 = $$1 instanceof ckv ? 3 : 0;
      $$1.a(this.dY().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.dX().a(this, (byte)3);
         this.au();
      }
   }
}
