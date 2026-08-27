import java.util.List;

public class cpv extends cpl {
   public cpv(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if ($$3.a(aue.S)) {
         cia $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   public static bml a(cia $$0, cwe $$1, ib $$2) {
      cef $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      eoq $$8 = new eoq((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<boz> $$9 = $$1.a(boz.class, $$8, $$1x -> $$1x.ga() == $$0);

      for (boz $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cef.b($$1, $$2);
            $$3.D();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dqr.b, $$2, dqr.a.a($$0));
         return bml.a;
      } else {
         return bml.d;
      }
   }
}
