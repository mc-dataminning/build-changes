import java.util.function.Consumer;

public class cxb extends cyu {
   public cxb(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      ja $$1 = $$0.k();
      if ($$1 == ja.a) {
         return bub.d;
      } else {
         div $$2 = $$0.q();
         dcr $$3 = new dcr($$0);
         iu $$4 = $$3.a();
         cyy $$5 = $$0.n();
         fei $$6 = fei.c($$4);
         fed $$7 = bwm.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arq $$8) {
               Consumer<cms> $$9 = bwm.a($$8, $$5, $$0.o());
               cms $$10 = bwm.f.b($$8, $$9, $$4, bwl.m, true, true);
               if ($$10 == null) {
                  return bub.d;
               }

               float $$11 = (float)azm.d((azm.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awn.aD, awo.e, 0.75F, 0.8F);
               $$10.a(eez.t, $$0.o());
            }

            $$5.h(1);
            return bub.a;
         } else {
            return bub.d;
         }
      }
   }
}
