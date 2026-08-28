public abstract class cjn extends bxv {
   private static final int bJ = 100;
   private int bK;

   protected cjn(bwj<? extends cjn> $$0, dip $$1) {
      super($$0, $$1);
   }

   public boolean b(arp $$0) {
      tx $$1 = new tx();
      $$1.a("id", this.bJ());
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

   public boolean gG() {
      return this.bK > 100;
   }
}
