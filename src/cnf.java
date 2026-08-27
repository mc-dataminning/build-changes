import java.util.function.Consumer;

public class cnf extends cpl {
   public cnf(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      ih $$1 = $$0.k();
      if ($$1 == ih.a) {
         return bml.e;
      } else {
         cwe $$2 = $$0.q();
         crx $$3 = new crx($$0);
         ib $$4 = $$3.a();
         cpq $$5 = $$0.n();
         eov $$6 = eov.c($$4);
         eoq $$7 = bol.e.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof apa $$8) {
               Consumer<ceb> $$9 = bol.a($$8, $$5, $$0.o());
               ceb $$10 = bol.e.b($$8, $$9, $$4, bpb.m, true, true);
               if ($$10 == null) {
                  return bml.e;
               }

               float $$11 = (float)awm.d((awm.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.do(), $$10.dq(), $$10.du(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.do(), $$10.dq(), $$10.du(), atp.aB, atq.e, 0.75F, 0.8F);
               $$10.a(dqr.t, $$0.o());
            }

            $$5.h(1);
            return bml.a($$2.B);
         } else {
            return bml.e;
         }
      }
   }
}
