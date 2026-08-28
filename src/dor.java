import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dhk implements doz {
   public static final MapCodec<dor> c = b(dor::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dwb<dwk> f = dvt.bo;
   public static final dwd g = dvt.aT;
   public static final dvu h = dvt.C;
   protected static final fab i = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ad.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dng.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dor> a() {
      return c;
   }

   public dor(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dwk.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jg $$1 = $$0.a();
      ere $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == erf.c));
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(h) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (o($$0) != dwk.b) {
         if (o($$0) == dwk.c) {
            $$1.a($$2, $$0.b(f, dwk.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awk.wg, awl.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      if (!$$0.y_() && q($$2) && $$3.aq() != bug.bm && $$0.c_($$1) instanceof dtp $$5 && $$0 instanceof arm $$6 && $$5.gy().a($$6, $$1, eaa.P, eaa.a.a($$2))) {
         $$5.f().b($$6, eaa.P, eaa.a.a($$3), $$3.dv());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dwk.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dev $$0, jg $$1, dvd $$2) {
      dhy $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return !$$0.C ? a($$2, dsi.I, ($$0x, $$1x, $$2x, $$3) -> eaj.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return i;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 == jl.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dwk o(dvd $$0) {
      return $$0.c(f);
   }

   public static boolean q(dvd $$0) {
      return o($$0) == dwk.a;
   }

   public static void a(dev $$0, jg $$1, dvd $$2) {
      $$0.a($$1, $$2.b(f, dwk.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable btz $$0, dev $$1, jg $$2, dvd $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dwk.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eaa.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.wf, awl.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable btz $$0, dev $$1, jg $$2, int $$3) {
      for (jl $$4 : jl.values()) {
         jg $$5 = $$2.a($$4);
         dvd $$6 = $$1.a_($$5);
         if ($$6.a(awz.bW)) {
            $$1.a(eaj.b($$3), $$5, eaa.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awk.I, awl.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if (o($$0) == dwk.b) {
         jl $$4 = jl.b($$3);
         if ($$4 != jl.b && $$4 != jl.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lk.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      if ($$1.c_($$2) instanceof dtp $$4) {
         return o($$0) == dwk.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bra.a(5));
      }
   }
}
