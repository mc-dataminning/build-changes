import java.util.function.Consumer;

public class cgu extends cjc {
   public cgu(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      hc $$1 = $$0.k();
      if ($$1 == hc.a) {
         return bha.e;
      } else {
         cpx $$2 = $$0.q();
         clp $$3 = new clp($$0);
         gw $$4 = $$3.a();
         cjh $$5 = $$0.n();
         ehp $$6 = ehp.c($$4);
         ehk $$7 = biw.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aks $$8) {
               Consumer<byf> $$9 = biw.a($$8, $$5, $$0.o());
               byf $$10 = biw.d.b($$8, $$5.v(), $$9, $$4, bjm.m, true, true);
               if ($$10 == null) {
                  return bha.e;
               }

               float $$11 = (float)ary.d((ary.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), apf.ao, apg.e, 0.75F, 0.8F);
               $$10.a(djv.t, $$0.o());
            }

            $$5.h(1);
            return bha.a($$2.B);
         } else {
            return bha.e;
         }
      }
   }
}
