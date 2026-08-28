public abstract class cko extends bys {
   private static final int bM = 100;
   private int bN;

   protected cko(bxe<? extends cko> $$0, djz $$1) {
      super($$0, $$1);
   }

   public boolean b(arv $$0) {
      ua $$1 = new ua();
      $$1.a("id", this.bI());
      this.h($$1);
      if ($$0.j($$1)) {
         this.aq();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void h() {
      this.bN++;
      super.h();
   }

   public boolean gK() {
      return this.bN > 100;
   }
}
