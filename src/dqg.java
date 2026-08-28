import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqg extends dkm implements dni, drq {
   public static final MapCodec<dqg> a = b(dqg::new);
   public static final dys<jm> b = dyl.bn;
   public static final dys<dyr> c = dyl.bo;
   public static final dym d = dyl.D;
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
   private static final fcs N = dkm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fcs O = dkm.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fcs P = dkm.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fcs Q = dkm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fcs R = dkm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcs S = dkm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fcs U = dkm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.b).b(c, dyr.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      if ($$4 != jm.b && $$4 != jm.a) {
         return $$0;
      } else {
         jm $$8 = $$0.c(b);
         if ($$8 == jm.a && $$2.T().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jm.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == dyr.a;
            dyr $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         if ($$0 instanceof ash $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof crd && $$3.dz().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      if ($$1.c(b) == jm.b && $$1.c(c) == dyr.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (r($$0) && !this.a($$0, (dhl)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dhl)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dxv $$0, ash $$1, jh $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dhl)$$1, $$2)) {
            Optional<dqg.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               etw $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ety.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ety.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jh $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dko.td) && $$5 == ety.c) {
                        dxv $$10 = dko.ee.m();
                        $$1.b($$4.get().a, $$10);
                        dkm.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ecr.c, $$4.get().a, ecr.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jh $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dxv $$14 = $$1.a_($$11);
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
   public dxv a(dbg $$0) {
      dhj $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.e().g();
      jm $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dyr $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == ety.c));
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcs d_(dxv $$0) {
      return fcp.a();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      dyr $$4 = $$0.c(c);
      fcs $$5;
      if ($$4 == dyr.a) {
         $$5 = N;
      } else if ($$4 == dyr.b) {
         if ($$0.c(b) == jm.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dyr.c) {
         $$5 = Q;
      } else if ($$4 == dyr.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      fby $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dxv $$0, dgn $$1, jh $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return 0.125F;
   }

   @Override
   public void a(dhi $$0, jh $$1, cma $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bua a(bvk $$0) {
      return $$0.dX().c($$0);
   }

   private static void a(dxv $$0, ash $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      dxv $$4 = $$0;

      while (q($$4)) {
         cma $$5 = cma.a($$1, $$3, $$4);
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
   public static void c(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dxv $$4 = $$1.a_($$2.b(1));
      dxv $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jh $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dxv $$7 = $$1.a_($$6);
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

   private static void b(ash $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jm.a);
         dxv $$4 = $$0.a_($$2);
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

         if (!a((dgn)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ash $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      dxv $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dhj)$$0, $$3);
      } else if ($$4.l() || $$4.a(dko.J)) {
         a($$0, $$3, $$2, dyr.b);
      }
   }

   private static void a(dhj $$0, jh $$1, jm $$2, dyr $$3) {
      dxv $$4 = dko.sO.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == ety.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dxv $$0, dhj $$1, jh $$2) {
      jh $$4;
      jh $$3;
      if ($$0.c(b) == jm.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jm.a, dyr.a);
      a($$1, $$3, jm.b, dyr.a);
   }

   public static void a(dhi $$0, jh $$1, dxv $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dhi $$0, jh $$1, dxv $$2, etw $$3) {
      fby $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      etw $$9 = a($$0, $$3);
      lq $$10 = $$9.a(aya.b) ? ls.aM : ls.aO;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jh a(dxv $$0, dhj $$1, jh $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jm $$5 = $$0.c(b);
         BiPredicate<jh, dxv> $$6 = ($$1x, $$2x) -> $$2x.a(dko.sO) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jm b(dhl $$0, jh $$1, jm $$2) {
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

   private static dyr a(dhl $$0, jh $$1, jm $$2, boolean $$3) {
      jm $$4 = $$2.g();
      dxv $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dyr.a ? dyr.b : dyr.a;
      } else if (!b($$5, $$2)) {
         return dyr.b;
      } else {
         dyr $$6 = $$5.c(c);
         if ($$6 != dyr.b && $$6 != dyr.a) {
            dxv $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dyr.e : dyr.d;
         } else {
            return dyr.c;
         }
      }
   }

   public static boolean o(dxv $$0) {
      return q($$0) && $$0.c(c) == dyr.b && !$$0.c(d);
   }

   private static boolean b(dxv $$0, ash $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3);
      dxv $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jh> a(dhi $$0, jh $$1, dxv $$2, int $$3) {
      jm $$4 = $$2.c(b);
      BiPredicate<jh, dxv> $$5 = ($$1x, $$2x) -> $$2x.a(dko.sO) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dko.sO), $$3);
   }

   private static boolean c(dhl $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dxv $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dxv $$0, boolean $$1) {
      if (!$$0.a(dko.sO)) {
         return false;
      } else {
         dyr $$2 = $$0.c(c);
         return $$2 == dyr.b || $$1 && $$2 == dyr.a;
      }
   }

   private static boolean a(dxv $$0, jm $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dxv $$0) {
      return b($$0, jm.a);
   }

   private static boolean r(dxv $$0) {
      return b($$0, jm.b);
   }

   private static boolean b(dxv $$0, dhl $$1, jh $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dko.sO);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   private static boolean b(dxv $$0, jm $$1) {
      return $$0.a(dko.sO) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jh a(dhi $$0, jh $$1, etw $$2) {
      Predicate<dxv> $$3 = $$1x -> $$1x.b() instanceof djf && ((djf)$$1x.b()).a($$2);
      BiPredicate<jh, dxv> $$4 = ($$1x, $$2x) -> a((dgn)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jh a(dhi $$0, jh $$1) {
      BiPredicate<jh, dxv> $$2 = ($$1x, $$2x) -> a((dgn)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.b.f(), $$2, dqg::o, 11).orElse(null);
   }

   public static etw a(ash $$0, jh $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dqg::a).orElse(ety.a);
   }

   private static Optional<dqg.a> b(dhi $$0, jh $$1, dxv $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jh $$2x = $$1x.d();
         dxv $$3 = $$0.a_($$2x);
         etw $$4;
         if ($$3.a(dko.td) && !$$0.G_().i()) {
            $$4 = ety.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dqg.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(etw $$0) {
      return $$0 == ety.e || $$0 == ety.c;
   }

   private static boolean a(dxv $$0, dxv $$1) {
      return $$0.a(dko.sP) && $$1.a(dko.J) && $$1.y().b();
   }

   private static etw a(dhi $$0, etw $$1) {
      if ($$1.a(ety.a)) {
         return $$0.G_().i() ? ety.e : ety.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jh> a(dhj $$0, jh $$1, jm.b $$2, BiPredicate<jh, dxv> $$3, Predicate<dxv> $$4, int $$5) {
      jm $$6 = jm.a($$2, jm.a.b);
      jh.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dxv $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dgn $$0, jh $$1, dxv $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fcs $$3 = $$2.g($$0, $$1);
         return !fcp.c(U, $$3, fcc.i);
      }
   }

   static record a(jh a, etw b, dxv c) {
   }
}
