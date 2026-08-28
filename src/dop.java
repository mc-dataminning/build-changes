import com.mojang.serialization.MapCodec;

public class dop extends dey {
   public static final MapCodec<dop> a = b(dop::new);

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   protected dop(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dfa.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avz.Ch, awa.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      je $$4 = je.b($$3);
      if ($$4 != je.b) {
         iz $$5 = $$2.a($$4);
         dsb $$6 = $$1.a_($$5);
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

            $$1.a(li.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
