import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends diw implements dqq {
   public static final MapCodec<dqi> c = b(dqi::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dxs<dyb> f = dxl.br;
   public static final dxu g = dxl.aW;
   public static final dxm h = dxl.J;
   protected static final fbs i = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dow.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dqi> a() {
      return c;
   }

   public dqi(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dyb.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      ji $$1 = $$0.a();
      esx $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == esy.c));
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(h) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (o($$0) != dyb.b) {
         if (o($$0) == dyb.c) {
            $$1.a($$2, $$0.b(f, dyb.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avz.wH, awa.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != buq.bF && $$0.c_($$1) instanceof dvh $$5 && $$0 instanceof arc $$6 && $$5.gr().a($$6, $$1, ebr.P, ebr.a.a($$2))) {
         $$5.f().b($$6, ebr.P, ebr.a.a($$3), $$3.du());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dyb.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dgg $$0, ji $$1, dwv $$2) {
      djk $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return !$$0.C ? a($$2, dtz.J, ($$0x, $$1x, $$2x, $$3) -> eca.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return i;
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dyb o(dwv $$0) {
      return $$0.c(f);
   }

   public static boolean q(dwv $$0) {
      return o($$0) == dyb.a;
   }

   public static void a(dgg $$0, ji $$1, dwv $$2) {
      $$0.a($$1, $$2.b(f, dyb.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable buj $$0, dgg $$1, ji $$2, dwv $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dyb.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ebr.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.wG, awa.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable buj $$0, dgg $$1, ji $$2, int $$3) {
      for (jn $$4 : jn.values()) {
         ji $$5 = $$2.a($$4);
         dwv $$6 = $$1.a_($$5);
         if ($$6.a(awo.bX)) {
            $$1.a(eca.b($$3), $$5, ebr.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avz.I, awa.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if (o($$0) == dyb.b) {
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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvh $$4) {
         return o($$0) == dyb.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brk.a(5));
      }
   }
}
