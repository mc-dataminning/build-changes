import java.util.function.Consumer;

public class cuq extends cwm {
   public cuq(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      jn $$1 = $$0.k();
      if ($$1 == jn.a) {
         return bsl.d;
      } else {
         dgj $$2 = $$0.q();
         dah $$3 = new dah($$0);
         ji $$4 = $$3.a();
         cwq $$5 = $$0.n();
         fbb $$6 = fbb.c($$4);
         faw $$7 = but.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ard $$8) {
               Consumer<cks> $$9 = but.a($$8, $$5, $$0.o());
               cks $$10 = but.f.b($$8, $$9, $$4, bus.m, true, true);
               if ($$10 == null) {
                  return bsl.d;
               }

               float $$11 = (float)ayz.d((ayz.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(ebu.t, $$0.o());
            }

            $$5.h(1);
            return bsl.a;
         } else {
            return bsl.d;
         }
      }
   }
}
