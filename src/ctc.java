import java.util.List;

public class ctc extends cty {
   public ctc(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if (!$$3.a(dfk.co) && !$$3.a(dfk.F)) {
         return bqh.f;
      } else {
         ja $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqh.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsh> $$8 = $$1.a_(null, new ewc($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqh.f;
            } else {
               if ($$1 instanceof aqm) {
                  chn $$9 = new chn($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxh.t, $$4);
                  dwj $$10 = ((aqm)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqh.a($$1.B);
            }
         }
      }
   }
}
