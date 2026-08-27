public class cny extends cnq {
   protected cny(cnq.a $$0, bix... $$1) {
      super($$0, cnr.f, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + 20 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 2;
   }
}
