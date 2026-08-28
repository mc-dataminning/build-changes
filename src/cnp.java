public class cnp extends cnr {
   public cnp(bsv<? extends cnp> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnp(dbt $$0, btk $$1) {
      super(bsv.aT, $$1, $$0);
   }

   public cnp(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuf u() {
      return cun.qC;
   }

   private lh v() {
      cuk $$0 = this.p();
      return (lh)(!$$0.e() && !$$0.a(this.u()) ? new lf(lj.S, $$0) : lj.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lh $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP().a($$1, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      bsp $$1 = $$0.a();
      int $$2 = $$1 instanceof cjh ? 3 : 0;
      $$1.a(this.dQ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, (byte)3);
         this.ao();
      }
   }
}
