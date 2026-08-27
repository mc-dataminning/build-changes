public class cnv extends cmc {
   private final cnu a;

   public cnv(cnu $$0, cmc.a $$1) {
      super($$1.b($$0.a()));
      this.a = $$0;
   }

   public cnu i() {
      return this.a;
   }

   @Override
   public int c() {
      return this.a.e();
   }

   @Override
   public boolean a(cmh $$0, cmh $$1) {
      return this.a.f().a($$1) || super.a($$0, $$1);
   }
}
