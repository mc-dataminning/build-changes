public class cda extends cdd {
   public cda(btt $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected eon a(int $$0) {
      this.o = new eog(false);
      this.o.a(true);
      return new eon(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return true;
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
      return this.a.bi() ? a(this.a, $$0, $$1, false) : false;
   }

   @Override
   public boolean a(iz $$0) {
      return !this.b.a_($$0.d()).i();
   }

   @Override
   public void a(boolean $$0) {
   }
}
