public class ctt extends cut {
   private final csy a;

   public ctt(csy $$0, bsr $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cxh $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cxh $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cxh $$0) {
      return $$0.a(cxl.rh);
   }
}
