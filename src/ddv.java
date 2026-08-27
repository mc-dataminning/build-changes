import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ddv extends dhu implements deb, dkz {
   public static final MapCodec<ddv> a = b(ddv::new);
   private static final drs b = drr.C;
   private static final drz<dsm> c = drr.bl;
   private static final int d = -1;
   private static final Object2IntMap<dsm> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dsm.b, 10);
      $$0.put(dsm.c, 10);
      $$0.put(dsm.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dsm, evd> j = ImmutableMap.of(
      dsm.a,
      ddy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dsm.b,
      ddy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dsm.c,
      ddy.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dsm.d,
      eva.a()
   );
   private static final evd k = ddy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<it, evd> l = ImmutableMap.of(
      it.c, eva.b(ddw.b, k, euo.e), it.d, eva.b(ddw.c, k, euo.e), it.f, eva.b(ddw.d, k, euo.e), it.e, eva.b(ddw.e, k, euo.e)
   );
   private final Map<drb, evd> m;

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   protected ddv(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, it.c).a(c, dsm.a));
      this.m = this.a(ddv::m);
   }

   private static evd m(drb $$0) {
      return eva.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(day $$0, ayk $$1, io $$2, it $$3) {
      int $$4 = ayd.a($$1, 2, 5);
      io.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(it.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         ddw.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(it.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(drb $$0) {
      return $$0.i() || $$0.a(dea.G) || $$0.a(dea.sF);
   }

   protected static boolean a(daz $$0, io $$1, drb $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(day $$0, io $$1, emu $$2, it $$3) {
      drb $$4 = dea.sD.n().a(b, Boolean.valueOf($$2.a(emv.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      this.a($$1, $$0, $$2.a(), dsm.d, avh.hB);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(b) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      drb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dea.sE) || $$4.a(avw.by);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.a && !$$0.a($$3, $$4)) {
         return dea.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return $$1 == it.b && $$2.a(this) ? dea.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      drb $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      io $$4 = $$2.c();
      drb $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         it $$6 = $$3.c(aE);
         ddw.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dsm.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dsm.b, null);
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dsm $$4 = $$0.c(c);
         if ($$4 == dsm.b) {
            this.a($$0, $$1, $$2, dsm.c, avh.hB);
         } else if ($$4 == dsm.c) {
            this.a($$0, $$1, $$2, dsm.d, avh.hB);
         } else if ($$4 == dsm.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dax $$0, io $$1, avg $$2) {
      float $$3 = ayd.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avi.e, 1.0F, $$3);
   }

   private static boolean a(io $$0, bru $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(drb $$0, dax $$1, io $$2, dsm $$3, @Nullable avg $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(drb $$0, dax $$1, io $$2) {
      a($$0, $$1, $$2, dsm.a);
      if ($$0.c(c) != dsm.a) {
         a($$1, $$2, avh.hC);
      }
   }

   private static void a(drb $$0, dax $$1, io $$2, dsm $$3) {
      dsm $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dvu.c, $$2);
      }
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.m.get($$0);
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a().d());
      emu $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dea.sD) || $$1.a(dea.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(emv.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, aE, c);
   }
}
