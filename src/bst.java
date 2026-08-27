public class bst extends bsr {
   private boolean p;

   public bst(bjk $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebf a(int $$0) {
      this.p = this.a.ag() == biw.v;
      this.o = new ebg(this.p);
      return new ebf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehp b() {
      return new ehp(this.a.dq(), this.a.e(0.5), this.a.dw());
   }

   @Override
   protected double a(ehp $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehp $$0, ehp $$1) {
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
