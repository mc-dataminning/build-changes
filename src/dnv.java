import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnv extends die implements dky, dpf {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dwd b = dvz.bm;
   public static final dwh<dwg> c = dvz.bn;
   public static final dwa d = dvz.C;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float j = 0.17578125F;
   private static final float k = 0.05859375F;
   private static final double l = 0.6;
   private static final float m = 1.0F;
   private static final int n = 40;
   private static final int o = 6;
   private static final float G = 2.0F;
   private static final int H = 2;
   private static final float I = 5.0F;
   private static final float J = 0.011377778F;
   private static final int K = 7;
   private static final int L = 10;
   private static final float M = 0.6875F;
   private static final fah N = die.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fah O = die.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fah P = die.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fah Q = die.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fah R = die.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fah S = die.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fah U = die.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.b).b(c, dwg.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      if ($$1 != jm.b && $$1 != jm.a) {
         return $$0;
      } else {
         jm $$6 = $$0.c(b);
         if ($$6 == jm.a && $$3.R().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dfe)$$3, $$4)) {
            if ($$6 == jm.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dwg.a;
            dwg $$8 = a($$3, $$4, $$6, $$7);
            return $$0.b(c, $$8);
         }
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cpt && $$3.dA().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      if ($$1.c(b) == jm.b && $$1.c(c) == dwg.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (r($$0) && !this.a($$0, (dfe)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dfe)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dvj $$0, arn $$1, jh $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dfe)$$1, $$2)) {
            Optional<dnv.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               erj $$5 = $$4.get().b;
               float $$6;
               if ($$5 == erl.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != erl.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jh $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dig.sI) && $$5 == erl.c) {
                        dvj $$10 = dig.dR.m();
                        $$1.b($$4.get().a, $$10);
                        die.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(eag.c, $$4.get().a, eag.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jh $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dvj $$14 = $$1.a_($$11);
                           $$1.a($$11, $$14.b(), $$13);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dfc $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.e().g();
      jm $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dwg $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == erl.c));
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected fah d_(dvj $$0) {
      return fae.a();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      dwg $$4 = $$0.c(c);
      fah $$5;
      if ($$4 == dwg.a) {
         $$5 = N;
      } else if ($$4 == dwg.b) {
         if ($$0.c(b) == jm.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dwg.c) {
         $$5 = Q;
      } else if ($$4 == dwg.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      ezn $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dvj $$0, deg $$1, jh $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return 0.125F;
   }

   @Override
   public void a(dfb $$0, jh $$1, cku $$2) {
      if (!$$2.bc()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsu a(bue $$0) {
      return $$0.dY().c($$0);
   }

   private static void a(dvj $$0, arn $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      dvj $$4 = $$0;

      while (q($$4)) {
         cku $$5 = cku.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jm.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dvj $$4 = $$1.a_($$2.b(1));
      dvj $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jh $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dvj $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jm.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arn $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jm.a);
         dvj $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jm.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jm.b);
            return;
         }

         if (c($$0, $$2, jm.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jm.b);
            return;
         }

         if (!a((deg)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arn $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      dvj $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dfc)$$0, $$3);
      } else if ($$4.l() || $$4.a(dig.G)) {
         a($$0, $$3, $$2, dwg.b);
      }
   }

   private static void a(dfc $$0, jh $$1, jm $$2, dwg $$3) {
      dvj $$4 = dig.st.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == erl.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dvj $$0, dfc $$1, jh $$2) {
      jh $$4;
      jh $$3;
      if ($$0.c(b) == jm.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jm.a, dwg.a);
      a($$1, $$3, jm.b, dwg.a);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dfb $$0, jh $$1, dvj $$2, erj $$3) {
      ezn $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      erj $$9 = a($$0, $$3);
      lp $$10 = $$9.a(axg.b) ? lr.aL : lr.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jh a(dvj $$0, dfc $$1, jh $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jm $$5 = $$0.c(b);
         BiPredicate<jh, dvj> $$6 = ($$1x, $$2x) -> $$2x.a(dig.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jm b(dfe $$0, jh $$1, jm $$2) {
      jm $$3;
      if (c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private static dwg a(dfe $$0, jh $$1, jm $$2, boolean $$3) {
      jm $$4 = $$2.g();
      dvj $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dwg.a ? dwg.b : dwg.a;
      } else if (!b($$5, $$2)) {
         return dwg.b;
      } else {
         dwg $$6 = $$5.c(c);
         if ($$6 != dwg.b && $$6 != dwg.a) {
            dvj $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dwg.e : dwg.d;
         } else {
            return dwg.c;
         }
      }
   }

   public static boolean o(dvj $$0) {
      return q($$0) && $$0.c(c) == dwg.b && !$$0.c(d);
   }

   private static boolean b(dvj $$0, arn $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3);
      dvj $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jh> a(dfb $$0, jh $$1, dvj $$2, int $$3) {
      jm $$4 = $$2.c(b);
      BiPredicate<jh, dvj> $$5 = ($$1x, $$2x) -> $$2x.a(dig.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dig.st), $$3);
   }

   private static boolean c(dfe $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dvj $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dvj $$0, boolean $$1) {
      if (!$$0.a(dig.st)) {
         return false;
      } else {
         dwg $$2 = $$0.c(c);
         return $$2 == dwg.b || $$1 && $$2 == dwg.a;
      }
   }

   private static boolean a(dvj $$0, jm $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dvj $$0) {
      return b($$0, jm.a);
   }

   private static boolean r(dvj $$0) {
      return b($$0, jm.b);
   }

   private static boolean b(dvj $$0, dfe $$1, jh $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dig.st);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   private static boolean b(dvj $$0, jm $$1) {
      return $$0.a(dig.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jh a(dfb $$0, jh $$1, erj $$2) {
      Predicate<dvj> $$3 = $$1x -> $$1x.b() instanceof dgx && ((dgx)$$1x.b()).a($$2);
      BiPredicate<jh, dvj> $$4 = ($$1x, $$2x) -> a((deg)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jh a(dfb $$0, jh $$1) {
      BiPredicate<jh, dvj> $$2 = ($$1x, $$2x) -> a((deg)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.b.f(), $$2, dnv::o, 11).orElse(null);
   }

   public static erj a(arn $$0, jh $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dnv::a).orElse(erl.a);
   }

   private static Optional<dnv.a> b(dfb $$0, jh $$1, dvj $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jh $$2x = $$1x.d();
         dvj $$3 = $$0.a_($$2x);
         erj $$4;
         if ($$3.a(dig.sI) && !$$0.D_().i()) {
            $$4 = erl.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dnv.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(erj $$0) {
      return $$0 == erl.e || $$0 == erl.c;
   }

   private static boolean a(dvj $$0, dvj $$1) {
      return $$0.a(dig.su) && $$1.a(dig.G) && $$1.y().b();
   }

   private static erj a(dfb $$0, erj $$1) {
      if ($$1.a(erl.a)) {
         return $$0.D_().i() ? erl.e : erl.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jh> a(dfc $$0, jh $$1, jm.b $$2, BiPredicate<jh, dvj> $$3, Predicate<dvj> $$4, int $$5) {
      jm $$6 = jm.a($$2, jm.a.b);
      jh.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dvj $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(deg $$0, jh $$1, dvj $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fah $$3 = $$2.g($$0, $$1);
         return !fae.c(U, $$3, ezr.i);
      }
   }

   static record a(jh a, erj b, dvj c) {
   }
}
