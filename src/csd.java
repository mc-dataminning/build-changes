public class csd extends crj {
   public csd(crj.a $$0, bma... $$1) {
      super($$0, crk.i, $$1);
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
   public float a(int $$0, bmq $$1) {
      return $$1 == bmq.e ? (float)$$0 * 2.5F : 0.0F;
   }
}
