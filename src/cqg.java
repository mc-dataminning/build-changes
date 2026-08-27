public class cqg extends cpm {
   public cqg(cpm.a $$0, bkn... $$1) {
      super($$0, cpn.i, $$1);
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
   public float a(int $$0, bld $$1) {
      return $$1 == bld.e ? (float)$$0 * 2.5F : 0.0F;
   }
}
