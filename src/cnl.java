public class cnl extends cnd {
   protected cnl(cnd.a $$0, bil... $$1) {
      super($$0, cne.f, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + 20 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 2;
   }
}
