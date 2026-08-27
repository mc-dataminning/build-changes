public interface cki {
   int n_ = 10;

   int gp();

   static boolean a(bso $$0, bso $$1) {
      float $$2 = (float)$$0.g(btw.c);
      float $$3;
      if (!$$0.p_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dP().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dQ().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.p_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bso $$0, bso $$1) {
      double $$2 = $$0.g(btw.d);
      double $$3 = $$1.g(btw.n);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.du() - $$0.du();
         double $$6 = $$1.dA() - $$0.dA();
         float $$7 = (float)($$0.dP().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dP().z.i() * 0.5F + 0.2F);
         euk $$9 = new euk($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dP().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.U = true;
      }
   }
}
