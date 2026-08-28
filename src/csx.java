public class csx extends ctx {
   private final csc a;

   public csx(csc $$0, bsb $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwn $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cwn $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cwn $$0) {
      return $$0.a(cwr.rf);
   }
}
