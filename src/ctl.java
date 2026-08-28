import java.util.function.Consumer;

public class ctl extends cvk {
   public ctl(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      jj $$1 = $$0.k();
      if ($$1 == jj.a) {
         return brp.d;
      } else {
         deg $$2 = $$0.q();
         czk $$3 = new czk($$0);
         je $$4 = $$3.a();
         cvp $$5 = $$0.n();
         eys $$6 = eys.c($$4);
         eyn $$7 = btv.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arh $$8) {
               Consumer<cjt> $$9 = btv.a($$8, $$5, $$0.o());
               cjt $$10 = btv.d.b($$8, $$9, $$4, btu.m, true, true);
               if ($$10 == null) {
                  return brp.d;
               }

               float $$11 = (float)azd.d((azd.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dx(), $$10.dz(), $$10.dD(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dx(), $$10.dz(), $$10.dD(), awe.aD, awf.e, 0.75F, 0.8F);
               $$10.a(dzl.t, $$0.o());
            }

            $$5.h(1);
            return brp.a;
         } else {
            return brp.d;
         }
      }
   }
}
