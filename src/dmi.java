import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dhk {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dvx b = dlt.aF;
   public static final dvu c = dvt.w;
   public static final dvu d = dvt.o;
   public static final fab e = dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fab f = dhy.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fab g = ezy.a(e, f);
   public static final fab h = dhy.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fab i = ezy.a(g, h);
   public static final fab j = ezy.a(
      dhy.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dhy.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dhy.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fab k = ezy.a(
      dhy.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dhy.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dhy.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fab l = ezy.a(
      dhy.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dhy.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dhy.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fab m = ezy.a(
      dhy.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dhy.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dhy.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected fab d_(dvd $$0) {
      return g;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   public dvd a(czm $$0) {
      dev $$1 = $$0.q();
      cvx $$2 = $$0.n();
      coh $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gH()) {
         cyg $$5 = $$2.a(kt.X, cyg.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return i;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtk($$0, $$1);
   }

   public static boolean a(@Nullable buv $$0, dev $$1, jg $$2, dvd $$3, cvx $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable buv $$0, dev $$1, jg $$2, dvd $$3, cvx $$4) {
      if ($$1.c_($$2) instanceof dtk $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awk.cz, awl.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable btz $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      dvd $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eaa.c, $$2, eaa.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dev $$0, jg $$1, dvd $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dev $$0, jg $$1, dvd $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dev $$0, jg $$1, dvd $$2) {
      esm $$3 = esi.a($$0, $$2.c(b).g(), jl.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dvd $$0, dev $$1, jg $$2) {
      if ($$1.c_($$2) instanceof dtk $$4) {
         jl $$5 = $$0.c(b);
         cvx $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ckq $$9 = new ckq($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 == jl.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      if ($$0.c(d)) {
         dsg $$3 = $$1.c_($$2);
         if ($$3 instanceof dtk) {
            return ((dtk)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$1.c(d)) {
         return bry.f;
      } else if ($$0.a(axi.aV)) {
         return (bry)(a($$4, $$2, $$3, $$1, $$0) ? bry.a : bry.e);
      } else {
         return (bry)($$0.f() && $$5 == brx.a ? bry.e : bry.f);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bry.a;
      } else {
         return bry.c;
      }
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dev $$0, jg $$1, coh $$2) {
      dsg $$3 = $$0.c_($$1);
      if ($$3 instanceof dtk) {
         $$2.a((dtk)$$3);
         $$2.a(awu.au);
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
