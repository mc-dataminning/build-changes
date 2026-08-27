public class cnz extends cnq {
   protected cnz(cnq.a $$0, cnr $$1, bix... $$2) {
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
   public boolean a(cnq $$0) {
      return super.a($$0) && $$0 != cnu.v;
   }
}
