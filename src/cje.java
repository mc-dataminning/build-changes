public class cje extends cke {
   private final cik a;

   public cje(cik $$0, bjv $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cng $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cng $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cng $$0) {
      return $$0.a(cnj.qx);
   }
}
