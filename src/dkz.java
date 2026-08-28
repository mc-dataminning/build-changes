import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkz extends dfh implements dic, dmi {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dte b = dta.bm;
   public static final dti<dth> c = dta.bn;
   public static final dtb d = dta.C;
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
   private static final ewy M = dfh.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewy N = dfh.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ewy O = dfh.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewy P = dfh.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ewy Q = dfh.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewy R = dfh.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ewy T = dfh.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.b).a(c, dth.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      if ($$1 != jf.b && $$1 != jf.a) {
         return $$0;
      } else {
         jf $$6 = $$0.c(b);
         if ($$6 == jf.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dci)$$3, $$4)) {
            if ($$6 == jf.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dth.a;
            dth $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cnp && $$3.dt().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      if ($$1.c(b) == jf.b && $$1.c(c) == dth.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().v());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (o($$0) && !this.a($$0, (dci)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dci)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dsk $$0, aqm $$1, ja $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dci)$$1, $$2)) {
            Optional<dkz.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eog $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eoi.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eoi.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ja $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfj.sI) && $$5 == eoi.c) {
                        dsk $$10 = dfj.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dfh.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dxg.c, $$4.get().a, dxg.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ja $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dsk $$14 = $$1.a_($$11);
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
   public dsk a(cxm $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      jf $$3 = $$0.e().g();
      jf $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dth $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eoi.c));
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return ewv.a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      dth $$4 = $$0.c(c);
      ewy $$5;
      if ($$4 == dth.a) {
         $$5 = M;
      } else if ($$4 == dth.b) {
         if ($$0.c(b) == jf.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dth.c) {
         $$5 = P;
      } else if ($$4 == dth.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ewf $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dcf $$0, ja $$1, cit $$2) {
      if (!$$2.aX()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bqz a(bsg $$0) {
      return $$0.dR().c($$0);
   }

   private static void a(dsk $$0, aqm $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      dsk $$4 = $$0;

      while (n($$4)) {
         cit $$5 = cit.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jf.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dsk $$4 = $$1.a_($$2.b(1));
      dsk $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ja $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dsk $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jf.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aqm $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jf.a);
         dsk $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, jf.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jf.b);
            return;
         }

         if (c($$0, $$2, jf.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), jf.b);
            return;
         }

         if (!a((dbl)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqm $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      dsk $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dcg)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfj.G)) {
         a($$0, $$3, $$2, dth.b);
      }
   }

   private static void a(dcg $$0, ja $$1, jf $$2, dth $$3) {
      dsk $$4 = dfj.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eoi.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dsk $$0, dcg $$1, ja $$2) {
      ja $$4;
      ja $$3;
      if ($$0.c(b) == jf.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, jf.a, dth.a);
      a($$1, $$3, jf.b, dth.a);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dcf $$0, ja $$1, dsk $$2, eog $$3) {
      ewf $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eog $$9 = a($$0, $$3);
      lh $$10 = $$9.a(awc.b) ? lj.aL : lj.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ja a(dsk $$0, dcg $$1, ja $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jf $$5 = $$0.c(b);
         BiPredicate<ja, dsk> $$6 = ($$1x, $$2x) -> $$2x.a(dfj.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jf b(dci $$0, ja $$1, jf $$2) {
      jf $$3;
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

   private static dth a(dci $$0, ja $$1, jf $$2, boolean $$3) {
      jf $$4 = $$2.g();
      dsk $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dth.a ? dth.b : dth.a;
      } else if (!b($$5, $$2)) {
         return dth.b;
      } else {
         dth $$6 = $$5.c(c);
         if ($$6 != dth.b && $$6 != dth.a) {
            dsk $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dth.e : dth.d;
         } else {
            return dth.c;
         }
      }
   }

   public static boolean m(dsk $$0) {
      return n($$0) && $$0.c(c) == dth.b && !$$0.c(d);
   }

   private static boolean b(dsk $$0, aqm $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      ja $$4 = $$2.a($$3);
      dsk $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ja> a(dcf $$0, ja $$1, dsk $$2, int $$3) {
      jf $$4 = $$2.c(b);
      BiPredicate<ja, dsk> $$5 = ($$1x, $$2x) -> $$2x.a(dfj.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dfj.st), $$3);
   }

   private static boolean c(dci $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2.g());
      dsk $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dsk $$0, boolean $$1) {
      if (!$$0.a(dfj.st)) {
         return false;
      } else {
         dth $$2 = $$0.c(c);
         return $$2 == dth.b || $$1 && $$2 == dth.a;
      }
   }

   private static boolean a(dsk $$0, jf $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dsk $$0) {
      return b($$0, jf.a);
   }

   private static boolean o(dsk $$0) {
      return b($$0, jf.b);
   }

   private static boolean b(dsk $$0, dci $$1, ja $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dfj.st);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   private static boolean b(dsk $$0, jf $$1) {
      return $$0.a(dfj.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ja a(dcf $$0, ja $$1, eog $$2) {
      Predicate<dsk> $$3 = $$1x -> $$1x.b() instanceof dea && ((dea)$$1x.b()).a($$2);
      BiPredicate<ja, dsk> $$4 = ($$1x, $$2x) -> a((dbl)$$0, $$1x, $$2x);
      return a($$0, $$1, jf.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ja a(dcf $$0, ja $$1) {
      BiPredicate<ja, dsk> $$2 = ($$1x, $$2x) -> a((dbl)$$0, $$1x, $$2x);
      return a($$0, $$1, jf.b.f(), $$2, dkz::m, 11).orElse(null);
   }

   public static eog a(aqm $$0, ja $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dkz::a).orElse(eoi.a);
   }

   private static Optional<dkz.a> b(dcf $$0, ja $$1, dsk $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ja $$2x = $$1x.c();
         dsk $$3 = $$0.a_($$2x);
         eog $$4;
         if ($$3.a(dfj.sI) && !$$0.D_().i()) {
            $$4 = eoi.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dkz.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eog $$0) {
      return $$0 == eoi.e || $$0 == eoi.c;
   }

   private static boolean a(dsk $$0, dsk $$1) {
      return $$0.a(dfj.su) && $$1.a(dfj.G) && $$1.u().b();
   }

   private static eog a(dcf $$0, eog $$1) {
      if ($$1.a(eoi.a)) {
         return $$0.D_().i() ? eoi.e : eoi.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ja> a(dcg $$0, ja $$1, jf.b $$2, BiPredicate<ja, dsk> $$3, Predicate<dsk> $$4, int $$5) {
      jf $$6 = jf.a($$2, jf.a.b);
      ja.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dsk $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbl $$0, ja $$1, dsk $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ewy $$3 = $$2.k($$0, $$1);
         return !ewv.c(T, $$3, ewj.i);
      }
   }

   static record a(ja a, eog b, dsk c) {
   }
}
