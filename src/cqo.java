public class cqo extends cro {
   private final cpu a;

   public cqo(cpu $$0, bqm $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuo $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cuo $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cuo $$0) {
      return $$0.a(cur.qy);
   }
}
