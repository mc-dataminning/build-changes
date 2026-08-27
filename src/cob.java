import java.util.List;

public class cob extends coy {
   public cob(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if (!$$3.a(cyu.co) && !$$3.a(cyu.F)) {
         return blw.e;
      } else {
         hz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return blw.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bnq> $$8 = $$1.a_(null, new enu($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return blw.e;
            } else {
               if ($$1 instanceof aow) {
                  ccp $$9 = new ccp($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dpw.t, $$4);
                  doy $$10 = ((aow)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return blw.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cpd $$0) {
      return true;
   }
}
