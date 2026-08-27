import java.util.List;

public class csp extends ctl {
   public csp(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if (!$$3.a(dec.co) && !$$3.a(dec.F)) {
         return bpw.e;
      } else {
         io $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bpw.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<brw> $$8 = $$1.a_(null, new euh($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bpw.e;
            } else {
               if ($$1 instanceof aqn) {
                  chb $$9 = new chb($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dvw.t, $$4);
                  duy $$10 = ((aqn)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bpw.a($$1.B);
            }
         }
      }
   }
}
