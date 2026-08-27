import java.util.List;

public class cnl extends cnb {
   public cnl(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if ($$3.a(asi.S)) {
         cfq $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   public static bkc a(cfq $$0, ctx $$1, hx $$2) {
      cbv $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      elx $$8 = new elx((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bmq> $$9 = $$1.a(bmq.class, $$8, $$1x -> $$1x.fU() == $$0);

      for (bmq $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cbv.b($$1, $$2);
            $$3.D();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dnz.b, $$2, dnz.a.a($$0));
         return bkc.a;
      } else {
         return bkc.d;
      }
   }
}
