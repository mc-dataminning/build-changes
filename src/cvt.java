public class cvt extends cty {
   private final cvs a;

   public cvt(cvs $$0, cty.a $$1) {
      super($$1.b($$0.a()));
      this.a = $$0;
   }

   public cvs h() {
      return this.a;
   }

   @Override
   public int g() {
      return this.a.e();
   }

   @Override
   public boolean a(cud $$0, cud $$1) {
      return this.a.f().a($$1) || super.a($$0, $$1);
   }
}
