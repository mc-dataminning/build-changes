import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dhq {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final dwd b = dlz.aF;
   public static final dwa c = dvz.w;
   public static final dwa d = dvz.o;
   public static final fah e = die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fah f = die.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fah g = fae.a(e, f);
   public static final fah h = die.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fah i = fae.a(g, h);
   public static final fah j = fae.a(
      die.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), die.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), die.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fah k = fae.a(
      die.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), die.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), die.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fah l = fae.a(
      die.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), die.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), die.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fah m = fae.a(
      die.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), die.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), die.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected fah d_(dvj $$0) {
      return g;
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   public dvj a(czs $$0) {
      dfb $$1 = $$0.q();
      cwb $$2 = $$0.n();
      com $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gH()) {
         cyk $$5 = $$2.a(ku.Y, cyk.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return i;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm)$$0.c(b)) {
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
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtq($$0, $$1);
   }

   public static boolean a(@Nullable bva $$0, dfb $$1, jh $$2, dvj $$3, cwb $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bva $$0, dfb $$1, jh $$2, dvj $$3, cwb $$4) {
      if ($$1.c_($$2) instanceof dtq $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awl.cz, awm.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bue $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      dvj $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eag.c, $$2, eag.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dfb $$0, jh $$1, dvj $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dfb $$0, jh $$1, dvj $$2) {
      ess $$3 = eso.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
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

   private void e(dvj $$0, dfb $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtq $$4) {
         jm $$5 = $$0.c(b);
         cwb $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ckv $$9 = new ckv($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      if ($$0.c(d)) {
         dsm $$3 = $$1.c_($$2);
         if ($$3 instanceof dtq) {
            return ((dtq)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$1.c(d)) {
         return bsd.f;
      } else if ($$0.a(axj.aY)) {
         return (bsd)(a($$4, $$2, $$3, $$1, $$0) ? bsd.a : bsd.e);
      } else {
         return (bsd)($$0.f() && $$5 == bsc.a ? bsd.e : bsd.f);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsd.a;
      } else {
         return bsd.c;
      }
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dfb $$0, jh $$1, com $$2) {
      dsm $$3 = $$0.c_($$1);
      if ($$3 instanceof dtq) {
         $$2.a((dtq)$$3);
         $$2.a(awv.au);
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
