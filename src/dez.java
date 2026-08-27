import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dez extends djc implements dff, dmr {
   public static final MapCodec<dez> a = b(dez::new);
   private static final dtt b = dts.C;
   private static final dua<dun> c = dts.bl;
   private static final int d = -1;
   private static final Object2IntMap<dun> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dun.b, 10);
      $$0.put(dun.c, 10);
      $$0.put(dun.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dun, exn> j = ImmutableMap.of(
      dun.a,
      dfc.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dun.b,
      dfc.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dun.c,
      dfc.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dun.d,
      exk.a()
   );
   private static final exn k = dfc.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<iw, exn> l = ImmutableMap.of(
      iw.c, exk.b(dfa.b, k, ewy.e), iw.d, exk.b(dfa.c, k, ewy.e), iw.f, exk.b(dfa.d, k, ewy.e), iw.e, exk.b(dfa.e, k, ewy.e)
   );
   private final Map<dtc, exn> m;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   protected dez(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, iw.c).a(c, dun.a));
      this.m = this.a(dez::m);
   }

   private static exn m(dtc $$0) {
      return exk.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dcb $$0, ayt $$1, ir $$2, iw $$3) {
      int $$4 = aym.a($$1, 2, 5);
      ir.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.d(iw.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dfa.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.d(iw.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dtc $$0) {
      return $$0.i() || $$0.a(dfe.al) || $$0.a(dfe.uc);
   }

   protected static boolean a(dcc $$0, ir $$1, dtc $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dcb $$0, ir $$1, epe $$2, iw $$3) {
      dtc $$4 = dfe.ua.n().a(b, Boolean.valueOf($$2.a(epf.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      this.a($$1, $$0, $$2.a(), dun.d, avo.hB);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfe.ub) || $$4.a(awe.bA);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.a && !$$0.a($$3, $$4)) {
         return dfe.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return $$1 == iw.b && $$2.a(this) ? dfe.ub.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      ir $$4 = $$2.c();
      dtc $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         iw $$6 = $$3.c(aE);
         dfa.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dun.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dun.b, null);
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dun $$4 = $$0.c(c);
         if ($$4 == dun.b) {
            this.a($$0, $$1, $$2, dun.c, avo.hB);
         } else if ($$4 == dun.c) {
            this.a($$0, $$1, $$2, dun.d, avo.hB);
         } else if ($$4 == dun.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dca $$0, ir $$1, avn $$2) {
      float $$3 = aym.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avq.e, 1.0F, $$3);
   }

   private static boolean a(ir $$0, brv $$1) {
      return $$1.aE() && $$1.ds().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dtc $$0, dca $$1, ir $$2, dun $$3, @Nullable avn $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dtc $$0, dca $$1, ir $$2) {
      a($$0, $$1, $$2, dun.a);
      if ($$0.c(c) != dun.a) {
         a($$1, $$2, avo.hC);
      }
   }

   private static void a(dtc $$0, dca $$1, ir $$2, dun $$3) {
      dun $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxv.c, $$2);
      }
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.m.get($$0);
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a().d());
      epe $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfe.ua) || $$1.a(dfe.ub);
      return this.n().a(b, Boolean.valueOf($$2.a(epf.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, aE, c);
   }
}
