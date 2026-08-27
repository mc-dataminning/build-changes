import com.mojang.serialization.MapCodec;

public class dlh extends ddn implements ddh {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final drh c = dqx.as;
   private static final eui e = dde.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eui f = dde.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ctc.wr);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dqh $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dva.c, $$2, dva.a.a($$5));
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$3 instanceof bsa && $$3.ai() != brn.Q && $$3.ai() != brn.h) {
         $$3.a($$0, new etp(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.ds() || $$3.af != $$3.dy())) {
            double $$4 = Math.abs($$3.ds() - $$3.ad);
            double $$5 = Math.abs($$3.dy() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(ctc.ry) ? bpo.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new csz(ctc.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avc.ze, avd.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dqh $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dva.c, $$2, dva.a.a($$3, $$8));
         return bpm.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
