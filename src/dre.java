import com.mojang.serialization.MapCodec;

public class dre extends dhm {
   public static final MapCodec<dre> a = b(dre::new);

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   protected dre(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if ($$1.C_().i()) {
         $$1.a($$2, dho.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awg.Cr, awh.e, 1.0F, (1.0F + $$1.D_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      jk $$4 = jk.b($$3);
      if ($$4 != jk.b) {
         jf $$5 = $$2.a($$4);
         dus $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jk.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jk.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jk.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jk.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lo.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
