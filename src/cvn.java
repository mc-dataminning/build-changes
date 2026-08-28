public class cvn extends cwn {
   private final cus a;

   public cvn(cus $$0, btu $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cyy $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int b_(cyy $$0) {
      return c($$0) ? 1 : super.b_($$0);
   }

   public static boolean c(cyy $$0) {
      return $$0.a(czc.rl);
   }
}
