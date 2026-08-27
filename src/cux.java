public class cux extends cur {
   private static final ij c = new ii();

   public cux(dfd.d $$0) {
      super($$0);
   }

   @Override
   protected ij a(cja $$0) {
      return c;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddi($$0, $$1);
   }

   @Override
   protected void a(akn $$0, gw $$1) {
      gy $$2 = new gy($$0, $$1);
      ddh $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         cja $$5 = $$3.a($$4);
         if (!$$5.b()) {
            hc $$6 = $$0.a_($$1).c(a);
            bgm $$7 = ddo.a($$0, $$1.a($$6));
            cja $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = ddo.a($$3, $$7, $$5.p().a(1), $$6.g());
               if ($$8.b()) {
                  $$8 = $$5.p();
                  $$8.h(1);
               } else {
                  $$8 = $$5.p();
               }
            }

            $$3.a($$4, $$8);
         }
      }
   }
}
