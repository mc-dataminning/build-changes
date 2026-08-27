import com.mojang.serialization.MapCodec;

public class dlx extends dch {
   public static final MapCodec<dlx> a = b(dlx::new);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dcj.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, auo.BO, aup.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      ij $$4 = ij.b($$3);
      if ($$4 != ij.b) {
         id $$5 = $$2.a($$4);
         dpi $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ij.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ij.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ij.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ij.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(kn.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
