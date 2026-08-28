public class cdx extends cdv {
   private boolean p;

   public cdx(bum $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected erf a(int $$0) {
      this.p = this.a.ao() == btv.y;
      this.o = new erj(this.p);
      return new erf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bm();
   }

   @Override
   protected eys b() {
      return new eys(this.a.dx(), this.a.e(0.5), this.a.dD());
   }

   @Override
   protected double a(eys $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(eys $$0, eys $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(je $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
