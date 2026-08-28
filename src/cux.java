import java.util.List;

public class cux extends cuj {
   public cux(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if ($$3.a(awd.S)) {
         cmv $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   public static bqq a(cmv $$0, dcu $$1, jd $$2) {
      ciz $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ewr $$8 = new ewr((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btn> $$9 = $$1.a(btn.class, $$8, $$1x -> $$1x.ga() == $$0);

      for (btn $$10 : $$9) {
         if ($$3 == null) {
            $$3 = ciz.b($$1, $$2);
            $$3.v();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxw.b, $$2, dxw.a.a($$0));
         return bqq.a;
      } else {
         return bqq.e;
      }
   }
}
