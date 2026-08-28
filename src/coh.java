public interface coh {
   int m_ = 10;
   float n_ = 0.2F;

   int x();

   static boolean a(ash $$0, bwg $$1, bwg $$2) {
      float $$3 = (float)$$1.h(bxo.c);
      float $$4;
      if (!$$1.e_() && (int)$$3 > 0) {
         $$4 = $$3 / 2.0F + (float)$$0.A.a((int)$$3);
      } else {
         $$4 = $$3;
      }

      bua $$6 = $$1.dX().b($$1);
      boolean $$7 = $$2.a($$0, $$6, $$4);
      if ($$7) {
         deb.a($$0, (bvk)$$2, $$6);
         if (!$$1.e_()) {
            a($$1, $$2);
         }
      }

      return $$7;
   }

   static void a(bwg $$0, bwg $$1) {
      double $$2 = $$0.h(bxo.d);
      double $$3 = $$1.h(bxo.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dB() - $$0.dB();
         double $$6 = $$1.dH() - $$0.dH();
         float $$7 = (float)($$0.dW().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dW().A.i() * 0.5F + 0.2F);
         fby $$9 = new fby($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dW().A.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.T = true;
      }
   }
}
