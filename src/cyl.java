import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cyl extends dcj implements cyr, dfo {
   public static final MapCodec<cyl> a = b(cyl::new);
   private static final dlw b = dlv.C;
   private static final dmd<dmq> c = dlv.bl;
   private static final int d = -1;
   private static final Object2IntMap<dmq> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dmq.b, 10);
      $$0.put(dmq.c, 10);
      $$0.put(dmq.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dmq, eol> j = ImmutableMap.of(
      dmq.a,
      cyo.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dmq.b,
      cyo.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dmq.c,
      cyo.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dmq.d,
      eoi.a()
   );
   private static final eol k = cyo.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ie, eol> l = ImmutableMap.of(
      ie.c, eoi.b(cym.b, k, enw.e), ie.d, eoi.b(cym.c, k, enw.e), ie.f, eoi.b(cym.d, k, enw.e), ie.e, eoi.b(cym.e, k, enw.e)
   );
   private final Map<dlf, eol> m;

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   protected cyl(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ie.c).a(c, dmq.a));
      this.m = this.a(cyl::m);
   }

   private static eol m(dlf $$0) {
      return eoi.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cvo $$0, awo $$1, hz $$2, ie $$3) {
      int $$4 = awh.a($$1, 2, 5);
      hz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ie.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cym.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ie.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dlf $$0) {
      return $$0.i() || $$0.a(cyq.G) || $$0.a(cyq.sF);
   }

   protected static boolean a(cvp $$0, hz $$1, dlf $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(cvo $$0, hz $$1, egp $$2, ie $$3) {
      dlf $$4 = cyq.sD.o().a(b, Boolean.valueOf($$2.a(egq.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      this.a($$1, $$0, $$2.a(), dmq.d, atk.hm);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(b) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlf $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cyq.sE) || $$4.a(atz.bx);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a && !$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return $$1 == ie.b && $$2.a(this) ? cyq.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      dlf $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      hz $$4 = $$2.c();
      dlf $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ie $$6 = $$3.c(aE);
         cym.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dmq.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dmq.b, null);
         }
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dmq $$4 = $$0.c(c);
         if ($$4 == dmq.b) {
            this.a($$0, $$1, $$2, dmq.c, atk.hm);
         } else if ($$4 == dmq.c) {
            this.a($$0, $$1, $$2, dmq.d, atk.hm);
         } else if ($$4 == dmq.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cvn $$0, hz $$1, atj $$2) {
      float $$3 = awh.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, atl.e, 1.0F, $$3);
   }

   private static boolean a(hz $$0, bno $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dlf $$0, cvn $$1, hz $$2, dmq $$3, @Nullable atj $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dlf $$0, cvn $$1, hz $$2) {
      a($$0, $$1, $$2, dmq.a);
      if ($$0.c(c) != dmq.a) {
         a($$1, $$2, atk.hn);
      }
   }

   private static void a(dlf $$0, cvn $$1, hz $$2, dmq $$3) {
      dmq $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dpp.c, $$2);
      }
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.m.get($$0);
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a().d());
      egp $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cyq.sD) || $$1.a(cyq.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(egq.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, aE, c);
   }
}
