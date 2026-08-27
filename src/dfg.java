import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfg extends cya implements dfo {
   public static final MapCodec<dfg> c = b(dfg::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dmd<dmm> f = dlv.bo;
   public static final dmf g = dlv.aT;
   public static final dlw h = dlv.C;
   protected static final eol i = cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = ddw.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dfg> a() {
      return c;
   }

   public dfg(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dmm.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      hz $$1 = $$0.a();
      egp $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == egq.c));
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(h) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (m($$0) != dmm.b) {
         if (m($$0) == dmm.c) {
            $$1.a($$2, $$0.a(f, dmm.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, atk.vz, atl.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bnu.bk && $$0.c_($$1) instanceof djz $$5 && $$0 instanceof aov $$6 && $$5.gj().a($$6, $$1, dpp.P, dpp.a.a($$2))) {
         $$5.g().b($$6, dpp.P, dpp.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dmm.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cvn $$0, hz $$1, dlf $$2) {
      cyo $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return !$$0.B ? a($$2, div.I, ($$0x, $$1x, $$2x, $$3) -> dpy.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return i;
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dmm m(dlf $$0) {
      return $$0.c(f);
   }

   public static boolean n(dlf $$0) {
      return m($$0) == dmm.a;
   }

   public static void a(cvn $$0, hz $$1, dlf $$2) {
      $$0.a($$1, $$2.a(f, dmm.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dmm.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dpp.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atk.vy, atl.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bno $$0, cvn $$1, hz $$2, int $$3) {
      for (ie $$4 : ie.values()) {
         hz $$5 = $$2.a($$4);
         dlf $$6 = $$1.a_($$5);
         if ($$6.a(atz.bO)) {
            $$1.a(dpy.b($$3), $$5, dpp.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, atk.I, atl.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if (m($$0) == dmm.b) {
         ie $$4 = ie.b($$3);
         if ($$4 != ie.b && $$4 != ie.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(js.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djz $$4) {
         return m($$0) == dmm.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bkw.a(5));
      }
   }
}
