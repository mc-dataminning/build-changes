public class cxl extends cxn {
   protected cxl(cxn.a $$0, bqs... $$1) {
      super($$0, avw.bm, $$1);
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
   public boolean a(csd $$0) {
      return $$0.b(jz.c) ? false : super.a($$0);
   }

   public static boolean a(csd $$0, int $$1, ayd $$2) {
      return $$0.f() instanceof cps && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
