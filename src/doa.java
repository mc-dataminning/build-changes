import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class doa extends dij implements dld, dpk {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dwl<jm> b = dwe.bm;
   public static final dwl<dwk> c = dwe.bn;
   public static final dwf d = dwe.C;
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
   private static final fal N = dij.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fal O = dij.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fal P = dij.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fal Q = dij.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fal R = dij.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fal S = dij.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fal U = dij.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.b).b(c, dwk.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      if ($$4 != jm.b && $$4 != jm.a) {
         return $$0;
      } else {
         jm $$8 = $$0.c(b);
         if ($$8 == jm.a && $$2.R().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jm.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == dwk.a;
            dwk $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cpx && $$3.dB().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      if ($$1.c(b) == jm.b && $$1.c(c) == dwk.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (r($$0) && !this.a($$0, (dfi)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dfi)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dvo $$0, arq $$1, jh $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dfi)$$1, $$2)) {
            Optional<doa.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ern $$5 = $$4.get().b;
               float $$6;
               if ($$5 == erp.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != erp.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jh $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dil.sI) && $$5 == erp.c) {
                        dvo $$10 = dil.dR.m();
                        $$1.b($$4.get().a, $$10);
                        dij.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(eak.c, $$4.get().a, eak.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jh $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dvo $$14 = $$1.a_($$11);
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
   public dvo a(czw $$0) {
      dfg $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.e().g();
      jm $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dwk $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == erp.c));
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected fal d_(dvo $$0) {
      return fai.a();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      dwk $$4 = $$0.c(c);
      fal $$5;
      if ($$4 == dwk.a) {
         $$5 = N;
      } else if ($$4 == dwk.b) {
         if ($$0.c(b) == jm.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dwk.c) {
         $$5 = Q;
      } else if ($$4 == dwk.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      ezr $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dvo $$0, dek $$1, jh $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return 0.125F;
   }

   @Override
   public void a(dff $$0, jh $$1, cky $$2) {
      if (!$$2.bd()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsy a(bui $$0) {
      return $$0.dZ().c($$0);
   }

   private static void a(dvo $$0, arq $$1, jh $$2) {
      jh.a $$3 = $$2.k();
      dvo $$4 = $$0;

      while (q($$4)) {
         cky $$5 = cky.a($$1, $$3, $$4);
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
   public static void c(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dvo $$4 = $$1.a_($$2.b(1));
      dvo $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jh $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dvo $$7 = $$1.a_($$6);
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

   private static void b(arq $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jm.a);
         dvo $$4 = $$0.a_($$2);
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

         if (!a((dek)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arq $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      dvo $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dfg)$$0, $$3);
      } else if ($$4.l() || $$4.a(dil.G)) {
         a($$0, $$3, $$2, dwk.b);
      }
   }

   private static void a(dfg $$0, jh $$1, jm $$2, dwk $$3) {
      dvo $$4 = dil.st.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == erp.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dvo $$0, dfg $$1, jh $$2) {
      jh $$4;
      jh $$3;
      if ($$0.c(b) == jm.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jm.a, dwk.a);
      a($$1, $$3, jm.b, dwk.a);
   }

   public static void a(dff $$0, jh $$1, dvo $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dff $$0, jh $$1, dvo $$2, ern $$3) {
      ezr $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      ern $$9 = a($$0, $$3);
      lq $$10 = $$9.a(axj.b) ? ls.aL : ls.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jh a(dvo $$0, dfg $$1, jh $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jm $$5 = $$0.c(b);
         BiPredicate<jh, dvo> $$6 = ($$1x, $$2x) -> $$2x.a(dil.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jm b(dfi $$0, jh $$1, jm $$2) {
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

   private static dwk a(dfi $$0, jh $$1, jm $$2, boolean $$3) {
      jm $$4 = $$2.g();
      dvo $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dwk.a ? dwk.b : dwk.a;
      } else if (!b($$5, $$2)) {
         return dwk.b;
      } else {
         dwk $$6 = $$5.c(c);
         if ($$6 != dwk.b && $$6 != dwk.a) {
            dvo $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dwk.e : dwk.d;
         } else {
            return dwk.c;
         }
      }
   }

   public static boolean o(dvo $$0) {
      return q($$0) && $$0.c(c) == dwk.b && !$$0.c(d);
   }

   private static boolean b(dvo $$0, arq $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      jh $$4 = $$2.a($$3);
      dvo $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jh> a(dff $$0, jh $$1, dvo $$2, int $$3) {
      jm $$4 = $$2.c(b);
      BiPredicate<jh, dvo> $$5 = ($$1x, $$2x) -> $$2x.a(dil.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dil.st), $$3);
   }

   private static boolean c(dfi $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2.g());
      dvo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dvo $$0, boolean $$1) {
      if (!$$0.a(dil.st)) {
         return false;
      } else {
         dwk $$2 = $$0.c(c);
         return $$2 == dwk.b || $$1 && $$2 == dwk.a;
      }
   }

   private static boolean a(dvo $$0, jm $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dvo $$0) {
      return b($$0, jm.a);
   }

   private static boolean r(dvo $$0) {
      return b($$0, jm.b);
   }

   private static boolean b(dvo $$0, dfi $$1, jh $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dil.st);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   private static boolean b(dvo $$0, jm $$1) {
      return $$0.a(dil.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jh a(dff $$0, jh $$1, ern $$2) {
      Predicate<dvo> $$3 = $$1x -> $$1x.b() instanceof dhc && ((dhc)$$1x.b()).a($$2);
      BiPredicate<jh, dvo> $$4 = ($$1x, $$2x) -> a((dek)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jh a(dff $$0, jh $$1) {
      BiPredicate<jh, dvo> $$2 = ($$1x, $$2x) -> a((dek)$$0, $$1x, $$2x);
      return a($$0, $$1, jm.b.f(), $$2, doa::o, 11).orElse(null);
   }

   public static ern a(arq $$0, jh $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(doa::a).orElse(erp.a);
   }

   private static Optional<doa.a> b(dff $$0, jh $$1, dvo $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jh $$2x = $$1x.d();
         dvo $$3 = $$0.a_($$2x);
         ern $$4;
         if ($$3.a(dil.sI) && !$$0.D_().i()) {
            $$4 = erp.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new doa.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ern $$0) {
      return $$0 == erp.e || $$0 == erp.c;
   }

   private static boolean a(dvo $$0, dvo $$1) {
      return $$0.a(dil.su) && $$1.a(dil.G) && $$1.y().b();
   }

   private static ern a(dff $$0, ern $$1) {
      if ($$1.a(erp.a)) {
         return $$0.D_().i() ? erp.e : erp.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jh> a(dfg $$0, jh $$1, jm.b $$2, BiPredicate<jh, dvo> $$3, Predicate<dvo> $$4, int $$5) {
      jm $$6 = jm.a($$2, jm.a.b);
      jh.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dvo $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dek $$0, jh $$1, dvo $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fal $$3 = $$2.g($$0, $$1);
         return !fai.c(U, $$3, ezv.i);
      }
   }

   static record a(jh a, ern b, dvo c) {
   }
}
