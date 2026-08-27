public class crg extends cri {
   protected crg(cri.a $$0, blz... $$1) {
      super($$0, crj.j, $$1);
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
   public boolean a(cmx $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(cmx $$0, int $$1, auu $$2) {
      return $$0.d() instanceof ckh && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
