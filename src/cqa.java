public class cqa extends cra {
   private final cpf a;

   public cqa(cpf $$0, bpw $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cua $$0) {
      return this.a.d($$0) || c($$0);
   }

   @Override
   public int a_(cua $$0) {
      return c($$0) ? 1 : super.a_($$0);
   }

   public static boolean c(cua $$0) {
      return $$0.a(cud.qy);
   }
}
