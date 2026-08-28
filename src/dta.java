import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dta extends dlm implements dtj {
   public static final MapCodec<dta> c = b(dta::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final eax<ebg> f = eap.br;
   public static final eaz g = eap.aW;
   public static final eaq h = eap.I;
   private static final ffc a = dma.b(16.0, 0.0, 8.0);
   private static final float[] b = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = drp.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dta> a() {
      return c;
   }

   public dta(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, ebg.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      iu $$1 = $$0.a();
      ewg $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == ewh.c));
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(h) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (o($$0) != ebg.b) {
         if (o($$0) == ebg.c) {
            $$1.a($$2, $$0.b(f, ebg.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awn.wU, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      if (!$$0.w_() && q($$2) && $$3.aq() != bwm.bG && $$0.c_($$1) instanceof dyi $$5 && $$0 instanceof arq $$6 && $$5.gq().a($$6, $$1, eez.P, eez.a.a($$2))) {
         $$5.f().b($$6, eez.P, eez.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (o($$0) == ebg.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(div $$0, iu $$1, dzz $$2) {
      dma $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return !$$0.C ? a($$2, dwz.J, ($$0x, $$1x, $$2x, $$3) -> efi.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static ebg o(dzz $$0) {
      return $$0.c(f);
   }

   public static boolean q(dzz $$0) {
      return o($$0) == ebg.a;
   }

   public static void a(div $$0, iu $$1, dzz $$2) {
      $$0.a($$1, $$2.b(f, ebg.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwd $$0, div $$1, iu $$2, dzz $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, ebg.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eez.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wT, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwd $$0, div $$1, iu $$2, int $$3) {
      for (ja $$4 : ja.values()) {
         iu $$5 = $$2.a($$4);
         dzz $$6 = $$1.a_($$5);
         if ($$6.a(axc.bY)) {
            $$1.a(efi.b($$3), $$5, eez.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awn.I, awo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if (o($$0) == ebg.b) {
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
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dyi $$4) {
         return o($$0) == ebg.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btd.a(5));
      }
   }
}
