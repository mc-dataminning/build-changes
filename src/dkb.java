import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dkb extends doc implements dkh, dri {
   public static final MapCodec<dkb> a = b(dkb::new);
   private static final dye b = dyd.D;
   private static final dyk<dyx> c = dyd.bm;
   private static final int d = -1;
   private static final Object2IntMap<dyx> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyx.b, 10);
      $$0.put(dyx.c, 10);
      $$0.put(dyx.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyx, fcm> j = ImmutableMap.of(
      dyx.a,
      dke.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyx.b,
      dke.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyx.c,
      dke.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyx.d,
      fcj.a()
   );
   private static final fcm k = dke.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcm> l = ImmutableMap.of(
      jm.c, fcj.b(dkc.b, k, fbw.e), jm.d, fcj.b(dkc.c, k, fbw.e), jm.f, fcj.b(dkc.d, k, fbw.e), jm.e, fcj.b(dkc.e, k, fbw.e)
   );
   private final Map<dxn, fcm> m;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dyx.a));
      this.m = this.a(dkb::o);
   }

   private static fcm o(dxn $$0) {
      return fcj.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dhb $$0, bam $$1, jh $$2, jm $$3) {
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
         dkc.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dxn $$0) {
      return $$0.l() || $$0.a(dkg.J) || $$0.a(dkg.ta);
   }

   protected static boolean a(dhc $$0, jh $$1, dxn $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dhb $$0, jh $$1, etp $$2, jm $$3) {
      dxn $$4 = dkg.sY.m().b(b, Boolean.valueOf($$2.a(etq.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      this.a($$1, $$0, $$2.b(), dyx.d, axf.hU);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxn $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dkg.sZ) || $$4.a(axu.bA);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etq.c, etq.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dkg.sZ.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      dxn $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      jh $$4 = $$2.d();
      dxn $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dkc.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyx.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyx.b, null);
         }
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyx $$4 = $$0.c(c);
         if ($$4 == dyx.b) {
            this.a($$0, $$1, $$2, dyx.c, axf.hU);
         } else if ($$4 == dyx.c) {
            this.a($$0, $$1, $$2, dyx.d, axf.hU);
         } else if ($$4 == dyx.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dha $$0, jh $$1, axe $$2) {
      float $$3 = bae.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, axg.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bvf $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dxn $$0, dha $$1, jh $$2, dyx $$3, @Nullable axe $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dxn $$0, dha $$1, jh $$2) {
      a($$0, $$1, $$2, dyx.a);
      if ($$0.c(c) != dyx.a) {
         a($$1, $$2, axf.hV);
      }
   }

   private static void a(dxn $$0, dha $$1, jh $$2, dyx $$3) {
      dyx $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ecj.c, $$2);
      }
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.m.get($$0);
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a().e());
      etp $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dkg.sY) || $$1.a(dkg.sZ);
      return this.m().b(b, Boolean.valueOf($$2.a(etq.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, aF, c);
   }
}
