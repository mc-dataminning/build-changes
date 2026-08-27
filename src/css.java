import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class css extends cwo implements csx, czw {
   private static final dga a = dfz.C;
   private static final dgh<dgu> b = dfz.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgu> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgu.b, 10);
      $$0.put(dgu.c, 10);
      $$0.put(dgu.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgu, eig> i = ImmutableMap.of(
      dgu.a,
      csv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgu.b,
      csv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgu.c,
      csv.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgu.d,
      eid.a()
   );
   private static final eig j = csv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eig> k = ImmutableMap.of(
      hc.c, eid.b(cst.a, j, ehr.e), hc.d, eid.b(cst.b, j, ehr.e), hc.f, eid.b(cst.c, j, ehr.e), hc.e, eid.b(cst.d, j, ehr.e)
   );
   private final Map<dfj, eig> l;

   protected css(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, hc.c).a(b, dgu.a));
      this.l = this.a(css::h);
   }

   private static eig h(dfj $$0) {
      return eid.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpw $$0, asc $$1, gw $$2, hc $$3) {
      int $$4 = arx.a($$1, 2, 5);
      gw.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cpx)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hc.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cst.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hc.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dfj $$0) {
      return $$0.i() || $$0.a(csw.G) || $$0.a(csw.rE);
   }

   protected static boolean a(cpx $$0, gw $$1, dfj $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpw $$0, gw $$1, eam $$2, hc $$3) {
      dfj $$4 = csw.rC.n().a(a, Boolean.valueOf($$2.a(ean.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      this.a($$1, $$0, $$2.a(), dgu.d, ape.gu);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(a) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfj $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csw.rD) || $$4.a(apt.bx);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !$$0.a($$3, $$4)) {
         return csw.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         return $$1 == hc.b && $$2.a(this) ? csw.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      dfj $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      gw $$4 = $$2.c();
      dfj $$5 = $$0.a_($$4);
      if (a((cpx)$$0, $$4, $$5)) {
         hc $$6 = $$3.c(aC);
         cst.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgu.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgu.b, null);
         }
      }
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgu $$4 = $$0.c(b);
         if ($$4 == dgu.b) {
            this.a($$0, $$1, $$2, dgu.c, ape.gu);
         } else if ($$4 == dgu.c) {
            this.a($$0, $$1, $$2, dgu.d, ape.gu);
         } else if ($$4 == dgu.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpv $$0, gw $$1, apd $$2) {
      float $$3 = arx.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, apf.e, 1.0F, $$3);
   }

   private static boolean a(gw $$0, biq $$1) {
      return $$1.aA() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dfj $$0, cpv $$1, gw $$2, dgu $$3, @Nullable apd $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dfj $$0, cpv $$1, gw $$2) {
      a($$0, $$1, $$2, dgu.a);
      if ($$0.c(b) != dgu.a) {
         a($$1, $$2, ape.gv);
      }
   }

   private static void a(dfj $$0, cpv $$1, gw $$2, dgu $$3) {
      dgu $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djt.c, $$2);
      }
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.l.get($$0);
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = $$0.q().a_($$0.a().d());
      eam $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csw.rC) || $$1.a(csw.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(ean.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, aC, b);
   }
}
