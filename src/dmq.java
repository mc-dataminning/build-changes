import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmq extends dfi implements dmy {
   public static final MapCodec<dmq> c = b(dmq::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dty<duh> f = dtq.bo;
   public static final dua g = dtq.aT;
   public static final dtr h = dtq.C;
   protected static final exp i = dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dlf.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dmq> a() {
      return c;
   }

   public dmq(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, duh.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      jd $$1 = $$0.a();
      eoy $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eoz.c));
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(h) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (m($$0) != duh.b) {
         if (m($$0) == duh.c) {
            $$1.a($$2, $$0.a(f, duh.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avo.wh, avp.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      if (!$$0.x_() && n($$2) && $$3.am() != bsw.bm && $$0.c_($$1) instanceof drn $$5 && $$0 instanceof aqt $$6 && $$5.gp().a($$6, $$1, dxw.P, dxw.a.a($$2))) {
         $$5.f().b($$6, dxw.P, dxw.a.a($$3), $$3.do());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == duh.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dcu $$0, jd $$1, dta $$2) {
      dfw $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return !$$0.B ? a($$2, dqh.I, ($$0x, $$1x, $$2x, $$3) -> dyf.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return i;
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static duh m(dta $$0) {
      return $$0.c(f);
   }

   public static boolean n(dta $$0) {
      return m($$0) == duh.a;
   }

   public static void a(dcu $$0, jd $$1, dta $$2) {
      $$0.a($$1, $$2.a(f, duh.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsq $$0, dcu $$1, jd $$2, dta $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, duh.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxw.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.wg, avp.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsq $$0, dcu $$1, jd $$2, int $$3) {
      for (ji $$4 : ji.values()) {
         jd $$5 = $$2.a($$4);
         dta $$6 = $$1.a_($$5);
         if ($$6.a(awd.bV)) {
            $$1.a(dyf.b($$3), $$5, dxw.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avo.I, avp.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if (m($$0) == duh.b) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      if ($$1.c_($$2) instanceof drn $$4) {
         return m($$0) == duh.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bps.a(5));
      }
   }
}
