import java.util.List;

public class cuw extends cum {
   public cuw(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if ($$3.a(awp.S)) {
         cmz $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   public static bqw a(cmz $$0, dca $$1, iz $$2) {
      cjd $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evo $$8 = new evo((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btt> $$9 = $$1.a(btt.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (btt $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cjd.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dwx.b, $$2, dwx.a.a($$0));
         return bqw.a;
      } else {
         return bqw.e;
      }
   }
}
