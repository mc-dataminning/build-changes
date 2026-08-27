import java.util.List;

public class clp extends cmm {
   public clp(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if (!$$3.a(cwl.co) && !$$3.a(cwl.F)) {
         return bjv.e;
      } else {
         hx $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bjv.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<blp> $$8 = $$1.a_(null, new elh($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bjv.e;
            } else {
               if ($$1 instanceof amz) {
                  cah $$9 = new cah($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dnk.t, $$4);
                  dmm $$10 = ((amz)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bjv.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cmr $$0) {
      return true;
   }
}
