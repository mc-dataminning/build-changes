public class cix extends ciz {
   public cix(bol<? extends cix> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cix(cwe $$0, box $$1) {
      super(bol.aR, $$1, $$0);
   }

   public cix(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cpl s() {
      return cpt.qB;
   }

   private jz x() {
      cpq $$0 = this.q();
      return (jz)(!$$0.b() && !$$0.a(this.s()) ? new jx(kb.Q, $$0) : kb.T);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jz $$1 = this.x();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dJ().a($$1, this.do(), this.dq(), this.du(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      bof $$1 = $$0.a();
      int $$2 = $$1 instanceof ceq ? 3 : 0;
      $$1.a(this.dK().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.dJ().a(this, (byte)3);
         this.am();
      }
   }
}
