import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dms extends dfk implements dna {
   public static final MapCodec<dms> c = b(dms::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dua<duj> f = dts.bo;
   public static final duc g = dts.aT;
   public static final dtt h = dts.C;
   protected static final ext i = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dlh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dms> a() {
      return c;
   }

   public dms(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, duj.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      jd $$1 = $$0.a();
      epc $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == epd.c));
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(h) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (m($$0) != duj.b) {
         if (m($$0) == duj.c) {
            $$1.a($$2, $$0.a(f, duj.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avp.wh, avq.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      if (!$$0.x_() && n($$2) && $$3.am() != bsx.bm && $$0.c_($$1) instanceof drp $$5 && $$0 instanceof aqu $$6 && $$5.go().a($$6, $$1, dxz.P, dxz.a.a($$2))) {
         $$5.f().b($$6, dxz.P, dxz.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == duj.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dcw $$0, jd $$1, dtc $$2) {
      dfy $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return !$$0.B ? a($$2, dqj.I, ($$0x, $$1x, $$2x, $$3) -> dyi.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return i;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static duj m(dtc $$0) {
      return $$0.c(f);
   }

   public static boolean n(dtc $$0) {
      return m($$0) == duj.a;
   }

   public static void a(dcw $$0, jd $$1, dtc $$2) {
      $$0.a($$1, $$2.a(f, duj.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsr $$0, dcw $$1, jd $$2, dtc $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, duj.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxz.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.wg, avq.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsr $$0, dcw $$1, jd $$2, int $$3) {
      for (ji $$4 : ji.values()) {
         jd $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         if ($$6.a(awe.bV)) {
            $$1.a(dyi.b($$3), $$5, dxz.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avp.I, avq.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if (m($$0) == duj.b) {
         ji $$4 = ji.b($$3);
         if ($$4 != ji.b && $$4 != ji.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lg.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      if ($$1.c_($$2) instanceof drp $$4) {
         return m($$0) == duj.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpt.a(5));
      }
   }
}
