public class ceu extends ces {
   private boolean p;

   public ceu(bvi $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected eto a(int $$0) {
      this.p = this.a.aq() == bur.H;
      this.o = new ets(this.p);
      this.o.a(false);
      return new eto(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected faz b() {
      return new faz(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(faz $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(faz $$0, faz $$1) {
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
