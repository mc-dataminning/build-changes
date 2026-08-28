import java.util.function.Consumer;

public class cyn extends dag {
   public cyn(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      jc $$1 = $$0.k();
      if ($$1 == jc.a) {
         return bvc.d;
      } else {
         dkj $$2 = $$0.q();
         ded $$3 = new ded($$0);
         iw $$4 = $$3.a();
         dak $$5 = $$0.n();
         fgc $$6 = fgc.c($$4);
         ffx $$7 = bxn.g.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof asb $$8) {
               Consumer<coc> $$9 = bxn.a($$8, $$5, $$0.o());
               coc $$10 = bxn.g.b($$8, $$9, $$4, bxm.m, true, true);
               if ($$10 == null) {
                  return bvc.d;
               }

               float $$11 = (float)azz.d((azz.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awy.aD, awz.e, 0.75F, 0.8F);
               $$10.a(egq.t, $$0.o());
            }

            $$5.h(1);
            return bvc.a;
         } else {
            return bvc.d;
         }
      }
   }
}
