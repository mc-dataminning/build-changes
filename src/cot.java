public class cot extends cov {
   public cot(btv<? extends cot> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cot(deg $$0, buk $$1, cvp $$2) {
      super(btv.aT, $$1, $$0, $$2);
   }

   public cot(deg $$0, double $$1, double $$2, double $$3, cvp $$4) {
      super(btv.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvk o() {
      return cvt.qD;
   }

   private ll q() {
      cvp $$0 = this.m();
      return (ll)(!$$0.f() && !$$0.a(this.o()) ? new lj(ln.S, $$0) : ln.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         ll $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dS().a($$1, this.dx(), this.dz(), this.dD(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eyp $$0) {
      super.a($$0);
      bto $$1 = $$0.a();
      int $$2 = $$1 instanceof ckj ? 3 : 0;
      $$1.a(this.dT().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.dS().a(this, (byte)3);
         this.as();
      }
   }
}
