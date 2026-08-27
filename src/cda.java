public abstract class cda extends brk {
   private static final int ca = 100;
   private int cb;

   protected cda(bqb<? extends cda> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public boolean b(apt $$0) {
      tm $$1 = new tm();
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
