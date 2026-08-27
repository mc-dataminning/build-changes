import java.util.List;

public class cjz extends ckw {
   public cjz(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if (!$$3.a(cuv.co) && !$$3.a(cuv.F)) {
         return biq.e;
      } else {
         ht $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return biq.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bki> $$8 = $$1.a_(null, new ejd($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return biq.e;
            } else {
               if ($$1 instanceof ama) {
                  byy $$9 = new byy($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dlg.t, $$4);
                  dki $$10 = ((ama)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return biq.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(clb $$0) {
      return true;
   }
}
