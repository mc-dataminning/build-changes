import java.util.function.Consumer;

public class cku extends cnb {
   public cku(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ic $$1 = $$0.k();
      if ($$1 == ic.a) {
         return bkc.e;
      } else {
         ctx $$2 = $$0.q();
         cpp $$3 = new cpp($$0);
         hx $$4 = $$3.a();
         cng $$5 = $$0.n();
         emc $$6 = emc.c($$4);
         elx $$7 = bmc.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ane $$8) {
               Consumer<cbr> $$9 = bmc.a($$8, $$5, $$0.o());
               cbr $$10 = bmc.e.b($$8, $$5.v(), $$9, $$4, bms.m, true, true);
               if ($$10 == null) {
                  return bkc.e;
               }

               float $$11 = (float)aup.d((aup.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), art.aA, aru.e, 0.75F, 0.8F);
               $$10.a(dnz.t, $$0.o());
            }

            $$5.h(1);
            return bkc.a($$2.B);
         } else {
            return bkc.e;
         }
      }
   }
}
