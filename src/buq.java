public class buq extends bue {
   public static final int c = 40;

   protected buq(buf $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(arx $$0, bvx $$1, int $$2) {
      $$1.a($$0, $$1.dX().r(), 1.0F);
      return true;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      int $$2 = 40 >> $$1;
      return $$2 > 0 ? $$0 % $$2 == 0 : true;
   }
}
