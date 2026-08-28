public interface cng {
   int m_ = 10;
   float n_ = 0.2F;

   int x();

   static boolean a(ard $$0, bvg $$1, bvg $$2) {
      float $$3 = (float)$$1.h(bwo.c);
      float $$4;
      if (!$$1.e_() && (int)$$3 > 0) {
         $$4 = $$3 / 2.0F + (float)$$0.A.a((int)$$3);
      } else {
         $$4 = $$3;
      }

      bta $$6 = $$1.dW().b($$1);
      boolean $$7 = $$2.a($$0, $$6, $$4);
      if ($$7) {
         dda.a($$0, (buk)$$2, $$6);
         if (!$$1.e_()) {
            a($$1, $$2);
         }
      }

      return $$7;
   }

   static void a(bvg $$0, bvg $$1) {
      double $$2 = $$0.h(bwo.d);
      double $$3 = $$1.h(bwo.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dA() - $$0.dA();
         double $$6 = $$1.dG() - $$0.dG();
         float $$7 = (float)($$0.dV().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dV().A.i() * 0.5F + 0.2F);
         faz $$9 = new faz($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dV().A.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.T = true;
      }
   }
}
