import com.mojang.serialization.MapCodec;

public class dmm extends dcv {
   public static final MapCodec<dmm> a = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   protected dmm(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dcx.aO.n(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, auz.BV, ava.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      ir $$4 = ir.b($$3);
      if ($$4 != ir.b) {
         im $$5 = $$2.a($$4);
         dpy $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ir.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ir.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ir.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ir.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(kw.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
