import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drc extends djq implements drl {
   public static final MapCodec<drc> c = b(drc::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dyo<dyx> f = dyg.br;
   public static final dyq g = dyg.aW;
   public static final dyh h = dyg.I;
   private static final fcr a = dke.b(16.0, 0.0, 8.0);
   private static final float[] b = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dps.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends drc> a() {
      return c;
   }

   public drc(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, dyx.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      ji $$1 = $$0.a();
      etw $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(h) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (o($$0) != dyx.b) {
         if (o($$0) == dyx.c) {
            $$1.a($$2, $$0.b(f, dyx.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awa.wR, awb.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      if (!$$0.w_() && q($$2) && $$3.aq() != bvi.bF && $$0.c_($$1) instanceof dwc $$5 && $$0 instanceof ard $$6 && $$5.gs().a($$6, $$1, ecp.P, ecp.a.a($$2))) {
         $$5.f().b($$6, ecp.P, ecp.a.a($$3), $$3.ds());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (o($$0) == dyx.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dgz $$0, ji $$1, dxq $$2) {
      dke $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return !$$0.C ? a($$2, duu.J, ($$0x, $$1x, $$2x, $$3) -> ecy.c.a($$0x, $$3.x(), $$3.gs())) : null;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dyx o(dxq $$0) {
      return $$0.c(f);
   }

   public static boolean q(dxq $$0) {
      return o($$0) == dyx.a;
   }

   public static void a(dgz $$0, ji $$1, dxq $$2) {
      $$0.a($$1, $$2.b(f, dyx.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bva $$0, dgz $$1, ji $$2, dxq $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dyx.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ecp.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.wQ, awb.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bva $$0, dgz $$1, ji $$2, int $$3) {
      for (jn $$4 : jn.values()) {
         ji $$5 = $$2.a($$4);
         dxq $$6 = $$1.a_($$5);
         if ($$6.a(awp.bY)) {
            $$1.a(ecy.b($$3), $$5, ecp.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awa.I, awb.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if (o($$0) == dyx.b) {
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
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dwc $$4) {
         return o($$0) == dyx.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsa.a(5));
      }
   }
}
