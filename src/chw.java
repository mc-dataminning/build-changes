import java.util.List;

public class chw extends cit {
   public chw(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if (!$$3.a(csn.co) && !$$3.a(csn.F)) {
         return bgq.e;
      } else {
         gu $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bgq.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bii> $$8 = $$1.a_(null, new egz($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bgq.e;
            } else {
               if ($$1 instanceof akk) {
                  bwz $$9 = new bwz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), djk.t, $$4);
                  dim $$10 = ((akk)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bgq.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(ciy $$0) {
      return true;
   }
}
