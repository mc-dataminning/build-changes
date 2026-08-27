public class cpx extends cpz {
   protected cpx(cpz.a $$0, bla... $$1) {
      super($$0, cqa.j, $$1);
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
   public boolean a(clo $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(clo $$0, int $$1, atw $$2) {
      return $$0.d() instanceof ciy && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
