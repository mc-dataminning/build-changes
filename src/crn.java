public class crn extends csn {
   private final cqs a;

   public crn(cqs $$0, brd $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cvl $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cvl $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cvl $$0) {
      return $$0.a(cvo.qz);
   }
}
