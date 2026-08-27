public class fni extends fma {
   private final cze s;

   public fni(cze $$0) {
      this.s = $$0;
   }

   @Override
   public cze m() {
      return this.s;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(cze $$0) {
      if ($$0 instanceof cnk.a $$1) {
         this.m.L().b(new ahn($$1.h().aj(), this.a.a(), $$0.p()));
      }
   }
}
