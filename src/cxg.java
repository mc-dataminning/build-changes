import java.util.function.Consumer;

public class cxg extends cyz {
   public cxg(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      ja $$1 = $$0.k();
      if ($$1 == ja.a) {
         return bud.d;
      } else {
         dja $$2 = $$0.q();
         dcw $$3 = new dcw($$0);
         iu $$4 = $$3.a();
         czd $$5 = $$0.n();
         feq $$6 = feq.c($$4);
         fel $$7 = bwo.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arq $$8) {
               Consumer<cmw> $$9 = bwo.a($$8, $$5, $$0.o());
               cmw $$10 = bwo.f.b($$8, $$9, $$4, bwn.m, true, true);
               if ($$10 == null) {
                  return bud.d;
               }

               float $$11 = (float)azm.d((azm.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awn.aD, awo.e, 0.75F, 0.8F);
               $$10.a(efh.t, $$0.o());
            }

            $$5.h(1);
            return bud.a;
         } else {
            return bud.d;
         }
      }
   }
}
