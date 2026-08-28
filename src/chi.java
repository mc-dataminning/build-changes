public class chi extends chg {
   private boolean p;

   public chi(bxy $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eyg a(int $$0) {
      this.p = this.a.an() == bxe.I;
      this.o = new eyk(this.p);
      this.o.a(false);
      return new eyg(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bl();
   }

   @Override
   protected ffs b() {
      return new ffs(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(ffs $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ffs $$0, ffs $$1) {
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
