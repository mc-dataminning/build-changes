import java.util.function.Consumer;

public class cvz extends cxu {
   public cvz(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      jo $$1 = $$0.k();
      if ($$1 == jo.a) {
         return btq.d;
      } else {
         dhp $$2 = $$0.q();
         dbn $$3 = new dbn($$0);
         jj $$4 = $$3.a();
         cxy $$5 = $$0.n();
         fcu $$6 = fcu.c($$4);
         fcp $$7 = bwb.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arn $$8) {
               Consumer<cmc> $$9 = bwb.a($$8, $$5, $$0.o());
               cmc $$10 = bwb.f.b($$8, $$9, $$4, bwa.m, true, true);
               if ($$10 == null) {
                  return btq.d;
               }

               float $$11 = (float)azk.d((azk.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awk.aD, awl.e, 0.75F, 0.8F);
               $$10.a(edm.t, $$0.o());
            }

            $$5.h(1);
            return btq.a;
         } else {
            return btq.d;
         }
      }
   }
}
