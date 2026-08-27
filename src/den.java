import com.mojang.serialization.MapCodec;

public class den extends cva {
   public static final MapCodec<den> a = b(den::new);

   @Override
   public MapCodec<den> a() {
      return a;
   }

   protected den(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, cvc.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, aqr.ih, aqs.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      hx $$4 = hx.b($$3);
      if ($$4 != hx.b) {
         ht $$5 = $$2.a($$4);
         dhi $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == hx.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == hx.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == hx.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == hx.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(js.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
