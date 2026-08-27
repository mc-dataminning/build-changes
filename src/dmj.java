import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends den implements dmr {
   public static final MapCodec<dmj> c = b(dmj::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dua<duj> f = dts.bo;
   public static final duc g = dts.aT;
   public static final dtt h = dts.C;
   protected static final exn i = dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkq.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dmj> a() {
      return c;
   }

   public dmj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, duj.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      ir $$1 = $$0.a();
      epe $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == epf.c));
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(h) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (m($$0) != duj.b) {
         if (m($$0) == duj.c) {
            $$1.a($$2, $$0.a(f, duj.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avo.wC, avq.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsb.bq && $$0.c_($$1) instanceof dro $$5 && $$0 instanceof aqt $$6 && $$5.gB().a($$6, $$1, dxv.P, dxv.a.a($$2))) {
         $$5.f().b($$6, dxv.P, dxv.a.a($$3), $$3.ds());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == duj.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dca $$0, ir $$1, dtc $$2) {
      dfc $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dro($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return !$$0.C ? a($$2, dqe.J, ($$0x, $$1x, $$2x, $$3) -> dye.c.a($$0x, $$3.gA(), $$3.gB())) : null;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return i;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$3 == iw.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static duj m(dtc $$0) {
      return $$0.c(f);
   }

   public static boolean n(dtc $$0) {
      return m($$0) == duj.a;
   }

   public static void a(dca $$0, ir $$1, dtc $$2) {
      $$0.a($$1, $$2.a(f, duj.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, duj.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxv.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.wB, avq.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable brv $$0, dca $$1, ir $$2, int $$3) {
      for (iw $$4 : iw.values()) {
         ir $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         if ($$6.a(awe.bY)) {
            $$1.a(dye.b($$3), $$5, dxv.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avo.N, avq.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if (m($$0) == duj.b) {
         iw $$4 = iw.b($$3);
         if ($$4 != iw.b && $$4 != iw.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ku.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      if ($$1.c_($$2) instanceof dro $$4) {
         return m($$0) == duj.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpc.a(5));
      }
   }
}
