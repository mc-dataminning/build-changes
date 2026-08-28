import java.util.List;

public class cuu extends cuk {
   public cuu(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if ($$3.a(awp.S)) {
         cmx $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   public static bqu a(cmx $$0, dby $$1, iz $$2) {
      cjb $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      evm $$8 = new evm((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<btr> $$9 = $$1.a(btr.class, $$8, $$1x -> $$1x.gf() == $$0);

      for (btr $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cjb.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dwv.b, $$2, dwv.a.a($$0));
         return bqu.a;
      } else {
         return bqu.e;
      }
   }
}
