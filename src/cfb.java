public abstract class cfb extends btk {
   private static final int ck = 100;
   private int cl;

   protected cfb(bsb<? extends cfb> $$0, dca $$1) {
      super($$0, $$1);
   }

   public boolean b(aqu $$0) {
      uk $$1 = new uk();
      $$1.a("id", this.bH());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ao();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cl++;
      super.l();
   }

   public boolean gH() {
      return this.cl > 100;
   }
}
