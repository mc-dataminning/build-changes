import com.mojang.serialization.MapCodec;

public class drb extends dhj {
   public static final MapCodec<drb> a = b(drb::new);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   protected drb(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if ($$1.B_().i()) {
         $$1.a($$2, dhl.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awe.Cr, awf.e, 1.0F, (1.0F + $$1.C_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      jj $$4 = jj.b($$3);
      if ($$4 != jj.b) {
         je $$5 = $$2.a($$4);
         duo $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jj.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jj.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jj.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jj.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(ln.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
