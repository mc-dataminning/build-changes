public class cps extends cpu {
   public cps(bus<? extends cps> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cps(dfm $$0, bvh $$1, cwm $$2) {
      super(bus.bg, $$1, $$0, $$2);
   }

   public cps(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      super(bus.bg, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwi l() {
      return cwq.qD;
   }

   private lq n() {
      cwm $$0 = this.j();
      return (lq)(!$$0.f() && !$$0.a(this.l()) ? new lo(ls.S, $$0) : ls.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lq $$1 = this.n();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      bul $$1 = $$0.a();
      int $$2 = $$1 instanceof clh ? 3 : 0;
      $$1.a(this.dW().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(ezw $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
