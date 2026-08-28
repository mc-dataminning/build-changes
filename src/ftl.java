public class ftl extends fsd {
   private final def u;

   public ftl(def $$0) {
      this.u = $$0;
   }

   @Override
   public def m() {
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
   protected void a(def $$0) {
      if ($$0 instanceof cqx.a $$1) {
         this.m.L().b(new aip($$1.h().as(), this.a.a(), $$0.p()));
      }
   }
}
