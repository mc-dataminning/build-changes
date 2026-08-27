public class cnr extends cos {
   private final cmx a;

   public cnr(cmx $$0, bny $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(crs $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(crs $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(crs $$0) {
      return $$0.a(crv.qx);
   }
}
