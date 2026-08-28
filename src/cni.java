public class cni extends cnk {
   public cni(bsn<? extends cni> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cni(dcg $$0, btc $$1) {
      super(bsn.aT, $$1, $$0);
   }

   public cni(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cty t() {
      return cug.qC;
   }

   private lh v() {
      cud $$0 = this.p();
      return (lh)(!$$0.e() && !$$0.a(this.t()) ? new lf(lj.S, $$0) : lj.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lh $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dR().a($$1, this.dw(), this.dy(), this.dC(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      bsh $$1 = $$0.a();
      int $$2 = $$1 instanceof cja ? 3 : 0;
      $$1.a(this.dS().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.dR().a(this, (byte)3);
         this.aq();
      }
   }
}
