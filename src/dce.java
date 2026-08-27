import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dce extends dgc implements dck, djh {
   public static final MapCodec<dce> a = b(dce::new);
   private static final dpz b = dpy.C;
   private static final dqg<dqt> c = dpy.bl;
   private static final int d = -1;
   private static final Object2IntMap<dqt> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dqt.b, 10);
      $$0.put(dqt.c, 10);
      $$0.put(dqt.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dqt, etc> j = ImmutableMap.of(
      dqt.a,
      dch.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dqt.b,
      dch.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dqt.c,
      dch.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dqt.d,
      esz.a()
   );
   private static final etc k = dch.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ij, etc> l = ImmutableMap.of(
      ij.c, esz.b(dcf.b, k, esn.e), ij.d, esz.b(dcf.c, k, esn.e), ij.f, esz.b(dcf.d, k, esn.e), ij.e, esz.b(dcf.e, k, esn.e)
   );
   private final Map<dpi, etc> m;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   protected dce(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ij.c).a(c, dqt.a));
      this.m = this.a(dce::m);
   }

   private static etc m(dpi $$0) {
      return esz.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(czh $$0, axt $$1, id $$2, ij $$3) {
      int $$4 = axm.a($$1, 2, 5);
      id.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ij.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dcf.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ij.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dpi $$0) {
      return $$0.i() || $$0.a(dcj.G) || $$0.a(dcj.sF);
   }

   protected static boolean a(czi $$0, id $$1, dpi $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(czh $$0, id $$1, elb $$2, ij $$3) {
      dpi $$4 = dcj.sD.n().a(b, Boolean.valueOf($$2.a(elc.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      this.a($$1, $$0, $$2.a(), dqt.d, auo.hw);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(b) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      dpi $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dcj.sE) || $$4.a(ave.by);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.a && !$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, elc.c, elc.c.a($$3));
         }

         return $$1 == ij.b && $$2.a(this) ? dcj.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      dpi $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      id $$4 = $$2.c();
      dpi $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ij $$6 = $$3.c(aE);
         dcf.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dqt.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dqt.b, null);
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dqt $$4 = $$0.c(c);
         if ($$4 == dqt.b) {
            this.a($$0, $$1, $$2, dqt.c, auo.hw);
         } else if ($$4 == dqt.c) {
            this.a($$0, $$1, $$2, dqt.d, auo.hw);
         } else if ($$4 == dqt.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(czg $$0, id $$1, aun $$2) {
      float $$3 = axm.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aup.e, 1.0F, $$3);
   }

   private static boolean a(id $$0, bqa $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dpi $$0, czg $$1, id $$2, dqt $$3, @Nullable aun $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dpi $$0, czg $$1, id $$2) {
      a($$0, $$1, $$2, dqt.a);
      if ($$0.c(c) != dqt.a) {
         a($$1, $$2, auo.hx);
      }
   }

   private static void a(dpi $$0, czg $$1, id $$2, dqt $$3) {
      dqt $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dub.c, $$2);
      }
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.m.get($$0);
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a().d());
      elb $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dcj.sD) || $$1.a(dcj.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(elc.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, aE, c);
   }
}
