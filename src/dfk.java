import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfk extends cye implements dfs {
   public static final MapCodec<dfk> c = b(dfk::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dmh<dmq> f = dlz.bo;
   public static final dmj g = dlz.aT;
   public static final dma h = dlz.C;
   protected static final eos i = cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dea.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dfk> a() {
      return c;
   }

   public dfk(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dmq.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      hz $$1 = $$0.a();
      egw $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == egx.c));
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(h) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (m($$0) != dmq.b) {
         if (m($$0) == dmq.c) {
            $$1.a($$2, $$0.a(f, dmq.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, atl.vA, atm.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bnw.bk && $$0.c_($$1) instanceof dkd $$5 && $$0 instanceof aow $$6 && $$5.gj().a($$6, $$1, dpw.P, dpw.a.a($$2))) {
         $$5.g().b($$6, dpw.P, dpw.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dmq.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cvr $$0, hz $$1, dlj $$2) {
      cys $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return !$$0.B ? a($$2, diz.I, ($$0x, $$1x, $$2x, $$3) -> dqf.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return i;
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dmq m(dlj $$0) {
      return $$0.c(f);
   }

   public static boolean n(dlj $$0) {
      return m($$0) == dmq.a;
   }

   public static void a(cvr $$0, hz $$1, dlj $$2) {
      $$0.a($$1, $$2.a(f, dmq.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dmq.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dpw.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atl.vz, atm.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bnq $$0, cvr $$1, hz $$2, int $$3) {
      for (ie $$4 : ie.values()) {
         hz $$5 = $$2.a($$4);
         dlj $$6 = $$1.a_($$5);
         if ($$6.a(aua.bO)) {
            $$1.a(dqf.b($$3), $$5, dpw.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, atl.I, atm.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if (m($$0) == dmq.b) {
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
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      if ($$1.c_($$2) instanceof dkd $$4) {
         return m($$0) == dmq.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bky.a(5));
      }
   }
}
