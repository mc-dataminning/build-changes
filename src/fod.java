public class fod extends fmv {
   private final czy s;

   public fod(czy $$0) {
      this.s = $$0;
   }

   @Override
   public czy m() {
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
   protected void a(czy $$0) {
      if ($$0 instanceof cnz.a $$1) {
         this.m.L().b(new ahs($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
