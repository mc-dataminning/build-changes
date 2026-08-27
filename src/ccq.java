public class ccq extends ccs {
   public ccq(biu<? extends ccq> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccq(cpv $$0, bjg $$1) {
      super(biu.aP, $$1, $$0);
   }

   public ccq(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cja s() {
      return cji.pO;
   }

   private it x() {
      cjf $$0 = this.t();
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
   protected void a(ehk $$0) {
      super.a($$0);
      biq $$1 = $$0.a();
      int $$2 = $$1 instanceof bys ? 3 : 0;
      $$1.a(this.dM().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, (byte)3);
         this.ak();
      }
   }
}
