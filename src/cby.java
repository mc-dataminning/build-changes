public interface cby {
   int l_ = 10;

   int ge();

   static boolean a(bky $$0, bky $$1) {
      float $$2 = (float)$$0.b(bme.c);
      float $$3;
      if (!$$0.n_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dL().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dM().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.n_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bky $$0, bky $$1) {
      double $$2 = $$0.b(bme.d);
      double $$3 = $$1.b(bme.i);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dq() - $$0.dq();
         double $$6 = $$1.dw() - $$0.dw();
         float $$7 = (float)($$0.dL().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dL().z.i() * 0.5F + 0.2F);
         eji $$9 = new eji($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dL().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.T = true;
      }
   }
}
