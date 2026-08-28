public interface ckx {
   int n_ = 10;

   int gn();

   static boolean a(btc $$0, btc $$1) {
      float $$2 = (float)$$0.g(buk.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dR().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      bra $$5 = $$0.dS().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dR() instanceof aqm $$7) {
            czo.a($$7, (bsh)$$1, $$5);
         }

         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(btc $$0, btc $$1) {
      double $$2 = $$0.g(buk.d);
      double $$3 = $$1.g(buk.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dw() - $$0.dw();
         double $$6 = $$1.dC() - $$0.dC();
         float $$7 = (float)($$0.dR().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dR().z.i() * 0.5F + 0.2F);
         ewh $$9 = new ewh($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dR().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.U = true;
      }
   }
}
