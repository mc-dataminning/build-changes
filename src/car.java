public class car extends cap {
   private boolean p;

   public car(brg $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected emh a(int $$0) {
      this.p = this.a.ai() == bqr.y;
      this.o = new eml(this.p);
      return new emh(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
   }

   @Override
   protected etf b() {
      return new etf(this.a.ds(), this.a.e(0.5), this.a.dy());
   }

   @Override
   protected double a(etf $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(etf $$0, etf $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(im $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
