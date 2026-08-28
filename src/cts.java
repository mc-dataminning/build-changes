import java.util.List;

public class cts extends cui implements cvf {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cts(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      if (!$$1.B) {
         cun $$2 = $$0.n();
         evp $$3 = $$0.l();
         je $$4 = $$0.k();
         cni $$5 = new cni($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqs.a($$1.B);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      if ($$1.fE()) {
         cun $$3 = $$1.b($$2);
         if (!$$0.B) {
            cni $$4 = new cni($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awj.c.b(this));
         }

         return bqt.a($$1.b($$2), $$0.x_());
      } else {
         return bqt.c($$1.b($$2));
      }
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cxh $$4 = $$0.a(km.T);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      return new cni($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvf.a c() {
      return cvf.a.a().a(cts::a).a(0.5F).b(1.0F).a(1004).a();
   }

   private static evp a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsy.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsy.P.m() / 2.0) - (double)bsy.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsy.P.l() / 2.0)
         );
   }
}
