import com.mojang.serialization.MapCodec;

public class doy extends dfh {
   public static final MapCodec<doy> a = b(doy::new);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dfj.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avh.Ck, avi.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      jf $$4 = jf.b($$3);
      if ($$4 != jf.b) {
         ja $$5 = $$2.a($$4);
         dsk $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jf.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jf.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jf.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jf.d) {
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
