public interface cgm {
   int n_ = 10;

   int gl();

   static boolean a(box $$0, box $$1) {
      float $$2 = (float)$$0.g(bqe.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dJ().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dK().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(box $$0, box $$1) {
      double $$2 = $$0.g(bqe.d);
      double $$3 = $$1.g(bqe.k);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.do() - $$0.do();
         double $$6 = $$1.du() - $$0.du();
         float $$7 = (float)($$0.dJ().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dJ().z.i() * 0.5F + 0.2F);
         eov $$9 = new eov($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dJ().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.S = true;
      }
   }
}
