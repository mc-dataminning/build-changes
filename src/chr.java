public class chr extends chp {
   private boolean p;

   public chr(byh $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected eyq a(int $$0) {
      this.p = this.a.an() == bxn.I;
      this.o = new eyu(this.p);
      this.o.a(false);
      return new eyq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bl();
   }

   @Override
   protected fgc b() {
      return new fgc(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fgc $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fgc $$0, fgc $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(iw $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
