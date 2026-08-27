import java.util.List;

public class cjh extends cke {
   public cjh(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if (!$$3.a(cuc.co) && !$$3.a(cuc.F)) {
         return bib.e;
      } else {
         ht $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bib.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bjt> $$8 = $$1.a_(null, new eia($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bib.e;
            } else {
               if ($$1 instanceof alq) {
                  byj $$9 = new byj($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dkl.t, $$4);
                  djn $$10 = ((alq)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bib.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(ckj $$0) {
      return true;
   }
}
