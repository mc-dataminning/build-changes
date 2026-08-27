import com.mojang.serialization.MapCodec;

public class dgf extends cwq {
   public static final MapCodec<dgf> a = b(dgf::new);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   protected dgf(djg.d $$0) {
      super($$0);
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, cws.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, ars.iq, art.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      ic $$4 = ic.b($$3);
      if ($$4 != ic.b) {
         hx $$5 = $$2.a($$4);
         djh $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ic.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ic.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ic.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ic.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(jx.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
