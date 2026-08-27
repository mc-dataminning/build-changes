import com.mojang.serialization.MapCodec;

public class des extends cvf {
   public static final MapCodec<des> a = b(des::new);

   @Override
   public MapCodec<des> a() {
      return a;
   }

   protected des(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, cvh.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, aqv.ih, aqw.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      ib $$4 = ib.b($$3);
      if ($$4 != ib.b) {
         hx $$5 = $$2.a($$4);
         dhn $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ib.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ib.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ib.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ib.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(jw.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
