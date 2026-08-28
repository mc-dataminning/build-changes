import java.util.List;

public class ctp extends cul {
   public ctp(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if (!$$3.a(dfc.co) && !$$3.a(dfc.F)) {
         return bqv.f;
      } else {
         iz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqv.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsv> $$8 = $$1.a_(null, new evn($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqv.f;
            } else {
               if ($$1 instanceof arf) {
                  cib $$9 = new cib($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dww.t, $$4);
                  dvy $$10 = ((arf)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqv.a($$1.B);
            }
         }
      }
   }
}
