public class bsr extends bsp {
   private boolean p;

   public bsr(bji $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebd a(int $$0) {
      this.p = this.a.ah() == biu.v;
      this.o = new ebe(this.p);
      return new ebd(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bc();
   }

   @Override
   protected ehn b() {
      return new ehn(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(ehn $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehn $$0, ehn $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(gw $$0) {
      return !this.b.a_($$0).i(this.b, $$0);
   }

   @Override
   public void a(boolean $$0) {
   }
}
