import java.util.function.Consumer;

public class csc extends cuf {
   public csc(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      je $$1 = $$0.k();
      if ($$1 == je.a) {
         return bqp.f;
      } else {
         dbt $$2 = $$0.q();
         cxv $$3 = new cxv($$0);
         iz $$4 = $$3.a();
         cuk $$5 = $$0.n();
         evm $$6 = evm.c($$4);
         evh $$7 = bsv.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arb $$8) {
               Consumer<cis> $$9 = bsv.a($$8, $$5, $$0.o());
               cis $$10 = bsv.d.b($$8, $$9, $$4, bto.m, true, true);
               if ($$10 == null) {
                  return bqp.f;
               }

               float $$11 = (float)ayu.d((ayu.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avw.aD, avx.e, 0.75F, 0.8F);
               $$10.a(dwq.t, $$0.o());
            }

            $$5.h(1);
            return bqp.a($$2.B);
         } else {
            return bqp.f;
         }
      }
   }
}
