import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dhv implements dpk {
   public static final MapCodec<dpc> c = b(dpc::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dwl<dwu> f = dwe.bo;
   public static final dwn g = dwe.aT;
   public static final dwf h = dwe.C;
   protected static final fal i = dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dnr.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dpc> a() {
      return c;
   }

   public dpc(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dwu.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jh $$1 = $$0.a();
      ero $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == erp.c));
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(h) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (o($$0) != dwu.b) {
         if (o($$0) == dwu.c) {
            $$1.a($$2, $$0.b(f, dwu.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awo.wg, awp.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
      if (!$$0.y_() && q($$2) && $$3.ar() != bup.bm && $$0.c_($$1) instanceof dua $$5 && $$0 instanceof arq $$6 && $$5.gy().a($$6, $$1, eak.P, eak.a.a($$2))) {
         $$5.f().b($$6, eak.P, eak.a.a($$3), $$3.dw());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dwu.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dff $$0, jh $$1, dvo $$2) {
      dij $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dua($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return !$$0.C ? a($$2, dst.I, ($$0x, $$1x, $$2x, $$3) -> eat.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return i;
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dwu o(dvo $$0) {
      return $$0.c(f);
   }

   public static boolean q(dvo $$0) {
      return o($$0) == dwu.a;
   }

   public static void a(dff $$0, jh $$1, dvo $$2) {
      $$0.a($$1, $$2.b(f, dwu.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bui $$0, dff $$1, jh $$2, dvo $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dwu.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eak.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awo.wf, awp.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bui $$0, dff $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dvo $$6 = $$1.a_($$5);
         if ($$6.a(axd.bW)) {
            $$1.a(eat.b($$3), $$5, eak.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awo.I, awp.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if (o($$0) == dwu.b) {
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
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dua $$4) {
         return o($$0) == dwu.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brj.a(5));
      }
   }
}
