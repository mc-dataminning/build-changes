public class cno extends cnq {
   protected cno(cnq.a $$0, bix... $$1) {
      super($$0, cnr.j, $$1);
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
   public boolean a(cjh $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(cjh $$0, int $$1, ase $$2) {
      return $$0.d() instanceof cgr && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
