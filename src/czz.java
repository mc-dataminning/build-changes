import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class czz extends ddx implements daf, dhc {
   public static final MapCodec<czz> a = b(czz::new);
   private static final dns b = dnr.C;
   private static final dnz<dom> c = dnr.bl;
   private static final int d = -1;
   private static final Object2IntMap<dom> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dom.b, 10);
      $$0.put(dom.c, 10);
      $$0.put(dom.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dom, eqm> j = ImmutableMap.of(
      dom.a,
      dac.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dom.b,
      dac.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dom.c,
      dac.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dom.d,
      eqj.a()
   );
   private static final eqm k = dac.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ih, eqm> l = ImmutableMap.of(
      ih.c, eqj.b(daa.b, k, epx.e), ih.d, eqj.b(daa.c, k, epx.e), ih.f, eqj.b(daa.d, k, epx.e), ih.e, eqj.b(daa.e, k, epx.e)
   );
   private final Map<dnb, eqm> m;

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   protected czz(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ih.c).a(c, dom.a));
      this.m = this.a(czz::m);
   }

   private static eqm m(dnb $$0) {
      return eqj.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cxc $$0, axd $$1, ib $$2, ih $$3) {
      int $$4 = aww.a($$1, 2, 5);
      ib.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ih.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         daa.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ih.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dnb $$0) {
      return $$0.i() || $$0.a(dae.G) || $$0.a(dae.sF);
   }

   protected static boolean a(cxd $$0, ib $$1, dnb $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cxc $$0, ib $$1, eip $$2, ih $$3) {
      dnb $$4 = dae.sD.o().a(b, Boolean.valueOf($$2.a(eiq.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      this.a($$1, $$0, $$2.a(), dom.d, aty.hu);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(b) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      dnb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dae.sE) || $$4.a(aun.by);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dae.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return $$1 == ih.b && $$2.a(this) ? dae.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      dnb $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      ib $$4 = $$2.c();
      dnb $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ih $$6 = $$3.c(aE);
         daa.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dom.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dom.b, null);
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dom $$4 = $$0.c(c);
         if ($$4 == dom.b) {
            this.a($$0, $$1, $$2, dom.c, aty.hu);
         } else if ($$4 == dom.c) {
            this.a($$0, $$1, $$2, dom.d, aty.hu);
         } else if ($$4 == dom.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cxb $$0, ib $$1, atx $$2) {
      float $$3 = aww.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, atz.e, 1.0F, $$3);
   }

   private static boolean a(ib $$0, box $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dnb $$0, cxb $$1, ib $$2, dom $$3, @Nullable atx $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dnb $$0, cxb $$1, ib $$2) {
      a($$0, $$1, $$2, dom.a);
      if ($$0.c(c) != dom.a) {
         a($$1, $$2, aty.hv);
      }
   }

   private static void a(dnb $$0, cxb $$1, ib $$2, dom $$3) {
      dom $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, drp.c, $$2);
      }
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.m.get($$0);
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a().d());
      eip $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dae.sD) || $$1.a(dae.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eiq.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, aE, c);
   }
}
