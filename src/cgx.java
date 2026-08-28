public abstract class cgx extends bvg {
   private static final int cc = 100;
   private int cd;

   protected cgx(btv<? extends cgx> $$0, deg $$1) {
      super($$0, $$1);
   }

   public boolean b(ari $$0) {
      uf $$1 = new uf();
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

   public boolean gF() {
      return this.cd > 100;
   }
}
