import java.util.List;

public class ctt extends cuj implements cvk {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctt(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      if (!$$1.B) {
         cuo $$2 = $$0.n();
         eww $$3 = $$0.l();
         ji $$4 = $$0.k();
         cni $$5 = new cni($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqq.a($$1.B);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      if ($$1.fB()) {
         cuo $$3 = $$1.b($$2);
         if (!$$0.B) {
            cni $$4 = new cni($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avy.c.b(this));
         }

         return bqr.a($$1.b($$2), $$0.x_());
      } else {
         return bqr.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      cxk $$4 = $$0.a(kq.V);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnn a(dcu $$0, jw $$1, cuo $$2, ji $$3) {
      return new cni($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvk.a c() {
      return cvk.a.a().a(ctt::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static eww a(ku $$0, ji $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsw.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsw.P.m() / 2.0) - (double)bsw.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsw.P.l() / 2.0)
         );
   }
}
