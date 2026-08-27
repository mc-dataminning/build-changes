public class cym extends cxn {
   public cym(cxn.a $$0, bqs... $$1) {
      super($$0, avw.bb, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cxn $$0) {
      return super.a($$0) && $$0 != cxq.j;
   }
}
