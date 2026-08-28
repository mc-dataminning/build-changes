import java.util.function.Consumer;

public class csg extends cuj {
   public csg(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqt.f;
      } else {
         dbx $$2 = $$0.q();
         cxz $$3 = new cxz($$0);
         iz $$4 = $$3.a();
         cuo $$5 = $$0.n();
         evq $$6 = evq.c($$4);
         evl $$7 = bsz.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof are $$8) {
               Consumer<ciw> $$9 = bsz.a($$8, $$5, $$0.o());
               ciw $$10 = bsz.d.b($$8, $$9, $$4, bts.m, true, true);
               if ($$10 == null) {
                  return bqt.f;
               }

               float $$11 = (float)ayy.d((ayy.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avz.aD, awa.e, 0.75F, 0.8F);
               $$10.a(dwu.t, $$0.o());
            }

            $$5.h(1);
            return bqt.a($$2.B);
         } else {
            return bqt.f;
         }
      }
   }
}
