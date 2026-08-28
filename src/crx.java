public class crx extends crz {
   public crx(bwm<? extends crx> $$0, div $$1) {
      super($$0, $$1);
   }

   public crx(div $$0, bxc $$1, cyy $$2) {
      super(bwm.bk, $$1, $$0, $$2);
   }

   public crx(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      super(bwm.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cyu g() {
      return czc.rp;
   }

   private lv j() {
      cyy $$0 = this.f();
      return (lv)($$0.f() ? lx.Z : new lt(lx.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lv $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      bwd $$1 = $$0.a();
      int $$2 = $$1 instanceof cni ? 3 : 0;
      $$1.a(this.dW().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
