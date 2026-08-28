import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class din extends dml implements dit, dpr {
   public static final MapCodec<din> a = b(din::new);
   private static final dwm b = dwl.C;
   private static final dws<dxf> c = dwl.bl;
   private static final int d = -1;
   private static final Object2IntMap<dxf> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dxf.b, 10);
      $$0.put(dxf.c, 10);
      $$0.put(dxf.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dxf, fas> j = ImmutableMap.of(
      dxf.a,
      diq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dxf.b,
      diq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dxf.c,
      diq.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dxf.d,
      fap.a()
   );
   private static final fas k = diq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fas> l = ImmutableMap.of(
      jm.c, fap.b(dio.b, k, fac.e), jm.d, fap.b(dio.c, k, fac.e), jm.f, fap.b(dio.d, k, fac.e), jm.e, fap.b(dio.e, k, fac.e)
   );
   private final Map<dvv, fas> m;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dxf.a));
      this.m = this.a(din::o);
   }

   private static fas o(dvv $$0) {
      return fap.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dfn $$0, azu $$1, jh $$2, jm $$3) {
      int $$4 = azm.a($$1, 2, 5);
      jh.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jm.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dio.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dvv $$0) {
      return $$0.l() || $$0.a(dis.G) || $$0.a(dis.sF);
   }

   protected static boolean a(dfo $$0, jh $$1, dvv $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dfn $$0, jh $$1, erv $$2, jm $$3) {
      dvv $$4 = dis.sD.m().b(b, Boolean.valueOf($$2.a(erw.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      this.a($$1, $$0, $$2.b(), dxf.d, awn.hC);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(b) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvv $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dis.sE) || $$4.a(axc.bz);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dis.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dis.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      dvv $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      jh $$4 = $$2.d();
      dvv $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dio.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dxf.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dxf.b, null);
         }
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dxf $$4 = $$0.c(c);
         if ($$4 == dxf.b) {
            this.a($$0, $$1, $$2, dxf.c, awn.hC);
         } else if ($$4 == dxf.c) {
            this.a($$0, $$1, $$2, dxf.d, awn.hC);
         } else if ($$4 == dxf.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dfm $$0, jh $$1, awm $$2) {
      float $$3 = azm.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awo.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bul $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dvv $$0, dfm $$1, jh $$2, dxf $$3, @Nullable awm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dvv $$0, dfm $$1, jh $$2) {
      a($$0, $$1, $$2, dxf.a);
      if ($$0.c(c) != dxf.a) {
         a($$1, $$2, awn.hD);
      }
   }

   private static void a(dvv $$0, dfm $$1, jh $$2, dxf $$3) {
      dxf $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ear.c, $$2);
      }
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.m.get($$0);
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = $$0.q().a_($$0.a().e());
      erv $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dis.sD) || $$1.a(dis.sE);
      return this.m().b(b, Boolean.valueOf($$2.a(erw.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, aF, c);
   }
}
