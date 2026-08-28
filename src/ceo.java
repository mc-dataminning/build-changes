public class ceo extends cem {
   private boolean p;

   public ceo(bvc $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected esa a(int $$0) {
      this.p = this.a.ar() == bul.y;
      this.o = new ese(this.p);
      return new esa(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.p || this.a.bo();
   }

   @Override
   protected ezn b() {
      return new ezn(this.a.dC(), this.a.e(0.5), this.a.dI());
   }

   @Override
   protected double a(ezn $$0) {
      return $$0.e;
   }

   @Override
   protected boolean a(ezn $$0, ezn $$1) {
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
