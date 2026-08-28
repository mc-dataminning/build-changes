public abstract class cgs extends bvb {
   private static final int cd = 100;
   private int ce;

   protected cgs(btq<? extends cgs> $$0, dds $$1) {
      super($$0, $$1);
   }

   public boolean b(arh $$0) {
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
      this.ce++;
      super.l();
   }

   public boolean gE() {
      return this.ce > 100;
   }
}
