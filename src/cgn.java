import java.util.function.Consumer;

public class cgn extends civ {
   public cgn(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      hc $$1 = $$0.k();
      if ($$1 == hc.a) {
         return bgt.e;
      } else {
         cpq $$2 = $$0.q();
         cli $$3 = new cli($$0);
         gw $$4 = $$3.a();
         cja $$5 = $$0.n();
         ehi $$6 = ehi.c($$4);
         ehd $$7 = bip.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof akn $$8) {
               Consumer<bxy> $$9 = bip.a($$8, $$5, $$0.o());
               bxy $$10 = bip.d.b($$8, $$5.v(), $$9, $$4, bjf.m, true, true);
               if ($$10 == null) {
                  return bgt.e;
               }

               float $$11 = (float)ars.d((ars.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dp(), $$10.dr(), $$10.dv(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dp(), $$10.dr(), $$10.dv(), aoz.ao, apa.e, 0.75F, 0.8F);
               $$10.a(djo.t, $$0.o());
            }

            $$5.h(1);
            return bgt.a($$2.B);
         } else {
            return bgt.e;
         }
      }
   }
}
