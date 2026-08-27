public class cex extends cfw {
   private final cef a;

   public cex(cef $$0, bgj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(ciy $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(ciy $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(ciy $$0) {
      return $$0.a(cjb.pK);
   }
}
