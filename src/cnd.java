public class cnd extends cnf {
   protected cnd(cnf.a $$0, bin... $$1) {
      super($$0, cng.j, $$1);
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
   public boolean a(ciy $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(ciy $$0, int $$1, aru $$2) {
      return $$0.d() instanceof cgi && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
