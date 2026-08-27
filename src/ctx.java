public class ctx extends cuc {
   public static final int a = 1000000;
   public static final int b = 20;
   public static final int c = 200;

   public ctx(cuc.a $$0) {
      super($$0);
   }

   @Override
   public cuh a(cuh $$0, dca $$1, bso $$2) {
      $$2.i($$2.aB() + 1000000);
      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuh $$0, dca $$1, brv $$2, int $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drd $$5 = $$0.a(ke.ao);
      if ($$5 != null && $$2.cE() == $$5.a() && $$3 == $$5.b()) {
         if ($$5.c() < 200) {
            $$0.b(ke.ao, new drd($$2.cE(), $$3, $$5.c() + 1));
         }

         int $$6 = aym.b((float)($$5.c() - 20) / 180.0F, 0, 5);
         if ($$6 > 0) {
            $$2.a($$2.dX().e(), (float)$$6);
         }
      } else {
         $$0.b(ke.ao, new drd($$2.cE(), $$3, 0));
      }
   }
}
