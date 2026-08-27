import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cyb extends csl implements cvc, czm {
   public static final dft a = dfp.bm;
   public static final dfx<dfw> b = dfp.bn;
   public static final dfq c = dfp.C;
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
   private static final ehw K = csl.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehw L = csl.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ehw M = csl.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ehw N = csl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ehw O = csl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehw P = csl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float Q = 0.125F;
   private static final ehw R = csl.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cyb(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.b).a(b, dfw.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      if ($$1 != ha.b && $$1 != ha.a) {
         return $$0;
      } else {
         ha $$6 = $$0.c(a);
         if ($$6 == ha.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cpo)$$3, $$4)) {
            if ($$6 == ha.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == dfw.a;
            dfw $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof ccq && $$3.dn().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      if ($$1.c(a) == ha.b && $$1.c(b) == dfw.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (o($$0) && !this.a($$0, (cpo)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cpo)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dez $$0, akk $$1, gu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cpo)$$1, $$2)) {
            Optional<cyb.a> $$4 = b((cpl)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eab $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ead.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ead.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(csm.rH) && $$5 == ead.c) {
                        dez $$10 = csm.dR.n();
                        $$1.b($$4.get().a, $$10);
                        csl.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(djj.c, $$4.get().a, djj.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dez $$14 = $$1.a_($$11);
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
   public dez a(clf $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.e().g();
      ha $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dfw $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == ead.c));
      }
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(c) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return eht.a();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      dfw $$4 = $$0.c(b);
      ehw $$5;
      if ($$4 == dfw.a) {
         $$5 = K;
      } else if ($$4 == dfw.b) {
         if ($$0.c(a) == ha.a) {
            $$5 = M;
         } else {
            $$5 = L;
         }
      } else if ($$4 == dfw.c) {
         $$5 = N;
      } else if ($$4 == dfw.d) {
         $$5 = O;
      } else {
         $$5 = P;
      }

      ehd $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dez $$0, cor $$1, gu $$2) {
      return false;
   }

   @Override
   public float ak_() {
      return 0.125F;
   }

   @Override
   public void a(cpl $$0, gu $$1, bye $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bhg a(bii $$0) {
      return $$0.dL().c($$0);
   }

   private static void a(dez $$0, akk $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      dez $$4 = $$0;

      while (n($$4)) {
         bye $$5 = bye.a($$1, $$3, $$4);
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
   public static void c(dez $$0, akk $$1, gu $$2, aru $$3) {
      dez $$4 = $$1.a_($$2.b(1));
      dez $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dez $$7 = $$1.a_($$6);
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
         dez $$4 = $$0.a_($$2);
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

         if (!b((cor)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(akk $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      dez $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cpm)$$0, $$3);
      } else if ($$4.i() || $$4.a(csm.G)) {
         a($$0, $$3, $$2, dfw.b);
      }
   }

   private static void a(cpm $$0, gu $$1, ha $$2, dfw $$3) {
      dez $$4 = csm.rs.n().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == ead.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dez $$0, cpm $$1, gu $$2) {
      gu $$4;
      gu $$3;
      if ($$0.c(a) == ha.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ha.a, dfw.a);
      a($$1, $$3, ha.b, dfw.a);
   }

   public static void a(cpl $$0, gu $$1, dez $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cpl $$0, gu $$1, dez $$2, eab $$3) {
      ehd $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eab $$9 = a($$0, $$3);
      it $$10 = $$9.a(apq.b) ? iv.aF : iv.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gu a(dez $$0, cpm $$1, gu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ha $$5 = $$0.c(a);
         BiPredicate<gu, dez> $$6 = ($$1x, $$2x) -> $$2x.a(csm.rs) && $$2x.c(a) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ha b(cpo $$0, gu $$1, ha $$2) {
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

   private static dfw a(cpo $$0, gu $$1, ha $$2, boolean $$3) {
      ha $$4 = $$2.g();
      dez $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != dfw.a ? dfw.b : dfw.a;
      } else if (!b($$5, $$2)) {
         return dfw.b;
      } else {
         dfw $$6 = $$5.c(b);
         if ($$6 != dfw.b && $$6 != dfw.a) {
            dez $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dfw.e : dfw.d;
         } else {
            return dfw.c;
         }
      }
   }

   public static boolean h(dez $$0) {
      return n($$0) && $$0.c(b) == dfw.b && !$$0.c(c);
   }

   private static boolean b(dez $$0, akk $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3);
      dez $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gu> a(cpl $$0, gu $$1, dez $$2, int $$3) {
      ha $$4 = $$2.c(a);
      BiPredicate<gu, dez> $$5 = ($$1x, $$2x) -> $$2x.a(csm.rs) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(csm.rs), $$3);
   }

   private static boolean c(cpo $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2.g());
      dez $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dez $$0, boolean $$1) {
      if (!$$0.a(csm.rs)) {
         return false;
      } else {
         dfw $$2 = $$0.c(b);
         return $$2 == dfw.b || $$1 && $$2 == dfw.a;
      }
   }

   private static boolean a(dez $$0, ha $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(dez $$0) {
      return b($$0, ha.a);
   }

   private static boolean o(dez $$0) {
      return b($$0, ha.b);
   }

   private static boolean b(dez $$0, cpo $$1, gu $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(csm.rs);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   private static boolean b(dez $$0, ha $$1) {
      return $$0.a(csm.rs) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gu a(cpl $$0, gu $$1, eab $$2) {
      Predicate<dez> $$3 = $$1x -> $$1x.b() instanceof cre && ((cre)$$1x.b()).a($$2);
      BiPredicate<gu, dez> $$4 = ($$1x, $$2x) -> b((cor)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gu a(cpl $$0, gu $$1) {
      BiPredicate<gu, dez> $$2 = ($$1x, $$2x) -> b((cor)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.b.f(), $$2, cyb::h, 11).orElse(null);
   }

   public static eab a(akk $$0, gu $$1) {
      return b((cpl)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cyb::a).orElse(ead.a);
   }

   private static Optional<cyb.a> b(cpl $$0, gu $$1, dez $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gu $$2x = $$1x.c();
         dez $$3 = $$0.a_($$2x);
         eab $$4;
         if ($$3.a(csm.rH) && !$$0.x_().i()) {
            $$4 = ead.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cyb.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eab $$0) {
      return $$0 == ead.e || $$0 == ead.c;
   }

   private static boolean a(dez $$0, dez $$1) {
      return $$0.a(csm.rt) && $$1.a(csm.G) && $$1.u().b();
   }

   private static eab a(cpl $$0, eab $$1) {
      if ($$1.a(ead.a)) {
         return $$0.x_().i() ? ead.e : ead.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gu> a(cpm $$0, gu $$1, ha.b $$2, BiPredicate<gu, dez> $$3, Predicate<dez> $$4, int $$5) {
      ha $$6 = ha.a($$2, ha.a.b);
      gu.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dez $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(cor $$0, gu $$1, dez $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ehw $$3 = $$2.k($$0, $$1);
         return !eht.c(R, $$3, ehh.i);
      }
   }

   static record a(gu a, eab b, dez c) {
   }
}
