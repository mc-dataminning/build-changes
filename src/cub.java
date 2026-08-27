public class cub extends ctm {
   public cub(ctm.a $$0, bnx... $$1) {
      super($$0, aui.bf, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + ($$0 - 1) * 9;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public int a() {
      return 3;
   }

   public static float e(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }
}
