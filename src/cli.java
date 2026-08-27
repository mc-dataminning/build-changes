public class cli extends clk {
   public cli(bqr<? extends cli> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cli(czu $$0, bre $$1) {
      super(bqr.aS, $$1, $$0);
   }

   public cli(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.aS, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cry r() {
      return csg.qC;
   }

   private ku v() {
      csd $$0 = this.p();
      return (ku)(!$$0.d() && !$$0.a(this.r()) ? new ks(kw.Q, $$0) : kw.T);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         ku $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN().a($$1, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      bql $$1 = $$0.a();
      int $$2 = $$1 instanceof cha ? 3 : 0;
      $$1.a(this.dO().b(this, this.u()), (float)$$2);
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, (byte)3);
         this.am();
      }
   }
}
