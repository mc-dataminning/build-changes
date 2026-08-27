public class ccl extends ccn {
   public ccl(bip<? extends ccl> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccl(cpq $$0, bjb $$1) {
      super(bip.aP, $$1, $$0);
   }

   public ccl(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected civ m() {
      return cjd.pO;
   }

   private iv q() {
      cja $$0 = this.o();
      return (iv)($$0.b() ? ix.R : new it(ix.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         iv $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dK().a($$1, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      bil $$1 = $$0.a();
      int $$2 = $$1 instanceof byn ? 3 : 0;
      $$1.a(this.dL().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, (byte)3);
         this.ak();
      }
   }
}
