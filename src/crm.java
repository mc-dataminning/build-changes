public class crm extends cqs {
   public crm(cqs.a $$0, blk... $$1) {
      super($$0, cqt.i, $$1);
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
   public float a(int $$0, bma $$1) {
      return $$1 == bma.e ? (float)$$0 * 2.5F : 0.0F;
   }
}
