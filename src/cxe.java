public class cxe extends cxn {
   public cxe(cxn.a $$0, bqs... $$1) {
      super($$0, avw.bn, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + ($$0 - 1) * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public int a() {
      return 5;
   }
}
