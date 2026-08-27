public class cxm extends cxn {
   protected cxm(cxn.a $$0, bqs... $$1) {
      super($$0, avw.bi, $$1);
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
