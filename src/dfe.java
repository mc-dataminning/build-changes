import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dfe extends djd implements dfk, dmi {
   public static final MapCodec<dfe> a = b(dfe::new);
   private static final dtb b = dta.C;
   private static final dti<dtv> c = dta.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtv> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtv.b, 10);
      $$0.put(dtv.c, 10);
      $$0.put(dtv.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtv, ewy> j = ImmutableMap.of(
      dtv.a,
      dfh.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtv.b,
      dfh.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtv.c,
      dfh.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtv.d,
      ewv.a()
   );
   private static final ewy k = dfh.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jf, ewy> l = ImmutableMap.of(
      jf.c, ewv.b(dff.b, k, ewj.e), jf.d, ewv.b(dff.c, k, ewj.e), jf.f, ewv.b(dff.d, k, ewj.e), jf.e, ewv.b(dff.e, k, ewj.e)
   );
   private final Map<dsk, ewy> m;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   protected dfe(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, jf.c).a(c, dtv.a));
      this.m = this.a(dfe::m);
   }

   private static ewy m(dsk $$0) {
      return ewv.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dcg $$0, ayo $$1, ja $$2, jf $$3) {
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
         dff.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jf.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsk $$0) {
      return $$0.i() || $$0.a(dfj.G) || $$0.a(dfj.sF);
   }

   protected static boolean a(dch $$0, ja $$1, dsk $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dcg $$0, ja $$1, eoh $$2, jf $$3) {
      dsk $$4 = dfj.sD.o().a(b, Boolean.valueOf($$2.a(eoi.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      this.a($$1, $$0, $$2.a(), dtv.d, avh.hB);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(b) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsk $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfj.sE) || $$4.a(avw.by);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfj.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return $$1 == jf.b && $$2.a(this) ? dfj.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      dsk $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      ja $$4 = $$2.c();
      dsk $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jf $$6 = $$3.c(aE);
         dff.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtv.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtv.b, null);
         }
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtv $$4 = $$0.c(c);
         if ($$4 == dtv.b) {
            this.a($$0, $$1, $$2, dtv.c, avh.hB);
         } else if ($$4 == dtv.c) {
            this.a($$0, $$1, $$2, dtv.d, avh.hB);
         } else if ($$4 == dtv.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dcf $$0, ja $$1, avg $$2) {
      float $$3 = ayg.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avi.e, 1.0F, $$3);
   }

   private static boolean a(ja $$0, bsg $$1) {
      return $$1.aF() && $$1.do().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsk $$0, dcf $$1, ja $$2, dtv $$3, @Nullable avg $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsk $$0, dcf $$1, ja $$2) {
      a($$0, $$1, $$2, dtv.a);
      if ($$0.c(c) != dtv.a) {
         a($$1, $$2, avh.hC);
      }
   }

   private static void a(dsk $$0, dcf $$1, ja $$2, dtv $$3) {
      dtv $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxg.c, $$2);
      }
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a().d());
      eoh $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfj.sD) || $$1.a(dfj.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eoi.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, aE, c);
   }
}
