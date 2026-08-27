public class cpq extends cpz {
   public cpq(cpz.a $$0, bla... $$1) {
      super($$0, cqa.k, $$1);
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
