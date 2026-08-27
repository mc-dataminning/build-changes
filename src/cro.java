import java.util.List;

public class cro extends cre {
   public cro(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if ($$3.a(avc.S)) {
         cjt $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   public static boa a(cjt $$0, cyx $$1, ib $$2) {
      cfx $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      erv $$8 = new erv((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bqq> $$9 = $$1.a(bqq.class, $$8, $$1x -> $$1x.gc() == $$0);

      for (bqq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cfx.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dts.b, $$2, dts.a.a($$0));
         return boa.a;
      } else {
         return boa.d;
      }
   }
}
