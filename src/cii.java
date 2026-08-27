public class cii extends cik {
   public cii(bnw<? extends cii> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cii(cvr $$0, boi $$1) {
      super(bnw.aR, $$1, $$0);
   }

   public cii(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   protected coy s() {
      return cpg.qB;
   }

   private jx y() {
      cpd $$0 = this.u();
      return (jx)($$0.b() ? jz.T : new jv(jz.Q, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jx $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      bnq $$1 = $$0.a();
      int $$2 = $$1 instanceof ceb ? 3 : 0;
      $$1.a(this.dN().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
