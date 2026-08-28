import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends deu implements dmj {
   public static final MapCodec<dmb> c = b(dmb::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dtj<dts> f = dtb.bo;
   public static final dtl g = dtb.aT;
   public static final dtc h = dtb.C;
   protected static final exa i = dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkr.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dmb> a() {
      return c;
   }

   public dmb(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dts.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      ja $$1 = $$0.a();
      eoj $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eok.c));
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(h) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (m($$0) != dts.b) {
         if (m($$0) == dts.c) {
            $$1.a($$2, $$0.a(f, dts.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avh.wh, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      if (!$$0.x_() && n($$2) && $$3.am() != bsn.bm && $$0.c_($$1) instanceof dqy $$5 && $$0 instanceof aqm $$6 && $$5.gq().a($$6, $$1, dxh.P, dxh.a.a($$2))) {
         $$5.f().b($$6, dxh.P, dxh.a.a($$3), $$3.dp());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dts.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dcg $$0, ja $$1, dsl $$2) {
      dfi $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return !$$0.B ? a($$2, dps.I, ($$0x, $$1x, $$2x, $$3) -> dxq.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dts m(dsl $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsl $$0) {
      return m($$0) == dts.a;
   }

   public static void a(dcg $$0, ja $$1, dsl $$2) {
      $$0.a($$1, $$2.a(f, dts.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsh $$0, dcg $$1, ja $$2, dsl $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dts.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxh.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.wg, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsh $$0, dcg $$1, ja $$2, int $$3) {
      for (jf $$4 : jf.values()) {
         ja $$5 = $$2.a($$4);
         dsl $$6 = $$1.a_($$5);
         if ($$6.a(avw.bV)) {
            $$1.a(dxq.b($$3), $$5, dxh.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avh.I, avi.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if (m($$0) == dts.b) {
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
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqy $$4) {
         return m($$0) == dts.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpj.a(5));
      }
   }
}
