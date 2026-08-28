import java.util.function.Consumer;

public class csj extends cum {
   public csj(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqw.f;
      } else {
         dca $$2 = $$0.q();
         cyc $$3 = new cyc($$0);
         iz $$4 = $$3.a();
         cur $$5 = $$0.n();
         evt $$6 = evt.c($$4);
         evo $$7 = btc.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arf $$8) {
               Consumer<ciz> $$9 = btc.a($$8, $$5, $$0.o());
               ciz $$10 = btc.d.b($$8, $$9, $$4, btv.m, true, true);
               if ($$10 == null) {
                  return bqw.f;
               }

               float $$11 = (float)ayz.d((ayz.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(dwx.t, $$0.o());
            }

            $$5.h(1);
            return bqw.a($$2.B);
         } else {
            return bqw.f;
         }
      }
   }
}
