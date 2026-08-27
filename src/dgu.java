import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgu extends czo implements dhc {
   public static final MapCodec<dgu> c = b(dgu::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dnz<doi> f = dnr.bo;
   public static final dob g = dnr.aT;
   public static final dns h = dnr.C;
   protected static final eqm i = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dfk.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dgu> a() {
      return c;
   }

   public dgu(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, doi.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ib $$1 = $$0.a();
      eip $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eiq.c));
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(h) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (m($$0) != doi.b) {
         if (m($$0) == doi.c) {
            $$1.a($$2, $$0.a(f, doi.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aty.vI, atz.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bpd.bm && $$0.c_($$1) instanceof dlo $$5 && $$0 instanceof apf $$6 && $$5.gq().a($$6, $$1, drp.P, drp.a.a($$2))) {
         $$5.f().b($$6, drp.P, drp.a.a($$3), $$3.dk());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == doi.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cxb $$0, ib $$1, dnb $$2) {
      dac $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return !$$0.B ? a($$2, dkk.I, ($$0x, $$1x, $$2x, $$3) -> dry.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return i;
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static doi m(dnb $$0) {
      return $$0.c(f);
   }

   public static boolean n(dnb $$0) {
      return m($$0) == doi.a;
   }

   public static void a(cxb $$0, ib $$1, dnb $$2) {
      $$0.a($$1, $$2.a(f, doi.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable box $$0, cxb $$1, ib $$2, dnb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, doi.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, drp.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aty.vH, atz.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable box $$0, cxb $$1, ib $$2, int $$3) {
      for (ih $$4 : ih.values()) {
         ib $$5 = $$2.a($$4);
         dnb $$6 = $$1.a_($$5);
         if ($$6.a(aun.bP)) {
            $$1.a(dry.b($$3), $$5, drp.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aty.I, atz.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if (m($$0) == doi.b) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b && $$4 != ih.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jv.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlo $$4) {
         return m($$0) == doi.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bmf.a(5));
      }
   }
}
