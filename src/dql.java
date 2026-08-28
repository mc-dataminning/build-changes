import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dql extends diz implements dqt {
   public static final MapCodec<dql> c = b(dql::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dxv<dye> f = dxo.br;
   public static final dxx g = dxo.aW;
   public static final dxp h = dxo.J;
   protected static final fbv i = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = doz.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dql> a() {
      return c;
   }

   public dql(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dye.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      ji $$1 = $$0.a();
      eta $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == etb.c));
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(h) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (o($$0) != dye.b) {
         if (o($$0) == dye.c) {
            $$1.a($$2, $$0.b(f, dye.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awa.wH, awb.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != but.bF && $$0.c_($$1) instanceof dvk $$5 && $$0 instanceof ard $$6 && $$5.gu().a($$6, $$1, ebu.P, ebu.a.a($$2))) {
         $$5.f().b($$6, ebu.P, ebu.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dye.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dgj $$0, ji $$1, dwy $$2) {
      djn $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return !$$0.C ? a($$2, duc.J, ($$0x, $$1x, $$2x, $$3) -> ecd.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return i;
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dye o(dwy $$0) {
      return $$0.c(f);
   }

   public static boolean q(dwy $$0) {
      return o($$0) == dye.a;
   }

   public static void a(dgj $$0, ji $$1, dwy $$2) {
      $$0.a($$1, $$2.b(f, dye.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bum $$0, dgj $$1, ji $$2, dwy $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dye.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ebu.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.wG, awb.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bum $$0, dgj $$1, ji $$2, int $$3) {
      for (jn $$4 : jn.values()) {
         ji $$5 = $$2.a($$4);
         dwy $$6 = $$1.a_($$5);
         if ($$6.a(awp.bX)) {
            $$1.a(ecd.b($$3), $$5, ebu.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awa.I, awb.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if (o($$0) == dye.b) {
         jn $$4 = jn.b($$3);
         if ($$4 != jn.b && $$4 != jn.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ln.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvk $$4) {
         return o($$0) == dye.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brn.a(5));
      }
   }
}
