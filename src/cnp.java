public class cnp extends cnq {
   protected cnp(cnq.a $$0, bix... $$1) {
      super($$0, cnr.g, $$1);
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
   public boolean a(cjh $$0) {
      return $$0.a(cjk.rg) ? true : super.a($$0);
   }
}
