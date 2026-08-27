public class cme extends cmg {
   public cme(brn<? extends cme> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cme(dad $$0, bsa $$1) {
      super(brn.aS, $$1, $$0);
   }

   public cme(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.aS, $$1, $$2, $$3, $$0);
   }

   @Override
   protected csu r() {
      return ctc.qC;
   }

   private kv v() {
      csz $$0 = this.p();
      return (kv)(!$$0.d() && !$$0.a(this.r()) ? new kt(kx.Q, $$0) : kx.T);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         kv $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN().a($$1, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      brh $$1 = $$0.a();
      int $$2 = $$1 instanceof chw ? 3 : 0;
      $$1.a(this.dO().b(this, this.u()), (float)$$2);
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, (byte)3);
         this.am();
      }
   }
}
