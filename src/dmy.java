import com.mojang.serialization.MapCodec;

public class dmy extends dey {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final dtb b = dsr.aw;
   protected static final float c = 6.0F;
   protected static final ewj d = dey.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   protected dmy(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
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
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awo.af) || $$3.a(awo.H)) {
            iz $$4 = $$2.d();

            for (je $$5 : je.c.a) {
               dsb $$6 = $$1.a_($$4.a($$5));
               enu $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awu.a) || $$6.a(dfa.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
