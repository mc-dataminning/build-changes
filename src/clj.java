public interface clj {
   int o_ = 10;

   int gk();

   static boolean a(btn $$0, btn $$1) {
      float $$2 = (float)$$0.g(buw.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dO().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      brk $$5 = $$0.dP().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dO() instanceof aqu $$7) {
            dae.a($$7, (bsr)$$1, $$5);
         }

         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(btn $$0, btn $$1) {
      double $$2 = $$0.g(buw.d);
      double $$3 = $$1.g(buw.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dt() - $$0.dt();
         double $$6 = $$1.dz() - $$0.dz();
         float $$7 = (float)($$0.dO().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dO().z.i() * 0.5F + 0.2F);
         exc $$9 = new exc($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dO().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.U = true;
      }
   }
}
