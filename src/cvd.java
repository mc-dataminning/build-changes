import java.util.List;

public class cvd extends cvx {
   public cvd(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if (!$$3.a(dig.co) && !$$3.a(dig.F)) {
         return bsd.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsd.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bue> $$8 = $$1.a_(null, new ezi($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsd.d;
            } else {
               if ($$1 instanceof arn) {
                  cjn $$9 = new cjn($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eag.t, $$4);
                  dzi $$10 = ((arn)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsd.a;
            }
         }
      }
   }
}
