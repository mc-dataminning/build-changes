import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dfc extends djb implements dfi, dmg {
   public static final MapCodec<dfc> a = b(dfc::new);
   private static final dsy b = dsx.C;
   private static final dtf<dts> c = dsx.bl;
   private static final int d = -1;
   private static final Object2IntMap<dts> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dts.b, 10);
      $$0.put(dts.c, 10);
      $$0.put(dts.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dts, ews> j = ImmutableMap.of(
      dts.a,
      dff.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dts.b,
      dff.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dts.c,
      dff.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dts.d,
      ewp.a()
   );
   private static final ews k = dff.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jf, ews> l = ImmutableMap.of(
      jf.c, ewp.b(dfd.b, k, ewd.e), jf.d, ewp.b(dfd.c, k, ewd.e), jf.f, ewp.b(dfd.d, k, ewd.e), jf.e, ewp.b(dfd.e, k, ewd.e)
   );
   private final Map<dsh, ews> m;

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   protected dfc(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, jf.c).a(c, dts.a));
      this.m = this.a(dfc::m);
   }

   private static ews m(dsh $$0) {
      return ewp.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dce $$0, aym $$1, ja $$2, jf $$3) {
      int $$4 = aye.a($$1, 2, 5);
      ja.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jf.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dfd.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jf.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsh $$0) {
      return $$0.i() || $$0.a(dfh.G) || $$0.a(dfh.sF);
   }

   protected static boolean a(dcf $$0, ja $$1, dsh $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dce $$0, ja $$1, eob $$2, jf $$3) {
      dsh $$4 = dfh.sD.o().a(b, Boolean.valueOf($$2.a(eoc.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      this.a($$1, $$0, $$2.a(), dts.d, avf.hB);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(b) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsh $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfh.sE) || $$4.a(avu.by);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfh.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return $$1 == jf.b && $$2.a(this) ? dfh.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      dsh $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      ja $$4 = $$2.c();
      dsh $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jf $$6 = $$3.c(aE);
         dfd.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dts.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dts.b, null);
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dts $$4 = $$0.c(c);
         if ($$4 == dts.b) {
            this.a($$0, $$1, $$2, dts.c, avf.hB);
         } else if ($$4 == dts.c) {
            this.a($$0, $$1, $$2, dts.d, avf.hB);
         } else if ($$4 == dts.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dcd $$0, ja $$1, ave $$2) {
      float $$3 = aye.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avg.e, 1.0F, $$3);
   }

   private static boolean a(ja $$0, bsd $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsh $$0, dcd $$1, ja $$2, dts $$3, @Nullable ave $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsh $$0, dcd $$1, ja $$2) {
      a($$0, $$1, $$2, dts.a);
      if ($$0.c(c) != dts.a) {
         a($$1, $$2, avf.hC);
      }
   }

   private static void a(dsh $$0, dcd $$1, ja $$2, dts $$3) {
      dts $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxa.c, $$2);
      }
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a().d());
      eob $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfh.sD) || $$1.a(dfh.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eoc.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, aE, c);
   }
}
