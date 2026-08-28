import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpj extends djn implements dmj, dqt {
   public static final MapCodec<dpj> a = b(dpj::new);
   public static final dxv<jn> b = dxo.bp;
   public static final dxv<dxu> c = dxo.bq;
   public static final dxp d = dxo.J;
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
   private static final fbv N = djn.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fbv O = djn.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fbv P = djn.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fbv Q = djn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fbv R = djn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbv S = djn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fbv U = djn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   public dpj(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.b).b(c, dxu.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      if ($$4 != jn.b && $$4 != jn.a) {
         return $$0;
      } else {
         jn $$8 = $$0.c(b);
         if ($$8 == jn.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jn.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == dxu.a;
            dxu $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cqe && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      if ($$1.c(b) == jn.b && $$1.c(c) == dxu.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (r($$0) && !this.a($$0, (dgm)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dgm)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dwy $$0, ard $$1, ji $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dgm)$$1, $$2)) {
            Optional<dpj.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               esz $$5 = $$4.get().b;
               float $$6;
               if ($$5 == etb.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != etb.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ji $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(djp.tk) && $$5 == etb.c) {
                        dwy $$10 = djp.ee.m();
                        $$1.b($$4.get().a, $$10);
                        djn.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ebu.c, $$4.get().a, ebu.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ji $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dwy $$14 = $$1.a_($$11);
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
   public dwy a(dah $$0) {
      dgk $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.e().g();
      jn $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dxu $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == etb.c));
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbv d_(dwy $$0) {
      return fbs.a();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      dxu $$4 = $$0.c(c);
      fbv $$5;
      if ($$4 == dxu.a) {
         $$5 = N;
      } else if ($$4 == dxu.b) {
         if ($$0.c(b) == jn.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dxu.c) {
         $$5 = Q;
      } else if ($$4 == dxu.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      fbb $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dwy $$0, dfo $$1, ji $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dgj $$0, ji $$1, clc $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public btc a(bum $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dwy $$0, ard $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      dwy $$4 = $$0;

      while (q($$4)) {
         clc $$5 = clc.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jn.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dwy $$4 = $$1.a_($$2.b(1));
      dwy $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ji $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dwy $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jn.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(ard $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jn.a);
         dwy $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jn.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jn.b);
            return;
         }

         if (c($$0, $$2, jn.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jn.b);
            return;
         }

         if (!a((dfo)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dwy $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dgk)$$0, $$3);
      } else if ($$4.l() || $$4.a(djp.J)) {
         a($$0, $$3, $$2, dxu.b);
      }
   }

   private static void a(dgk $$0, ji $$1, jn $$2, dxu $$3) {
      dwy $$4 = djp.sV.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == etb.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dwy $$0, dgk $$1, ji $$2) {
      ji $$4;
      ji $$3;
      if ($$0.c(b) == jn.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jn.a, dxu.a);
      a($$1, $$3, jn.b, dxu.a);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dgj $$0, ji $$1, dwy $$2, esz $$3) {
      fbb $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      esz $$9 = a($$0, $$3);
      lr $$10 = $$9.a(awv.b) ? lt.aN : lt.aP;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ji a(dwy $$0, dgk $$1, ji $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jn $$5 = $$0.c(b);
         BiPredicate<ji, dwy> $$6 = ($$1x, $$2x) -> $$2x.a(djp.sV) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jn b(dgm $$0, ji $$1, jn $$2) {
      jn $$3;
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

   private static dxu a(dgm $$0, ji $$1, jn $$2, boolean $$3) {
      jn $$4 = $$2.g();
      dwy $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dxu.a ? dxu.b : dxu.a;
      } else if (!b($$5, $$2)) {
         return dxu.b;
      } else {
         dxu $$6 = $$5.c(c);
         if ($$6 != dxu.b && $$6 != dxu.a) {
            dwy $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dxu.e : dxu.d;
         } else {
            return dxu.c;
         }
      }
   }

   public static boolean o(dwy $$0) {
      return q($$0) && $$0.c(c) == dxu.b && !$$0.c(d);
   }

   private static boolean b(dwy $$0, ard $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3);
      dwy $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ji> a(dgj $$0, ji $$1, dwy $$2, int $$3) {
      jn $$4 = $$2.c(b);
      BiPredicate<ji, dwy> $$5 = ($$1x, $$2x) -> $$2x.a(djp.sV) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(djp.sV), $$3);
   }

   private static boolean c(dgm $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dwy $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dwy $$0, boolean $$1) {
      if (!$$0.a(djp.sV)) {
         return false;
      } else {
         dxu $$2 = $$0.c(c);
         return $$2 == dxu.b || $$1 && $$2 == dxu.a;
      }
   }

   private static boolean a(dwy $$0, jn $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dwy $$0) {
      return b($$0, jn.a);
   }

   private static boolean r(dwy $$0) {
      return b($$0, jn.b);
   }

   private static boolean b(dwy $$0, dgm $$1, ji $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(djp.sV);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   private static boolean b(dwy $$0, jn $$1) {
      return $$0.a(djp.sV) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ji a(dgj $$0, ji $$1, esz $$2) {
      Predicate<dwy> $$3 = $$1x -> $$1x.b() instanceof dig && ((dig)$$1x.b()).a($$2);
      BiPredicate<ji, dwy> $$4 = ($$1x, $$2x) -> a((dfo)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ji a(dgj $$0, ji $$1) {
      BiPredicate<ji, dwy> $$2 = ($$1x, $$2x) -> a((dfo)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.b.f(), $$2, dpj::o, 11).orElse(null);
   }

   public static esz a(ard $$0, ji $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dpj::a).orElse(etb.a);
   }

   private static Optional<dpj.a> b(dgj $$0, ji $$1, dwy $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ji $$2x = $$1x.d();
         dwy $$3 = $$0.a_($$2x);
         esz $$4;
         if ($$3.a(djp.tk) && !$$0.G_().i()) {
            $$4 = etb.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dpj.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(esz $$0) {
      return $$0 == etb.e || $$0 == etb.c;
   }

   private static boolean a(dwy $$0, dwy $$1) {
      return $$0.a(djp.sW) && $$1.a(djp.J) && $$1.y().b();
   }

   private static esz a(dgj $$0, esz $$1) {
      if ($$1.a(etb.a)) {
         return $$0.G_().i() ? etb.e : etb.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ji> a(dgk $$0, ji $$1, jn.b $$2, BiPredicate<ji, dwy> $$3, Predicate<dwy> $$4, int $$5) {
      jn $$6 = jn.a($$2, jn.a.b);
      ji.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dwy $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dfo $$0, ji $$1, dwy $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fbv $$3 = $$2.g($$0, $$1);
         return !fbs.c(U, $$3, fbf.i);
      }
   }

   static record a(ji a, esz b, dwy c) {
   }
}
