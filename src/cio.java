public abstract class cio extends bwv {
   private static final int bJ = 100;
   private int bK;

   protected cio(bvi<? extends cio> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public boolean b(are $$0) {
      tq $$1 = new tq();
      $$1.a("id", this.bI());
      this.f($$1);
      if ($$0.h($$1)) {
         this.at();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.bK++;
      super.h();
   }

   public boolean gI() {
      return this.bK > 100;
   }
}
