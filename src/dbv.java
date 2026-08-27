public class dbv extends csl {
   protected dbv(dey.d $$0) {
      super($$0);
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if ($$1.x_().i()) {
         $$1.a($$2, csm.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, aow.hN, aox.e, 1.0F, (1.0F + $$1.y_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      ha $$4 = ha.b($$3);
      if ($$4 != ha.b) {
         gu $$5 = $$2.a($$4);
         dez $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ha.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ha.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ha.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ha.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(iv.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
