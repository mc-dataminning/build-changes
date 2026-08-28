public class cej extends ceh {
   private boolean p;

   public cej(bux $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected eru a(int $$0) {
      this.p = this.a.aq() == bug.y;
      this.o = new ery(this.p);
      return new eru(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bo();
   }

   @Override
   protected ezh b() {
      return new ezh(this.a.dC(), this.a.e(0.5), this.a.dI());
   }

   @Override
   protected double a(ezh $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ezh $$0, ezh $$1) {
      return a(this.a, $$0, $$1, false);
   }

   @Override
   public boolean a(jg $$0) {
      return !this.b.a_($$0).s();
   }

   @Override
   public void a(boolean $$0) {
   }
}
