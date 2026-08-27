import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cya extends csk implements cvb, czl {
   public static final dfs a = dfo.bm;
   public static final dfw<dfv> b = dfo.bn;
   public static final dfp c = dfo.C;
   private static final int d = 11;
   private static final int e = 2;
   private static final float f = 0.02F;
   private static final float g = 0.12F;
   private static final int h = 11;
   private static final float i = 0.17578125F;
   private static final float j = 0.05859375F;
   private static final double k = 0.6;
   private static final float l = 1.0F;
   private static final int m = 40;
   private static final int n = 6;
   private static final float D = 2.0F;
   private static final int E = 2;
   private static final float F = 5.0F;
   private static final float G = 0.011377778F;
   private static final int H = 7;
   private static final int I = 10;
   private static final float J = 0.6875F;
   private static final ehy K = csk.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehy L = csk.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ehy M = csk.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehy N = csk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ehy O = csk.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehy P = csk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float Q = 0.125F;
   private static final ehy R = csk.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cya(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.b).a(b, dfv.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      if ($$1 != hb.b && $$1 != hb.a) {
         return $$0;
      } else {
         hb $$6 = $$0.c(a);
         if ($$6 == hb.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cpn)$$3, $$4)) {
            if ($$6 == hb.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == dfv.a;
            dfv $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      gv $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof ccp && $$3.dn().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      if ($$1.c(a) == hb.b && $$1.c(b) == dfv.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (o($$0) && !this.a($$0, (cpn)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cpn)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dey $$0, aki $$1, gv $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cpn)$$1, $$2)) {
            Optional<cya.a> $$4 = b((cpk)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eaa $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eac.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eac.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gv $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(csl.rH) && $$5 == eac.c) {
                        dey $$10 = csl.dR.n();
                        $$1.b($$4.get().a, $$10);
                        csk.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dji.c, $$4.get().a, dji.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gv $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dey $$14 = $$1.a_($$11);
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
   public dey a(cle $$0) {
      cpl $$1 = $$0.q();
      gv $$2 = $$0.a();
      hb $$3 = $$0.e().g();
      hb $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dfv $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == eac.c));
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return ehv.a();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      dfv $$4 = $$0.c(b);
      ehy $$5;
      if ($$4 == dfv.a) {
         $$5 = K;
      } else if ($$4 == dfv.b) {
         if ($$0.c(a) == hb.a) {
            $$5 = M;
         } else {
            $$5 = L;
         }
      } else if ($$4 == dfv.c) {
         $$5 = N;
      } else if ($$4 == dfv.d) {
         $$5 = O;
      } else {
         $$5 = P;
      }

      ehf $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dey $$0, coq $$1, gv $$2) {
      return false;
   }

   @Override
   public float al_() {
      return 0.125F;
   }

   @Override
   public void a(cpk $$0, gv $$1, byd $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bhe a(big $$0) {
      return $$0.dL().c($$0);
   }

   private static void a(dey $$0, aki $$1, gv $$2) {
      gv.a $$3 = $$2.j();
      dey $$4 = $$0;

      while (n($$4)) {
         byd $$5 = byd.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(hb.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dey $$0, aki $$1, gv $$2, art $$3) {
      dey $$4 = $$1.a_($$2.b(1));
      dey $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gv $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dey $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, hb.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aki $$0, gv $$1) {
      gv.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(hb.a);
         dey $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, hb.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, hb.b);
            return;
         }

         if (c($$0, $$2, hb.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), hb.b);
            return;
         }

         if (!b((coq)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aki $$0, gv $$1, hb $$2) {
      gv $$3 = $$1.a($$2);
      dey $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cpl)$$0, $$3);
      } else if ($$4.i() || $$4.a(csl.G)) {
         a($$0, $$3, $$2, dfv.b);
      }
   }

   private static void a(cpl $$0, gv $$1, hb $$2, dfv $$3) {
      dey $$4 = csl.rs.n().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == eac.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dey $$0, cpl $$1, gv $$2) {
      gv $$4;
      gv $$3;
      if ($$0.c(a) == hb.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, hb.a, dfv.a);
      a($$1, $$3, hb.b, dfv.a);
   }

   public static void a(cpk $$0, gv $$1, dey $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cpk $$0, gv $$1, dey $$2, eaa $$3) {
      ehf $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eaa $$9 = a($$0, $$3);
      iu $$10 = $$9.a(apo.b) ? iw.aF : iw.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gv a(dey $$0, cpl $$1, gv $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         hb $$5 = $$0.c(a);
         BiPredicate<gv, dey> $$6 = ($$1x, $$2x) -> $$2x.a(csl.rs) && $$2x.c(a) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static hb b(cpn $$0, gv $$1, hb $$2) {
      hb $$3;
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

   private static dfv a(cpn $$0, gv $$1, hb $$2, boolean $$3) {
      hb $$4 = $$2.g();
      dey $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != dfv.a ? dfv.b : dfv.a;
      } else if (!b($$5, $$2)) {
         return dfv.b;
      } else {
         dfv $$6 = $$5.c(b);
         if ($$6 != dfv.b && $$6 != dfv.a) {
            dey $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dfv.e : dfv.d;
         } else {
            return dfv.c;
         }
      }
   }

   public static boolean h(dey $$0) {
      return n($$0) && $$0.c(b) == dfv.b && !$$0.c(c);
   }

   private static boolean b(dey $$0, aki $$1, gv $$2) {
      hb $$3 = $$0.c(a);
      gv $$4 = $$2.a($$3);
      dey $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gv> a(cpk $$0, gv $$1, dey $$2, int $$3) {
      hb $$4 = $$2.c(a);
      BiPredicate<gv, dey> $$5 = ($$1x, $$2x) -> $$2x.a(csl.rs) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(csl.rs), $$3);
   }

   private static boolean c(cpn $$0, gv $$1, hb $$2) {
      gv $$3 = $$1.a($$2.g());
      dey $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dey $$0, boolean $$1) {
      if (!$$0.a(csl.rs)) {
         return false;
      } else {
         dfv $$2 = $$0.c(b);
         return $$2 == dfv.b || $$1 && $$2 == dfv.a;
      }
   }

   private static boolean a(dey $$0, hb $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(dey $$0) {
      return b($$0, hb.a);
   }

   private static boolean o(dey $$0) {
      return b($$0, hb.b);
   }

   private static boolean b(dey $$0, cpn $$1, gv $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(csl.rs);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   private static boolean b(dey $$0, hb $$1) {
      return $$0.a(csl.rs) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gv a(cpk $$0, gv $$1, eaa $$2) {
      Predicate<dey> $$3 = $$1x -> $$1x.b() instanceof crd && ((crd)$$1x.b()).a($$2);
      BiPredicate<gv, dey> $$4 = ($$1x, $$2x) -> b((coq)$$0, $$1x, $$2x);
      return a($$0, $$1, hb.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gv a(cpk $$0, gv $$1) {
      BiPredicate<gv, dey> $$2 = ($$1x, $$2x) -> b((coq)$$0, $$1x, $$2x);
      return a($$0, $$1, hb.b.f(), $$2, cya::h, 11).orElse(null);
   }

   public static eaa a(aki $$0, gv $$1) {
      return b((cpk)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cya::a).orElse(eac.a);
   }

   private static Optional<cya.a> b(cpk $$0, gv $$1, dey $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gv $$2x = $$1x.c();
         dey $$3 = $$0.a_($$2x);
         eaa $$4;
         if ($$3.a(csl.rH) && !$$0.x_().i()) {
            $$4 = eac.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cya.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eaa $$0) {
      return $$0 == eac.e || $$0 == eac.c;
   }

   private static boolean a(dey $$0, dey $$1) {
      return $$0.a(csl.rt) && $$1.a(csl.G) && $$1.u().b();
   }

   private static eaa a(cpk $$0, eaa $$1) {
      if ($$1.a(eac.a)) {
         return $$0.x_().i() ? eac.e : eac.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gv> a(cpl $$0, gv $$1, hb.b $$2, BiPredicate<gv, dey> $$3, Predicate<dey> $$4, int $$5) {
      hb $$6 = hb.a($$2, hb.a.b);
      gv.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dey $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(coq $$0, gv $$1, dey $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ehy $$3 = $$2.k($$0, $$1);
         return !ehv.c(R, $$3, ehj.i);
      }
   }

   static record a(gv a, eaa b, dey c) {
   }
}
