public class cdc extends cda {
   private boolean p;

   public cdc(btq $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eok a(int $$0) {
      this.p = this.a.ak() == bsz.y;
      this.o = new eoo(this.p);
      return new eok(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bi();
   }

   @Override
   protected evq b() {
      return new evq(this.a.du(), this.a.e(0.5), this.a.dA());
   }

   @Override
   protected double a(evq $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(evq $$0, evq $$1) {
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
