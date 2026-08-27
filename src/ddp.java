import com.mojang.serialization.MapCodec;

public class ddp extends dde {
   public static final MapCodec<ddp> a = b(ddp::new);
   public static final drh b = dqx.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final eui e = dde.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eui f = dde.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   protected ddp(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      in $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dqh $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return e;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return f;
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
      for (is $$3 : is.c.a) {
         dqh $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(avw.b)) {
            return false;
         }
      }

      dqh $$5 = $$1.a_($$2.d());
      return ($$5.a(ddg.dQ) || $$5.a(avr.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
