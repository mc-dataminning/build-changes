import com.mojang.serialization.MapCodec;

public class dcj extends ctc {
   public static final MapCodec<dcj> a = b(dcj::new);

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   protected dcj(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if ($$1.C_().i()) {
         $$1.a($$2, cte.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, apg.hN, aph.e, 1.0F, (1.0F + $$1.D_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      ha $$4 = ha.b($$3);
      if ($$4 != ha.b) {
         gw $$5 = $$2.a($$4);
         dfd $$6 = $$1.a_($$5);
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
