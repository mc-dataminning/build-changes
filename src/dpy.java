import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpy extends dke implements dna, dri {
   public static final MapCodec<dpy> a = b(dpy::new);
   public static final dyk<jm> b = dyd.bn;
   public static final dyk<dyj> c = dyd.bo;
   public static final dye d = dyd.D;
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
   private static final fcm N = dke.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fcm O = dke.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fcm P = dke.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fcm Q = dke.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fcm R = dke.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcm S = dke.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fcm U = dke.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   public dpy(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.b).b(c, dyj.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
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
            boolean $$9 = $$0.c(c) == dyj.a;
            dyj $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         if ($$0 instanceof ash $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cqy && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      if ($$1.c(b) == jm.b && $$1.c(c) == dyj.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (r($$0) && !this.a($$0, (dhd)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dhd)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dxn $$0, ash $$1, jh $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dhd)$$1, $$2)) {
            Optional<dpy.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eto $$5 = $$4.get().b;
               float $$6;
               if ($$5 == etq.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != etq.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jh $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dkg.td) && $$5 == etq.c) {
                        dxn $$10 = dkg.ee.m();
                        $$1.b($$4.get().a, $$10);
                        dke.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ecj.c, $$4.get().a, ecj.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jh $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dxn $$14 = $$1.a_($$11);
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
   public dxn a(dbb $$0) {
      dhb $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.e().g();
      jm $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dyj $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == etq.c));
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcm d_(dxn $$0) {
      return fcj.a();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      dyj $$4 = $$0.c(c);
      fcm $$5;
      if ($$4 == dyj.a) {
         $$5 = N;
      } else if ($$4 == dyj.b) {
         if ($$0.c(b) == jm.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dyj.c) {
         $$5 = Q;
      } else if ($$4 == dyj.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      fbs $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dxn $$0, dgf $$1, jh $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return 0.125F;
   }

   @Override
   public void a(dha $$0, jh $$1, clv $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public btv a(bvf $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dxn $$0, ash $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      dxn $$4 = $$0;

      while (q($$4)) {
         clv $$5 = clv.a($$1, $$3, $$4);
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
   public static void c(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dxn $$4 = $$1.a_($$2.b(1));
      dxn $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jh $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dxn $$7 = $$1.a_($$6);
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
         dxn $$4 = $$0.a_($$2);
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

         if (!a((dgf)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ash $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      dxn $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dhb)$$0, $$3);
      } else if ($$4.l() || $$4.a(dkg.J)) {
         a($$0, $$3, $$2, dyj.b);
      }
   }

   private static void a(dhb $$0, jh $$1, jm $$2, dyj $$3) {
      dxn $$4 = dkg.sO.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == etq.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dxn $$0, dhb $$1, jh $$2) {
      jh $$4;
      jh $$3;
      if ($$0.c(b) == jm.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jm.a, dyj.a);
      a($$1, $$3, jm.b, dyj.a);
   }

   public static void a(dha $$0, jh $$1, dxn $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dha $$0, jh $$1, dxn $$2, eto $$3) {
      fbs $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      eto $$9 = a($$0, $$3);
      lq $$10 = $$9.a(aya.b) ? ls.aM : ls.aO;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jh a(dxn $$0, dhb $$1, jh $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jm $$5 = $$0.c(b);
         BiPredicate<jh, dxn> $$6 = ($$1x, $$2x) -> $$2x.a(dkg.sO) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jm b(dhd $$0, jh $$1, jm $$2) {
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

   private static dyj a(dhd $$0, jh $$1, jm $$2, boolean $$3) {
      jm $$4 = $$2.g();
      dxn $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dyj.a ? dyj.b : dyj.a;
      } else if (!b($$5, $$2)) {
         return dyj.b;
      } else {
         dyj $$6 = $$5.c(c);
         if ($$6 != dyj.b && $$6 != dyj.a) {
            dxn $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dyj.e : dyj.d;
         } else {
            return dyj.c;
         }
      }
   }

   public static boolean o(dxn $$0) {
      return q($$0) && $$0.c(c) == dyj.b && !$$0.c(d);
   }

   private static boolean b(dxn $$0, ash $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3);
      dxn $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jh> a(dha $$0, jh $$1, dxn $$2, int $$3) {
      jm $$4 = $$2.c(b);
      BiPredicate<jh, dxn> $$5 = ($$1x, $$2x) -> $$2x.a(dkg.sO) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dkg.sO), $$3);
   }

   private static boolean c(dhd $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dxn $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dxn $$0, boolean $$1) {
      if (!$$0.a(dkg.sO)) {
         return false;
      } else {
         dyj $$2 = $$0.c(c);
         return $$2 == dyj.b || $$1 && $$2 == dyj.a;
      }
   }

   private static boolean a(dxn $$0, jm $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dxn $$0) {
      return b($$0, jm.a);
   }

   private static boolean r(dxn $$0) {
      return b($$0, jm.b);
   }

   private static boolean b(dxn $$0, dhd $$1, jh $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dkg.sO);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   private static boolean b(dxn $$0, jm $$1) {
      return $$0.a(dkg.sO) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jh a(dha $$0, jh $$1, eto $$2) {
      Predicate<dxn> $$3 = $$1x -> $$1x.b() instanceof dix && ((dix)$$1x.b()).a($$2);
      BiPredicate<jh, dxn> $$4 = ($$1x, $$2x) -> a((dgf)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jh a(dha $$0, jh $$1) {
      BiPredicate<jh, dxn> $$2 = ($$1x, $$2x) -> a((dgf)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.b.f(), $$2, dpy::o, 11).orElse(null);
   }

   public static eto a(ash $$0, jh $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dpy::a).orElse(etq.a);
   }

   private static Optional<dpy.a> b(dha $$0, jh $$1, dxn $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jh $$2x = $$1x.d();
         dxn $$3 = $$0.a_($$2x);
         eto $$4;
         if ($$3.a(dkg.td) && !$$0.G_().i()) {
            $$4 = etq.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dpy.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eto $$0) {
      return $$0 == etq.e || $$0 == etq.c;
   }

   private static boolean a(dxn $$0, dxn $$1) {
      return $$0.a(dkg.sP) && $$1.a(dkg.J) && $$1.y().b();
   }

   private static eto a(dha $$0, eto $$1) {
      if ($$1.a(etq.a)) {
         return $$0.G_().i() ? etq.e : etq.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jh> a(dhb $$0, jh $$1, jm.b $$2, BiPredicate<jh, dxn> $$3, Predicate<dxn> $$4, int $$5) {
      jm $$6 = jm.a($$2, jm.a.b);
      jh.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dxn $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dgf $$0, jh $$1, dxn $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fcm $$3 = $$2.g($$0, $$1);
         return !fcj.c(U, $$3, fbw.i);
      }
   }

   static record a(jh a, eto b, dxn c) {
   }
}
