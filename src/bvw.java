public class bvw extends bvk {
   public static final int c = 40;

   protected bvw(bvl $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arq $$0, bxj $$1, int $$2) {
      $$1.a($$0, $$1.dV().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
