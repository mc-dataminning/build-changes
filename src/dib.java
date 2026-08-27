import com.mojang.serialization.MapCodec;

public class dib extends dac {
   public static final MapCodec<dib> a = b(dib::new);
   public static final dob b = dnr.aw;
   protected static final float c = 6.0F;
   protected static final eqm d = dac.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   protected dib(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.o());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(aun.af) || $$3.a(aun.H)) {
            ib $$4 = $$2.d();

            for (ih $$5 : ih.c.a) {
               dnb $$6 = $$1.a_($$4.a($$5));
               eip $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(aus.a) || $$6.a(dae.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
