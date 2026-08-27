import java.util.List;

public class clw extends cmt {
   public clw(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if (!$$3.a(cws.co) && !$$3.a(cws.F)) {
         return bkb.e;
      } else {
         hx $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bkb.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<blv> $$8 = $$1.a_(null, new elo($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bkb.e;
            } else {
               if ($$1 instanceof and) {
                  can $$9 = new can($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dnr.t, $$4);
                  dmt $$10 = ((and)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bkb.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cmy $$0) {
      return true;
   }
}
