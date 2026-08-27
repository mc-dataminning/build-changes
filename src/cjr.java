public class cjr extends cjt {
   public cjr(bpd<? extends cjr> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjr(cxb $$0, bpp $$1) {
      super(bpd.aT, $$1, $$0);
   }

   public cjr(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cqh r() {
      return cqp.qB;
   }

   private ka s() {
      cqm $$0 = this.p();
      return (ka)(!$$0.b() && !$$0.a(this.r()) ? new jy(kc.R, $$0) : kc.U);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         ka $$1 = this.s();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM().a($$1, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(epq $$0) {
      super.a($$0);
      box $$1 = $$0.a();
      int $$2 = $$1 instanceof cfj ? 3 : 0;
      $$1.a(this.dN().b(this, this.af_()), (float)$$2);
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, (byte)3);
         this.am();
      }
   }
}
