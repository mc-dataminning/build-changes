import com.mojang.serialization.MapCodec;

public class ddq extends dde {
   public static final MapCodec<ddq> a = b(ddq::new);
   public static final int b = 6;
   public static final drh c = dqx.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eui[] g = new eui[]{
      dde.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dde.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   protected ddq(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      csu $$7 = $$0.f();
      if ($$0.a(avz.aJ) && $$1.c(c) == 0 && dde.a($$7) instanceof ddt $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avc.dr, avd.e, 1.0F, 1.0F);
         $$2.b($$3, ddu.a($$8));
         $$2.a($$4, dva.c, $$3);
         $$4.b(avm.c.b($$7));
         return bpo.a;
      } else {
         return bpo.d;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bpm.a;
         }

         if ($$3.b(bpl.a).d()) {
            return bpm.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bpm a(dae $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$3.t(false)) {
         return bpm.d;
      } else {
         $$3.a(avm.U);
         $$3.gk().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dva.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dva.f, $$1);
         }

         return bpm.a;
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
