public class byk extends byi {
   private boolean p;

   public byk(boz $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected eii a(int $$0) {
      this.p = this.a.ai() == bol.x;
      this.o = new eij(this.p);
      return new eii(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bd();
   }

   @Override
   protected eov b() {
      return new eov(this.a.do(), this.a.e(0.5), this.a.du());
   }

   @Override
   protected double a(eov $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eov $$0, eov $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ib $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
