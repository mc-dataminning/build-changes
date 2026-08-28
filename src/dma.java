import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends det implements dmi {
   public static final MapCodec<dma> c = b(dma::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dti<dtr> f = dta.bo;
   public static final dtk g = dta.aT;
   public static final dtb h = dta.C;
   protected static final ewy i = dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkq.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dma> a() {
      return c;
   }

   public dma(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dtr.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      ja $$1 = $$0.a();
      eoh $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eoi.c));
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(h) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (m($$0) != dtr.b) {
         if (m($$0) == dtr.c) {
            $$1.a($$2, $$0.a(f, dtr.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avh.wh, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      if (!$$0.x_() && n($$2) && $$3.al() != bsm.bm && $$0.c_($$1) instanceof dqx $$5 && $$0 instanceof aqm $$6 && $$5.gr().a($$6, $$1, dxg.P, dxg.a.a($$2))) {
         $$5.f().b($$6, dxg.P, dxg.a.a($$3), $$3.do());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dtr.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dcf $$0, ja $$1, dsk $$2) {
      dfh $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return !$$0.B ? a($$2, dpr.I, ($$0x, $$1x, $$2x, $$3) -> dxp.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dtr m(dsk $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsk $$0) {
      return m($$0) == dtr.a;
   }

   public static void a(dcf $$0, ja $$1, dsk $$2) {
      $$0.a($$1, $$2.a(f, dtr.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsg $$0, dcf $$1, ja $$2, dsk $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dtr.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxg.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.wg, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsg $$0, dcf $$1, ja $$2, int $$3) {
      for (jf $$4 : jf.values()) {
         ja $$5 = $$2.a($$4);
         dsk $$6 = $$1.a_($$5);
         if ($$6.a(avw.bV)) {
            $$1.a(dxp.b($$3), $$5, dxg.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avh.I, avi.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if (m($$0) == dtr.b) {
         jf $$4 = jf.b($$3);
         if ($$4 != jf.b && $$4 != jf.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ld.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqx $$4) {
         return m($$0) == dtr.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpi.a(5));
      }
   }
}
