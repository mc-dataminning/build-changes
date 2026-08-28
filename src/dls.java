import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends del implements dma {
   public static final MapCodec<dls> c = b(dls::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dta<dtj> f = dss.bo;
   public static final dtc g = dss.aT;
   public static final dst h = dss.C;
   protected static final ewk i = dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dki.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dls> a() {
      return c;
   }

   public dls(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dtj.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      iz $$1 = $$0.a();
      env $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == enw.c));
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(h) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$0) != dtj.b) {
         if (m($$0) == dtj.c) {
            $$1.a($$2, $$0.a(f, dtj.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awa.we, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bta.bm && $$0.c_($$1) instanceof dqo $$5 && $$0 instanceof arf $$6 && $$5.gt().a($$6, $$1, dwv.P, dwv.a.a($$2))) {
         $$5.f().b($$6, dwv.P, dwv.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dtj.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dby $$0, iz $$1, dsc $$2) {
      dez $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return !$$0.B ? a($$2, dpj.I, ($$0x, $$1x, $$2x, $$3) -> dxe.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dtj m(dsc $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsc $$0) {
      return m($$0) == dtj.a;
   }

   public static void a(dby $$0, iz $$1, dsc $$2) {
      $$0.a($$1, $$2.a(f, dtj.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsu $$0, dby $$1, iz $$2, dsc $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dtj.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dwv.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.wd, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsu $$0, dby $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         dsc $$6 = $$1.a_($$5);
         if ($$6.a(awp.bV)) {
            $$1.a(dxe.b($$3), $$5, dwv.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awa.I, awb.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if (m($$0) == dtj.b) {
         je $$4 = je.b($$3);
         if ($$4 != je.b && $$4 != je.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lc.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqo $$4) {
         return m($$0) == dtj.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpw.a(5));
      }
   }
}
