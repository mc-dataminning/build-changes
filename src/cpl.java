public class cpl extends cpn {
   public cpl(bul<? extends cpl> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpl(dfb $$0, bva $$1, cwb $$2) {
      super(bul.aT, $$1, $$0, $$2);
   }

   public cpl(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      super(bul.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvx o() {
      return cwf.qD;
   }

   private lp q() {
      cwb $$0 = this.m();
      return (lp)(!$$0.f() && !$$0.a(this.o()) ? new ln(lr.S, $$0) : lr.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lp $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dX().a($$1, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      bue $$1 = $$0.a();
      int $$2 = $$1 instanceof cla ? 3 : 0;
      $$1.a(this.dY().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.dX().a(this, (byte)3);
         this.av();
      }
   }
}
