import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dew extends div implements dfc, dma {
   public static final MapCodec<dew> a = b(dew::new);
   private static final dst b = dss.C;
   private static final dta<dtn> c = dss.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtn> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtn.b, 10);
      $$0.put(dtn.c, 10);
      $$0.put(dtn.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtn, ewk> j = ImmutableMap.of(
      dtn.a,
      dez.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtn.b,
      dez.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtn.c,
      dez.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtn.d,
      ewh.a()
   );
   private static final ewk k = dez.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewk> l = ImmutableMap.of(
      je.c, ewh.b(dex.b, k, evv.e), je.d, ewh.b(dex.c, k, evv.e), je.f, ewh.b(dex.d, k, evv.e), je.e, ewh.b(dex.e, k, evv.e)
   );
   private final Map<dsc, ewk> m;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   protected dew(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dtn.a));
      this.m = this.a(dew::m);
   }

   private static ewk m(dsc $$0) {
      return ewh.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dbz $$0, azh $$1, iz $$2, je $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      iz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(je.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dex.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsc $$0) {
      return $$0.i() || $$0.a(dfb.G) || $$0.a(dfb.sF);
   }

   protected static boolean a(dca $$0, iz $$1, dsc $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dbz $$0, iz $$1, env $$2, je $$3) {
      dsc $$4 = dfb.sD.o().a(b, Boolean.valueOf($$2.a(enw.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      this.a($$1, $$0, $$2.a(), dtn.d, awa.hB);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(b) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsc $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfb.sE) || $$4.a(awp.by);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfb.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dfb.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      dsc $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      iz $$4 = $$2.c();
      dsc $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         dex.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtn.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtn.b, null);
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtn $$4 = $$0.c(c);
         if ($$4 == dtn.b) {
            this.a($$0, $$1, $$2, dtn.c, awa.hB);
         } else if ($$4 == dtn.c) {
            this.a($$0, $$1, $$2, dtn.d, awa.hB);
         } else if ($$4 == dtn.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dby $$0, iz $$1, avz $$2) {
      float $$3 = ayz.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bsu $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsc $$0, dby $$1, iz $$2, dtn $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsc $$0, dby $$1, iz $$2) {
      a($$0, $$1, $$2, dtn.a);
      if ($$0.c(c) != dtn.a) {
         a($$1, $$2, awa.hC);
      }
   }

   private static void a(dsc $$0, dby $$1, iz $$2, dtn $$3) {
      dtn $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dwv.c, $$2);
      }
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a().d());
      env $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfb.sD) || $$1.a(dfb.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(enw.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, aE, c);
   }
}
