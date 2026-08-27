public abstract class cbj extends bpt {
   private static final int bY = 100;
   private int bZ;

   protected cbj(bol<? extends cbj> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public boolean b(apb $$0) {
      sy $$1 = new sy();
      $$1.a("id", this.bw());
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
      this.bZ++;
      super.l();
   }

   public boolean gu() {
      return this.bZ > 100;
   }
}
