public class cxd extends cwz {
   protected cxd(cwz.a $$0, bqh... $$1) {
      super($$0, avm.bg, $$1);
   }

   @Override
   public int a(int $$0) {
      return 10 + 20 * ($$0 - 1);
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
