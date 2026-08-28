import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnp extends dhy implements dks, doz {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dvx b = dvt.bm;
   public static final dwb<dwa> c = dvt.bn;
   public static final dvu d = dvt.C;
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
   private static final fab N = dhy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final fab O = dhy.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final fab P = dhy.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final fab Q = dhy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final fab R = dhy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final fab S = dhy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final fab U = dhy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.b).b(c, dwa.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      if ($$1 != jl.b && $$1 != jl.a) {
         return $$0;
      } else {
         jl $$6 = $$0.c(b);
         if ($$6 == jl.a && $$3.R().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dey)$$3, $$4)) {
            if ($$6 == jl.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dwa.a;
            dwa $$8 = a($$3, $$4, $$6, $$7);
            return $$0.b(c, $$8);
         }
      }
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      if (!$$0.C) {
         jg $$4 = $$2.b();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cpo && $$3.dA().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      if ($$1.c(b) == jl.b && $$1.c(c) == dwa.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (r($$0) && !this.a($$0, (dey)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dey)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dvd $$0, arm $$1, jg $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dey)$$1, $$2)) {
            Optional<dnp.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               erd $$5 = $$4.get().b;
               float $$6;
               if ($$5 == erf.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != erf.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jg $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dia.sI) && $$5 == erf.c) {
                        dvd $$10 = dia.dR.m();
                        $$1.b($$4.get().a, $$10);
                        dhy.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(eaa.c, $$4.get().a, eaa.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jg $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dvd $$14 = $$1.a_($$11);
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
   public dvd a(czm $$0) {
      dew $$1 = $$0.q();
      jg $$2 = $$0.a();
      jl $$3 = $$0.e().g();
      jl $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dwa $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == erf.c));
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected fab d_(dvd $$0) {
      return ezy.a();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      dwa $$4 = $$0.c(c);
      fab $$5;
      if ($$4 == dwa.a) {
         $$5 = N;
      } else if ($$4 == dwa.b) {
         if ($$0.c(b) == jl.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dwa.c) {
         $$5 = Q;
      } else if ($$4 == dwa.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      ezh $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(dvd $$0, dea $$1, jg $$2) {
      return false;
   }

   @Override
   protected float at_() {
      return 0.125F;
   }

   @Override
   public void a(dev $$0, jg $$1, ckp $$2) {
      if (!$$2.bc()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsp a(btz $$0) {
      return $$0.dY().c($$0);
   }

   private static void a(dvd $$0, arm $$1, jg $$2) {
      jg.a $$3 = $$2.k();
      dvd $$4 = $$0;

      while (q($$4)) {
         ckp $$5 = ckp.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jl.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dvd $$0, arm $$1, jg $$2, azr $$3) {
      dvd $$4 = $$1.a_($$2.b(1));
      dvd $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jg $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dvd $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jl.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arm $$0, jg $$1) {
      jg.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jl.a);
         dvd $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jl.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jl.b);
            return;
         }

         if (c($$0, $$2, jl.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jl.b);
            return;
         }

         if (!a((dea)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arm $$0, jg $$1, jl $$2) {
      jg $$3 = $$1.a($$2);
      dvd $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dew)$$0, $$3);
      } else if ($$4.l() || $$4.a(dia.G)) {
         a($$0, $$3, $$2, dwa.b);
      }
   }

   private static void a(dew $$0, jg $$1, jl $$2, dwa $$3) {
      dvd $$4 = dia.st.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == erf.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dvd $$0, dew $$1, jg $$2) {
      jg $$4;
      jg $$3;
      if ($$0.c(b) == jl.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jl.a, dwa.a);
      a($$1, $$3, jl.b, dwa.a);
   }

   public static void a(dev $$0, jg $$1, dvd $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dev $$0, jg $$1, dvd $$2, erd $$3) {
      ezh $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      erd $$9 = a($$0, $$3);
      lo $$10 = $$9.a(axf.b) ? lq.aL : lq.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jg a(dvd $$0, dew $$1, jg $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jl $$5 = $$0.c(b);
         BiPredicate<jg, dvd> $$6 = ($$1x, $$2x) -> $$2x.a(dia.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jl b(dey $$0, jg $$1, jl $$2) {
      jl $$3;
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

   private static dwa a(dey $$0, jg $$1, jl $$2, boolean $$3) {
      jl $$4 = $$2.g();
      dvd $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dwa.a ? dwa.b : dwa.a;
      } else if (!b($$5, $$2)) {
         return dwa.b;
      } else {
         dwa $$6 = $$5.c(c);
         if ($$6 != dwa.b && $$6 != dwa.a) {
            dvd $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dwa.e : dwa.d;
         } else {
            return dwa.c;
         }
      }
   }

   public static boolean o(dvd $$0) {
      return q($$0) && $$0.c(c) == dwa.b && !$$0.c(d);
   }

   private static boolean b(dvd $$0, arm $$1, jg $$2) {
      jl $$3 = $$0.c(b);
      jg $$4 = $$2.a($$3);
      dvd $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jg> a(dev $$0, jg $$1, dvd $$2, int $$3) {
      jl $$4 = $$2.c(b);
      BiPredicate<jg, dvd> $$5 = ($$1x, $$2x) -> $$2x.a(dia.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dia.st), $$3);
   }

   private static boolean c(dey $$0, jg $$1, jl $$2) {
      jg $$3 = $$1.a($$2.g());
      dvd $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dvd $$0, boolean $$1) {
      if (!$$0.a(dia.st)) {
         return false;
      } else {
         dwa $$2 = $$0.c(c);
         return $$2 == dwa.b || $$1 && $$2 == dwa.a;
      }
   }

   private static boolean a(dvd $$0, jl $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dvd $$0) {
      return b($$0, jl.a);
   }

   private static boolean r(dvd $$0) {
      return b($$0, jl.b);
   }

   private static boolean b(dvd $$0, dey $$1, jg $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dia.st);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   private static boolean b(dvd $$0, jl $$1) {
      return $$0.a(dia.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jg a(dev $$0, jg $$1, erd $$2) {
      Predicate<dvd> $$3 = $$1x -> $$1x.b() instanceof dgr && ((dgr)$$1x.b()).a($$2);
      BiPredicate<jg, dvd> $$4 = ($$1x, $$2x) -> a((dea)$$0, $$1x, $$2x);
      return a($$0, $$1, jl.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jg a(dev $$0, jg $$1) {
      BiPredicate<jg, dvd> $$2 = ($$1x, $$2x) -> a((dea)$$0, $$1x, $$2x);
      return a($$0, $$1, jl.b.f(), $$2, dnp::o, 11).orElse(null);
   }

   public static erd a(arm $$0, jg $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dnp::a).orElse(erf.a);
   }

   private static Optional<dnp.a> b(dev $$0, jg $$1, dvd $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jg $$2x = $$1x.d();
         dvd $$3 = $$0.a_($$2x);
         erd $$4;
         if ($$3.a(dia.sI) && !$$0.D_().i()) {
            $$4 = erf.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dnp.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(erd $$0) {
      return $$0 == erf.e || $$0 == erf.c;
   }

   private static boolean a(dvd $$0, dvd $$1) {
      return $$0.a(dia.su) && $$1.a(dia.G) && $$1.y().b();
   }

   private static erd a(dev $$0, erd $$1) {
      if ($$1.a(erf.a)) {
         return $$0.D_().i() ? erf.e : erf.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jg> a(dew $$0, jg $$1, jl.b $$2, BiPredicate<jg, dvd> $$3, Predicate<dvd> $$4, int $$5) {
      jl $$6 = jl.a($$2, jl.a.b);
      jg.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dvd $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dea $$0, jg $$1, dvd $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fab $$3 = $$2.g($$0, $$1);
         return !ezy.c(U, $$3, ezl.i);
      }
   }

   static record a(jg a, erd b, dvd c) {
   }
}
