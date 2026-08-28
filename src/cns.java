public class cns extends cnu {
   public cns(bsw<? extends cns> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cns(dcu $$0, btl $$1) {
      super(bsw.aT, $$1, $$0);
   }

   public cns(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuj t() {
      return cur.qC;
   }

   private lk v() {
      cuo $$0 = this.p();
      return (lk)(!$$0.e() && !$$0.a(this.t()) ? new li(lm.S, $$0) : lm.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lk $$1 = this.v();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dQ().a($$1, this.dv(), this.dx(), this.dB(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      bsq $$1 = $$0.a();
      int $$2 = $$1 instanceof cjk ? 3 : 0;
      $$1.a(this.dR().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.dQ().a(this, (byte)3);
         this.aq();
      }
   }
}
