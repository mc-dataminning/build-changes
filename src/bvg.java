public class bvg extends buu {
   public static final int c = 40;

   protected bvg(buv $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arn $$0, bwr $$1, int $$2) {
      $$1.a($$0, $$1.dW().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
