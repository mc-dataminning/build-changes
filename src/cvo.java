import java.util.List;

public class cvo extends cwi {
   public cvo(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if (!$$3.a(dis.co) && !$$3.a(dis.F)) {
         return bsk.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsk.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bul> $$8 = $$1.a_(null, new ezt($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsk.d;
            } else {
               if ($$1 instanceof arp) {
                  cju $$9 = new cju($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ear.t, $$4);
                  dzt $$10 = ((arp)$$1).E();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsk.a;
            }
         }
      }
   }
}
