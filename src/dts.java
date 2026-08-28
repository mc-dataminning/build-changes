import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dts extends dmd implements duc {
   public static final MapCodec<dts> c = b(dts::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final ebr<eca> f = ebj.br;
   public static final ebt g = ebj.aW;
   public static final ebk h = ebj.I;
   private static final ffw a = dmr.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dsh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dts> a() {
      return c;
   }

   public dts(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, eca.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      iv $$1 = $$0.a();
      exa $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == exb.c));
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(h) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (o($$0) != eca.b) {
         if (o($$0) == eca.c) {
            $$1.a($$2, $$0.b(f, eca.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awn.wX, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bwi $$3) {
      if (!$$0.w_() && q($$2) && $$3.an() != bwr.bG && $$0.c_($$1) instanceof dzc $$5 && $$0 instanceof arq $$6 && $$5.gt().a($$6, $$1, eft.P, eft.a.a($$2))) {
         $$5.f().b($$6, eft.P, eft.a.a($$3), $$3.ds());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if (o($$0) == eca.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(djm $$0, iv $$1, eat $$2) {
      dmr $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return !$$0.C ? a($$2, dxt.J, ($$0x, $$1x, $$2x, $$3) -> egc.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a;
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static eca o(eat $$0) {
      return $$0.c(f);
   }

   public static boolean q(eat $$0) {
      return o($$0) == eca.a;
   }

   public static void a(djm $$0, iv $$1, eat $$2) {
      $$0.a($$1, $$2.b(f, eca.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwi $$0, djm $$1, iv $$2, eat $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, eca.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eft.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wW, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwi $$0, djm $$1, iv $$2, int $$3) {
      for (jb $$4 : jb.values()) {
         iv $$5 = $$2.a($$4);
         eat $$6 = $$1.a_($$5);
         if ($$6.a(axc.bZ)) {
            $$1.a(egc.b($$3), $$5, eft.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awn.I, awo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if (o($$0) == eca.b) {
         jb $$4 = jb.b($$3);
         if ($$4 != jb.b && $$4 != jb.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ls.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dzc $$4) {
         return o($$0) == eca.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bti.a(5));
      }
   }
}
