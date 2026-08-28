public class cev extends cet {
   private boolean p;

   public cev(bvj $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected esl a(int $$0) {
      this.p = this.a.aq() == bus.G;
      this.o = new esp(this.p);
      return new esl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bn();
   }

   @Override
   protected ezy b() {
      return new ezy(this.a.dA(), this.a.e(0.5), this.a.dG());
   }

   @Override
   protected double a(ezy $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ezy $$0, ezy $$1) {
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
