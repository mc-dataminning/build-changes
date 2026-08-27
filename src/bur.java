public class bur extends bup {
   private boolean p;

   public bur(bli $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected edj a(int $$0) {
      this.p = this.a.ai() == bku.v;
      this.o = new edk(this.p);
      return new edj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected eju b() {
      return new eju(this.a.ds(), this.a.e(0.5), this.a.dy());
   }

   @Override
   protected double a(eju $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eju $$0, eju $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ht $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
