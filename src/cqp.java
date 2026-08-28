public class cqp extends cqr {
   public cqp(bvi<? extends cqp> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqp(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.bj, $$1, $$0, $$2);
   }

   public cqp(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.bj, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxd g() {
      return cxl.rl;
   }

   private lr j() {
      cxh $$0 = this.f();
      return (lr)($$0.f() ? lt.Z : new lp(lt.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lr $$1 = this.j();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU().a($$1, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      bva $$1 = $$0.a();
      int $$2 = $$1 instanceof cmb ? 3 : 0;
      $$1.a(this.dV().b(this, this.q()), (float)$$2);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, (byte)3);
         this.at();
      }
   }
}
