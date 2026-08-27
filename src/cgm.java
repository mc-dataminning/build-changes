public class cgm extends cgo {
   public cgm(bmc<? extends cgm> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgm(ctx $$0, bmo $$1) {
      super(bmc.aR, $$1, $$0);
   }

   public cgm(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cnb s() {
      return cnj.qB;
   }

   private jv y() {
      cng $$0 = this.u();
      return (jv)($$0.b() ? jx.T : new jt(jx.Q, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jv $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL().a($$1, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      blw $$1 = $$0.a();
      int $$2 = $$1 instanceof ccg ? 3 : 0;
      $$1.a(this.dM().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.am();
      }
   }
}
