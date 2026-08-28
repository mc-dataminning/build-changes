import java.util.List;

public class cuf extends ctv {
   public cuf(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if ($$3.a(avu.S)) {
         cmh $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   public static bqd a(cmh $$0, dcd $$1, ja $$2) {
      cil $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evu $$8 = new evu((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bta> $$9 = $$1.a(bta.class, $$8, $$1x -> $$1x.gb() == $$0);

      for (bta $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cil.b($$1, $$2);
            $$3.v();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxa.b, $$2, dxa.a.a($$0));
         return bqd.a;
      } else {
         return bqd.e;
      }
   }
}
