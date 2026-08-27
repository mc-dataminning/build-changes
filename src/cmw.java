public class cmw extends cnf {
   public cmw(cnf.a $$0, bin... $$1) {
      super($$0, cng.k, $$1);
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
