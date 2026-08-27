import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dbv extends dft implements dcb, diy {
   public static final MapCodec<dbv> a = b(dbv::new);
   private static final dpq b = dpp.C;
   private static final dpx<dqk> c = dpp.bl;
   private static final int d = -1;
   private static final Object2IntMap<dqk> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dqk.b, 10);
      $$0.put(dqk.c, 10);
      $$0.put(dqk.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dqk, est> j = ImmutableMap.of(
      dqk.a,
      dby.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dqk.b,
      dby.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dqk.c,
      dby.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dqk.d,
      esq.a()
   );
   private static final est k = dby.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ih, est> l = ImmutableMap.of(
      ih.c, esq.b(dbw.b, k, ese.e), ih.d, esq.b(dbw.c, k, ese.e), ih.f, esq.b(dbw.d, k, ese.e), ih.e, esq.b(dbw.e, k, ese.e)
   );
   private final Map<doz, est> m;

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   protected dbv(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ih.c).a(c, dqk.a));
      this.m = this.a(dbv::m);
   }

   private static est m(doz $$0) {
      return esq.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cyy $$0, axr $$1, ib $$2, ih $$3) {
      int $$4 = axk.a($$1, 2, 5);
      ib.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ih.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dbw.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ih.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(doz $$0) {
      return $$0.i() || $$0.a(dca.G) || $$0.a(dca.sF);
   }

   protected static boolean a(cyz $$0, ib $$1, doz $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cyy $$0, ib $$1, eks $$2, ih $$3) {
      doz $$4 = dca.sD.n().a(b, Boolean.valueOf($$2.a(ekt.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      this.a($$1, $$0, $$2.a(), dqk.d, aum.hw);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(b) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      doz $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dca.sE) || $$4.a(avc.by);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return $$1 == ih.b && $$2.a(this) ? dca.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      doz $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      ib $$4 = $$2.c();
      doz $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ih $$6 = $$3.c(aE);
         dbw.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dqk.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dqk.b, null);
         }
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dqk $$4 = $$0.c(c);
         if ($$4 == dqk.b) {
            this.a($$0, $$1, $$2, dqk.c, aum.hw);
         } else if ($$4 == dqk.c) {
            this.a($$0, $$1, $$2, dqk.d, aum.hw);
         } else if ($$4 == dqk.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cyx $$0, ib $$1, aul $$2) {
      float $$3 = axk.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aun.e, 1.0F, $$3);
   }

   private static boolean a(ib $$0, bpv $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(doz $$0, cyx $$1, ib $$2, dqk $$3, @Nullable aul $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(doz $$0, cyx $$1, ib $$2) {
      a($$0, $$1, $$2, dqk.a);
      if ($$0.c(c) != dqk.a) {
         a($$1, $$2, aum.hx);
      }
   }

   private static void a(doz $$0, cyx $$1, ib $$2, dqk $$3) {
      dqk $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dts.c, $$2);
      }
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.m.get($$0);
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a().d());
      eks $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dca.sD) || $$1.a(dca.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(ekt.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, aE, c);
   }
}
