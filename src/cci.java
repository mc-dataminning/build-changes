public class cci extends cck {
   public cci(bim<? extends cci> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cci(cpl $$0, biy $$1) {
      super(bim.aP, $$1, $$0);
   }

   public cci(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cis m() {
      return cja.pO;
   }

   private it q() {
      cix $$0 = this.o();
      return (it)($$0.b() ? iv.R : new ir(iv.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         it $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dK().a($$1, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      bii $$1 = $$0.a();
      int $$2 = $$1 instanceof byk ? 3 : 0;
      $$1.a(this.dL().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, (byte)3);
         this.ak();
      }
   }
}
