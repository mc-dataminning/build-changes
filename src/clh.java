public interface clh {
   int n_ = 10;

   int gm();

   static boolean a(btl $$0, btl $$1) {
      float $$2 = (float)$$0.g(buu.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dQ().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      brj $$5 = $$0.dR().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dQ() instanceof aqt $$7) {
            dac.a($$7, (bsq)$$1, $$5);
         }

         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(btl $$0, btl $$1) {
      double $$2 = $$0.g(buu.d);
      double $$3 = $$1.g(buu.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dv() - $$0.dv();
         double $$6 = $$1.dB() - $$0.dB();
         float $$7 = (float)($$0.dQ().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dQ().z.i() * 0.5F + 0.2F);
         eww $$9 = new eww($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dQ().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.U = true;
      }
   }
}
