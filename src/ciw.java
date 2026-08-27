public class ciw extends cjw {
   private final cic a;

   public ciw(cic $$0, bju $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cmy $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cmy $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cmy $$0) {
      return $$0.a(cnb.qv);
   }
}
