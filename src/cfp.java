public class cfp extends cfn {
   private boolean p;

   public cfp(bwd $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected euf a(int $$0) {
      this.p = this.a.aq() == bvm.I;
      this.o = new euj(this.p);
      return new euf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fbs b() {
      return new fbs(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fbs $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fbs $$0, fbs $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jh $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
