public class ccw extends ccy {
   public ccw(bja<? extends ccw> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccw(cqb $$0, bjm $$1) {
      super(bja.aP, $$1, $$0);
   }

   public ccw(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cjg s() {
      return cjo.pO;
   }

   private it x() {
      cjl $$0 = this.t();
      return (it)($$0.b() ? iv.R : new ir(iv.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         it $$1 = this.x();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL().a($$1, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      biw $$1 = $$0.a();
      int $$2 = $$1 instanceof byy ? 3 : 0;
      $$1.a(this.dM().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.ak();
      }
   }
}
