public class cns extends cnu {
   protected cns(cnu.a $$0, bjb... $$1) {
      super($$0, cnv.j, $$1);
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
   public boolean a(cjl $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(cjl $$0, int $$1, ash $$2) {
      return $$0.d() instanceof cgv && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
