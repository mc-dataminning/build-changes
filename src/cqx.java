public class cqx extends cqs {
   protected cqx(cqs.a $$0, blk... $$1) {
      super($$0, cqt.f, $$1);
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
