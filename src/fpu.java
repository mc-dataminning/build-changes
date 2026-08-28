public class fpu extends fol {
   private final dbv s;

   public fpu(dbv $$0) {
      this.s = $$0;
   }

   @Override
   public dbv m() {
      return this.s;
   }

   @Override
   int D() {
      return 150;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(dbv $$0) {
      if ($$0 instanceof coz.a $$1) {
         this.l.L().b(new ahw($$1.h().an(), this.a.a(), $$0.p()));
      }
   }
}
