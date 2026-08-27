import com.mojang.serialization.MapCodec;

public class dpk extends dfc {
   public static final MapCodec<dpk> a = b(dpk::new);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   protected dpk(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, dfe.bw.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avo.CF, avq.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      iw $$4 = iw.b($$3);
      if ($$4 != iw.b) {
         ir $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == iw.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == iw.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == iw.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == iw.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lb.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
