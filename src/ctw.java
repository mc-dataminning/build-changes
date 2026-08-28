import java.util.List;

public class ctw extends cum implements cvj {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctw(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      if (!$$1.B) {
         cur $$2 = $$0.n();
         evt $$3 = $$0.l();
         je $$4 = $$0.k();
         cnm $$5 = new cnm($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqw.a($$1.B);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      if ($$1.fE()) {
         cur $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnm $$4 = new cnm($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bqx.a($$1.b($$2), $$0.x_());
      } else {
         return bqx.c($$1.b($$2));
      }
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      cxl $$4 = $$0.a(km.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnr a(dca $$0, js $$1, cur $$2, je $$3) {
      return new cnm($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvj.a c() {
      return cvj.a.a().a(ctw::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static evt a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)btc.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)btc.P.m() / 2.0) - (double)btc.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)btc.P.l() / 2.0)
         );
   }
}
