public class cam extends cap {
   public cam(brg $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected emh a(int $$0) {
      this.o = new ema(false);
      this.o.a(true);
      return new emh(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bg() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(im $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
