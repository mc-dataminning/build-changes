import java.util.List;

public class cte extends csu {
   public cte(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if ($$3.a(avr.S)) {
         clh $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   public static bpm a(clh $$0, dad $$1, in $$2) {
      chl $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      etk $$8 = new etk((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bsc> $$9 = $$1.a(bsc.class, $$8, $$1x -> $$1x.ge() == $$0);

      for (bsc $$10 : $$9) {
         if ($$3 == null) {
            $$3 = chl.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dva.b, $$2, dva.a.a($$0));
         return bpm.a;
      } else {
         return bpm.d;
      }
   }
}
