public class chm extends cim {
   private final cgs a;

   public chm(cgs $$0, biu $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(clo $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(clo $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(clo $$0) {
      return $$0.a(clr.qv);
   }
}
