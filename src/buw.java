public class buw extends buu {
   private boolean p;

   public buw(bln $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected edo a(int $$0) {
      this.p = this.a.ai() == bkz.v;
      this.o = new edp(this.p);
      return new edo(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected ejz b() {
      return new ejz(this.a.ds(), this.a.e(0.5), this.a.dy());
   }

   @Override
   protected double a(ejz $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ejz $$0, ejz $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(hx $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
