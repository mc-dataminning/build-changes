public class cnd extends cne {
   protected cnd(cne.a $$0, bin... $$1) {
      super($$0, cnf.g, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + 10 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public boolean a(cix $$0) {
      return $$0.a(cja.rg) ? true : super.a($$0);
   }
}
