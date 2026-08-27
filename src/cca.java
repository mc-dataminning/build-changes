public abstract class cca extends bqk {
   private static final int ca = 100;
   private int cb;

   protected cca(bpc<? extends cca> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public boolean b(apg $$0) {
      ta $$1 = new ta();
      $$1.a("id", this.bz());
      this.f($$1);
      if ($$0.h($$1)) {
         this.am();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cb++;
      super.l();
   }

   public boolean gw() {
      return this.cb > 100;
   }
}
