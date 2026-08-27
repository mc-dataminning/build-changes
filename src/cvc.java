public class cvc extends cuw {
   private static final ij c = new ii();

   public cvc(dfi.d $$0) {
      super($$0);
   }

   @Override
   protected ij a(cjf $$0) {
      return c;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddn($$0, $$1);
   }

   @Override
   protected void a(akr $$0, gw $$1) {
      gy $$2 = new gy($$0, $$1);
      ddm $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         cjf $$5 = $$3.a($$4);
         if (!$$5.b()) {
            hc $$6 = $$0.a_($$1).c(a);
            bgr $$7 = ddt.a($$0, $$1.a($$6));
            cjf $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = ddt.a($$3, $$7, $$5.p().a(1), $$6.g());
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
