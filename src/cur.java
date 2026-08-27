public class cur extends cul {
   private static final ii c = new ih();

   public cur(dex.d $$0) {
      super($$0);
   }

   @Override
   protected ii a(ciw $$0) {
      return c;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddc($$0, $$1);
   }

   @Override
   protected void a(aki $$0, gv $$1) {
      gx $$2 = new gx($$0, $$1);
      ddb $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         ciw $$5 = $$3.a($$4);
         if (!$$5.b()) {
            hb $$6 = $$0.a_($$1).c(a);
            bgh $$7 = ddi.a($$0, $$1.a($$6));
            ciw $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = ddi.a($$3, $$7, $$5.p().a(1), $$6.g());
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
