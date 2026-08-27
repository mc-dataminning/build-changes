import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diz extends dbt implements djh {
   public static final MapCodec<diz> c = b(diz::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dqg<dqp> f = dpy.bo;
   public static final dqi g = dpy.aT;
   public static final dpz h = dpy.C;
   protected static final etc i = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dhp.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends diz> a() {
      return c;
   }

   public diz(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dqp.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      id $$1 = $$0.a();
      elb $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == elc.c));
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(h) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (m($$0) != dqp.b) {
         if (m($$0) == dqp.c) {
            $$1.a($$2, $$0.a(f, dqp.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, auo.vL, aup.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bqg.bl && $$0.c_($$1) instanceof dnv $$5 && $$0 instanceof apu $$6 && $$5.gq().a($$6, $$1, dub.P, dub.a.a($$2))) {
         $$5.f().b($$6, dub.P, dub.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dqp.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(czg $$0, id $$1, dpi $$2) {
      dch $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return !$$0.B ? a($$2, dmq.I, ($$0x, $$1x, $$2x, $$3) -> duk.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return i;
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$3 == ij.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dqp m(dpi $$0) {
      return $$0.c(f);
   }

   public static boolean n(dpi $$0) {
      return m($$0) == dqp.a;
   }

   public static void a(czg $$0, id $$1, dpi $$2) {
      $$0.a($$1, $$2.a(f, dqp.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dqp.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dub.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auo.vK, aup.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bqa $$0, czg $$1, id $$2, int $$3) {
      for (ij $$4 : ij.values()) {
         id $$5 = $$2.a($$4);
         dpi $$6 = $$1.a_($$5);
         if ($$6.a(ave.bP)) {
            $$1.a(duk.b($$3), $$5, dub.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, auo.I, aup.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if (m($$0) == dqp.b) {
         ij $$4 = ij.b($$3);
         if ($$4 != ij.b && $$4 != ij.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(kg.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      if ($$1.c_($$2) instanceof dnv $$4) {
         return m($$0) == dqp.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bnh.a(5));
      }
   }
}
