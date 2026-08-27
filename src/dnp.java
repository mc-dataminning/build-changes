import com.mojang.serialization.MapCodec;

public class dnp extends ddy {
   public static final MapCodec<dnp> a = b(dnp::new);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dea.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avh.Ch, avi.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      it $$4 = it.b($$3);
      if ($$4 != it.b) {
         io $$5 = $$2.a($$4);
         drb $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == it.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == it.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == it.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == it.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(ky.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
