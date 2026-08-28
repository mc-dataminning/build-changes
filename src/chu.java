public abstract class chu extends bwd {
   private static final int cc = 100;
   private int cd;

   protected chu(bur<? extends chu> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public boolean b(ard $$0) {
      tq $$1 = new tq();
      $$1.a("id", this.bK());
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
      this.cd++;
      super.h();
   }

   public boolean gF() {
      return this.cd > 100;
   }
}
