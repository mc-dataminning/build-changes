public class ctx extends ctz {
   protected ctx(ctz.a $$0, bom... $$1) {
      super($$0, aum.bm, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + ($$0 - 1) * 8;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cpq $$0) {
      return $$0.j() ? false : super.a($$0);
   }

   public static boolean a(cpq $$0, int $$1, awt $$2) {
      return $$0.d() instanceof cnc && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
