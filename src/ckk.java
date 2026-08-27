public interface ckk {
   int n_ = 10;

   int gy();

   static boolean a(bso $$0, bso $$1) {
      float $$2 = (float)$$0.g(btv.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dU().A.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dX().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bso $$0, bso $$1) {
      double $$2 = $$0.g(btv.d);
      double $$3 = $$1.g(btv.n);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dz() - $$0.dz();
         double $$6 = $$1.dF() - $$0.dF();
         float $$7 = (float)($$0.dU().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dU().A.i() * 0.5F + 0.2F);
         ewu $$9 = new ewu($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dU().A.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.V = true;
      }
   }
}
