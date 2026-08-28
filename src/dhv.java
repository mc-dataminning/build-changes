import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dhv extends dlt implements dib, doz {
   public static final MapCodec<dhv> a = b(dhv::new);
   private static final dvu b = dvt.C;
   private static final dwb<dwo> c = dvt.bl;
   private static final int d = -1;
   private static final Object2IntMap<dwo> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dwo.b, 10);
      $$0.put(dwo.c, 10);
      $$0.put(dwo.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dwo, fab> j = ImmutableMap.of(
      dwo.a,
      dhy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwo.b,
      dhy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwo.c,
      dhy.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dwo.d,
      ezy.a()
   );
   private static final fab k = dhy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jl, fab> l = ImmutableMap.of(
      jl.c, ezy.b(dhw.b, k, ezl.e), jl.d, ezy.b(dhw.c, k, ezl.e), jl.f, ezy.b(dhw.d, k, ezl.e), jl.e, ezy.b(dhw.e, k, ezl.e)
   );
   private final Map<dvd, fab> m;

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jl.c).b(c, dwo.a));
      this.m = this.a(dhv::o);
   }

   private static fab o(dvd $$0) {
      return ezy.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dew $$0, azr $$1, jg $$2, jl $$3) {
      int $$4 = azj.a($$1, 2, 5);
      jg.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jl.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dhw.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jl.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dvd $$0) {
      return $$0.l() || $$0.a(dia.G) || $$0.a(dia.sF);
   }

   protected static boolean a(dex $$0, jg $$1, dvd $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dew $$0, jg $$1, ere $$2, jl $$3) {
      dvd $$4 = dia.sD.m().b(b, Boolean.valueOf($$2.a(erf.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      this.a($$1, $$0, $$2.b(), dwo.d, awk.hC);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(b) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      dvd $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dia.sE) || $$4.a(awz.bz);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.a && !$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return $$1 == jl.b && $$2.a(this) ? dia.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      dvd $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      jg $$4 = $$2.d();
      dvd $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jl $$6 = $$3.c(aF);
         dhw.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dwo.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dwo.b, null);
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dwo $$4 = $$0.c(c);
         if ($$4 == dwo.b) {
            this.a($$0, $$1, $$2, dwo.c, awk.hC);
         } else if ($$4 == dwo.c) {
            this.a($$0, $$1, $$2, dwo.d, awk.hC);
         } else if ($$4 == dwo.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dev $$0, jg $$1, awj $$2) {
      float $$3 = azj.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awl.e, 1.0F, $$3);
   }

   private static boolean a(jg $$0, btz $$1) {
      return $$1.aJ() && $$1.dv().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dvd $$0, dev $$1, jg $$2, dwo $$3, @Nullable awj $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dvd $$0, dev $$1, jg $$2) {
      a($$0, $$1, $$2, dwo.a);
      if ($$0.c(c) != dwo.a) {
         a($$1, $$2, awk.hD);
      }
   }

   private static void a(dvd $$0, dev $$1, jg $$2, dwo $$3) {
      dwo $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eaa.c, $$2);
      }
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.m.get($$0);
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a().e());
      ere $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dia.sD) || $$1.a(dia.sE);
      return this.m().b(b, Boolean.valueOf($$2.a(erf.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, aF, c);
   }
}
