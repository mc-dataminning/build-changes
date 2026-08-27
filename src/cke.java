import java.util.function.Consumer;

public class cke extends cmm {
   public cke(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      ic $$1 = $$0.k();
      if ($$1 == ic.a) {
         return bjv.e;
      } else {
         cti $$2 = $$0.q();
         cpa $$3 = new cpa($$0);
         hx $$4 = $$3.a();
         cmr $$5 = $$0.n();
         elm $$6 = elm.c($$4);
         elh $$7 = blt.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof amz $$8) {
               Consumer<cbe> $$9 = blt.a($$8, $$5, $$0.o());
               cbe $$10 = blt.d.b($$8, $$5.v(), $$9, $$4, bmj.m, true, true);
               if ($$10 == null) {
                  return bjv.e;
               }

               float $$11 = (float)aui.d((aui.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), arm.ao, arn.e, 0.75F, 0.8F);
               $$10.a(dnk.t, $$0.o());
            }

            $$5.h(1);
            return bjv.a($$2.B);
         } else {
            return bjv.e;
         }
      }
   }
}
