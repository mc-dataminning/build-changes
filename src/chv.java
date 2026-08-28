public abstract class chv extends bwe {
   private static final int cc = 100;
   private int cd;

   protected chv(bus<? extends chv> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public boolean b(are $$0) {
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

   public boolean gI() {
      return this.cd > 100;
   }
}
