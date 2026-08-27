public class cch extends ccj {
   public cch(bik<? extends cch> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cch(cpk $$0, biw $$1) {
      super(bik.aP, $$1, $$0);
   }

   public cch(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cir m() {
      return ciz.pO;
   }

   private iu q() {
      ciw $$0 = this.o();
      return (iu)($$0.b() ? iw.R : new is(iw.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         iu $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dK().a($$1, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      big $$1 = $$0.a();
      int $$2 = $$1 instanceof byj ? 3 : 0;
      $$1.a(this.dL().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, (byte)3);
         this.ak();
      }
   }
}
