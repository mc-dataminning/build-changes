public class cdf extends cdd {
   private boolean p;

   public cdf(btt $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected eon a(int $$0) {
      this.p = this.a.ak() == btc.y;
      this.o = new eor(this.p);
      return new eon(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evt b() {
      return new evt(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evt $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evt $$0, evt $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iz $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
