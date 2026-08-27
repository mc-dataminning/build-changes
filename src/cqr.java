import java.util.List;

public class cqr extends crn {
   public cqr(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if (!$$3.a(dcj.co) && !$$3.a(dcj.F)) {
         return bof.e;
      } else {
         id $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bof.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bqa> $$8 = $$1.a_(null, new ese($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bof.e;
            } else {
               if ($$1 instanceof apu) {
                  cfd $$9 = new cfd($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dub.t, $$4);
                  dtd $$10 = ((apu)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().g(1);
               return bof.a($$1.B);
            }
         }
      }
   }
}
