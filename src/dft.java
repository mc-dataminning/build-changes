import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dft extends djs implements dfz, dmy {
   public static final MapCodec<dft> a = b(dft::new);
   private static final dtr b = dtq.C;
   private static final dty<dul> c = dtq.bl;
   private static final int d = -1;
   private static final Object2IntMap<dul> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dul.b, 10);
      $$0.put(dul.c, 10);
      $$0.put(dul.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dul, exp> j = ImmutableMap.of(
      dul.a,
      dfw.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dul.b,
      dfw.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dul.c,
      dfw.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dul.d,
      exm.a()
   );
   private static final exp k = dfw.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ji, exp> l = ImmutableMap.of(
      ji.c, exm.b(dfu.b, k, exa.e), ji.d, exm.b(dfu.c, k, exa.e), ji.f, exm.b(dfu.d, k, exa.e), ji.e, exm.b(dfu.e, k, exa.e)
   );
   private final Map<dta, exp> m;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   protected dft(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ji.c).a(c, dul.a));
      this.m = this.a(dft::m);
   }

   private static exp m(dta $$0) {
      return exm.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dcv $$0, ayv $$1, jd $$2, ji $$3) {
      int $$4 = ayn.a($$1, 2, 5);
      jd.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ji.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dfu.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ji.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dta $$0) {
      return $$0.i() || $$0.a(dfy.G) || $$0.a(dfy.sF);
   }

   protected static boolean a(dcw $$0, jd $$1, dta $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dcv $$0, jd $$1, eoy $$2, ji $$3) {
      dta $$4 = dfy.sD.o().a(b, Boolean.valueOf($$2.a(eoz.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      this.a($$1, $$0, $$2.a(), dul.d, avo.hB);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(b) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      dta $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfy.sE) || $$4.a(awd.by);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return $$1 == ji.b && $$2.a(this) ? dfy.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      dta $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      jd $$4 = $$2.c();
      dta $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ji $$6 = $$3.c(aE);
         dfu.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dul.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dul.b, null);
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dul $$4 = $$0.c(c);
         if ($$4 == dul.b) {
            this.a($$0, $$1, $$2, dul.c, avo.hB);
         } else if ($$4 == dul.c) {
            this.a($$0, $$1, $$2, dul.d, avo.hB);
         } else if ($$4 == dul.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dcu $$0, jd $$1, avn $$2) {
      float $$3 = ayn.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avp.e, 1.0F, $$3);
   }

   private static boolean a(jd $$0, bsq $$1) {
      return $$1.aF() && $$1.do().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dta $$0, dcu $$1, jd $$2, dul $$3, @Nullable avn $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dta $$0, dcu $$1, jd $$2) {
      a($$0, $$1, $$2, dul.a);
      if ($$0.c(c) != dul.a) {
         a($$1, $$2, avo.hC);
      }
   }

   private static void a(dta $$0, dcu $$1, jd $$2, dul $$3) {
      dul $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dxw.c, $$2);
      }
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.m.get($$0);
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a().d());
      eoy $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfy.sD) || $$1.a(dfy.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eoz.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, aE, c);
   }
}
