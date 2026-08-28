import com.mojang.serialization.MapCodec;

public class dol extends deu {
   public static final MapCodec<dol> a = b(dol::new);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dew.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avw.Ch, avx.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      je $$4 = je.b($$3);
      if ($$4 != je.b) {
         iz $$5 = $$2.a($$4);
         drx $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == je.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == je.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == je.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == je.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lj.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
