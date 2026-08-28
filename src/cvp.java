import java.util.function.Consumer;

public class cvp extends cxl {
   public cvp(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return btj.d;
      } else {
         dhi $$2 = $$0.q();
         dbg $$3 = new dbg($$0);
         jh $$4 = $$3.a();
         cxp $$5 = $$0.n();
         fby $$6 = fby.c($$4);
         fbt $$7 = bvr.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ash $$8) {
               Consumer<clq> $$9 = bvr.a($$8, $$5, $$0.o());
               clq $$10 = bvr.f.b($$8, $$9, $$4, bvq.m, true, true);
               if ($$10 == null) {
                  return btj.d;
               }

               float $$11 = (float)bae.d((bae.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dB(), $$10.dD(), $$10.dH(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dB(), $$10.dD(), $$10.dH(), axf.aD, axg.e, 0.75F, 0.8F);
               $$10.a(ecr.t, $$0.o());
            }

            $$5.h(1);
            return btj.a;
         } else {
            return btj.d;
         }
      }
   }
}
