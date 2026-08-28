import java.util.List;

public class cus extends cui {
   public cus(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if ($$3.a(awo.S)) {
         cmv $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   public static bqs a(cmv $$0, dbw $$1, iz $$2) {
      ciz $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evk $$8 = new evk((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btp> $$9 = $$1.a(btp.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (btp $$10 : $$9) {
         if ($$3 == null) {
            $$3 = ciz.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dwt.b, $$2, dwt.a.a($$0));
         return bqs.a;
      } else {
         return bqs.e;
      }
   }
}
