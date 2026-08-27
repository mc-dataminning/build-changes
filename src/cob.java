import java.util.function.Consumer;

public class cob extends cqh {
   public cob(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      ih $$1 = $$0.k();
      if ($$1 == ih.a) {
         return bnd.e;
      } else {
         cxb $$2 = $$0.q();
         csu $$3 = new csu($$0);
         ib $$4 = $$3.a();
         cqm $$5 = $$0.n();
         ept $$6 = ept.c($$4);
         epo $$7 = bpd.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof apf $$8) {
               Consumer<ceu> $$9 = bpd.a($$8, $$5, $$0.o());
               ceu $$10 = bpd.e.b($$8, $$9, $$4, bpt.m, true, true);
               if ($$10 == null) {
                  return bnd.e;
               }

               float $$11 = (float)aww.d((aww.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), aty.aD, atz.e, 0.75F, 0.8F);
               $$10.a(drp.t, $$0.o());
            }

            $$5.h(1);
            return bnd.a($$2.B);
         } else {
            return bnd.e;
         }
      }
   }
}
