import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpi extends djm implements dmi, dqs {
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final dxu<jn> b = dxn.bp;
   public static final dxu<dxt> c = dxn.bq;
   public static final dxo d = dxn.J;
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
   private static final fbu N = djm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fbu O = djm.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fbu P = djm.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fbu Q = djm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fbu R = djm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbu S = djm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fbu U = djm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.b).b(c, dxt.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
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
            boolean $$9 = $$0.c(c) == dxt.a;
            dxt $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cqd && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, bul $$3, float $$4) {
      if ($$1.c(b) == jn.b && $$1.c(c) == dxt.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (r($$0) && !this.a($$0, (dgl)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dgl)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dwx $$0, ard $$1, ji $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dgl)$$1, $$2)) {
            Optional<dpi.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               esy $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eta.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eta.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ji $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(djo.tk) && $$5 == eta.c) {
                        dwx $$10 = djo.ee.m();
                        $$1.b($$4.get().a, $$10);
                        djm.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ebt.c, $$4.get().a, ebt.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ji $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dwx $$14 = $$1.a_($$11);
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
   public dwx a(dag $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.e().g();
      jn $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dxt $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == eta.c));
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbu d_(dwx $$0) {
      return fbr.a();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      dxt $$4 = $$0.c(c);
      fbu $$5;
      if ($$4 == dxt.a) {
         $$5 = N;
      } else if ($$4 == dxt.b) {
         if ($$0.c(b) == jn.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dxt.c) {
         $$5 = Q;
      } else if ($$4 == dxt.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      fba $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dwx $$0, dfn $$1, ji $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dgi $$0, ji $$1, clb $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public btb a(bul $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dwx $$0, ard $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      dwx $$4 = $$0;

      while (q($$4)) {
         clb $$5 = clb.a($$1, $$3, $$4);
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
   public static void c(dwx $$0, ard $$1, ji $$2, azh $$3) {
      dwx $$4 = $$1.a_($$2.b(1));
      dwx $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ji $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dwx $$7 = $$1.a_($$6);
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
         dwx $$4 = $$0.a_($$2);
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

         if (!a((dfn)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dwx $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dgj)$$0, $$3);
      } else if ($$4.l() || $$4.a(djo.J)) {
         a($$0, $$3, $$2, dxt.b);
      }
   }

   private static void a(dgj $$0, ji $$1, jn $$2, dxt $$3) {
      dwx $$4 = djo.sV.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == eta.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dwx $$0, dgj $$1, ji $$2) {
      ji $$4;
      ji $$3;
      if ($$0.c(b) == jn.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jn.a, dxt.a);
      a($$1, $$3, jn.b, dxt.a);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dgi $$0, ji $$1, dwx $$2, esy $$3) {
      fba $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      esy $$9 = a($$0, $$3);
      lr $$10 = $$9.a(awv.b) ? lt.aN : lt.aP;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ji a(dwx $$0, dgj $$1, ji $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jn $$5 = $$0.c(b);
         BiPredicate<ji, dwx> $$6 = ($$1x, $$2x) -> $$2x.a(djo.sV) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jn b(dgl $$0, ji $$1, jn $$2) {
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

   private static dxt a(dgl $$0, ji $$1, jn $$2, boolean $$3) {
      jn $$4 = $$2.g();
      dwx $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dxt.a ? dxt.b : dxt.a;
      } else if (!b($$5, $$2)) {
         return dxt.b;
      } else {
         dxt $$6 = $$5.c(c);
         if ($$6 != dxt.b && $$6 != dxt.a) {
            dwx $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dxt.e : dxt.d;
         } else {
            return dxt.c;
         }
      }
   }

   public static boolean o(dwx $$0) {
      return q($$0) && $$0.c(c) == dxt.b && !$$0.c(d);
   }

   private static boolean b(dwx $$0, ard $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3);
      dwx $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ji> a(dgi $$0, ji $$1, dwx $$2, int $$3) {
      jn $$4 = $$2.c(b);
      BiPredicate<ji, dwx> $$5 = ($$1x, $$2x) -> $$2x.a(djo.sV) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(djo.sV), $$3);
   }

   private static boolean c(dgl $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dwx $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dwx $$0, boolean $$1) {
      if (!$$0.a(djo.sV)) {
         return false;
      } else {
         dxt $$2 = $$0.c(c);
         return $$2 == dxt.b || $$1 && $$2 == dxt.a;
      }
   }

   private static boolean a(dwx $$0, jn $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dwx $$0) {
      return b($$0, jn.a);
   }

   private static boolean r(dwx $$0) {
      return b($$0, jn.b);
   }

   private static boolean b(dwx $$0, dgl $$1, ji $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(djo.sV);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   private static boolean b(dwx $$0, jn $$1) {
      return $$0.a(djo.sV) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ji a(dgi $$0, ji $$1, esy $$2) {
      Predicate<dwx> $$3 = $$1x -> $$1x.b() instanceof dif && ((dif)$$1x.b()).a($$2);
      BiPredicate<ji, dwx> $$4 = ($$1x, $$2x) -> a((dfn)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ji a(dgi $$0, ji $$1) {
      BiPredicate<ji, dwx> $$2 = ($$1x, $$2x) -> a((dfn)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.b.f(), $$2, dpi::o, 11).orElse(null);
   }

   public static esy a(ard $$0, ji $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dpi::a).orElse(eta.a);
   }

   private static Optional<dpi.a> b(dgi $$0, ji $$1, dwx $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ji $$2x = $$1x.d();
         dwx $$3 = $$0.a_($$2x);
         esy $$4;
         if ($$3.a(djo.tk) && !$$0.G_().i()) {
            $$4 = eta.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dpi.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(esy $$0) {
      return $$0 == eta.e || $$0 == eta.c;
   }

   private static boolean a(dwx $$0, dwx $$1) {
      return $$0.a(djo.sW) && $$1.a(djo.J) && $$1.y().b();
   }

   private static esy a(dgi $$0, esy $$1) {
      if ($$1.a(eta.a)) {
         return $$0.G_().i() ? eta.e : eta.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ji> a(dgj $$0, ji $$1, jn.b $$2, BiPredicate<ji, dwx> $$3, Predicate<dwx> $$4, int $$5) {
      jn $$6 = jn.a($$2, jn.a.b);
      ji.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dwx $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dfn $$0, ji $$1, dwx $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fbu $$3 = $$2.g($$0, $$1);
         return !fbr.c(U, $$3, fbe.i);
      }
   }

   static record a(ji a, esy b, dwx c) {
   }
}
