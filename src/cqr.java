import java.util.function.Consumer;

public class cqr extends csu {
   public cqr(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      is $$1 = $$0.k();
      if ($$1 == is.a) {
         return bpm.e;
      } else {
         dad $$2 = $$0.q();
         cwi $$3 = new cwi($$0);
         in $$4 = $$3.a();
         csz $$5 = $$0.n();
         etp $$6 = etp.c($$4);
         etk $$7 = brn.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqh $$8) {
               Consumer<chh> $$9 = brn.a($$8, $$5, $$0.o());
               chh $$10 = brn.d.b($$8, $$9, $$4, bse.m, true, true);
               if ($$10 == null) {
                  return bpm.e;
               }

               float $$11 = (float)axz.d((axz.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.ds(), $$10.du(), $$10.dy(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.ds(), $$10.du(), $$10.dy(), avc.aD, avd.e, 0.75F, 0.8F);
               $$10.a(dva.t, $$0.o());
            }

            $$5.h(1);
            return bpm.a($$2.B);
         } else {
            return bpm.e;
         }
      }
   }
}
