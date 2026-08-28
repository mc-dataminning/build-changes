import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dfv extends dju implements dgb, dna {
   public static final MapCodec<dfv> a = b(dfv::new);
   private static final dtt b = dts.C;
   private static final dua<dun> c = dts.bl;
   private static final int d = -1;
   private static final Object2IntMap<dun> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dun.b, 10);
      $$0.put(dun.c, 10);
      $$0.put(dun.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dun, ext> j = ImmutableMap.of(
      dun.a,
      dfy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dun.b,
      dfy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dun.c,
      dfy.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dun.d,
      exq.a()
   );
   private static final ext k = dfy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ji, ext> l = ImmutableMap.of(
      ji.c, exq.b(dfw.b, k, exe.e), ji.d, exq.b(dfw.c, k, exe.e), ji.f, exq.b(dfw.d, k, exe.e), ji.e, exq.b(dfw.e, k, exe.e)
   );
   private final Map<dtc, ext> m;

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   protected dfv(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ji.c).a(c, dun.a));
      this.m = this.a(dfv::m);
   }

   private static ext m(dtc $$0) {
      return exq.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dcx $$0, ayw $$1, jd $$2, ji $$3) {
      int $$4 = ayo.a($$1, 2, 5);
      jd.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ji.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dfw.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ji.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dtc $$0) {
      return $$0.i() || $$0.a(dga.G) || $$0.a(dga.sF);
   }

   protected static boolean a(dcy $$0, jd $$1, dtc $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dcx $$0, jd $$1, epc $$2, ji $$3) {
      dtc $$4 = dga.sD.o().a(b, Boolean.valueOf($$2.a(epd.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      this.a($$1, $$0, $$2.a(), dun.d, avp.hB);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(b) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      dtc $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dga.sE) || $$4.a(awe.by);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, epd.c, epd.c.a($$3));
         }

         return $$1 == ji.b && $$2.a(this) ? dga.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.d());
      return n($$3);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      jd $$4 = $$2.d();
      dtc $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ji $$6 = $$3.c(aE);
         dfw.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dun.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dun.b, null);
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dun $$4 = $$0.c(c);
         if ($$4 == dun.b) {
            this.a($$0, $$1, $$2, dun.c, avp.hB);
         } else if ($$4 == dun.c) {
            this.a($$0, $$1, $$2, dun.d, avp.hB);
         } else if ($$4 == dun.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dcw $$0, jd $$1, avo $$2) {
      float $$3 = ayo.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avq.e, 1.0F, $$3);
   }

   private static boolean a(jd $$0, bsr $$1) {
      return $$1.aF() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dtc $$0, dcw $$1, jd $$2, dun $$3, @Nullable avo $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dtc $$0, dcw $$1, jd $$2) {
      a($$0, $$1, $$2, dun.a);
      if ($$0.c(c) != dun.a) {
         a($$1, $$2, avp.hC);
      }
   }

   private static void a(dtc $$0, dcw $$1, jd $$2, dun $$3) {
      dun $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxz.c, $$2);
      }
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.m.get($$0);
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a().e());
      epc $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dga.sD) || $$1.a(dga.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(epd.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, aE, c);
   }
}
