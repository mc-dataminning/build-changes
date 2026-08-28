public class cwn extends cxn {
   private final cvs a;

   public cwn(cvs $$0, buk $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(czy $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int b_(czy $$0) {
      return c($$0) ? 1 : super.b_($$0);
   }

   public static boolean c(czy $$0) {
      return $$0.a(dac.ro);
   }
}
