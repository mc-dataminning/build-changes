public class bxv extends bxt {
   private boolean p;

   public bxv(bok $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehn a(int $$0) {
      this.p = this.a.ai() == bnw.x;
      this.o = new eho(this.p);
      return new ehn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected enz b() {
      return new enz(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(enz $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(enz $$0, enz $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hz $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
