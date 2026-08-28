public class bwb extends bvv {
   public static final int c = 25;

   protected bwb(bvw $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(ars $$0, bxu $$1, int $$2) {
      if ($$1.eG() > 1.0F) {
         $$1.a($$0, $$1.dW().q(), 1.0F);
      }

      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 25 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
