public class cut extends cun {
   private static final ih c = new ig();

   public cut(dez.d $$0) {
      super($$0);
   }

   @Override
   protected ih a(ciy $$0) {
      return c;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dde($$0, $$1);
   }

   @Override
   protected void a(akk $$0, gu $$1) {
      gw $$2 = new gw($$0, $$1);
      ddd $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         ciy $$5 = $$3.a($$4);
         if (!$$5.b()) {
            ha $$6 = $$0.a_($$1).c(a);
            bgj $$7 = ddk.a($$0, $$1.a($$6));
            ciy $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = ddk.a($$3, $$7, $$5.p().a(1), $$6.g());
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
