public class cev extends cet {
   private boolean p;

   public cev(bvj $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected etp a(int $$0) {
      this.p = this.a.aq() == bus.H;
      this.o = new ett(this.p);
      this.o.a(false);
      return new etp(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected fba b() {
      return new fba(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(fba $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(fba $$0, fba $$1) {
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
