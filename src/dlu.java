import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends den implements dmc {
   public static final MapCodec<dlu> c = b(dlu::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dtc<dtl> f = dsu.bo;
   public static final dte g = dsu.aT;
   public static final dsv h = dsu.C;
   protected static final ewm i = dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkk.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dlu> a() {
      return c;
   }

   public dlu(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dtl.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      iz $$1 = $$0.a();
      enx $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eny.c));
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(h) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$0) != dtl.b) {
         if (m($$0) == dtl.c) {
            $$1.a($$2, $$0.a(f, dtl.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awa.we, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, bsw $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != btc.bm && $$0.c_($$1) instanceof dqq $$5 && $$0 instanceof arf $$6 && $$5.gt().a($$6, $$1, dwx.P, dwx.a.a($$2))) {
         $$5.f().b($$6, dwx.P, dwx.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dtl.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dca $$0, iz $$1, dse $$2) {
      dfb $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return !$$0.B ? a($$2, dpl.I, ($$0x, $$1x, $$2x, $$3) -> dxg.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return i;
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dtl m(dse $$0) {
      return $$0.c(f);
   }

   public static boolean n(dse $$0) {
      return m($$0) == dtl.a;
   }

   public static void a(dca $$0, iz $$1, dse $$2) {
      $$0.a($$1, $$2.a(f, dtl.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsw $$0, dca $$1, iz $$2, dse $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dtl.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dwx.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.wd, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsw $$0, dca $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         dse $$6 = $$1.a_($$5);
         if ($$6.a(awp.bV)) {
            $$1.a(dxg.b($$3), $$5, dwx.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awa.I, awb.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if (m($$0) == dtl.b) {
         je $$4 = je.b($$3);
         if ($$4 != je.b && $$4 != je.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lc.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqq $$4) {
         return m($$0) == dtl.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpy.a(5));
      }
   }
}
