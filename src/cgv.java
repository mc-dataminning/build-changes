public class cgv extends cgt {
   private boolean p;

   public cgv(bxl $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected exl a(int $$0) {
      this.p = this.a.an() == bwr.H;
      this.o = new exp(this.p);
      this.o.a(false);
      return new exl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bk();
   }

   @Override
   protected fex b() {
      return new fex(this.a.dz(), this.a.e(0.5), this.a.dF());
   }

   @Override
   protected double a(fex $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fex $$0, fex $$1) {
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
