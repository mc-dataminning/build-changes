public class cqr extends cqs {
   protected cqr(cqs.a $$0, blk... $$1) {
      super($$0, cqt.g, $$1);
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
   public boolean a(cmh $$0) {
      return $$0.a(cmk.rS) ? true : super.a($$0);
   }
}
