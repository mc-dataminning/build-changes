public class ctq extends cti {
   protected ctq(cti.a $$0, auo<cou> $$1, bnv... $$2) {
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
   public boolean a(cti $$0) {
      return super.a($$0) && $$0 != ctl.v;
   }
}
