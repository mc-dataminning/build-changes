import java.util.List;

public class cup extends cuf {
   public cup(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if ($$3.a(awl.S)) {
         cms $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   public static bqp a(cms $$0, dbt $$1, iz $$2) {
      ciw $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evh $$8 = new evh((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btm> $$9 = $$1.a(btm.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (btm $$10 : $$9) {
         if ($$3 == null) {
            $$3 = ciw.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dwq.b, $$2, dwq.a.a($$0));
         return bqp.a;
      } else {
         return bqp.e;
      }
   }
}
