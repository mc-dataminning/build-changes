public class cqt extends cpz {
   public cqt(cpz.a $$0, bla... $$1) {
      super($$0, cqa.i, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + ($$0 - 1) * 8;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 20;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, blq $$1) {
      return $$1 == blq.e ? (float)$$0 * 2.5F : 0.0F;
   }
}
