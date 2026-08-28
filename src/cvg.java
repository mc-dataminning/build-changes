import java.util.function.Consumer;

public class cvg extends cxc {
   public cvg(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bta.d;
      } else {
         dgz $$2 = $$0.q();
         dax $$3 = new dax($$0);
         jh $$4 = $$3.a();
         cxg $$5 = $$0.n();
         fbr $$6 = fbr.c($$4);
         fbm $$7 = bvi.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arx $$8) {
               Consumer<clh> $$9 = bvi.a($$8, $$5, $$0.o());
               clh $$10 = bvi.f.b($$8, $$9, $$4, bvh.m, true, true);
               if ($$10 == null) {
                  return bta.d;
               }

               float $$11 = (float)azu.d((azu.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dB(), $$10.dD(), $$10.dH(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dB(), $$10.dD(), $$10.dH(), awv.aD, aww.e, 0.75F, 0.8F);
               $$10.a(eck.t, $$0.o());
            }

            $$5.h(1);
            return bta.a;
         } else {
            return bta.d;
         }
      }
   }
}
