import java.util.function.Consumer;

public class cgj extends cir {
   public cgj(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      hb $$1 = $$0.k();
      if ($$1 == hb.a) {
         return bgo.e;
      } else {
         cpk $$2 = $$0.q();
         cle $$3 = new cle($$0);
         gv $$4 = $$3.a();
         ciw $$5 = $$0.n();
         ehf $$6 = ehf.c($$4);
         eha $$7 = bik.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aki $$8) {
               Consumer<bxu> $$9 = bik.a($$8, $$5, $$0.o());
               bxu $$10 = bik.d.b($$8, $$5.v(), $$9, $$4, bja.m, true, true);
               if ($$10 == null) {
                  return bgo.e;
               }

               float $$11 = (float)aro.d((aro.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dp(), $$10.dr(), $$10.dv(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dp(), $$10.dr(), $$10.dv(), aou.ao, aov.e, 0.75F, 0.8F);
               $$10.a(dji.t, $$0.o());
            }

            $$5.h(1);
            return bgo.a($$2.B);
         } else {
            return bgo.e;
         }
      }
   }
}
