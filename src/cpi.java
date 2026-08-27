import java.util.List;

public class cpi extends coy {
   public cpi(coy.a $$0) {
      super($$0);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if ($$3.a(aua.S)) {
         chl $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   public static blw a(chl $$0, cvr $$1, hz $$2) {
      cdq $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      enu $$8 = new enu((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bok> $$9 = $$1.a(bok.class, $$8, $$1x -> $$1x.fV() == $$0);

      for (bok $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cdq.b($$1, $$2);
            $$3.D();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dpw.b, $$2, dpw.a.a($$0));
         return blw.a;
      } else {
         return blw.d;
      }
   }
}
