import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class czc extends dda implements czi, dgf {
   public static final MapCodec<czc> a = b(czc::new);
   private static final dmv b = dmu.C;
   private static final dnc<dnp> c = dmu.bl;
   private static final int d = -1;
   private static final Object2IntMap<dnp> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dnp.b, 10);
      $$0.put(dnp.c, 10);
      $$0.put(dnp.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dnp, epo> j = ImmutableMap.of(
      dnp.a,
      czf.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dnp.b,
      czf.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dnp.c,
      czf.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dnp.d,
      epl.a()
   );
   private static final epo k = czf.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ih, epo> l = ImmutableMap.of(
      ih.c, epl.b(czd.b, k, eoz.e), ih.d, epl.b(czd.c, k, eoz.e), ih.f, epl.b(czd.d, k, eoz.e), ih.e, epl.b(czd.e, k, eoz.e)
   );
   private final Map<dme, epo> m;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ih.c).a(c, dnp.a));
      this.m = this.a(czc::m);
   }

   private static epo m(dme $$0) {
      return epl.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cwf $$0, awt $$1, ib $$2, ih $$3) {
      int $$4 = awm.a($$1, 2, 5);
      ib.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ih.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         czd.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ih.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dme $$0) {
      return $$0.i() || $$0.a(czh.G) || $$0.a(czh.sF);
   }

   protected static boolean a(cwg $$0, ib $$1, dme $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cwf $$0, ib $$1, ehr $$2, ih $$3) {
      dme $$4 = czh.sD.o().a(b, Boolean.valueOf($$2.a(ehs.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      this.a($$1, $$0, $$2.a(), dnp.d, atp.hn);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(b) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      dme $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(czh.sE) || $$4.a(aue.bx);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return $$1 == ih.b && $$2.a(this) ? czh.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      dme $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      ib $$4 = $$2.c();
      dme $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ih $$6 = $$3.c(aE);
         czd.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dnp.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dnp.b, null);
         }
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dnp $$4 = $$0.c(c);
         if ($$4 == dnp.b) {
            this.a($$0, $$1, $$2, dnp.c, atp.hn);
         } else if ($$4 == dnp.c) {
            this.a($$0, $$1, $$2, dnp.d, atp.hn);
         } else if ($$4 == dnp.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cwe $$0, ib $$1, ato $$2) {
      float $$3 = awm.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, atq.e, 1.0F, $$3);
   }

   private static boolean a(ib $$0, bof $$1) {
      return $$1.aC() && $$1.dh().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dme $$0, cwe $$1, ib $$2, dnp $$3, @Nullable ato $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dme $$0, cwe $$1, ib $$2) {
      a($$0, $$1, $$2, dnp.a);
      if ($$0.c(c) != dnp.a) {
         a($$1, $$2, atp.ho);
      }
   }

   private static void a(dme $$0, cwe $$1, ib $$2, dnp $$3) {
      dnp $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dqr.c, $$2);
      }
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.m.get($$0);
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a().d());
      ehr $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(czh.sD) || $$1.a(czh.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(ehs.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, aE, c);
   }
}
