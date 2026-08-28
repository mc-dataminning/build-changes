import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drb extends djp implements drj {
   public static final MapCodec<drb> c = b(drb::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dyl<dyu> f = dye.br;
   public static final dyn g = dye.aW;
   public static final dyf h = dye.J;
   protected static final fcl i = dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dpp.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends drb> a() {
      return c;
   }

   public drb(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dyu.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jh $$1 = $$0.a();
      etq $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == etr.c));
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(h) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (o($$0) != dyu.b) {
         if (o($$0) == dyu.c) {
            $$1.a($$2, $$0.b(f, dyu.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awv.wH, aww.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
      if (!$$0.B_() && q($$2) && $$3.aq() != bvi.bG && $$0.c_($$1) instanceof dwa $$5 && $$0 instanceof arx $$6 && $$5.gq().a($$6, $$1, eck.P, eck.a.a($$2))) {
         $$5.f().b($$6, eck.P, eck.a.a($$3), $$3.du());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dyu.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dgz $$0, jh $$1, dxo $$2) {
      dkd $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return !$$0.C ? a($$2, dus.J, ($$0x, $$1x, $$2x, $$3) -> ect.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return i;
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dyu o(dxo $$0) {
      return $$0.c(f);
   }

   public static boolean q(dxo $$0) {
      return o($$0) == dyu.a;
   }

   public static void a(dgz $$0, jh $$1, dxo $$2) {
      $$0.a($$1, $$2.b(f, dyu.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bvb $$0, dgz $$1, jh $$2, dxo $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dyu.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eck.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.wG, aww.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bvb $$0, dgz $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dxo $$6 = $$1.a_($$5);
         if ($$6.a(axk.bX)) {
            $$1.a(ect.b($$3), $$5, eck.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awv.I, aww.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if (o($$0) == dyu.b) {
         jm $$4 = jm.b($$3);
         if ($$4 != jm.b && $$4 != jm.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lm.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwa $$4) {
         return o($$0) == dyu.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsc.a(5));
      }
   }
}
