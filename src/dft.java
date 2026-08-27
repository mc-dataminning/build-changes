import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dft extends dac implements dcx, dhc {
   public static final MapCodec<dft> a = b(dft::new);
   public static final dnv b = dnr.bm;
   public static final dnz<dny> c = dnr.bn;
   public static final dns d = dnr.C;
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
   private static final eqm M = dac.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eqm N = dac.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eqm O = dac.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eqm P = dac.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eqm Q = dac.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eqm R = dac.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eqm T = dac.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.b).a(c, dny.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      if ($$1 != ih.b && $$1 != ih.a) {
         return $$0;
      } else {
         ih $$6 = $$0.c(b);
         if ($$6 == ih.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cxe)$$3, $$4)) {
            if ($$6 == ih.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dny.a;
            dny $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cjz && $$3.dp().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      if ($$1.c(b) == ih.b && $$1.c(c) == dny.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (o($$0) && !this.a($$0, (cxe)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cxe)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dnb $$0, apf $$1, ib $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cxe)$$1, $$2)) {
            Optional<dft.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eio $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eiq.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eiq.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ib $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dae.sI) && $$5 == eiq.c) {
                        dnb $$10 = dae.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dac.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(drp.c, $$4.get().a, drp.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ib $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dnb $$14 = $$1.a_($$11);
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
   public dnb a(csu $$0) {
      cxc $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.e().g();
      ih $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dny $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eiq.c));
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return eqj.a();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      dny $$4 = $$0.c(c);
      eqm $$5;
      if ($$4 == dny.a) {
         $$5 = M;
      } else if ($$4 == dny.b) {
         if ($$0.c(b) == ih.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dny.c) {
         $$5 = P;
      } else if ($$4 == dny.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ept $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dnb $$0, cwh $$1, ib $$2) {
      return false;
   }

   @Override
   protected float au_() {
      return 0.125F;
   }

   @Override
   public void a(cxb $$0, ib $$1, cfd $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bnw a(box $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dnb $$0, apf $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      dnb $$4 = $$0;

      while (n($$4)) {
         cfd $$5 = cfd.a($$1, $$3, $$4);
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
   public static void c(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dnb $$4 = $$1.a_($$2.b(1));
      dnb $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ib $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dnb $$7 = $$1.a_($$6);
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

   private static void b(apf $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ih.a);
         dnb $$4 = $$0.a_($$2);
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

         if (!a((cwh)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(apf $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      dnb $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cxc)$$0, $$3);
      } else if ($$4.i() || $$4.a(dae.G)) {
         a($$0, $$3, $$2, dny.b);
      }
   }

   private static void a(cxc $$0, ib $$1, ih $$2, dny $$3) {
      dnb $$4 = dae.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eiq.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dnb $$0, cxc $$1, ib $$2) {
      ib $$4;
      ib $$3;
      if ($$0.c(b) == ih.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ih.a, dny.a);
      a($$1, $$3, ih.b, dny.a);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cxb $$0, ib $$1, dnb $$2, eio $$3) {
      ept $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eio $$9 = a($$0, $$3);
      ka $$10 = $$9.a(aus.b) ? kc.aJ : kc.aL;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ib a(dnb $$0, cxc $$1, ib $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ih $$5 = $$0.c(b);
         BiPredicate<ib, dnb> $$6 = ($$1x, $$2x) -> $$2x.a(dae.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ih b(cxe $$0, ib $$1, ih $$2) {
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

   private static dny a(cxe $$0, ib $$1, ih $$2, boolean $$3) {
      ih $$4 = $$2.g();
      dnb $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dny.a ? dny.b : dny.a;
      } else if (!b($$5, $$2)) {
         return dny.b;
      } else {
         dny $$6 = $$5.c(c);
         if ($$6 != dny.b && $$6 != dny.a) {
            dnb $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dny.e : dny.d;
         } else {
            return dny.c;
         }
      }
   }

   public static boolean m(dnb $$0) {
      return n($$0) && $$0.c(c) == dny.b && !$$0.c(d);
   }

   private static boolean b(dnb $$0, apf $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      ib $$4 = $$2.a($$3);
      dnb $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ib> a(cxb $$0, ib $$1, dnb $$2, int $$3) {
      ih $$4 = $$2.c(b);
      BiPredicate<ib, dnb> $$5 = ($$1x, $$2x) -> $$2x.a(dae.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dae.st), $$3);
   }

   private static boolean c(cxe $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2.g());
      dnb $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dnb $$0, boolean $$1) {
      if (!$$0.a(dae.st)) {
         return false;
      } else {
         dny $$2 = $$0.c(c);
         return $$2 == dny.b || $$1 && $$2 == dny.a;
      }
   }

   private static boolean a(dnb $$0, ih $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dnb $$0) {
      return b($$0, ih.a);
   }

   private static boolean o(dnb $$0) {
      return b($$0, ih.b);
   }

   private static boolean b(dnb $$0, cxe $$1, ib $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dae.st);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   private static boolean b(dnb $$0, ih $$1) {
      return $$0.a(dae.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ib a(cxb $$0, ib $$1, eio $$2) {
      Predicate<dnb> $$3 = $$1x -> $$1x.b() instanceof cyv && ((cyv)$$1x.b()).a($$2);
      BiPredicate<ib, dnb> $$4 = ($$1x, $$2x) -> a((cwh)$$0, $$1x, $$2x);
      return a($$0, $$1, ih.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ib a(cxb $$0, ib $$1) {
      BiPredicate<ib, dnb> $$2 = ($$1x, $$2x) -> a((cwh)$$0, $$1x, $$2x);
      return a($$0, $$1, ih.b.f(), $$2, dft::m, 11).orElse(null);
   }

   public static eio a(apf $$0, ib $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dft::a).orElse(eiq.a);
   }

   private static Optional<dft.a> b(cxb $$0, ib $$1, dnb $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ib $$2x = $$1x.c();
         dnb $$3 = $$0.a_($$2x);
         eio $$4;
         if ($$3.a(dae.sI) && !$$0.D_().i()) {
            $$4 = eiq.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dft.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eio $$0) {
      return $$0 == eiq.e || $$0 == eiq.c;
   }

   private static boolean a(dnb $$0, dnb $$1) {
      return $$0.a(dae.su) && $$1.a(dae.G) && $$1.u().b();
   }

   private static eio a(cxb $$0, eio $$1) {
      if ($$1.a(eiq.a)) {
         return $$0.D_().i() ? eiq.e : eiq.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ib> a(cxc $$0, ib $$1, ih.b $$2, BiPredicate<ib, dnb> $$3, Predicate<dnb> $$4, int $$5) {
      ih $$6 = ih.a($$2, ih.a.b);
      ib.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dnb $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cwh $$0, ib $$1, dnb $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eqm $$3 = $$2.k($$0, $$1);
         return !eqj.c(T, $$3, epx.i);
      }
   }

   static record a(ib a, eio b, dnb c) {
   }
}
