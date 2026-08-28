import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dss extends dlg implements dtb {
   public static final MapCodec<dss> c = b(dss::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final eam<eav> f = eae.br;
   public static final eao g = eae.aW;
   public static final eaf h = eae.I;
   private static final feq a = dlu.b(16.0, 0.0, 8.0);
   private static final float[] b = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dri.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dss> a() {
      return c;
   }

   public dss(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, eav.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      iu $$1 = $$0.a();
      evv $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == evw.c));
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(h) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (o($$0) != eav.b) {
         if (o($$0) == eav.c) {
            $$1.a($$2, $$0.b(f, eav.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awl.wR, awm.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
      if (!$$0.w_() && q($$2) && $$3.aq() != bwj.bG && $$0.c_($$1) instanceof dxy $$5 && $$0 instanceof aro $$6 && $$5.gq().a($$6, $$1, eeo.P, eeo.a.a($$2))) {
         $$5.f().b($$6, eeo.P, eeo.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (o($$0) == eav.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dip $$0, iu $$1, dzo $$2) {
      dlu $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return !$$0.C ? a($$2, dwp.J, ($$0x, $$1x, $$2x, $$3) -> eex.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a;
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static eav o(dzo $$0) {
      return $$0.c(f);
   }

   public static boolean q(dzo $$0) {
      return o($$0) == eav.a;
   }

   public static void a(dip $$0, iu $$1, dzo $$2) {
      $$0.a($$1, $$2.b(f, eav.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bwa $$0, dip $$1, iu $$2, dzo $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, eav.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, eeo.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.wQ, awm.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bwa $$0, dip $$1, iu $$2, int $$3) {
      for (ja $$4 : ja.values()) {
         iu $$5 = $$2.a($$4);
         dzo $$6 = $$1.a_($$5);
         if ($$6.a(axa.bY)) {
            $$1.a(eex.b($$3), $$5, eeo.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awl.I, awm.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if (o($$0) == eav.b) {
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
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dxy $$4) {
         return o($$0) == eav.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bta.a(5));
      }
   }
}
