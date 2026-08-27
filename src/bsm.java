public class bsm extends bsk {
   private boolean p;

   public bsm(bjd $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected eay a(int $$0) {
      this.p = this.a.ag() == bip.v;
      this.o = new eaz(this.p);
      return new eay(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bb();
   }

   @Override
   protected ehi b() {
      return new ehi(this.a.dp(), this.a.e(0.5), this.a.dv());
   }

   @Override
   protected double a(ehi $$0) {
      return $$0.d;
   }

   @Override
   protected boolean a(ehi $$0, ehi $$1) {
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
