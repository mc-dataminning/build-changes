import java.util.List;

public class ctu extends cuk implements cvh {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctu(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      if (!$$1.B) {
         cup $$2 = $$0.n();
         evr $$3 = $$0.l();
         je $$4 = $$0.k();
         cnk $$5 = new cnk($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqu.a($$1.B);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      if ($$1.fE()) {
         cup $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnk $$4 = new cnk($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bqv.a($$1.b($$2), $$0.x_());
      } else {
         return bqv.c($$1.b($$2));
      }
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      cxj $$4 = $$0.a(km.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnp a(dby $$0, js $$1, cup $$2, je $$3) {
      return new cnk($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvh.a c() {
      return cvh.a.a().a(ctu::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static evr a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bta.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bta.P.m() / 2.0) - (double)bta.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bta.P.l() / 2.0)
         );
   }
}
