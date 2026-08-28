import com.mojang.serialization.MapCodec;

public class dtj extends djn {
   public static final MapCodec<dtj> a = b(dtj::new);

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   protected dtj(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if ($$1.G_().i()) {
         $$1.a($$2, djp.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awa.CZ, awb.e, 1.0F, (1.0F + $$1.H_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      jn $$4 = jn.b($$3);
      if ($$4 != jn.b) {
         ji $$5 = $$2.a($$4);
         dwy $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jn.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jn.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jn.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jn.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lt.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
