public class ctk extends ctm {
   protected ctk(ctm.a $$0, bnx... $$1) {
      super($$0, aui.bl, $$1);
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
   public boolean a(cpd $$0) {
      return $$0.j() ? false : super.a($$0);
   }

   public static boolean a(cpd $$0, int $$1, awp $$2) {
      return $$0.d() instanceof cmn && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
