import java.util.function.Consumer;

public class cgs extends cja {
   public cgs(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      hc $$1 = $$0.k();
      if ($$1 == hc.a) {
         return bgy.e;
      } else {
         cpv $$2 = $$0.q();
         cln $$3 = new cln($$0);
         gw $$4 = $$3.a();
         cjf $$5 = $$0.n();
         ehn $$6 = ehn.c($$4);
         ehi $$7 = biu.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof akr $$8) {
               Consumer<byd> $$9 = biu.a($$8, $$5, $$0.o());
               byd $$10 = biu.d.b($$8, $$5.v(), $$9, $$4, bjk.m, true, true);
               if ($$10 == null) {
                  return bgy.e;
               }

               float $$11 = (float)arx.d((arx.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), ape.ao, apf.e, 0.75F, 0.8F);
               $$10.a(djt.t, $$0.o());
            }

            $$5.h(1);
            return bgy.a($$2.B);
         } else {
            return bgy.e;
         }
      }
   }
}
