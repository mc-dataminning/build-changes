import java.util.List;

public class cti extends cty implements cuv {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cti(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      if (!$$1.B) {
         cud $$2 = $$0.n();
         ewh $$3 = $$0.l();
         jf $$4 = $$0.k();
         cmy $$5 = new cmy($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqh.a($$1.B);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      if ($$1.fC()) {
         cud $$3 = $$1.b($$2);
         if (!$$0.B) {
            cmy $$4 = new cmy($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avr.c.b(this));
         }

         return bqi.a($$1.b($$2), $$0.x_());
      } else {
         return bqi.c($$1.b($$2));
      }
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cww $$4 = $$0.a(kn.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnd a(dcg $$0, jt $$1, cud $$2, jf $$3) {
      return new cmy($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cuv.a c() {
      return cuv.a.a().a(cti::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ewh a(kr $$0, jf $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsn.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsn.P.m() / 2.0) - (double)bsn.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsn.P.l() / 2.0)
         );
   }
}
