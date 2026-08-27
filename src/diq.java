import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diq extends dbk implements diy {
   public static final MapCodec<diq> c = b(diq::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dpx<dqg> f = dpp.bo;
   public static final dpz g = dpp.aT;
   public static final dpq h = dpp.C;
   protected static final est i = dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dhg.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends diq> a() {
      return c;
   }

   public diq(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dqg.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ib $$1 = $$0.a();
      eks $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == ekt.c));
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(h) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (m($$0) != dqg.b) {
         if (m($$0) == dqg.c) {
            $$1.a($$2, $$0.a(f, dqg.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aum.vL, aun.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bqb.bl && $$0.c_($$1) instanceof dnm $$5 && $$0 instanceof aps $$6 && $$5.gq().a($$6, $$1, dts.P, dts.a.a($$2))) {
         $$5.f().b($$6, dts.P, dts.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dqg.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cyx $$0, ib $$1, doz $$2) {
      dby $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return !$$0.B ? a($$2, dmh.I, ($$0x, $$1x, $$2x, $$3) -> dub.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return i;
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dqg m(doz $$0) {
      return $$0.c(f);
   }

   public static boolean n(doz $$0) {
      return m($$0) == dqg.a;
   }

   public static void a(cyx $$0, ib $$1, doz $$2) {
      $$0.a($$1, $$2.a(f, dqg.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dqg.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dts.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.vK, aun.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bpv $$0, cyx $$1, ib $$2, int $$3) {
      for (ih $$4 : ih.values()) {
         ib $$5 = $$2.a($$4);
         doz $$6 = $$1.a_($$5);
         if ($$6.a(avc.bP)) {
            $$1.a(dub.b($$3), $$5, dts.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aum.I, aun.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if (m($$0) == dqg.b) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b && $$4 != ih.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ke.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dnm $$4) {
         return m($$0) == dqg.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bnc.a(5));
      }
   }
}
