import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dcs extends dgr implements dcy, djw {
   public static final MapCodec<dcs> a = b(dcs::new);
   private static final dqp b = dqo.C;
   private static final dqw<drj> c = dqo.bl;
   private static final int d = -1;
   private static final Object2IntMap<drj> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(drj.b, 10);
      $$0.put(drj.c, 10);
      $$0.put(drj.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<drj, ety> j = ImmutableMap.of(
      drj.a,
      dcv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      drj.b,
      dcv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      drj.c,
      dcv.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      drj.d,
      etv.a()
   );
   private static final ety k = dcv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ir, ety> l = ImmutableMap.of(
      ir.c, etv.b(dct.b, k, etj.e), ir.d, etv.b(dct.c, k, etj.e), ir.f, etv.b(dct.d, k, etj.e), ir.e, etv.b(dct.e, k, etj.e)
   );
   private final Map<dpy, ety> m;

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   protected dcs(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ir.c).a(c, drj.a));
      this.m = this.a(dcs::m);
   }

   private static ety m(dpy $$0) {
      return etv.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(czv $$0, ayd $$1, im $$2, ir $$3) {
      int $$4 = axw.a($$1, 2, 5);
      im.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ir.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dct.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ir.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dpy $$0) {
      return $$0.i() || $$0.a(dcx.G) || $$0.a(dcx.sF);
   }

   protected static boolean a(czw $$0, im $$1, dpy $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(czv $$0, im $$1, elr $$2, ir $$3) {
      dpy $$4 = dcx.sD.n().a(b, Boolean.valueOf($$2.a(els.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      this.a($$1, $$0, $$2.a(), drj.d, auz.hw);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(b) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      dpy $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dcx.sE) || $$4.a(avo.by);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.a && !$$0.a($$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return $$1 == ir.b && $$2.a(this) ? dcx.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      dpy $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      im $$4 = $$2.c();
      dpy $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ir $$6 = $$3.c(aE);
         dct.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == drj.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, drj.b, null);
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         drj $$4 = $$0.c(c);
         if ($$4 == drj.b) {
            this.a($$0, $$1, $$2, drj.c, auz.hw);
         } else if ($$4 == drj.c) {
            this.a($$0, $$1, $$2, drj.d, auz.hw);
         } else if ($$4 == drj.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(czu $$0, im $$1, auy $$2) {
      float $$3 = axw.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, ava.e, 1.0F, $$3);
   }

   private static boolean a(im $$0, bql $$1) {
      return $$1.aC() && $$1.dl().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dpy $$0, czu $$1, im $$2, drj $$3, @Nullable auy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dpy $$0, czu $$1, im $$2) {
      a($$0, $$1, $$2, drj.a);
      if ($$0.c(c) != drj.a) {
         a($$1, $$2, auz.hx);
      }
   }

   private static void a(dpy $$0, czu $$1, im $$2, drj $$3) {
      drj $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dur.c, $$2);
      }
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.m.get($$0);
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a().d());
      elr $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dcx.sD) || $$1.a(dcx.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(els.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, aE, c);
   }
}
