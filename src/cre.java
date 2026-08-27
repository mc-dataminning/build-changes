public class cre extends cpl {
   private final crd a;

   public cre(crd $$0, cpl.a $$1) {
      super($$1.b($$0.a()));
      this.a = $$0;
   }

   public crd i() {
      return this.a;
   }

   @Override
   public int e() {
      return this.a.e();
   }

   @Override
   public boolean a(cpq $$0, cpq $$1) {
      return this.a.f().a($$1) || super.a($$0, $$1);
   }
}
