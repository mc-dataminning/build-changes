public interface cnb {
   int o_ = 10;
   float p_ = 0.2F;

   int gv();

   static boolean a(bve $$0, bve $$1) {
      float $$2 = (float)$$0.h(bwm.c);
      float $$3;
      if (!$$0.p_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dY().A.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      bsy $$5 = $$0.dZ().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dY() instanceof arq $$7) {
            dby.a($$7, (bui)$$1, $$5);
         }

         if (!$$0.p_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(bve $$0, bve $$1) {
      double $$2 = $$0.h(bwm.d);
      double $$3 = $$1.h(bwm.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dD() - $$0.dD();
         double $$6 = $$1.dJ() - $$0.dJ();
         float $$7 = (float)($$0.dY().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dY().A.i() * 0.5F + 0.2F);
         ezr $$9 = new ezr($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dY().A.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.U = true;
      }
   }
}
