import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cvc extends cza implements cvi, dcf {
   public static final MapCodec<cvc> a = b(cvc::new);
   private static final die b = did.C;
   private static final dil<diy> c = did.bl;
   private static final int d = -1;
   private static final Object2IntMap<diy> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(diy.b, 10);
      $$0.put(diy.c, 10);
      $$0.put(diy.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<diy, eks> j = ImmutableMap.of(
      diy.a,
      cvf.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      diy.b,
      cvf.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      diy.c,
      cvf.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      diy.d,
      ekp.a()
   );
   private static final eks k = cvf.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ib, eks> l = ImmutableMap.of(
      ib.c, ekp.b(cvd.b, k, ekd.e), ib.d, ekp.b(cvd.c, k, ekd.e), ib.f, ekp.b(cvd.d, k, ekd.e), ib.e, ekp.b(cvd.e, k, ekd.e)
   );
   private final Map<dhn, eks> m;

   @Override
   public MapCodec<cvc> a() {
      return a;
   }

   protected cvc(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ib.c).a(c, diy.a));
      this.m = this.a(cvc::h);
   }

   private static eks h(dhn $$0) {
      return ekp.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(csg $$0, atw $$1, hx $$2, ib $$3) {
      int $$4 = atq.a($$1, 2, 5);
      hx.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ib.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cvd.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ib.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G) || $$0.a(cvh.sF);
   }

   protected static boolean a(csh $$0, hx $$1, dhn $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(csg $$0, hx $$1, ecx $$2, ib $$3) {
      dhn $$4 = cvh.sD.o().a(b, Boolean.valueOf($$2.a(ecy.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      this.a($$1, $$0, $$2.a(), diy.d, aqv.gO);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(b) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      dhn $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cvh.sE) || $$4.a(ark.bx);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a && !$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return $$1 == ib.b && $$2.a(this) ? cvh.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      dhn $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      hx $$4 = $$2.c();
      dhn $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ib $$6 = $$3.c(aE);
         cvd.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == diy.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, diy.b, null);
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         diy $$4 = $$0.c(c);
         if ($$4 == diy.b) {
            this.a($$0, $$1, $$2, diy.c, aqv.gO);
         } else if ($$4 == diy.c) {
            this.a($$0, $$1, $$2, diy.d, aqv.gO);
         } else if ($$4 == diy.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(csf $$0, hx $$1, aqu $$2) {
      float $$3 = atq.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aqw.e, 1.0F, $$3);
   }

   private static boolean a(hx $$0, bkv $$1) {
      return $$1.aC() && $$1.dl().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dhn $$0, csf $$1, hx $$2, diy $$3, @Nullable aqu $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dhn $$0, csf $$1, hx $$2) {
      a($$0, $$1, $$2, diy.a);
      if ($$0.c(c) != diy.a) {
         a($$1, $$2, aqv.gP);
      }
   }

   private static void a(dhn $$0, csf $$1, hx $$2, diy $$3) {
      diy $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dlx.c, $$2);
      }
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.m.get($$0);
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a().d());
      ecx $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cvh.sD) || $$1.a(cvh.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(ecy.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, aE, c);
   }
}
