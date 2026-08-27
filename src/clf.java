import java.util.List;

public class clf extends cmc {
   public clf(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if (!$$3.a(cwb.co) && !$$3.a(cwb.F)) {
         return bjl.e;
      } else {
         hv $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bjl.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<blf> $$8 = $$1.a_(null, new ekw($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bjl.e;
            } else {
               if ($$1 instanceof amp) {
                  bzx $$9 = new bzx($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dmz.t, $$4);
                  dmb $$10 = ((amp)$$1).C();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bjl.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cmh $$0) {
      return true;
   }
}
