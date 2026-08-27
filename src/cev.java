public class cev extends cfu {
   private final ced a;

   public cev(ced $$0, bgh $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ciw $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(ciw $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(ciw $$0) {
      return $$0.a(ciz.pK);
   }
}
