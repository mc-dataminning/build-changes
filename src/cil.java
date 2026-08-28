public abstract class cil extends bwu {
   private static final int cd = 100;
   private int ce;

   protected cil(bvi<? extends cil> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public boolean b(ary $$0) {
      um $$1 = new um();
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
      this.ce++;
      super.h();
   }

   public boolean gE() {
      return this.ce > 100;
   }
}
