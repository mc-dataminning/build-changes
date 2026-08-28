import com.mojang.serialization.MapCodec;

public class dtz extends dkd {
   public static final MapCodec<dtz> a = b(dtz::new);

   @Override
   public MapCodec<dtz> a() {
      return a;
   }

   protected dtz(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if ($$1.G_().i()) {
         $$1.a($$2, dkf.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awv.Da, aww.e, 1.0F, (1.0F + $$1.H_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      jm $$4 = jm.b($$3);
      if ($$4 != jm.b) {
         jh $$5 = $$2.a($$4);
         dxo $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jm.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jm.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jm.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jm.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(ls.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
