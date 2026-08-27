public abstract class bvo extends bkb {
   private static final int bW = 100;
   private int bX;

   protected bvo(biu<? extends bvo> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public boolean b(aks $$0) {
      qy $$1 = new qy();
      $$1.a("id", this.bu());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ak();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.bX++;
      super.l();
   }

   public boolean gm() {
      return this.bX > 100;
   }
}
