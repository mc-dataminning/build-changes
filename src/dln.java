import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends deg implements dlv {
   public static final MapCodec<dln> c = b(dln::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dsv<dte> f = dsn.bo;
   public static final dsx g = dsn.aT;
   public static final dso h = dsn.C;
   protected static final ewf i = deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkd.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dln> a() {
      return c;
   }

   public dln(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dte.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      iz $$1 = $$0.a();
      enq $$2 = $$0.q().b_($$1);
      return this.n().a(h, Boolean.valueOf($$2.a() == enr.c));
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(h) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (m($$0) != dte.b) {
         if (m($$0) == dte.c) {
            $$1.a($$2, $$0.a(f, dte.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avw.we, avx.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, bsp $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsv.bm && $$0.c_($$1) instanceof dqj $$5 && $$0 instanceof arb $$6 && $$5.gt().a($$6, $$1, dwq.P, dwq.a.a($$2))) {
         $$5.f().b($$6, dwq.P, dwq.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dte.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dbt $$0, iz $$1, drx $$2) {
      deu $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return !$$0.B ? a($$2, dpe.I, ($$0x, $$1x, $$2x, $$3) -> dwz.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return i;
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dte m(drx $$0) {
      return $$0.c(f);
   }

   public static boolean n(drx $$0) {
      return m($$0) == dte.a;
   }

   public static void a(dbt $$0, iz $$1, drx $$2) {
      $$0.a($$1, $$2.a(f, dte.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dte.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dwq.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avw.wd, avx.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsp $$0, dbt $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         drx $$6 = $$1.a_($$5);
         if ($$6.a(awl.bV)) {
            $$1.a(dwz.b($$3), $$5, dwq.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avw.I, avx.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if (m($$0) == dte.b) {
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
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqj $$4) {
         return m($$0) == dte.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpr.a(5));
      }
   }
}
