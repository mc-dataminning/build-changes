import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dff extends dje implements dfl, dmj {
   public static final MapCodec<dff> a = b(dff::new);
   private static final dtc b = dtb.C;
   private static final dtj<dtw> c = dtb.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtw> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtw.b, 10);
      $$0.put(dtw.c, 10);
      $$0.put(dtw.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtw, exa> j = ImmutableMap.of(
      dtw.a,
      dfi.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtw.b,
      dfi.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtw.c,
      dfi.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtw.d,
      ewx.a()
   );
   private static final exa k = dfi.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jf, exa> l = ImmutableMap.of(
      jf.c, ewx.b(dfg.b, k, ewl.e), jf.d, ewx.b(dfg.c, k, ewl.e), jf.f, ewx.b(dfg.d, k, ewl.e), jf.e, ewx.b(dfg.e, k, ewl.e)
   );
   private final Map<dsl, exa> m;

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   protected dff(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, jf.c).a(c, dtw.a));
      this.m = this.a(dff::m);
   }

   private static exa m(dsl $$0) {
      return ewx.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dch $$0, ayo $$1, ja $$2, jf $$3) {
      int $$4 = ayg.a($$1, 2, 5);
      ja.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jf.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dfg.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jf.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsl $$0) {
      return $$0.i() || $$0.a(dfk.G) || $$0.a(dfk.sF);
   }

   protected static boolean a(dci $$0, ja $$1, dsl $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dch $$0, ja $$1, eoj $$2, jf $$3) {
      dsl $$4 = dfk.sD.o().a(b, Boolean.valueOf($$2.a(eok.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      this.a($$1, $$0, $$2.a(), dtw.d, avh.hB);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(b) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsl $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfk.sE) || $$4.a(avw.by);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfk.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return $$1 == jf.b && $$2.a(this) ? dfk.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      dsl $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      ja $$4 = $$2.c();
      dsl $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jf $$6 = $$3.c(aE);
         dfg.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtw.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtw.b, null);
         }
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtw $$4 = $$0.c(c);
         if ($$4 == dtw.b) {
            this.a($$0, $$1, $$2, dtw.c, avh.hB);
         } else if ($$4 == dtw.c) {
            this.a($$0, $$1, $$2, dtw.d, avh.hB);
         } else if ($$4 == dtw.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dcg $$0, ja $$1, avg $$2) {
      float $$3 = ayg.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avi.e, 1.0F, $$3);
   }

   private static boolean a(ja $$0, bsh $$1) {
      return $$1.aG() && $$1.dp().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsl $$0, dcg $$1, ja $$2, dtw $$3, @Nullable avg $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsl $$0, dcg $$1, ja $$2) {
      a($$0, $$1, $$2, dtw.a);
      if ($$0.c(c) != dtw.a) {
         a($$1, $$2, avh.hC);
      }
   }

   private static void a(dsl $$0, dcg $$1, ja $$2, dtw $$3) {
      dtw $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxh.c, $$2);
      }
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a().d());
      eoj $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfk.sD) || $$1.a(dfk.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eok.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, aE, c);
   }
}
