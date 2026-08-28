public class cew extends ceu {
   private boolean p;

   public cew(bvk $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected etq a(int $$0) {
      this.p = this.a.aq() == but.H;
      this.o = new etu(this.p);
      this.o.a(false);
      return new etq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fbb b() {
      return new fbb(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fbb $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fbb $$0, fbb $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(ji $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
