import java.util.function.Consumer;

public class crw extends cty {
   public crw(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      jf $$1 = $$0.k();
      if ($$1 == jf.a) {
         return bqh.f;
      } else {
         dcg $$2 = $$0.q();
         cxn $$3 = new cxn($$0);
         ja $$4 = $$3.a();
         cud $$5 = $$0.n();
         ewh $$6 = ewh.c($$4);
         ewc $$7 = bsn.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqm $$8) {
               Consumer<cik> $$9 = bsn.a($$8, $$5, $$0.o());
               cik $$10 = bsn.d.b($$8, $$9, $$4, btg.m, true, true);
               if ($$10 == null) {
                  return bqh.f;
               }

               float $$11 = (float)ayg.d((ayg.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dw(), $$10.dy(), $$10.dC(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dw(), $$10.dy(), $$10.dC(), avh.aD, avi.e, 0.75F, 0.8F);
               $$10.a(dxh.t, $$0.o());
            }

            $$5.h(1);
            return bqh.a($$2.B);
         } else {
            return bqh.f;
         }
      }
   }
}
