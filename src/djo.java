import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djo extends dch implements djw {
   public static final MapCodec<djo> c = b(djo::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dqw<drf> f = dqo.bo;
   public static final dqy g = dqo.aT;
   public static final dqp h = dqo.C;
   protected static final ety i = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = die.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends djo> a() {
      return c;
   }

   public djo(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, drf.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      im $$1 = $$0.a();
      elr $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == els.c));
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(h) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (m($$0) != drf.b) {
         if (m($$0) == drf.c) {
            $$1.a($$2, $$0.a(f, drf.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, auz.vS, ava.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bqr.bl && $$0.c_($$1) instanceof dok $$5 && $$0 instanceof aqe $$6 && $$5.gs().a($$6, $$1, dur.P, dur.a.a($$2))) {
         $$5.f().b($$6, dur.P, dur.a.a($$3), $$3.dl());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == drf.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(czu $$0, im $$1, dpy $$2) {
      dcv $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dok($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return !$$0.B ? a($$2, dnf.I, ($$0x, $$1x, $$2x, $$3) -> dva.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return i;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 == ir.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static drf m(dpy $$0) {
      return $$0.c(f);
   }

   public static boolean n(dpy $$0) {
      return m($$0) == drf.a;
   }

   public static void a(czu $$0, im $$1, dpy $$2) {
      $$0.a($$1, $$2.a(f, drf.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bql $$0, czu $$1, im $$2, dpy $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, drf.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dur.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auz.vR, ava.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bql $$0, czu $$1, im $$2, int $$3) {
      for (ir $$4 : ir.values()) {
         im $$5 = $$2.a($$4);
         dpy $$6 = $$1.a_($$5);
         if ($$6.a(avo.bP)) {
            $$1.a(dva.b($$3), $$5, dur.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, auz.I, ava.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if (m($$0) == drf.b) {
         ir $$4 = ir.b($$3);
         if ($$4 != ir.b && $$4 != ir.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(kp.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      if ($$1.c_($$2) instanceof dok $$4) {
         return m($$0) == drf.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bns.a(5));
      }
   }
}
