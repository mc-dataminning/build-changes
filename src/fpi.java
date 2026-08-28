public class fpi extends fnz {
   private final dbh s;

   public fpi(dbh $$0) {
      this.s = $$0;
   }

   @Override
   public dbh m() {
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
   protected void a(dbh $$0) {
      if ($$0 instanceof cop.a $$1) {
         this.l.L().b(new ahq($$1.h().an(), this.a.a(), $$0.p()));
      }
   }
}
