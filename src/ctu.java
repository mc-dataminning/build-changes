public class ctu extends ctm {
   protected ctu(ctm.a $$0, aup<coy> $$1, bnx... $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public int a(int $$0) {
      return 15 + ($$0 - 1) * 9;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(ctm $$0) {
      return super.a($$0) && $$0 != ctp.v;
   }
}
