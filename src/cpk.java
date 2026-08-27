public class cpk extends cpm {
   protected cpk(cpm.a $$0, bkn... $$1) {
      super($$0, cpn.j, $$1);
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
   public boolean a(clb $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(clb $$0, int $$1, ato $$2) {
      return $$0.d() instanceof cil && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
