public interface ckw {
   int n_ = 10;

   int go();

   static boolean a(btb $$0, btb $$1) {
      float $$2 = (float)$$0.g(buj.c);
      float $$3;
      if (!$$0.p_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dQ().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      bqz $$5 = $$0.dR().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dQ() instanceof aqm $$7) {
            czn.a($$7, (bsg)$$1, $$5);
         }

         if (!$$0.p_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(btb $$0, btb $$1) {
      double $$2 = $$0.g(buj.d);
      double $$3 = $$1.g(buj.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dv() - $$0.dv();
         double $$6 = $$1.dB() - $$0.dB();
         float $$7 = (float)($$0.dQ().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dQ().z.i() * 0.5F + 0.2F);
         ewf $$9 = new ewf($$5, 0.0, $$6).d().a($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dQ().z.i() * 0.5;
         $$1.j($$9.c, $$10, $$9.e);
         $$1.U = true;
      }
   }
}
