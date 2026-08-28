import java.util.List;

public class ctj extends cuf {
   public ctj(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if (!$$3.a(dew.co) && !$$3.a(dew.F)) {
         return bqp.f;
      } else {
         iz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqp.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsp> $$8 = $$1.a_(null, new evh($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqp.f;
            } else {
               if ($$1 instanceof arb) {
                  chv $$9 = new chv($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dwq.t, $$4);
                  dvs $$10 = ((arb)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqp.a($$1.B);
            }
         }
      }
   }
}
