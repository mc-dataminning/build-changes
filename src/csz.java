public class csz extends ctz {
   private final cse a;

   public csz(cse $$0, bsc $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cwp $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cwp $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cwp $$0) {
      return $$0.a(cwt.rf);
   }
}
