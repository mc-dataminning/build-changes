import java.util.function.Consumer;

public class csf extends cui {
   public csf(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqs.f;
      } else {
         dbw $$2 = $$0.q();
         cxy $$3 = new cxy($$0);
         iz $$4 = $$3.a();
         cun $$5 = $$0.n();
         evp $$6 = evp.c($$4);
         evk $$7 = bsy.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof are $$8) {
               Consumer<civ> $$9 = bsy.a($$8, $$5, $$0.o());
               civ $$10 = bsy.d.b($$8, $$9, $$4, btr.m, true, true);
               if ($$10 == null) {
                  return bqs.f;
               }

               float $$11 = (float)ayx.d((ayx.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avz.aD, awa.e, 0.75F, 0.8F);
               $$10.a(dwt.t, $$0.o());
            }

            $$5.h(1);
            return bqs.a($$2.B);
         } else {
            return bqs.f;
         }
      }
   }
}
