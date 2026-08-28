import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dmn extends dgv implements djq, dnx {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final duu b = duq.bm;
   public static final duy<dux> c = duq.bn;
   public static final dur d = duq.C;
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
   private static final float F = 2.0F;
   private static final int G = 2;
   private static final float H = 5.0F;
   private static final float I = 0.011377778F;
   private static final int J = 7;
   private static final int K = 10;
   private static final float L = 0.6875F;
   private static final eyx M = dgv.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eyx N = dgv.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eyx O = dgv.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eyx P = dgv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eyx Q = dgv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eyx R = dgv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eyx T = dgv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.b).b(c, dux.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      if ($$1 != jj.b && $$1 != jj.a) {
         return $$0;
      } else {
         jj $$6 = $$0.c(b);
         if ($$6 == jj.a && $$3.R().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (ddv)$$3, $$4)) {
            if ($$6 == jj.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dux.a;
            dux $$8 = a($$3, $$4, $$6, $$7);
            return $$0.b(c, $$8);
         }
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      if (!$$0.B) {
         je $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cow && $$3.dv().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      if ($$1.c(b) == jj.b && $$1.c(c) == dux.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (r($$0) && !this.a($$0, (ddv)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (ddv)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dua $$0, arg $$1, je $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (ddv)$$1, $$2)) {
            Optional<dmn.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eqa $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eqc.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eqc.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  je $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dgx.sI) && $$5 == eqc.c) {
                        dua $$10 = dgx.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dgv.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dyx.c, $$4.get().a, dyx.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        je $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dua $$14 = $$1.a_($$11);
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
   public dua a(cyw $$0) {
      ddt $$1 = $$0.q();
      je $$2 = $$0.a();
      jj $$3 = $$0.e().g();
      jj $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dux $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == eqc.c));
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected eyx d_(dua $$0) {
      return eyu.a();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      dux $$4 = $$0.c(c);
      eyx $$5;
      if ($$4 == dux.a) {
         $$5 = M;
      } else if ($$4 == dux.b) {
         if ($$0.c(b) == jj.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dux.c) {
         $$5 = P;
      } else if ($$4 == dux.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eye $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dua $$0, dcx $$1, je $$2) {
      return false;
   }

   @Override
   protected float au_() {
      return 0.125F;
   }

   @Override
   public void a(dds $$0, je $$1, cjy $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsb a(btj $$0) {
      return $$0.dT().c($$0);
   }

   private static void a(dua $$0, arg $$1, je $$2) {
      je.a $$3 = $$2.k();
      dua $$4 = $$0;

      while (q($$4)) {
         cjy $$5 = cjy.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jj.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dua $$0, arg $$1, je $$2, azk $$3) {
      dua $$4 = $$1.a_($$2.b(1));
      dua $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         je $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dua $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jj.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arg $$0, je $$1) {
      je.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jj.a);
         dua $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jj.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jj.b);
            return;
         }

         if (c($$0, $$2, jj.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jj.b);
            return;
         }

         if (!a((dcx)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arg $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2);
      dua $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (ddt)$$0, $$3);
      } else if ($$4.l() || $$4.a(dgx.G)) {
         a($$0, $$3, $$2, dux.b);
      }
   }

   private static void a(ddt $$0, je $$1, jj $$2, dux $$3) {
      dua $$4 = dgx.st.o().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == eqc.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dua $$0, ddt $$1, je $$2) {
      je $$4;
      je $$3;
      if ($$0.c(b) == jj.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jj.a, dux.a);
      a($$1, $$3, jj.b, dux.a);
   }

   public static void a(dds $$0, je $$1, dua $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dds $$0, je $$1, dua $$2, eqa $$3) {
      eye $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      eqa $$9 = a($$0, $$3);
      ll $$10 = $$9.a(awy.b) ? ln.aL : ln.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static je a(dua $$0, ddt $$1, je $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jj $$5 = $$0.c(b);
         BiPredicate<je, dua> $$6 = ($$1x, $$2x) -> $$2x.a(dgx.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jj b(ddv $$0, je $$1, jj $$2) {
      jj $$3;
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

   private static dux a(ddv $$0, je $$1, jj $$2, boolean $$3) {
      jj $$4 = $$2.g();
      dua $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dux.a ? dux.b : dux.a;
      } else if (!b($$5, $$2)) {
         return dux.b;
      } else {
         dux $$6 = $$5.c(c);
         if ($$6 != dux.b && $$6 != dux.a) {
            dua $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dux.e : dux.d;
         } else {
            return dux.c;
         }
      }
   }

   public static boolean o(dua $$0) {
      return q($$0) && $$0.c(c) == dux.b && !$$0.c(d);
   }

   private static boolean b(dua $$0, arg $$1, je $$2) {
      jj $$3 = $$0.c(b);
      je $$4 = $$2.a($$3);
      dua $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<je> a(dds $$0, je $$1, dua $$2, int $$3) {
      jj $$4 = $$2.c(b);
      BiPredicate<je, dua> $$5 = ($$1x, $$2x) -> $$2x.a(dgx.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dgx.st), $$3);
   }

   private static boolean c(ddv $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2.g());
      dua $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dua $$0, boolean $$1) {
      if (!$$0.a(dgx.st)) {
         return false;
      } else {
         dux $$2 = $$0.c(c);
         return $$2 == dux.b || $$1 && $$2 == dux.a;
      }
   }

   private static boolean a(dua $$0, jj $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dua $$0) {
      return b($$0, jj.a);
   }

   private static boolean r(dua $$0) {
      return b($$0, jj.b);
   }

   private static boolean b(dua $$0, ddv $$1, je $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dgx.st);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   private static boolean b(dua $$0, jj $$1) {
      return $$0.a(dgx.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static je a(dds $$0, je $$1, eqa $$2) {
      Predicate<dua> $$3 = $$1x -> $$1x.b() instanceof dfo && ((dfo)$$1x.b()).a($$2);
      BiPredicate<je, dua> $$4 = ($$1x, $$2x) -> a((dcx)$$0, $$1x, $$2x);
      return a($$0, $$1, jj.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static je a(dds $$0, je $$1) {
      BiPredicate<je, dua> $$2 = ($$1x, $$2x) -> a((dcx)$$0, $$1x, $$2x);
      return a($$0, $$1, jj.b.f(), $$2, dmn::o, 11).orElse(null);
   }

   public static eqa a(arg $$0, je $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dmn::a).orElse(eqc.a);
   }

   private static Optional<dmn.a> b(dds $$0, je $$1, dua $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         je $$2x = $$1x.d();
         dua $$3 = $$0.a_($$2x);
         eqa $$4;
         if ($$3.a(dgx.sI) && !$$0.B_().i()) {
            $$4 = eqc.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dmn.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eqa $$0) {
      return $$0 == eqc.e || $$0 == eqc.c;
   }

   private static boolean a(dua $$0, dua $$1) {
      return $$0.a(dgx.su) && $$1.a(dgx.G) && $$1.y().b();
   }

   private static eqa a(dds $$0, eqa $$1) {
      if ($$1.a(eqc.a)) {
         return $$0.B_().i() ? eqc.e : eqc.c;
      } else {
         return $$1;
      }
   }

   private static Optional<je> a(ddt $$0, je $$1, jj.b $$2, BiPredicate<je, dua> $$3, Predicate<dua> $$4, int $$5) {
      jj $$6 = jj.a($$2, jj.a.b);
      je.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dua $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dcx $$0, je $$1, dua $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         eyx $$3 = $$2.g($$0, $$1);
         return !eyu.c(T, $$3, eyi.i);
      }
   }

   static record a(je a, eqa b, dua c) {
   }
}
