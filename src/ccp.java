public class ccp extends ccn {
   private boolean p;

   public ccp(btd $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected eox a(int $$0) {
      this.p = this.a.al() == bsm.y;
      this.o = new epb(this.p);
      return new eox(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bj();
   }

   @Override
   protected ewf b() {
      return new ewf(this.a.dv(), this.a.e(0.5), this.a.dB());
   }

   @Override
   protected double a(ewf $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ewf $$0, ewf $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ja $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
