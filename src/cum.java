import java.util.function.Consumer;

public class cum extends cwi {
   public cum(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bsk.d;
      } else {
         dfm $$2 = $$0.q();
         dad $$3 = new dad($$0);
         jh $$4 = $$3.a();
         cwm $$5 = $$0.n();
         ezy $$6 = ezy.c($$4);
         ezt $$7 = bus.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arp $$8) {
               Consumer<ckr> $$9 = bus.a($$8, $$5, $$0.o());
               ckr $$10 = bus.f.b($$8, $$9, $$4, bur.m, true, true);
               if ($$10 == null) {
                  return bsk.d;
               }

               float $$11 = (float)azm.d((azm.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awn.aD, awo.e, 0.75F, 0.8F);
               $$10.a(ear.t, $$0.o());
            }

            $$5.h(1);
            return bsk.a;
         } else {
            return bsk.d;
         }
      }
   }
}
