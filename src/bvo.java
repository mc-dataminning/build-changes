public class bvo extends bvc {
   public static final int c = 40;

   protected bvo(bvd $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(aro $$0, bwz $$1, int $$2) {
      $$1.a($$0, $$1.dW().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
