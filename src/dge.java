import com.mojang.serialization.MapCodec;

public class dge extends cwp {
   public static final MapCodec<dge> a = b(dge::new);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   protected dge(djf.d $$0) {
      super($$0);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if ($$1.E_().i()) {
         $$1.a($$2, cwr.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, arr.iq, ars.e, 1.0F, (1.0F + $$1.F_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      ic $$4 = ic.b($$3);
      if ($$4 != ic.b) {
         hx $$5 = $$2.a($$4);
         djg $$6 = $$1.a_($$5);
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
