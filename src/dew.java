import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dew extends czf implements dca, dgf {
   public static final MapCodec<dew> a = b(dew::new);
   public static final dmy b = dmu.bm;
   public static final dnc<dnb> c = dmu.bn;
   public static final dmv d = dmu.C;
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
   private static final epo M = czf.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final epo N = czf.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final epo O = czf.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final epo P = czf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final epo Q = czf.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final epo R = czf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final epo T = czf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.b).a(c, dnb.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      if ($$1 != ih.b && $$1 != ih.a) {
         return $$0;
      } else {
         ih $$6 = $$0.c(b);
         if ($$6 == ih.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cwh)$$3, $$4)) {
            if ($$6 == ih.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dnb.a;
            dnb $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cjf && $$3.dm().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      if ($$1.c(b) == ih.b && $$1.c(c) == dnb.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (o($$0) && !this.a($$0, (cwh)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cwh)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dme $$0, apa $$1, ib $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cwh)$$1, $$2)) {
            Optional<dew.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ehq $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ehs.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ehs.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ib $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(czh.sI) && $$5 == ehs.c) {
                        dme $$10 = czh.dR.o();
                        $$1.b($$4.get().a, $$10);
                        czf.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dqr.c, $$4.get().a, dqr.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ib $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dme $$14 = $$1.a_($$11);
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
   public dme a(crx $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.e().g();
      ih $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dnb $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == ehs.c));
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return epl.a();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      dnb $$4 = $$0.c(c);
      epo $$5;
      if ($$4 == dnb.a) {
         $$5 = M;
      } else if ($$4 == dnb.b) {
         if ($$0.c(b) == ih.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dnb.c) {
         $$5 = P;
      } else if ($$4 == dnb.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eov $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dme $$0, cvk $$1, ib $$2) {
      return false;
   }

   @Override
   protected float av_() {
      return 0.125F;
   }

   @Override
   public void a(cwe $$0, ib $$1, cek $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bne a(bof $$0) {
      return $$0.dK().c($$0);
   }

   private static void a(dme $$0, apa $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      dme $$4 = $$0;

      while (n($$4)) {
         cek $$5 = cek.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ih.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dme $$0, apa $$1, ib $$2, awt $$3) {
      dme $$4 = $$1.a_($$2.b(1));
      dme $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ib $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dme $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ih.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(apa $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ih.a);
         dme $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ih.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ih.b);
            return;
         }

         if (c($$0, $$2, ih.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ih.b);
            return;
         }

         if (!a((cvk)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(apa $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      dme $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cwf)$$0, $$3);
      } else if ($$4.i() || $$4.a(czh.G)) {
         a($$0, $$3, $$2, dnb.b);
      }
   }

   private static void a(cwf $$0, ib $$1, ih $$2, dnb $$3) {
      dme $$4 = czh.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == ehs.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dme $$0, cwf $$1, ib $$2) {
      ib $$4;
      ib $$3;
      if ($$0.c(b) == ih.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ih.a, dnb.a);
      a($$1, $$3, ih.b, dnb.a);
   }

   public static void a(cwe $$0, ib $$1, dme $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cwe $$0, ib $$1, dme $$2, ehq $$3) {
      eov $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ehq $$9 = a($$0, $$3);
      jz $$10 = $$9.a(auj.b) ? kb.aI : kb.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ib a(dme $$0, cwf $$1, ib $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ih $$5 = $$0.c(b);
         BiPredicate<ib, dme> $$6 = ($$1x, $$2x) -> $$2x.a(czh.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ih b(cwh $$0, ib $$1, ih $$2) {
      ih $$3;
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

   private static dnb a(cwh $$0, ib $$1, ih $$2, boolean $$3) {
      ih $$4 = $$2.g();
      dme $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dnb.a ? dnb.b : dnb.a;
      } else if (!b($$5, $$2)) {
         return dnb.b;
      } else {
         dnb $$6 = $$5.c(c);
         if ($$6 != dnb.b && $$6 != dnb.a) {
            dme $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dnb.e : dnb.d;
         } else {
            return dnb.c;
         }
      }
   }

   public static boolean m(dme $$0) {
      return n($$0) && $$0.c(c) == dnb.b && !$$0.c(d);
   }

   private static boolean b(dme $$0, apa $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      ib $$4 = $$2.a($$3);
      dme $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ib> a(cwe $$0, ib $$1, dme $$2, int $$3) {
      ih $$4 = $$2.c(b);
      BiPredicate<ib, dme> $$5 = ($$1x, $$2x) -> $$2x.a(czh.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(czh.st), $$3);
   }

   private static boolean c(cwh $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2.g());
      dme $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dme $$0, boolean $$1) {
      if (!$$0.a(czh.st)) {
         return false;
      } else {
         dnb $$2 = $$0.c(c);
         return $$2 == dnb.b || $$1 && $$2 == dnb.a;
      }
   }

   private static boolean a(dme $$0, ih $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dme $$0) {
      return b($$0, ih.a);
   }

   private static boolean o(dme $$0) {
      return b($$0, ih.b);
   }

   private static boolean b(dme $$0, cwh $$1, ib $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(czh.st);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   private static boolean b(dme $$0, ih $$1) {
      return $$0.a(czh.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ib a(cwe $$0, ib $$1, ehq $$2) {
      Predicate<dme> $$3 = $$1x -> $$1x.b() instanceof cxy && ((cxy)$$1x.b()).a($$2);
      BiPredicate<ib, dme> $$4 = ($$1x, $$2x) -> a((cvk)$$0, $$1x, $$2x);
      return a($$0, $$1, ih.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ib a(cwe $$0, ib $$1) {
      BiPredicate<ib, dme> $$2 = ($$1x, $$2x) -> a((cvk)$$0, $$1x, $$2x);
      return a($$0, $$1, ih.b.f(), $$2, dew::m, 11).orElse(null);
   }

   public static ehq a(apa $$0, ib $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dew::a).orElse(ehs.a);
   }

   private static Optional<dew.a> b(cwe $$0, ib $$1, dme $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ib $$2x = $$1x.c();
         dme $$3 = $$0.a_($$2x);
         ehq $$4;
         if ($$3.a(czh.sI) && !$$0.E_().i()) {
            $$4 = ehs.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dew.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ehq $$0) {
      return $$0 == ehs.e || $$0 == ehs.c;
   }

   private static boolean a(dme $$0, dme $$1) {
      return $$0.a(czh.su) && $$1.a(czh.G) && $$1.u().b();
   }

   private static ehq a(cwe $$0, ehq $$1) {
      if ($$1.a(ehs.a)) {
         return $$0.E_().i() ? ehs.e : ehs.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ib> a(cwf $$0, ib $$1, ih.b $$2, BiPredicate<ib, dme> $$3, Predicate<dme> $$4, int $$5) {
      ih $$6 = ih.a($$2, ih.a.b);
      ib.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dme $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cvk $$0, ib $$1, dme $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         epo $$3 = $$2.k($$0, $$1);
         return !epl.c(T, $$3, eoz.i);
      }
   }

   static record a(ib a, ehq b, dme c) {
   }
}
