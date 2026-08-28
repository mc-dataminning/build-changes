import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dne extends dhm implements dkh, doo {
   public static final MapCodec<dne> a = b(dne::new);
   public static final dvm b = dvi.bm;
   public static final dvq<dvp> c = dvi.bn;
   public static final dvj d = dvi.C;
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
   private static final ezq N = dhm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ezq O = dhm.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ezq P = dhm.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ezq Q = dhm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ezq R = dhm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ezq S = dhm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final ezq U = dhm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.b).b(c, dvp.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      if ($$1 != jk.b && $$1 != jk.a) {
         return $$0;
      } else {
         jk $$6 = $$0.c(b);
         if ($$6 == jk.a && $$3.R().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dem)$$3, $$4)) {
            if ($$6 == jk.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dvp.a;
            dvp $$8 = a($$3, $$4, $$6, $$7);
            return $$0.b(c, $$8);
         }
      }
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      if (!$$0.B) {
         jf $$4 = $$2.b();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cpe && $$3.dv().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      if ($$1.c(b) == jk.b && $$1.c(c) == dvp.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (r($$0) && !this.a($$0, (dem)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dem)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dus $$0, arj $$1, jf $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dem)$$1, $$2)) {
            Optional<dne.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eqs $$5 = $$4.get().b;
               float $$6;
               if ($$5 == equ.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != equ.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jf $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dho.sI) && $$5 == equ.c) {
                        dus $$10 = dho.dR.n();
                        $$1.b($$4.get().a, $$10);
                        dhm.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dzp.c, $$4.get().a, dzp.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jf $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dus $$14 = $$1.a_($$11);
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
   public dus a(czn $$0) {
      dek $$1 = $$0.q();
      jf $$2 = $$0.a();
      jk $$3 = $$0.e().g();
      jk $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dvp $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == equ.c));
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected ezq d_(dus $$0) {
      return ezn.a();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      dvp $$4 = $$0.c(c);
      ezq $$5;
      if ($$4 == dvp.a) {
         $$5 = N;
      } else if ($$4 == dvp.b) {
         if ($$0.c(b) == jk.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dvp.c) {
         $$5 = Q;
      } else if ($$4 == dvp.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      eyw $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dus $$0, ddo $$1, jf $$2) {
      return false;
   }

   @Override
   protected float at_() {
      return 0.125F;
   }

   @Override
   public void a(dej $$0, jf $$1, ckg $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsj a(btr $$0) {
      return $$0.dT().c($$0);
   }

   private static void a(dus $$0, arj $$1, jf $$2) {
      jf.a $$3 = $$2.k();
      dus $$4 = $$0;

      while (q($$4)) {
         ckg $$5 = ckg.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jk.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dus $$0, arj $$1, jf $$2, azn $$3) {
      dus $$4 = $$1.a_($$2.b(1));
      dus $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jf $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dus $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jk.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arj $$0, jf $$1) {
      jf.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jk.a);
         dus $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jk.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jk.b);
            return;
         }

         if (c($$0, $$2, jk.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jk.b);
            return;
         }

         if (!a((ddo)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arj $$0, jf $$1, jk $$2) {
      jf $$3 = $$1.a($$2);
      dus $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dek)$$0, $$3);
      } else if ($$4.l() || $$4.a(dho.G)) {
         a($$0, $$3, $$2, dvp.b);
      }
   }

   private static void a(dek $$0, jf $$1, jk $$2, dvp $$3) {
      dus $$4 = dho.st.n().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == equ.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dus $$0, dek $$1, jf $$2) {
      jf $$4;
      jf $$3;
      if ($$0.c(b) == jk.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jk.a, dvp.a);
      a($$1, $$3, jk.b, dvp.a);
   }

   public static void a(dej $$0, jf $$1, dus $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dej $$0, jf $$1, dus $$2, eqs $$3) {
      eyw $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      eqs $$9 = a($$0, $$3);
      lm $$10 = $$9.a(axb.b) ? lo.aL : lo.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jf a(dus $$0, dek $$1, jf $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jk $$5 = $$0.c(b);
         BiPredicate<jf, dus> $$6 = ($$1x, $$2x) -> $$2x.a(dho.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jk b(dem $$0, jf $$1, jk $$2) {
      jk $$3;
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

   private static dvp a(dem $$0, jf $$1, jk $$2, boolean $$3) {
      jk $$4 = $$2.g();
      dus $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dvp.a ? dvp.b : dvp.a;
      } else if (!b($$5, $$2)) {
         return dvp.b;
      } else {
         dvp $$6 = $$5.c(c);
         if ($$6 != dvp.b && $$6 != dvp.a) {
            dus $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dvp.e : dvp.d;
         } else {
            return dvp.c;
         }
      }
   }

   public static boolean o(dus $$0) {
      return q($$0) && $$0.c(c) == dvp.b && !$$0.c(d);
   }

   private static boolean b(dus $$0, arj $$1, jf $$2) {
      jk $$3 = $$0.c(b);
      jf $$4 = $$2.a($$3);
      dus $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jf> a(dej $$0, jf $$1, dus $$2, int $$3) {
      jk $$4 = $$2.c(b);
      BiPredicate<jf, dus> $$5 = ($$1x, $$2x) -> $$2x.a(dho.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dho.st), $$3);
   }

   private static boolean c(dem $$0, jf $$1, jk $$2) {
      jf $$3 = $$1.a($$2.g());
      dus $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dus $$0, boolean $$1) {
      if (!$$0.a(dho.st)) {
         return false;
      } else {
         dvp $$2 = $$0.c(c);
         return $$2 == dvp.b || $$1 && $$2 == dvp.a;
      }
   }

   private static boolean a(dus $$0, jk $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dus $$0) {
      return b($$0, jk.a);
   }

   private static boolean r(dus $$0) {
      return b($$0, jk.b);
   }

   private static boolean b(dus $$0, dem $$1, jf $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dho.st);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   private static boolean b(dus $$0, jk $$1) {
      return $$0.a(dho.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jf a(dej $$0, jf $$1, eqs $$2) {
      Predicate<dus> $$3 = $$1x -> $$1x.b() instanceof dgf && ((dgf)$$1x.b()).a($$2);
      BiPredicate<jf, dus> $$4 = ($$1x, $$2x) -> a((ddo)$$0, $$1x, $$2x);
      return a($$0, $$1, jk.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jf a(dej $$0, jf $$1) {
      BiPredicate<jf, dus> $$2 = ($$1x, $$2x) -> a((ddo)$$0, $$1x, $$2x);
      return a($$0, $$1, jk.b.f(), $$2, dne::o, 11).orElse(null);
   }

   public static eqs a(arj $$0, jf $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dne::a).orElse(equ.a);
   }

   private static Optional<dne.a> b(dej $$0, jf $$1, dus $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jf $$2x = $$1x.d();
         dus $$3 = $$0.a_($$2x);
         eqs $$4;
         if ($$3.a(dho.sI) && !$$0.C_().i()) {
            $$4 = equ.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dne.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eqs $$0) {
      return $$0 == equ.e || $$0 == equ.c;
   }

   private static boolean a(dus $$0, dus $$1) {
      return $$0.a(dho.su) && $$1.a(dho.G) && $$1.y().b();
   }

   private static eqs a(dej $$0, eqs $$1) {
      if ($$1.a(equ.a)) {
         return $$0.C_().i() ? equ.e : equ.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jf> a(dek $$0, jf $$1, jk.b $$2, BiPredicate<jf, dus> $$3, Predicate<dus> $$4, int $$5) {
      jk $$6 = jk.a($$2, jk.a.b);
      jf.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dus $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(ddo $$0, jf $$1, dus $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         ezq $$3 = $$2.g($$0, $$1);
         return !ezn.c(U, $$3, eza.i);
      }
   }

   static record a(jf a, eqs b, dus c) {
   }
}
