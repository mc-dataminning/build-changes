import java.util.List;

public class ctt extends ctj {
   public ctt(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if ($$3.a(avw.S)) {
         clw $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   public static bpu a(clw $$0, dax $$1, io $$2) {
      cia $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      euf $$8 = new euf((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bsq> $$9 = $$1.a(bsq.class, $$8, $$1x -> $$1x.ge() == $$0);

      for (bsq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cia.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dvu.b, $$2, dvu.a.a($$0));
         return bpu.a;
      } else {
         return bpu.d;
      }
   }
}
