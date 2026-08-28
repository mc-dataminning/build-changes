public class cwp extends cxp {
   private final cvu a;

   public cwp(cvu $$0, bum $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(daa $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int b_(daa $$0) {
      return c($$0) ? 1 : super.b_($$0);
   }

   public static boolean c(daa $$0) {
      return $$0.a(dae.ro);
   }
}
