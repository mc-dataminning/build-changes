public class ccj extends ccl {
   public ccj(bim<? extends ccj> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccj(cpm $$0, biy $$1) {
      super(bim.aP, $$1, $$0);
   }

   public ccj(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cit m() {
      return cjb.pO;
   }

   private it q() {
      ciy $$0 = this.o();
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
   protected void a(ehb $$0) {
      super.a($$0);
      bii $$1 = $$0.a();
      int $$2 = $$1 instanceof byl ? 3 : 0;
      $$1.a(this.dL().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, (byte)3);
         this.ak();
      }
   }
}
