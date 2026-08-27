import java.util.function.Consumer;

public class cmq extends coy {
   public cmq(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      ie $$1 = $$0.k();
      if ($$1 == ie.a) {
         return blw.e;
      } else {
         cvr $$2 = $$0.q();
         crk $$3 = new crk($$0);
         hz $$4 = $$3.a();
         cpd $$5 = $$0.n();
         enz $$6 = enz.c($$4);
         enu $$7 = bnw.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aow $$8) {
               Consumer<cdm> $$9 = bnw.a($$8, $$5, $$0.o());
               cdm $$10 = bnw.e.b($$8, $$5.w(), $$9, $$4, bom.m, true, true);
               if ($$10 == null) {
                  return blw.e;
               }

               float $$11 = (float)awi.d((awi.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), atl.aB, atm.e, 0.75F, 0.8F);
               $$10.a(dpw.t, $$0.o());
            }

            $$5.h(1);
            return blw.a($$2.B);
         } else {
            return blw.e;
         }
      }
   }
}
