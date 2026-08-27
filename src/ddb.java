import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ddb extends dha implements ddh, dkf {
   public static final MapCodec<ddb> a = b(ddb::new);
   private static final dqy b = dqx.C;
   private static final drf<drs> c = dqx.bl;
   private static final int d = -1;
   private static final Object2IntMap<drs> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(drs.b, 10);
      $$0.put(drs.c, 10);
      $$0.put(drs.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<drs, eui> j = ImmutableMap.of(
      drs.a,
      dde.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      drs.b,
      dde.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      drs.c,
      dde.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      drs.d,
      euf.a()
   );
   private static final eui k = dde.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<is, eui> l = ImmutableMap.of(
      is.c, euf.b(ddc.b, k, ett.e), is.d, euf.b(ddc.c, k, ett.e), is.f, euf.b(ddc.d, k, ett.e), is.e, euf.b(ddc.e, k, ett.e)
   );
   private final Map<dqh, eui> m;

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   protected ddb(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, is.c).a(c, drs.a));
      this.m = this.a(ddb::m);
   }

   private static eui m(dqh $$0) {
      return euf.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dae $$0, ayg $$1, in $$2, is $$3) {
      int $$4 = axz.a($$1, 2, 5);
      in.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(is.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         ddc.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(is.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G) || $$0.a(ddg.sF);
   }

   protected static boolean a(daf $$0, in $$1, dqh $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dae $$0, in $$1, ema $$2, is $$3) {
      dqh $$4 = ddg.sD.n().a(b, Boolean.valueOf($$2.a(emb.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      this.a($$1, $$0, $$2.a(), drs.d, avc.hw);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(b) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      dqh $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(ddg.sE) || $$4.a(avr.by);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.a && !$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return $$1 == is.b && $$2.a(this) ? ddg.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      dqh $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      in $$4 = $$2.c();
      dqh $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         is $$6 = $$3.c(aE);
         ddc.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == drs.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, drs.b, null);
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         drs $$4 = $$0.c(c);
         if ($$4 == drs.b) {
            this.a($$0, $$1, $$2, drs.c, avc.hw);
         } else if ($$4 == drs.c) {
            this.a($$0, $$1, $$2, drs.d, avc.hw);
         } else if ($$4 == drs.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dad $$0, in $$1, avb $$2) {
      float $$3 = axz.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avd.e, 1.0F, $$3);
   }

   private static boolean a(in $$0, brh $$1) {
      return $$1.aC() && $$1.dl().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dqh $$0, dad $$1, in $$2, drs $$3, @Nullable avb $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dqh $$0, dad $$1, in $$2) {
      a($$0, $$1, $$2, drs.a);
      if ($$0.c(c) != drs.a) {
         a($$1, $$2, avc.hx);
      }
   }

   private static void a(dqh $$0, dad $$1, in $$2, drs $$3) {
      drs $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dva.c, $$2);
      }
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.m.get($$0);
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a().d());
      ema $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(ddg.sD) || $$1.a(ddg.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(emb.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, aE, c);
   }
}
