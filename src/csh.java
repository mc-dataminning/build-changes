import java.util.function.Consumer;

public class csh extends cuk {
   public csh(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqu.f;
      } else {
         dby $$2 = $$0.q();
         cya $$3 = new cya($$0);
         iz $$4 = $$3.a();
         cup $$5 = $$0.n();
         evr $$6 = evr.c($$4);
         evm $$7 = bta.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arf $$8) {
               Consumer<cix> $$9 = bta.a($$8, $$5, $$0.o());
               cix $$10 = bta.d.b($$8, $$9, $$4, btt.m, true, true);
               if ($$10 == null) {
                  return bqu.f;
               }

               float $$11 = (float)ayz.d((ayz.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(dwv.t, $$0.o());
            }

            $$5.h(1);
            return bqu.a($$2.B);
         } else {
            return bqu.f;
         }
      }
   }
}
