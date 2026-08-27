import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dar extends ctm implements daz {
   public static final MapCodec<dar> c = b(dar::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dgz<dhi> f = dgr.bo;
   public static final dhb g = dgr.aT;
   public static final dgs h = dgr.C;
   protected static final eiy i = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = czh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dar> a() {
      return c;
   }

   public dar(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dhi.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ht $$1 = $$0.a();
      ebe $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ebf.c));
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(h) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (h($$0) != dhi.b) {
         if (h($$0) == dhi.c) {
            $$1.a($$2, $$0.a(f, dhi.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aqd.uw, aqe.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bjt $$3) {
      if (!$$0.x_() && n($$2) && $$3.ag() != bjx.bi && $$0.c_($$1) instanceof dfc $$5 && $$0 instanceof alq $$6 && $$5.gh().a($$6, $$1, dkl.P, dkl.a.a($$2))) {
         $$5.g().b($$6, dkl.P, dkl.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dhi.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cqz $$0, ht $$1, dgb $$2) {
      cua $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return !$$0.B ? a($$2, ddz.I, ($$0x, $$1x, $$2x, $$3) -> dku.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return i;
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dhi h(dgb $$0) {
      return $$0.c(f);
   }

   public static boolean n(dgb $$0) {
      return h($$0) == dhi.a;
   }

   public static void a(cqz $$0, ht $$1, dgb $$2) {
      $$0.a($$1, $$2.a(f, dhi.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dhi.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dkl.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqd.uv, aqe.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bjt $$0, cqz $$1, ht $$2, int $$3) {
      for (hx $$4 : hx.values()) {
         ht $$5 = $$2.a($$4);
         dgb $$6 = $$1.a_($$5);
         if ($$6.a(aqs.bO)) {
            $$1.a(dku.b($$3), $$5, dkl.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aqd.I, aqe.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if (h($$0) == dhi.b) {
         hx $$4 = hx.b($$3);
         if ($$4 != hx.b && $$4 != hx.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jl.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfc $$4) {
         return h($$0) == dhi.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhd.a(5));
      }
   }
}
