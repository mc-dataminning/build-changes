import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dkj extends dok implements dkp, drq {
   public static final MapCodec<dkj> a = b(dkj::new);
   private static final dym b = dyl.D;
   private static final dys<dzf> c = dyl.bm;
   private static final int d = -1;
   private static final Object2IntMap<dzf> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dzf.b, 10);
      $$0.put(dzf.c, 10);
      $$0.put(dzf.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dzf, fcs> j = ImmutableMap.of(
      dzf.a,
      dkm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dzf.b,
      dkm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dzf.c,
      dkm.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dzf.d,
      fcp.a()
   );
   private static final fcs k = dkm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcs> l = ImmutableMap.of(
      jm.c, fcp.b(dkk.b, k, fcc.e), jm.d, fcp.b(dkk.c, k, fcc.e), jm.f, fcp.b(dkk.d, k, fcc.e), jm.e, fcp.b(dkk.e, k, fcc.e)
   );
   private final Map<dxv, fcs> m;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dzf.a));
      this.m = this.a(dkj::o);
   }

   private static fcs o(dxv $$0) {
      return fcp.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dhj $$0, bam $$1, jh $$2, jm $$3) {
      int $$4 = bae.a($$1, 2, 5);
      jh.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jm.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dkk.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dxv $$0) {
      return $$0.l() || $$0.a(dko.J) || $$0.a(dko.ta);
   }

   protected static boolean a(dhk $$0, jh $$1, dxv $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dhj $$0, jh $$1, etx $$2, jm $$3) {
      dxv $$4 = dko.sY.m().b(b, Boolean.valueOf($$2.a(ety.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      this.a($$1, $$0, $$2.b(), dzf.d, axf.hV);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxv $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dko.sZ) || $$4.a(axu.bA);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dko.sZ.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      dxv $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      jh $$4 = $$2.d();
      dxv $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dkk.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dzf.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dzf.b, null);
         }
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dzf $$4 = $$0.c(c);
         if ($$4 == dzf.b) {
            this.a($$0, $$1, $$2, dzf.c, axf.hV);
         } else if ($$4 == dzf.c) {
            this.a($$0, $$1, $$2, dzf.d, axf.hV);
         } else if ($$4 == dzf.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dhi $$0, jh $$1, axe $$2) {
      float $$3 = bae.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, axg.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bvk $$1) {
      return $$1.aJ() && $$1.du().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dxv $$0, dhi $$1, jh $$2, dzf $$3, @Nullable axe $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dxv $$0, dhi $$1, jh $$2) {
      a($$0, $$1, $$2, dzf.a);
      if ($$0.c(c) != dzf.a) {
         a($$1, $$2, axf.hW);
      }
   }

   private static void a(dxv $$0, dhi $$1, jh $$2, dzf $$3) {
      dzf $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ecr.c, $$2);
      }
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.m.get($$0);
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a().e());
      etx $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dko.sY) || $$1.a(dko.sZ);
      return this.m().b(b, Boolean.valueOf($$2.a(ety.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, aF, c);
   }
}
