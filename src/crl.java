public class crl extends crr {
   public crl(crr.a $$0, bmd... $$1) {
      super($$0, crs.k, $$1);
   }

   @Override
   public int a(int $$0) {
      return 12 + ($$0 - 1) * 20;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 25;
   }

   @Override
   public int a() {
      return 2;
   }
}
