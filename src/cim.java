public interface cim {
   int n_ = 10;

   int gn();

   static boolean a(bqt $$0, bqt $$1) {
      float $$2 = (float)$$0.g(bsa.c);
      float $$3;
      if (!$$0.p_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dM().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dN().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.p_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bqt $$0, bqt $$1) {
      double $$2 = $$0.g(bsa.d);
      double $$3 = $$1.g(bsa.n);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dr() - $$0.dr();
         double $$6 = $$1.dx() - $$0.dx();
         float $$7 = (float)($$0.dM().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dM().z.i() * 0.5F + 0.2F);
         esj $$9 = new esj($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dM().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.T = true;
      }
   }
}
