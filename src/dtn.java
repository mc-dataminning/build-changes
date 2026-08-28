import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtn extends dly implements dtx {
   public static final MapCodec<dtn> c = b(dtn::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final ebm<ebv> f = ebe.br;
   public static final ebo g = ebe.aW;
   public static final ebf h = ebe.I;
   private static final ffr a = dmm.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dsc.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dtn> a() {
      return c;
   }

   public dtn(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, ebv.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      iv $$1 = $$0.a();
      ewv $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == eww.c));
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(h) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (o($$0) != ebv.b) {
         if (o($$0) == ebv.c) {
            $$1.a($$2, $$0.b(f, ebv.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awn.wX, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
      if (!$$0.w_() && q($$2) && $$3.an() != bwr.bG && $$0.c_($$1) instanceof dyx $$5 && $$0 instanceof arq $$6 && $$5.gt().a($$6, $$1, efo.P, efo.a.a($$2))) {
         $$5.f().b($$6, efo.P, efo.a.a($$3), $$3.ds());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if (o($$0) == ebv.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(djh $$0, iv $$1, eao $$2) {
      dmm $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return !$$0.C ? a($$2, dxo.J, ($$0x, $$1x, $$2x, $$3) -> efx.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ebv o(eao $$0) {
      return $$0.c(f);
   }

   public static boolean q(eao $$0) {
      return o($$0) == ebv.a;
   }

   public static void a(djh $$0, iv $$1, eao $$2) {
      $$0.a($$1, $$2.b(f, ebv.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwi $$0, djh $$1, iv $$2, eao $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ebv.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, efo.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wW, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwi $$0, djh $$1, iv $$2, int $$3) {
      for (jb $$4 : jb.values()) {
         iv $$5 = $$2.a($$4);
         eao $$6 = $$1.a_($$5);
         if ($$6.a(axc.bZ)) {
            $$1.a(efx.b($$3), $$5, efo.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awn.I, awo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if (o($$0) == ebv.b) {
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
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dyx $$4) {
         return o($$0) == ebv.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bti.a(5));
      }
   }
}
