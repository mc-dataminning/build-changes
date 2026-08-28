public class ftt extends fsk {
   private final dem u;

   public ftt(dem $$0) {
      this.u = $$0;
   }

   @Override
   public dem m() {
      return this.u;
   }

   @Override
   int F() {
      return 150;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dem $$0) {
      if ($$0 instanceof crd.a $$1) {
         this.m.L().b(new ain($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
