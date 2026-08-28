public interface cms {
   int o_ = 10;
   float p_ = 0.2F;

   int gv();

   static boolean a(buv $$0, buv $$1) {
      float $$2 = (float)$$0.h(bwd.c);
      float $$3;
      if (!$$0.p_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dX().A.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      bsp $$5 = $$0.dY().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dX() instanceof arm $$7) {
            dbo.a($$7, (btz)$$1, $$5);
         }

         if (!$$0.p_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(buv $$0, buv $$1) {
      double $$2 = $$0.h(bwd.d);
      double $$3 = $$1.h(bwd.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dC() - $$0.dC();
         double $$6 = $$1.dI() - $$0.dI();
         float $$7 = (float)($$0.dX().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dX().A.i() * 0.5F + 0.2F);
         ezh $$9 = new ezh($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dX().A.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.U = true;
      }
   }
}
