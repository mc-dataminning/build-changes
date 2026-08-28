public abstract class cha extends bvj {
   private static final int cc = 100;
   private int cd;

   protected cha(bty<? extends cha> $$0, dej $$1) {
      super($$0, $$1);
   }

   public boolean b(ark $$0) {
      ug $$1 = new ug();
      $$1.a("id", this.bH());
      this.f($$1);
      if ($$0.h($$1)) {
         this.as();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cd++;
      super.l();
   }

   public boolean gE() {
      return this.cd > 100;
   }
}
