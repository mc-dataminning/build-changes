public class ctg extends ctm {
   public ctg(ctm.a $$0, bnx... $$1) {
      super($$0, aui.bm, $$1);
   }

   @Override
   public int a(int $$0) {
      return 12 + ($$0 - 1) * 20;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 25;
   }

   @Override
   public int a() {
      return 2;
   }
}
