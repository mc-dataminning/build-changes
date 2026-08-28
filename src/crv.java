import java.util.function.Consumer;

public class crv extends ctx {
   public crv(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      jf $$1 = $$0.k();
      if ($$1 == jf.a) {
         return bqg.f;
      } else {
         dcf $$2 = $$0.q();
         cxm $$3 = new cxm($$0);
         ja $$4 = $$3.a();
         cuc $$5 = $$0.n();
         ewf $$6 = ewf.c($$4);
         ewa $$7 = bsm.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqm $$8) {
               Consumer<cij> $$9 = bsm.a($$8, $$5, $$0.o());
               cij $$10 = bsm.d.b($$8, $$9, $$4, btf.m, true, true);
               if ($$10 == null) {
                  return bqg.f;
               }

               float $$11 = (float)ayg.d((ayg.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dv(), $$10.dx(), $$10.dB(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dv(), $$10.dx(), $$10.dB(), avh.aD, avi.e, 0.75F, 0.8F);
               $$10.a(dxg.t, $$0.o());
            }

            $$5.h(1);
            return bqg.a($$2.B);
         } else {
            return bqg.f;
         }
      }
   }
}
