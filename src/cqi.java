import java.util.List;

public class cqi extends cre {
   public cqi(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if (!$$3.a(dca.co) && !$$3.a(dca.F)) {
         return boa.e;
      } else {
         ib $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return boa.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bpv> $$8 = $$1.a_(null, new erv($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return boa.e;
            } else {
               if ($$1 instanceof aps) {
                  cew $$9 = new cew($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dts.t, $$4);
                  dsu $$10 = ((aps)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().g(1);
               return boa.a($$1.B);
            }
         }
      }
   }
}
