import com.mojang.serialization.MapCodec;

public class djs extends dac {
   public static final MapCodec<djs> a = b(djs::new);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dae.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, aty.iN, atz.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      ih $$4 = ih.b($$3);
      if ($$4 != ih.b) {
         ib $$5 = $$2.a($$4);
         dnb $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ih.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ih.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ih.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ih.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(kc.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
