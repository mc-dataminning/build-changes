public class cnc extends cnd {
   protected cnc(cnd.a $$0, bil... $$1) {
      super($$0, cne.g, $$1);
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
   public boolean a(ciw $$0) {
      return $$0.a(ciz.rg) ? true : super.a($$0);
   }
}
