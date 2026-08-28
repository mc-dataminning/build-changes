import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dey extends dix implements dfe, dmc {
   public static final MapCodec<dey> a = b(dey::new);
   private static final dsv b = dsu.C;
   private static final dtc<dtp> c = dsu.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtp> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtp.b, 10);
      $$0.put(dtp.c, 10);
      $$0.put(dtp.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtp, ewm> j = ImmutableMap.of(
      dtp.a,
      dfb.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtp.b,
      dfb.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtp.c,
      dfb.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtp.d,
      ewj.a()
   );
   private static final ewm k = dfb.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewm> l = ImmutableMap.of(
      je.c, ewj.b(dez.b, k, evx.e), je.d, ewj.b(dez.c, k, evx.e), je.f, ewj.b(dez.d, k, evx.e), je.e, ewj.b(dez.e, k, evx.e)
   );
   private final Map<dse, ewm> m;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   protected dey(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dtp.a));
      this.m = this.a(dey::m);
   }

   private static ewm m(dse $$0) {
      return ewj.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dcb $$0, azh $$1, iz $$2, je $$3) {
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
         dez.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dse $$0) {
      return $$0.i() || $$0.a(dfd.G) || $$0.a(dfd.sF);
   }

   protected static boolean a(dcc $$0, iz $$1, dse $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dcb $$0, iz $$1, enx $$2, je $$3) {
      dse $$4 = dfd.sD.o().a(b, Boolean.valueOf($$2.a(eny.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      this.a($$1, $$0, $$2.a(), dtp.d, awa.hB);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(b) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      dse $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfd.sE) || $$4.a(awp.by);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dfd.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      dse $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      iz $$4 = $$2.c();
      dse $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         dez.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtp.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtp.b, null);
         }
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtp $$4 = $$0.c(c);
         if ($$4 == dtp.b) {
            this.a($$0, $$1, $$2, dtp.c, awa.hB);
         } else if ($$4 == dtp.c) {
            this.a($$0, $$1, $$2, dtp.d, awa.hB);
         } else if ($$4 == dtp.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dca $$0, iz $$1, avz $$2) {
      float $$3 = ayz.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bsw $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dse $$0, dca $$1, iz $$2, dtp $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dse $$0, dca $$1, iz $$2) {
      a($$0, $$1, $$2, dtp.a);
      if ($$0.c(c) != dtp.a) {
         a($$1, $$2, awa.hC);
      }
   }

   private static void a(dse $$0, dca $$1, iz $$2, dtp $$3) {
      dtp $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dwx.c, $$2);
      }
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.m.get($$0);
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a().d());
      enx $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfd.sD) || $$1.a(dfd.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eny.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, aE, c);
   }
}
