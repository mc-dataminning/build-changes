public class crr extends cri {
   protected crr(cri.a $$0, crj $$1, blz... $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public int a(int $$0) {
      return 15 + ($$0 - 1) * 9;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cri $$0) {
      return super.a($$0) && $$0 != crm.v;
   }
}
