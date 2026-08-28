public class cnu extends cnw {
   public cnu(bsx<? extends cnu> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnu(dcw $$0, btn $$1) {
      super(bsx.aT, $$1, $$0);
   }

   public cnu(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cul t() {
      return cut.qC;
   }

   private lk v() {
      cuq $$0 = this.p();
      return (lk)(!$$0.e() && !$$0.a(this.t()) ? new li(lm.S, $$0) : lm.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lk $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dO().a($$1, this.dt(), this.dv(), this.dz(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      bsr $$1 = $$0.a();
      int $$2 = $$1 instanceof cjm ? 3 : 0;
      $$1.a(this.dP().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if (!this.dO().B) {
         this.dO().a(this, (byte)3);
         this.aq();
      }
   }
}
