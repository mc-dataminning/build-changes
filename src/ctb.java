import java.util.List;

public class ctb extends ctx {
   public ctb(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if (!$$3.a(dfj.co) && !$$3.a(dfj.F)) {
         return bqg.f;
      } else {
         ja $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqg.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsg> $$8 = $$1.a_(null, new ewa($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqg.f;
            } else {
               if ($$1 instanceof aqm) {
                  chm $$9 = new chm($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxg.t, $$4);
                  dwi $$10 = ((aqm)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqg.a($$1.B);
            }
         }
      }
   }
}
