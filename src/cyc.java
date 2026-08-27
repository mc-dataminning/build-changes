import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cyc extends csm implements cvd, czn {
   public static final dfu a = dfq.bm;
   public static final dfy<dfx> b = dfq.bn;
   public static final dfr c = dfq.C;
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
   private static final ehx K = csm.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehx L = csm.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ehx M = csm.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehx N = csm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ehx O = csm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehx P = csm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float Q = 0.125F;
   private static final ehx R = csm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cyc(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.b).a(b, dfx.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      if ($$1 != ha.b && $$1 != ha.a) {
         return $$0;
      } else {
         ha $$6 = $$0.c(a);
         if ($$6 == ha.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cpp)$$3, $$4)) {
            if ($$6 == ha.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == dfx.a;
            dfx $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof ccr && $$3.dn().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      if ($$1.c(a) == ha.b && $$1.c(b) == dfx.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (o($$0) && !this.a($$0, (cpp)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cpp)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dfa $$0, akk $$1, gu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cpp)$$1, $$2)) {
            Optional<cyc.a> $$4 = b((cpm)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eac $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eae.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eae.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(csn.rH) && $$5 == eae.c) {
                        dfa $$10 = csn.dR.n();
                        $$1.b($$4.get().a, $$10);
                        csm.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(djk.c, $$4.get().a, djk.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dfa $$14 = $$1.a_($$11);
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
   public dfa a(clg $$0) {
      cpn $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.e().g();
      ha $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dfx $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == eae.c));
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return ehu.a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      dfx $$4 = $$0.c(b);
      ehx $$5;
      if ($$4 == dfx.a) {
         $$5 = K;
      } else if ($$4 == dfx.b) {
         if ($$0.c(a) == ha.a) {
            $$5 = M;
         } else {
            $$5 = L;
         }
      } else if ($$4 == dfx.c) {
         $$5 = N;
      } else if ($$4 == dfx.d) {
         $$5 = O;
      } else {
         $$5 = P;
      }

      ehe $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dfa $$0, cos $$1, gu $$2) {
      return false;
   }

   @Override
   public float al_() {
      return 0.125F;
   }

   @Override
   public void a(cpm $$0, gu $$1, byf $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bhg a(bii $$0) {
      return $$0.dL().c($$0);
   }

   private static void a(dfa $$0, akk $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      dfa $$4 = $$0;

      while (n($$4)) {
         byf $$5 = byf.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ha.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dfa $$0, akk $$1, gu $$2, aru $$3) {
      dfa $$4 = $$1.a_($$2.b(1));
      dfa $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dfa $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ha.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(akk $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ha.a);
         dfa $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ha.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ha.b);
            return;
         }

         if (c($$0, $$2, ha.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), ha.b);
            return;
         }

         if (!b((cos)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(akk $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      dfa $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cpn)$$0, $$3);
      } else if ($$4.i() || $$4.a(csn.G)) {
         a($$0, $$3, $$2, dfx.b);
      }
   }

   private static void a(cpn $$0, gu $$1, ha $$2, dfx $$3) {
      dfa $$4 = csn.rs.n().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == eae.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dfa $$0, cpn $$1, gu $$2) {
      gu $$4;
      gu $$3;
      if ($$0.c(a) == ha.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ha.a, dfx.a);
      a($$1, $$3, ha.b, dfx.a);
   }

   public static void a(cpm $$0, gu $$1, dfa $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cpm $$0, gu $$1, dfa $$2, eac $$3) {
      ehe $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eac $$9 = a($$0, $$3);
      it $$10 = $$9.a(apq.b) ? iv.aF : iv.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gu a(dfa $$0, cpn $$1, gu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ha $$5 = $$0.c(a);
         BiPredicate<gu, dfa> $$6 = ($$1x, $$2x) -> $$2x.a(csn.rs) && $$2x.c(a) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ha b(cpp $$0, gu $$1, ha $$2) {
      ha $$3;
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

   private static dfx a(cpp $$0, gu $$1, ha $$2, boolean $$3) {
      ha $$4 = $$2.g();
      dfa $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != dfx.a ? dfx.b : dfx.a;
      } else if (!b($$5, $$2)) {
         return dfx.b;
      } else {
         dfx $$6 = $$5.c(b);
         if ($$6 != dfx.b && $$6 != dfx.a) {
            dfa $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dfx.e : dfx.d;
         } else {
            return dfx.c;
         }
      }
   }

   public static boolean h(dfa $$0) {
      return n($$0) && $$0.c(b) == dfx.b && !$$0.c(c);
   }

   private static boolean b(dfa $$0, akk $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3);
      dfa $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gu> a(cpm $$0, gu $$1, dfa $$2, int $$3) {
      ha $$4 = $$2.c(a);
      BiPredicate<gu, dfa> $$5 = ($$1x, $$2x) -> $$2x.a(csn.rs) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(csn.rs), $$3);
   }

   private static boolean c(cpp $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2.g());
      dfa $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dfa $$0, boolean $$1) {
      if (!$$0.a(csn.rs)) {
         return false;
      } else {
         dfx $$2 = $$0.c(b);
         return $$2 == dfx.b || $$1 && $$2 == dfx.a;
      }
   }

   private static boolean a(dfa $$0, ha $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(dfa $$0) {
      return b($$0, ha.a);
   }

   private static boolean o(dfa $$0) {
      return b($$0, ha.b);
   }

   private static boolean b(dfa $$0, cpp $$1, gu $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(csn.rs);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   private static boolean b(dfa $$0, ha $$1) {
      return $$0.a(csn.rs) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gu a(cpm $$0, gu $$1, eac $$2) {
      Predicate<dfa> $$3 = $$1x -> $$1x.b() instanceof crf && ((crf)$$1x.b()).a($$2);
      BiPredicate<gu, dfa> $$4 = ($$1x, $$2x) -> b((cos)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gu a(cpm $$0, gu $$1) {
      BiPredicate<gu, dfa> $$2 = ($$1x, $$2x) -> b((cos)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.b.f(), $$2, cyc::h, 11).orElse(null);
   }

   public static eac a(akk $$0, gu $$1) {
      return b((cpm)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cyc::a).orElse(eae.a);
   }

   private static Optional<cyc.a> b(cpm $$0, gu $$1, dfa $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gu $$2x = $$1x.c();
         dfa $$3 = $$0.a_($$2x);
         eac $$4;
         if ($$3.a(csn.rH) && !$$0.x_().i()) {
            $$4 = eae.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cyc.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eac $$0) {
      return $$0 == eae.e || $$0 == eae.c;
   }

   private static boolean a(dfa $$0, dfa $$1) {
      return $$0.a(csn.rt) && $$1.a(csn.G) && $$1.u().b();
   }

   private static eac a(cpm $$0, eac $$1) {
      if ($$1.a(eae.a)) {
         return $$0.x_().i() ? eae.e : eae.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gu> a(cpn $$0, gu $$1, ha.b $$2, BiPredicate<gu, dfa> $$3, Predicate<dfa> $$4, int $$5) {
      ha $$6 = ha.a($$2, ha.a.b);
      gu.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dfa $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(cos $$0, gu $$1, dfa $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ehx $$3 = $$2.k($$0, $$1);
         return !ehu.c(R, $$3, ehi.i);
      }
   }

   static record a(gu a, eac b, dfa c) {
   }
}
