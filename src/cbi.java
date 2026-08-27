public class cbi extends cbl {
   public cbi(bsc $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected emq a(int $$0) {
      this.o = new emj(false);
      this.o.a(true);
      return new emq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   protected etp b() {
      return new etp(this.a.ds(), this.a.e(0.5), this.a.dy());
   }

   @Override
   protected double a(etp $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(etp $$0, etp $$1) {
      return this.a.bg() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(in $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
