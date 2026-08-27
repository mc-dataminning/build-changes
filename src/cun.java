import java.util.List;

public class cun extends cuc {
   public cun(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.a(awe.S)) {
         cly $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   public static bqa a(cly $$0, dca $$1, ir $$2) {
      cia $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ewp $$8 = new ewp((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bsq> $$9 = $$1.a(bsq.class, $$8, $$1x -> $$1x.gn() == $$0);

      for (bsq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cia.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxv.b, $$2, dxv.a.a($$0));
         return bqa.a;
      } else {
         return bqa.d;
      }
   }
}
