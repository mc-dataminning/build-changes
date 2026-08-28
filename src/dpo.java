import com.mojang.serialization.MapCodec;

public class dpo extends dfw {
   public static final MapCodec<dpo> a = b(dpo::new);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   protected dpo(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dfy.aO.o(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, avo.Cl, avp.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      ji $$4 = ji.b($$3);
      if ($$4 != ji.b) {
         jd $$5 = $$2.a($$4);
         dta $$6 = $$1.a_($$5);
         if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ji.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ji.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ji.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ji.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lm.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
