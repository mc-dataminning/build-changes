public class bws extends bwg {
   public static final int c = 40;

   protected bws(bwh $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(asb $$0, byf $$1, int $$2) {
      $$1.a($$0, $$1.dW().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
