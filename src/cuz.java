import java.util.List;

public class cuz extends cvt {
   public cuz(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if (!$$3.a(dia.co) && !$$3.a(dia.F)) {
         return bry.d;
      } else {
         jg $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bry.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<btz> $$8 = $$1.a_(null, new ezc($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bry.d;
            } else {
               if ($$1 instanceof arm) {
                  cji $$9 = new cji($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eaa.t, $$4);
                  dzc $$10 = ((arm)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bry.a;
            }
         }
      }
   }
}
