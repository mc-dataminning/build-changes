public class cnh extends cnj {
   public cnh(bsm<? extends cnh> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnh(dcf $$0, btb $$1) {
      super(bsm.aT, $$1, $$0);
   }

   public cnh(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctx u() {
      return cuf.qC;
   }

   private lh v() {
      cuc $$0 = this.p();
      return (lh)(!$$0.e() && !$$0.a(this.u()) ? new lf(lj.S, $$0) : lj.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lh $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dQ().a($$1, this.dv(), this.dx(), this.dB(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      bsg $$1 = $$0.a();
      int $$2 = $$1 instanceof ciz ? 3 : 0;
      $$1.a(this.dR().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.dQ().a(this, (byte)3);
         this.ap();
      }
   }
}
