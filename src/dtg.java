import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtg extends dlr implements dtq {
   public static final MapCodec<dtg> c = b(dtg::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final ebf<ebo> f = eax.br;
   public static final ebh g = eax.aW;
   public static final eay h = eax.I;
   private static final ffk a = dmf.b(16.0, 0.0, 8.0);
   private static final float[] b = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = drv.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dtg> a() {
      return c;
   }

   public dtg(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, ebo.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      iu $$1 = $$0.a();
      ewo $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == ewp.c));
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(h) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (o($$0) != ebo.b) {
         if (o($$0) == ebo.c) {
            $$1.a($$2, $$0.b(f, ebo.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awn.wX, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bwf $$3) {
      if (!$$0.w_() && q($$2) && $$3.aq() != bwo.bG && $$0.c_($$1) instanceof dyq $$5 && $$0 instanceof arq $$6 && $$5.gr().a($$6, $$1, efh.P, efh.a.a($$2))) {
         $$5.f().b($$6, efh.P, efh.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (o($$0) == ebo.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dja $$0, iu $$1, eah $$2) {
      dmf $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return !$$0.C ? a($$2, dxh.J, ($$0x, $$1x, $$2x, $$3) -> efq.c.a($$0x, $$3.x(), $$3.gr())) : null;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ebo o(eah $$0) {
      return $$0.c(f);
   }

   public static boolean q(eah $$0) {
      return o($$0) == ebo.a;
   }

   public static void a(dja $$0, iu $$1, eah $$2) {
      $$0.a($$1, $$2.b(f, ebo.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwf $$0, dja $$1, iu $$2, eah $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ebo.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, efh.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wW, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwf $$0, dja $$1, iu $$2, int $$3) {
      for (ja $$4 : ja.values()) {
         iu $$5 = $$2.a($$4);
         eah $$6 = $$1.a_($$5);
         if ($$6.a(axc.bZ)) {
            $$1.a(efq.b($$3), $$5, efh.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awn.I, awo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if (o($$0) == ebo.b) {
         ja $$4 = ja.b($$3);
         if ($$4 != ja.b && $$4 != ja.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lr.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dyq $$4) {
         return o($$0) == ebo.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btf.a(5));
      }
   }
}
