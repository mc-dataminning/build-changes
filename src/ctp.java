import java.util.List;

public class ctp extends cuf implements cvc {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctp(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      if (!$$1.B) {
         cuk $$2 = $$0.n();
         evm $$3 = $$0.l();
         je $$4 = $$0.k();
         cnf $$5 = new cnf($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqp.a($$1.B);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      if ($$1.fE()) {
         cuk $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnf $$4 = new cnf($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awg.c.b(this));
         }

         return bqq.a($$1.b($$2), $$0.x_());
      } else {
         return bqq.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      cxe $$4 = $$0.a(km.T);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnk a(dbt $$0, js $$1, cuk $$2, je $$3) {
      return new cnf($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvc.a c() {
      return cvc.a.a().a(ctp::a).a(0.5F).b(1.0F).a(1004).a();
   }

   private static evm a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsv.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsv.P.m() / 2.0) - (double)bsv.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsv.P.l() / 2.0)
         );
   }
}
