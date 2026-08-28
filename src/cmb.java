public interface cmb {
   int o_ = 10;
   float p_ = 0.2F;

   int go();

   static boolean a(buf $$0, buf $$1) {
      float $$2 = (float)$$0.h(bvm.c);
      float $$3;
      if (!$$0.o_() && (int)$$2 > 0) {
         $$3 = $$2 / 2.0F + (float)$$0.dS().z.a((int)$$2);
      } else {
         $$3 = $$2;
      }

      bsb $$5 = $$0.dT().b($$0);
      boolean $$6 = $$1.a($$5, $$3);
      if ($$6) {
         if ($$0.dS() instanceof arg $$7) {
            day.a($$7, (btj)$$1, $$5);
         }

         if (!$$0.o_()) {
            b($$0, $$1);
         }
      }

      return $$6;
   }

   static void b(buf $$0, buf $$1) {
      double $$2 = $$0.h(bvm.d);
      double $$3 = $$1.h(bvm.p);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dx() - $$0.dx();
         double $$6 = $$1.dD() - $$0.dD();
         float $$7 = (float)($$0.dS().z.a(21) - 10);
         double $$8 = $$4 * (double)($$0.dS().z.i() * 0.5F + 0.2F);
         eye $$9 = new eye($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * (double)$$0.dS().z.i() * 0.5;
         $$1.j($$9.d, $$10, $$9.f);
         $$1.U = true;
      }
   }
}
