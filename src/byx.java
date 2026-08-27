public class byx extends bza {
   public byx(bpr $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected ejf a(int $$0) {
      this.o = new eiy(false);
      this.o.a(true);
      return new ejf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected ept b() {
      return new ept(this.a.dr(), this.a.e(0.5), this.a.dx());
   }

   @Override
   protected double a(ept $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ept $$0, ept $$1) {
      return this.a.bg() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(ib $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
