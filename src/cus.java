public class cus extends cum {
   private static final ih c = new ig();

   public cus(dey.d $$0) {
      super($$0);
   }

   @Override
   protected ih a(cix $$0) {
      return c;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddd($$0, $$1);
   }

   @Override
   protected void a(akk $$0, gu $$1) {
      gw $$2 = new gw($$0, $$1);
      ddc $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         cix $$5 = $$3.a($$4);
         if (!$$5.b()) {
            ha $$6 = $$0.a_($$1).c(a);
            bgj $$7 = ddj.a($$0, $$1.a($$6));
            cix $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = ddj.a($$3, $$7, $$5.p().a(1), $$6.g());
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
