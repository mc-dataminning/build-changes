import java.util.List;

public class cvs extends cwm {
   public cvs(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      if (!$$3.a(djp.cv) && !$$3.a(djp.I)) {
         return bsl.d;
      } else {
         ji $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsl.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bum> $$8 = $$1.a_(null, new faw($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsl.d;
            } else {
               if ($$1 instanceof ard) {
                  cjv $$9 = new cjv($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ebu.t, $$4);
                  eaw $$10 = ((ard)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsl.a;
            }
         }
      }
   }
}
