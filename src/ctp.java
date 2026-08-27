public class ctp extends cti {
   protected ctp(cti.a $$0, bnv... $$1) {
      super($$0, auh.bf, $$1);
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
