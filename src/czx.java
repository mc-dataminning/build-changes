import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class czx extends ddv implements dad, dha {
   public static final MapCodec<czx> a = b(czx::new);
   private static final dnq b = dnp.C;
   private static final dnx<dok> c = dnp.bl;
   private static final int d = -1;
   private static final Object2IntMap<dok> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dok.b, 10);
      $$0.put(dok.c, 10);
      $$0.put(dok.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dok, eqk> j = ImmutableMap.of(
      dok.a,
      daa.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dok.b,
      daa.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dok.c,
      daa.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dok.d,
      eqh.a()
   );
   private static final eqk k = daa.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ih, eqk> l = ImmutableMap.of(
      ih.c, eqh.b(czy.b, k, epv.e), ih.d, eqh.b(czy.c, k, epv.e), ih.f, eqh.b(czy.d, k, epv.e), ih.e, eqh.b(czy.e, k, epv.e)
   );
   private final Map<dmz, eqk> m;

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   protected czx(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ih.c).a(c, dok.a));
      this.m = this.a(czx::m);
   }

   private static eqk m(dmz $$0) {
      return eqh.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cxa $$0, axd $$1, ib $$2, ih $$3) {
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
         czy.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ih.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dmz $$0) {
      return $$0.i() || $$0.a(dac.G) || $$0.a(dac.sF);
   }

   protected static boolean a(cxb $$0, ib $$1, dmz $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cxa $$0, ib $$1, ein $$2, ih $$3) {
      dmz $$4 = dac.sD.o().a(b, Boolean.valueOf($$2.a(eio.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      this.a($$1, $$0, $$2.a(), dok.d, aty.hq);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(b) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      dmz $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dac.sE) || $$4.a(aun.by);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dac.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return $$1 == ih.b && $$2.a(this) ? dac.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      dmz $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      ib $$4 = $$2.c();
      dmz $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ih $$6 = $$3.c(aE);
         czy.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dok.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dok.b, null);
         }
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dok $$4 = $$0.c(c);
         if ($$4 == dok.b) {
            this.a($$0, $$1, $$2, dok.c, aty.hq);
         } else if ($$4 == dok.c) {
            this.a($$0, $$1, $$2, dok.d, aty.hq);
         } else if ($$4 == dok.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cwz $$0, ib $$1, atx $$2) {
      float $$3 = aww.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, atz.e, 1.0F, $$3);
   }

   private static boolean a(ib $$0, bow $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dmz $$0, cwz $$1, ib $$2, dok $$3, @Nullable atx $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dmz $$0, cwz $$1, ib $$2) {
      a($$0, $$1, $$2, dok.a);
      if ($$0.c(c) != dok.a) {
         a($$1, $$2, aty.hr);
      }
   }

   private static void a(dmz $$0, cwz $$1, ib $$2, dok $$3) {
      dok $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, drn.c, $$2);
      }
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.m.get($$0);
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a().d());
      ein $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dac.sD) || $$1.a(dac.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eio.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, aE, c);
   }
}
