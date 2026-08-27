import com.mojang.serialization.MapCodec;

public class dfn extends cvz {
   public static final MapCodec<dfn> a = b(dfn::new);

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   protected dfn(dio.d $$0) {
      super($$0);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, cwb.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, arc.iq, ard.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      ia $$4 = ia.b($$3);
      if ($$4 != ia.b) {
         hv $$5 = $$2.a($$4);
         dip $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ia.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ia.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ia.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ia.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(jv.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
