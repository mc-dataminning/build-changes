public class fso extends frg {
   private final ddv u;

   public fso(ddv $$0) {
      this.u = $$0;
   }

   @Override
   public ddv m() {
      return this.u;
   }

   @Override
   int D() {
      return 150;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.a.a(this.m().m());
   }

   @Override
   protected void a(ddv $$0) {
      if ($$0 instanceof cqo.a $$1) {
         this.m.L().b(new ail($$1.h().ar(), this.a.a(), $$0.p()));
      }
   }
}
