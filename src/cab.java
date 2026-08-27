public interface cab {
   int l_ = 10;

   int ga();

   static boolean a(bjb $$0, bjb $$1) {
      float $$2 = (float)$$0.b(bkh.f);
      float $$3;
      if (!$$0.i_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dK().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      boolean $$5 = $$1.a($$0.dL().b($$0), $$3);
      if ($$5) {
         $$0.a($$0, $$1);
         if (!$$0.i_()) {
            b($$0, $$1);
         }
      }

      return $$5;
   }

   static void b(bjb $$0, bjb $$1) {
      double $$2 = $$0.b(bkh.g);
      double $$3 = $$1.b(bkh.c);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dp() - $$0.dp();
         double $$6 = $$1.dv() - $$0.dv();
         float $$7 = (float)($$0.dK().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dK().z.i() * 0.5F + 0.2F);
         ehi $$9 = new ehi($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dK().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.T = true;
      }
   }
}
