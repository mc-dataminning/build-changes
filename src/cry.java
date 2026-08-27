import java.util.List;

public class cry extends csu {
   public cry(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if (!$$3.a(ddg.co) && !$$3.a(ddg.F)) {
         return bpm.e;
      } else {
         in $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bpm.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<brh> $$8 = $$1.a_(null, new etk($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bpm.e;
            } else {
               if ($$1 instanceof aqh) {
                  cgk $$9 = new cgk($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dva.t, $$4);
                  duc $$10 = ((aqh)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bpm.a($$1.B);
            }
         }
      }
   }
}
