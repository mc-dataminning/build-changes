public class csa extends crr {
   protected csa(crr.a $$0, crs $$1, bmd... $$2) {
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
   public boolean a(crr $$0) {
      return super.a($$0) && $$0 != crv.v;
   }
}
