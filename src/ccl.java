public interface ccl {
   int l_ = 10;

   int gf();

   static boolean a(bll $$0, bll $$1) {
      float $$2 = (float)$$0.b(bmr.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dN().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dO().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bll $$0, bll $$1) {
      double $$2 = $$0.b(bmr.d);
      double $$3 = $$1.b(bmr.i);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.ds() - $$0.ds();
         double $$6 = $$1.dy() - $$0.dy();
         float $$7 = (float)($$0.dN().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dN().z.i() * 0.5F + 0.2F);
         ejz $$9 = new ejz($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dN().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.T = true;
      }
   }
}
