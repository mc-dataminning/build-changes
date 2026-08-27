import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class czd extends crx implements czl {
   public static final int b = 30;
   public static final int c = 10;
   public static final dfw<dgf> d = dfo.bo;
   public static final dfy e = dfo.aT;
   public static final dfp f = dfo.C;
   protected static final ehy g = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cxr.b($$1[$$2]);
      }
   });

   public czd(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgf.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      gv $$1 = $$0.a();
      eab $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == eac.c));
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(f) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (h($$0) != dgf.b) {
         if (h($$0) == dgf.c) {
            $$1.a($$2, $$0.a(d, dgf.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, aou.uu, aov.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
      if (!$$0.r_() && n($$2) && $$3.ag() != bik.bi && $$0.c_($$1) instanceof ddp $$5 && $$0 instanceof aki $$6 && $$5.gc().a($$6, $$1, dji.P, dji.a.a($$2))) {
         $$5.g().b($$6, dji.P, dji.a.a($$3), $$3.di());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgf.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpk $$0, gv $$1, dey $$2) {
      csk $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return !$$0.B ? a($$2, dcm.I, ($$0x, $$1x, $$2x, $$3) -> djr.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return g;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$3 == hb.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgf h(dey $$0) {
      return $$0.c(d);
   }

   public static boolean n(dey $$0) {
      return h($$0) == dgf.a;
   }

   public static void a(cpk $$0, gv $$1, dey $$2) {
      $$0.a($$1, $$2.a(d, dgf.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable big $$0, cpk $$1, gv $$2, dey $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgf.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dji.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.ut, aov.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable big $$0, cpk $$1, gv $$2, int $$3) {
      for (hb $$4 : hb.values()) {
         gv $$5 = $$2.a($$4);
         dey $$6 = $$1.a_($$5);
         if ($$6.a(apj.bO)) {
            $$1.a(djr.b($$3), $$5, dji.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aou.I, aov.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if (h($$0) == dgf.b) {
         hb $$4 = hb.b($$3);
         if ($$4 != hb.b && $$4 != hb.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ip.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      if ($$1.c_($$2) instanceof ddp $$4) {
         return h($$0) == dgf.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfq.a(5));
      }
   }
}
