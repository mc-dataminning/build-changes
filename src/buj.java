public class buj extends buh {
   private boolean p;

   public buj(bla $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected ecx a(int $$0) {
      this.p = this.a.ag() == bkm.v;
      this.o = new ecy(this.p);
      return new ecx(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected eji b() {
      return new eji(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(eji $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(eji $$0, eji $$1) {
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
