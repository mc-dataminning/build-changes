public class cxw extends cxn {
   protected cxw(cxn.a $$0, awd<cry> $$1, bqs... $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public int a(int $$0) {
      return 15 + ($$0 - 1) * 9;
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
   public boolean a(cxn $$0) {
      return super.a($$0) && $$0 != cxq.v;
   }
}
