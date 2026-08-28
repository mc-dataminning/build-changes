public class cgv extends cgt {
   private boolean p;

   public cgv(bxl $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected exq a(int $$0) {
      this.p = this.a.an() == bwr.H;
      this.o = new exu(this.p);
      this.o.a(false);
      return new exq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bk();
   }

   @Override
   protected ffc b() {
      return new ffc(this.a.dz(), this.a.e(0.5), this.a.dF());
   }

   @Override
   protected double a(ffc $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ffc $$0, ffc $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iv $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
