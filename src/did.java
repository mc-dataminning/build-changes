import com.mojang.serialization.MapCodec;

public class did extends cyo {
   public static final MapCodec<did> a = b(did::new);

   @Override
   public MapCodec<did> a() {
      return a;
   }

   protected did(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, cyq.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, atk.iF, atl.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      ie $$4 = ie.b($$3);
      if ($$4 != ie.b) {
         hz $$5 = $$2.a($$4);
         dlf $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ie.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ie.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ie.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ie.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(jz.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
