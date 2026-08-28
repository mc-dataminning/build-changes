import java.util.function.Consumer;

public class cvk extends cxg {
   public cvk(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bte.d;
      } else {
         dha $$2 = $$0.q();
         dbb $$3 = new dbb($$0);
         jh $$4 = $$3.a();
         cxk $$5 = $$0.n();
         fbs $$6 = fbs.c($$4);
         fbn $$7 = bvm.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ash $$8) {
               Consumer<cll> $$9 = bvm.a($$8, $$5, $$0.o());
               cll $$10 = bvm.f.b($$8, $$9, $$4, bvl.m, true, true);
               if ($$10 == null) {
                  return bte.d;
               }

               float $$11 = (float)bae.d((bae.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), axf.aD, axg.e, 0.75F, 0.8F);
               $$10.a(ecj.t, $$0.o());
            }

            $$5.h(1);
            return bte.a;
         } else {
            return bte.d;
         }
      }
   }
}
