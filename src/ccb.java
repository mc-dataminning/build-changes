public class ccb extends cbz {
   private boolean p;

   public ccb(bsq $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.p = this.a.ak() == bsb.A;
      this.o = new epy(this.p);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected ewu b() {
      return new ewu(this.a.dz(), this.a.e(0.5), this.a.dF());
   }

   @Override
   protected double a(ewu $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ewu $$0, ewu $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ir $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
