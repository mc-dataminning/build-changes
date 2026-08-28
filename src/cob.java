public interface cob {
   int m_ = 10;
   float n_ = 0.2F;

   int q();

   static boolean a(ard $$0, bvy $$1, bvy $$2) {
      float $$3 = (float)$$1.h(bxg.c);
      float $$4;
      if (!$$1.n_() && (int)$$3 > 0) {
         $$4 = $$3 / 2.0F + (float)$$0.A.a((int)$$3);
      } else {
         $$4 = $$3;
      }

      btp $$6 = $$1.dV().b($$1);
      boolean $$7 = $$2.a($$0, $$6, $$4);
      if ($$7) {
         ddt.a($$0, (bva)$$2, $$6);
         if (!$$1.n_()) {
            a($$1, $$2);
         }
      }

      return $$7;
   }

   static void a(bvy $$0, bvy $$1) {
      double $$2 = $$0.h(bxg.d);
      double $$3 = $$1.h(bxg.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dz() - $$0.dz();
         double $$6 = $$1.dF() - $$0.dF();
         float $$7 = (float)($$0.dU().A.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dU().A.i() * 0.5F + 0.2F);
         fbx $$9 = new fbx($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dU().A.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.T = true;
      }
   }
}
