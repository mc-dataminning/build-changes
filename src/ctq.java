import java.util.List;

public class ctq extends cum {
   public ctq(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if (!$$3.a(dfd.co) && !$$3.a(dfd.F)) {
         return bqw.f;
      } else {
         iz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqw.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsw> $$8 = $$1.a_(null, new evo($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqw.f;
            } else {
               if ($$1 instanceof arf) {
                  cic $$9 = new cic($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dwx.t, $$4);
                  dvz $$10 = ((arf)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqw.a($$1.B);
            }
         }
      }
   }
}
