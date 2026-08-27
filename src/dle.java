import com.mojang.serialization.MapCodec;

public class dle extends dde {
   public static final MapCodec<dle> a = b(dle::new);
   public static final drh b = dqx.aw;
   protected static final float c = 6.0F;
   protected static final eui d = dde.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   protected dle(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.n());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(avr.af) || $$3.a(avr.H)) {
            in $$4 = $$2.d();

            for (is $$5 : is.c.a) {
               dqh $$6 = $$1.a_($$4.a($$5));
               ema $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(avw.a) || $$6.a(ddg.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
