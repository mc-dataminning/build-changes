public class cbn extends cbl {
   private boolean p;

   public cbn(bsc $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected emq a(int $$0) {
      this.p = this.a.ai() == brn.y;
      this.o = new emu(this.p);
      return new emq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bg();
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
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(in $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
