import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends ddk implements dkz {
   public static final MapCodec<dkr> c = b(dkr::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final drz<dsi> f = drr.bo;
   public static final dsb g = drr.aT;
   public static final drs h = drr.C;
   protected static final evd i = ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = djh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dkr> a() {
      return c;
   }

   public dkr(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dsi.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      io $$1 = $$0.a();
      emu $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == emv.c));
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(h) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (m($$0) != dsi.b) {
         if (m($$0) == dsi.c) {
            $$1.a($$2, $$0.a(f, dsi.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avh.we, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsa.bm && $$0.c_($$1) instanceof dpn $$5 && $$0 instanceof aqm $$6 && $$5.gs().a($$6, $$1, dvu.P, dvu.a.a($$2))) {
         $$5.f().b($$6, dvu.P, dvu.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dsi.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dax $$0, io $$1, drb $$2) {
      ddy $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return !$$0.B ? a($$2, doi.I, ($$0x, $$1x, $$2x, $$3) -> dwd.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return i;
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$3 == it.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dsi m(drb $$0) {
      return $$0.c(f);
   }

   public static boolean n(drb $$0) {
      return m($$0) == dsi.a;
   }

   public static void a(dax $$0, io $$1, drb $$2) {
      $$0.a($$1, $$2.a(f, dsi.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bru $$0, dax $$1, io $$2, drb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dsi.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dvu.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.wd, avi.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bru $$0, dax $$1, io $$2, int $$3) {
      for (it $$4 : it.values()) {
         io $$5 = $$2.a($$4);
         drb $$6 = $$1.a_($$5);
         if ($$6.a(avw.bV)) {
            $$1.a(dwd.b($$3), $$5, dvu.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avh.I, avi.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if (m($$0) == dsi.b) {
         it $$4 = it.b($$3);
         if ($$4 != it.b && $$4 != it.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(kr.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpn $$4) {
         return m($$0) == dsi.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bow.a(5));
      }
   }
}
