import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dki extends doj implements dko, drp {
   public static final MapCodec<dki> a = b(dki::new);
   private static final dyl b = dyk.D;
   private static final dyr<dze> c = dyk.bm;
   private static final int d = -1;
   private static final Object2IntMap<dze> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dze.b, 10);
      $$0.put(dze.c, 10);
      $$0.put(dze.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dze, fcr> j = ImmutableMap.of(
      dze.a,
      dkl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dze.b,
      dkl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dze.c,
      dkl.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dze.d,
      fco.a()
   );
   private static final fcr k = dkl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcr> l = ImmutableMap.of(
      jm.c, fco.b(dkj.b, k, fcb.e), jm.d, fco.b(dkj.c, k, fcb.e), jm.f, fco.b(dkj.d, k, fcb.e), jm.e, fco.b(dkj.e, k, fcb.e)
   );
   private final Map<dxu, fcr> m;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   protected dki(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dze.a));
      this.m = this.a(dki::o);
   }

   private static fcr o(dxu $$0) {
      return fco.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dhi $$0, bam $$1, jh $$2, jm $$3) {
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
         dkj.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dxu $$0) {
      return $$0.l() || $$0.a(dkn.J) || $$0.a(dkn.ta);
   }

   protected static boolean a(dhj $$0, jh $$1, dxu $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dhi $$0, jh $$1, etw $$2, jm $$3) {
      dxu $$4 = dkn.sY.m().b(b, Boolean.valueOf($$2.a(etx.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      this.a($$1, $$0, $$2.b(), dze.d, axf.hV);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxu $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dkn.sZ) || $$4.a(axu.bA);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dkn.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dkn.sZ.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      dxu $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      jh $$4 = $$2.d();
      dxu $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dkj.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dze.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dze.b, null);
         }
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dze $$4 = $$0.c(c);
         if ($$4 == dze.b) {
            this.a($$0, $$1, $$2, dze.c, axf.hV);
         } else if ($$4 == dze.c) {
            this.a($$0, $$1, $$2, dze.d, axf.hV);
         } else if ($$4 == dze.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dhh $$0, jh $$1, axe $$2) {
      float $$3 = bae.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, axg.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bvj $$1) {
      return $$1.aJ() && $$1.du().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dxu $$0, dhh $$1, jh $$2, dze $$3, @Nullable axe $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dxu $$0, dhh $$1, jh $$2) {
      a($$0, $$1, $$2, dze.a);
      if ($$0.c(c) != dze.a) {
         a($$1, $$2, axf.hW);
      }
   }

   private static void a(dxu $$0, dhh $$1, jh $$2, dze $$3) {
      dze $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ecq.c, $$2);
      }
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.m.get($$0);
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = $$0.q().a_($$0.a().e());
      etw $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dkn.sY) || $$1.a(dkn.sZ);
      return this.m().b(b, Boolean.valueOf($$2.a(etx.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, aF, c);
   }
}
