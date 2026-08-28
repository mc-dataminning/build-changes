public class cta extends cua {
   private final csf a;

   public cta(csf $$0, bse $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwq $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cwq $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cwq $$0) {
      return $$0.a(cwu.rf);
   }
}
