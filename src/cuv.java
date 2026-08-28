import java.util.List;

public class cuv extends cul {
   public cuv(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if ($$3.a(awp.S)) {
         cmy $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   public static bqv a(cmy $$0, dbz $$1, iz $$2) {
      cjc $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evn $$8 = new evn((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bts> $$9 = $$1.a(bts.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (bts $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cjc.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dww.b, $$2, dww.a.a($$0));
         return bqv.a;
      } else {
         return bqv.e;
      }
   }
}
