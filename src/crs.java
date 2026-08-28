import java.util.function.Consumer;

public class crs extends ctv {
   public crs(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      jf $$1 = $$0.k();
      if ($$1 == jf.a) {
         return bqd.f;
      } else {
         dcd $$2 = $$0.q();
         cxk $$3 = new cxk($$0);
         ja $$4 = $$3.a();
         cua $$5 = $$0.n();
         evz $$6 = evz.c($$4);
         evu $$7 = bsj.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqk $$8) {
               Consumer<cig> $$9 = bsj.a($$8, $$5, $$0.o());
               cig $$10 = bsj.d.b($$8, $$9, $$4, btc.m, true, true);
               if ($$10 == null) {
                  return bqd.f;
               }

               float $$11 = (float)aye.d((aye.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avf.aD, avg.e, 0.75F, 0.8F);
               $$10.a(dxa.t, $$0.o());
            }

            $$5.h(1);
            return bqd.a($$2.B);
         } else {
            return bqd.f;
         }
      }
   }
}
