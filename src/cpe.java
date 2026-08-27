import java.util.List;

public class cpe extends cou {
   public cpe(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if ($$3.a(atz.S)) {
         chh $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   public static blu a(chh $$0, cvn $$1, hz $$2) {
      cdm $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      enn $$8 = new enn((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<boi> $$9 = $$1.a(boi.class, $$8, $$1x -> $$1x.fV() == $$0);

      for (boi $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cdm.b($$1, $$2);
            $$3.D();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dpp.b, $$2, dpp.a.a($$0));
         return blu.a;
      } else {
         return blu.d;
      }
   }
}
