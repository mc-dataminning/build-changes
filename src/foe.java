public class foe extends fmw {
   private final daa s;

   public foe(daa $$0) {
      this.s = $$0;
   }

   @Override
   public daa m() {
      return this.s;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(daa $$0) {
      if ($$0 instanceof cob.a $$1) {
         this.m.L().b(new aht($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
