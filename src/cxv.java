import java.util.List;

public class cxv extends cyo {
   public cxv(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if (!$$3.a(dlw.cv) && !$$3.a(dlw.I)) {
         return bty.d;
      } else {
         iu $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bty.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwa> $$8 = $$1.a_(null, new fdr($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bty.d;
            } else {
               if ($$1 instanceof aro) {
                  clp $$9 = new clp($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eeo.t, $$4);
                  edo $$10 = ((aro)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bty.a;
            }
         }
      }
   }
}
