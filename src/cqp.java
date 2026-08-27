import java.util.List;

public class cqp extends cqf {
   public cqp(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if ($$3.a(aun.S)) {
         cis $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   public static bnc a(cis $$0, cwz $$1, ib $$2) {
      cex $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      epm $$8 = new epm((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bpq> $$9 = $$1.a(bpq.class, $$8, $$1x -> $$1x.gc() == $$0);

      for (bpq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cex.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(drn.b, $$2, drn.a.a($$0));
         return bnc.a;
      } else {
         return bnc.d;
      }
   }
}
