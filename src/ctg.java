public class ctg extends cti {
   protected ctg(cti.a $$0, bnv... $$1) {
      super($$0, auh.bl, $$1);
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
   public boolean a(coz $$0) {
      return $$0.j() ? false : super.a($$0);
   }

   public static boolean a(coz $$0, int $$1, awo $$2) {
      return $$0.d() instanceof cmj && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
