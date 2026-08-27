public class cwx extends cwz {
   protected cwx(cwz.a $$0, bqh... $$1) {
      super($$0, avm.bm, $$1);
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
   public boolean a(crs $$0) {
      return $$0.b(jr.c) ? false : super.a($$0);
   }

   public static boolean a(crs $$0, int $$1, axt $$2) {
      return $$0.f() instanceof cph && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
