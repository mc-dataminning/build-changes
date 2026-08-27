import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfx extends cyr implements dgf {
   public static final MapCodec<dfx> c = b(dfx::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dnc<dnl> f = dmu.bo;
   public static final dne g = dmu.aT;
   public static final dmv h = dmu.C;
   protected static final epo i = czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = den.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dfx> a() {
      return c;
   }

   public dfx(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dnl.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ib $$1 = $$0.a();
      ehr $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ehs.c));
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(h) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (m($$0) != dnl.b) {
         if (m($$0) == dnl.c) {
            $$1.a($$2, $$0.a(f, dnl.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, atp.vA, atq.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bol.bk && $$0.c_($$1) instanceof dkr $$5 && $$0 instanceof apa $$6 && $$5.go().a($$6, $$1, dqr.P, dqr.a.a($$2))) {
         $$5.f().b($$6, dqr.P, dqr.a.a($$3), $$3.dh());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dnl.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cwe $$0, ib $$1, dme $$2) {
      czf $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return !$$0.B ? a($$2, djn.I, ($$0x, $$1x, $$2x, $$3) -> dra.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return i;
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dnl m(dme $$0) {
      return $$0.c(f);
   }

   public static boolean n(dme $$0) {
      return m($$0) == dnl.a;
   }

   public static void a(cwe $$0, ib $$1, dme $$2) {
      $$0.a($$1, $$2.a(f, dnl.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dnl.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dqr.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atp.vz, atq.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bof $$0, cwe $$1, ib $$2, int $$3) {
      for (ih $$4 : ih.values()) {
         ib $$5 = $$2.a($$4);
         dme $$6 = $$1.a_($$5);
         if ($$6.a(aue.bO)) {
            $$1.a(dra.b($$3), $$5, dqr.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, atp.I, atq.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if (m($$0) == dnl.b) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b && $$4 != ih.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ju.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dkr $$4) {
         return m($$0) == dnl.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bln.a(5));
      }
   }
}
