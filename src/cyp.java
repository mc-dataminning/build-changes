import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cyp extends dcn implements cyv, dfs {
   public static final MapCodec<cyp> a = b(cyp::new);
   private static final dma b = dlz.C;
   private static final dmh<dmu> c = dlz.bl;
   private static final int d = -1;
   private static final Object2IntMap<dmu> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dmu.b, 10);
      $$0.put(dmu.c, 10);
      $$0.put(dmu.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dmu, eos> j = ImmutableMap.of(
      dmu.a,
      cys.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dmu.b,
      cys.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dmu.c,
      cys.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dmu.d,
      eop.a()
   );
   private static final eos k = cys.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ie, eos> l = ImmutableMap.of(
      ie.c, eop.b(cyq.b, k, eod.e), ie.d, eop.b(cyq.c, k, eod.e), ie.f, eop.b(cyq.d, k, eod.e), ie.e, eop.b(cyq.e, k, eod.e)
   );
   private final Map<dlj, eos> m;

   @Override
   public MapCodec<cyp> a() {
      return a;
   }

   protected cyp(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ie.c).a(c, dmu.a));
      this.m = this.a(cyp::m);
   }

   private static eos m(dlj $$0) {
      return eop.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cvs $$0, awp $$1, hz $$2, ie $$3) {
      int $$4 = awi.a($$1, 2, 5);
      hz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ie.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cyq.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ie.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dlj $$0) {
      return $$0.i() || $$0.a(cyu.G) || $$0.a(cyu.sF);
   }

   protected static boolean a(cvt $$0, hz $$1, dlj $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cvs $$0, hz $$1, egw $$2, ie $$3) {
      dlj $$4 = cyu.sD.o().a(b, Boolean.valueOf($$2.a(egx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      this.a($$1, $$0, $$2.a(), dmu.d, atl.hn);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(b) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlj $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cyu.sE) || $$4.a(aua.bx);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a && !$$0.a($$3, $$4)) {
         return cyu.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return $$1 == ie.b && $$2.a(this) ? cyu.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      dlj $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      hz $$4 = $$2.c();
      dlj $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ie $$6 = $$3.c(aE);
         cyq.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dmu.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dmu.b, null);
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dmu $$4 = $$0.c(c);
         if ($$4 == dmu.b) {
            this.a($$0, $$1, $$2, dmu.c, atl.hn);
         } else if ($$4 == dmu.c) {
            this.a($$0, $$1, $$2, dmu.d, atl.hn);
         } else if ($$4 == dmu.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cvr $$0, hz $$1, atk $$2) {
      float $$3 = awi.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, atm.e, 1.0F, $$3);
   }

   private static boolean a(hz $$0, bnq $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dlj $$0, cvr $$1, hz $$2, dmu $$3, @Nullable atk $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dlj $$0, cvr $$1, hz $$2) {
      a($$0, $$1, $$2, dmu.a);
      if ($$0.c(c) != dmu.a) {
         a($$1, $$2, atl.ho);
      }
   }

   private static void a(dlj $$0, cvr $$1, hz $$2, dmu $$3) {
      dmu $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dpw.c, $$2);
      }
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.m.get($$0);
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a().d());
      egw $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cyu.sD) || $$1.a(cyu.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(egx.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, aE, c);
   }
}
