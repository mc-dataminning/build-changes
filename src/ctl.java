public class ctl extends ctm {
   protected ctl(ctm.a $$0, bnx... $$1) {
      super($$0, aui.bh, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + 10 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 5;
   }
}
