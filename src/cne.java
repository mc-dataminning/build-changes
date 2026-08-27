public class cne extends cnf {
   protected cne(cnf.a $$0, bin... $$1) {
      super($$0, cng.g, $$1);
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

   @Override
   public boolean a(ciy $$0) {
      return $$0.a(cjb.rg) ? true : super.a($$0);
   }
}
