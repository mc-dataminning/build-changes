import java.util.List;

public class cui extends cty {
   public cui(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if ($$3.a(avw.S)) {
         cml $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   public static bqh a(cml $$0, dcg $$1, ja $$2) {
      cip $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ewc $$8 = new ewc((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bte> $$9 = $$1.a(bte.class, $$8, $$1x -> $$1x.gb() == $$0);

      for (bte $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cip.b($$1, $$2);
            $$3.v();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxh.b, $$2, dxh.a.a($$0));
         return bqh.a;
      } else {
         return bqh.e;
      }
   }
}
