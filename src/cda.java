public class cda extends ccy {
   private boolean p;

   public cda(btn $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected epo a(int $$0) {
      this.p = this.a.am() == bsw.y;
      this.o = new eps(this.p);
      return new epo(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bj();
   }

   @Override
   protected eww b() {
      return new eww(this.a.dv(), this.a.e(0.5), this.a.dB());
   }

   @Override
   protected double a(eww $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eww $$0, eww $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jd $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
