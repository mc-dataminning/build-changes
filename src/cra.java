public class cra extends crc {
   protected cra(crc.a $$0, blu... $$1) {
      super($$0, crd.j, $$1);
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
   public boolean a(cmr $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(cmr $$0, int $$1, aup $$2) {
      return $$0.d() instanceof ckb && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
