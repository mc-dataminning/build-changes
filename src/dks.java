import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dks extends dfa implements dhv, dmb {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dsx b = dst.bm;
   public static final dtb<dta> c = dst.bn;
   public static final dsu d = dst.C;
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
   private static final ewl M = dfa.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewl N = dfa.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ewl O = dfa.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewl P = dfa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ewl Q = dfa.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewl R = dfa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ewl T = dfa.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.b).a(c, dta.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      if ($$1 != je.b && $$1 != je.a) {
         return $$0;
      } else {
         je $$6 = $$0.c(b);
         if ($$6 == je.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcc)$$3, $$4)) {
            if ($$6 == je.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dta.a;
            dta $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cod && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      if ($$1.c(b) == je.b && $$1.c(c) == dta.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (o($$0) && !this.a($$0, (dcc)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dcc)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dsd $$0, arf $$1, iz $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dcc)$$1, $$2)) {
            Optional<dks.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               env $$5 = $$4.get().b;
               float $$6;
               if ($$5 == enx.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != enx.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iz $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfc.sI) && $$5 == enx.c) {
                        dsd $$10 = dfc.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dfa.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dww.c, $$4.get().a, dww.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iz $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dsd $$14 = $$1.a_($$11);
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
   public dsd a(cyb $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.e().g();
      je $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dta $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == enx.c));
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return ewi.a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      dta $$4 = $$0.c(c);
      ewl $$5;
      if ($$4 == dta.a) {
         $$5 = M;
      } else if ($$4 == dta.b) {
         if ($$0.c(b) == je.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dta.c) {
         $$5 = P;
      } else if ($$4 == dta.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      evs $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Override
   protected float aq_() {
      return 0.125F;
   }

   @Override
   public void a(dbz $$0, iz $$1, cjh $$2) {
      if (!$$2.aW()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bro a(bsv $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(dsd $$0, arf $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dsd $$4 = $$0;

      while (n($$4)) {
         cjh $$5 = cjh.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(je.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dsd $$4 = $$1.a_($$2.b(1));
      dsd $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iz $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dsd $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, je.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arf $$0, iz $$1) {
      iz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(je.a);
         dsd $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, je.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, je.b);
            return;
         }

         if (c($$0, $$2, je.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), je.b);
            return;
         }

         if (!a((dbf)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arf $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      dsd $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dca)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfc.G)) {
         a($$0, $$3, $$2, dta.b);
      }
   }

   private static void a(dca $$0, iz $$1, je $$2, dta $$3) {
      dsd $$4 = dfc.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == enx.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dsd $$0, dca $$1, iz $$2) {
      iz $$4;
      iz $$3;
      if ($$0.c(b) == je.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, je.a, dta.a);
      a($$1, $$3, je.b, dta.a);
   }

   public static void a(dbz $$0, iz $$1, dsd $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dbz $$0, iz $$1, dsd $$2, env $$3) {
      evs $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      env $$9 = a($$0, $$3);
      lg $$10 = $$9.a(awv.b) ? li.aL : li.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iz a(dsd $$0, dca $$1, iz $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         je $$5 = $$0.c(b);
         BiPredicate<iz, dsd> $$6 = ($$1x, $$2x) -> $$2x.a(dfc.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static je b(dcc $$0, iz $$1, je $$2) {
      je $$3;
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

   private static dta a(dcc $$0, iz $$1, je $$2, boolean $$3) {
      je $$4 = $$2.g();
      dsd $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dta.a ? dta.b : dta.a;
      } else if (!b($$5, $$2)) {
         return dta.b;
      } else {
         dta $$6 = $$5.c(c);
         if ($$6 != dta.b && $$6 != dta.a) {
            dsd $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dta.e : dta.d;
         } else {
            return dta.c;
         }
      }
   }

   public static boolean m(dsd $$0) {
      return n($$0) && $$0.c(c) == dta.b && !$$0.c(d);
   }

   private static boolean b(dsd $$0, arf $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3);
      dsd $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iz> a(dbz $$0, iz $$1, dsd $$2, int $$3) {
      je $$4 = $$2.c(b);
      BiPredicate<iz, dsd> $$5 = ($$1x, $$2x) -> $$2x.a(dfc.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dfc.st), $$3);
   }

   private static boolean c(dcc $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsd $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dsd $$0, boolean $$1) {
      if (!$$0.a(dfc.st)) {
         return false;
      } else {
         dta $$2 = $$0.c(c);
         return $$2 == dta.b || $$1 && $$2 == dta.a;
      }
   }

   private static boolean a(dsd $$0, je $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dsd $$0) {
      return b($$0, je.a);
   }

   private static boolean o(dsd $$0) {
      return b($$0, je.b);
   }

   private static boolean b(dsd $$0, dcc $$1, iz $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dfc.st);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   private static boolean b(dsd $$0, je $$1) {
      return $$0.a(dfc.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iz a(dbz $$0, iz $$1, env $$2) {
      Predicate<dsd> $$3 = $$1x -> $$1x.b() instanceof ddt && ((ddt)$$1x.b()).a($$2);
      BiPredicate<iz, dsd> $$4 = ($$1x, $$2x) -> a((dbf)$$0, $$1x, $$2x);
      return a($$0, $$1, je.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iz a(dbz $$0, iz $$1) {
      BiPredicate<iz, dsd> $$2 = ($$1x, $$2x) -> a((dbf)$$0, $$1x, $$2x);
      return a($$0, $$1, je.b.f(), $$2, dks::m, 11).orElse(null);
   }

   public static env a(arf $$0, iz $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dks::a).orElse(enx.a);
   }

   private static Optional<dks.a> b(dbz $$0, iz $$1, dsd $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iz $$2x = $$1x.c();
         dsd $$3 = $$0.a_($$2x);
         env $$4;
         if ($$3.a(dfc.sI) && !$$0.D_().i()) {
            $$4 = enx.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dks.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(env $$0) {
      return $$0 == enx.e || $$0 == enx.c;
   }

   private static boolean a(dsd $$0, dsd $$1) {
      return $$0.a(dfc.su) && $$1.a(dfc.G) && $$1.u().b();
   }

   private static env a(dbz $$0, env $$1) {
      if ($$1.a(enx.a)) {
         return $$0.D_().i() ? enx.e : enx.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iz> a(dca $$0, iz $$1, je.b $$2, BiPredicate<iz, dsd> $$3, Predicate<dsd> $$4, int $$5) {
      je $$6 = je.a($$2, je.a.b);
      iz.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dsd $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbf $$0, iz $$1, dsd $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ewl $$3 = $$2.k($$0, $$1);
         return !ewi.c(T, $$3, evw.i);
      }
   }

   static record a(iz a, env b, dsd c) {
   }
}
