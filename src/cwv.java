import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cwv extends dat implements cxb, ddy {
   public static final MapCodec<cwv> a = b(cwv::new);
   private static final dkg b = dkf.C;
   private static final dkn<dla> c = dkf.bl;
   private static final int d = -1;
   private static final Object2IntMap<dla> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dla.b, 10);
      $$0.put(dla.c, 10);
      $$0.put(dla.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dla, emv> j = ImmutableMap.of(
      dla.a,
      cwy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dla.b,
      cwy.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dla.c,
      cwy.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dla.d,
      ems.a()
   );
   private static final emv k = cwy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emv> l = ImmutableMap.of(
      ic.c, ems.b(cww.b, k, emg.e), ic.d, ems.b(cww.c, k, emg.e), ic.f, ems.b(cww.d, k, emg.e), ic.e, ems.b(cww.e, k, emg.e)
   );
   private final Map<djp, emv> m;

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   protected cwv(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ic.c).a(c, dla.a));
      this.m = this.a(cwv::h);
   }

   private static emv h(djp $$0) {
      return ems.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cty $$0, auw $$1, hx $$2, ic $$3) {
      int $$4 = aup.a($$1, 2, 5);
      hx.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ic.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cww.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ic.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(djp $$0) {
      return $$0.i() || $$0.a(cxa.G) || $$0.a(cxa.sF);
   }

   protected static boolean a(ctz $$0, hx $$1, djp $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cty $$0, hx $$1, eez $$2, ic $$3) {
      djp $$4 = cxa.sD.o().a(b, Boolean.valueOf($$2.a(efa.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      this.a($$1, $$0, $$2.a(), dla.d, art.hm);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(b) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      djp $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cxa.sE) || $$4.a(asi.bx);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return $$1 == ic.b && $$2.a(this) ? cxa.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      djp $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      hx $$4 = $$2.c();
      djp $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ic $$6 = $$3.c(aE);
         cww.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dla.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dla.b, null);
         }
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dla $$4 = $$0.c(c);
         if ($$4 == dla.b) {
            this.a($$0, $$1, $$2, dla.c, art.hm);
         } else if ($$4 == dla.c) {
            this.a($$0, $$1, $$2, dla.d, art.hm);
         } else if ($$4 == dla.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(ctx $$0, hx $$1, ars $$2) {
      float $$3 = aup.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aru.e, 1.0F, $$3);
   }

   private static boolean a(hx $$0, blw $$1) {
      return $$1.aC() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(djp $$0, ctx $$1, hx $$2, dla $$3, @Nullable ars $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(djp $$0, ctx $$1, hx $$2) {
      a($$0, $$1, $$2, dla.a);
      if ($$0.c(c) != dla.a) {
         a($$1, $$2, art.hn);
      }
   }

   private static void a(djp $$0, ctx $$1, hx $$2, dla $$3) {
      dla $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dnz.c, $$2);
      }
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.m.get($$0);
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a().d());
      eez $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cxa.sD) || $$1.a(cxa.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(efa.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, aE, c);
   }
}
