import java.util.List;

public class ctt extends cuj implements cvg {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctt(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      if (!$$1.B) {
         cuo $$2 = $$0.n();
         evq $$3 = $$0.l();
         je $$4 = $$0.k();
         cnj $$5 = new cnj($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqt.a($$1.B);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      if ($$1.fE()) {
         cuo $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnj $$4 = new cnj($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awj.c.b(this));
         }

         return bqu.a($$1.b($$2), $$0.x_());
      } else {
         return bqu.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      cxi $$4 = $$0.a(km.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cno a(dbx $$0, js $$1, cuo $$2, je $$3) {
      return new cnj($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvg.a c() {
      return cvg.a.a().a(ctt::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static evq a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsz.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsz.P.m() / 2.0) - (double)bsz.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsz.P.l() / 2.0)
         );
   }
}
