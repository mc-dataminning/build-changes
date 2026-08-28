import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkr extends dez implements dhu, dma {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final dsw b = dss.bm;
   public static final dta<dsz> c = dss.bn;
   public static final dst d = dss.C;
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
   private static final ewk M = dez.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewk N = dez.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ewk O = dez.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ewk P = dez.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ewk Q = dez.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ewk R = dez.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ewk T = dez.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.b).a(c, dsz.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      if ($$1 != je.b && $$1 != je.a) {
         return $$0;
      } else {
         je $$6 = $$0.c(b);
         if ($$6 == je.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcb)$$3, $$4)) {
            if ($$6 == je.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dsz.a;
            dsz $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof coc && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      if ($$1.c(b) == je.b && $$1.c(c) == dsz.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (o($$0) && !this.a($$0, (dcb)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dcb)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dsc $$0, arf $$1, iz $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dcb)$$1, $$2)) {
            Optional<dkr.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               enu $$5 = $$4.get().b;
               float $$6;
               if ($$5 == enw.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != enw.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iz $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfb.sI) && $$5 == enw.c) {
                        dsc $$10 = dfb.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dez.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dwv.c, $$4.get().a, dwv.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iz $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dsc $$14 = $$1.a_($$11);
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
   public dsc a(cya $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.e().g();
      je $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dsz $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == enw.c));
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return ewh.a();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      dsz $$4 = $$0.c(c);
      ewk $$5;
      if ($$4 == dsz.a) {
         $$5 = M;
      } else if ($$4 == dsz.b) {
         if ($$0.c(b) == je.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dsz.c) {
         $$5 = P;
      } else if ($$4 == dsz.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      evr $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dsc $$0, dbe $$1, iz $$2) {
      return false;
   }

   @Override
   protected float aq_() {
      return 0.125F;
   }

   @Override
   public void a(dby $$0, iz $$1, cjg $$2) {
      if (!$$2.aW()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public brn a(bsu $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(dsc $$0, arf $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dsc $$4 = $$0;

      while (n($$4)) {
         cjg $$5 = cjg.a($$1, $$3, $$4);
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
   public static void c(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dsc $$4 = $$1.a_($$2.b(1));
      dsc $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iz $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dsc $$7 = $$1.a_($$6);
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
         dsc $$4 = $$0.a_($$2);
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

         if (!a((dbe)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arf $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      dsc $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dbz)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfb.G)) {
         a($$0, $$3, $$2, dsz.b);
      }
   }

   private static void a(dbz $$0, iz $$1, je $$2, dsz $$3) {
      dsc $$4 = dfb.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == enw.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dsc $$0, dbz $$1, iz $$2) {
      iz $$4;
      iz $$3;
      if ($$0.c(b) == je.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, je.a, dsz.a);
      a($$1, $$3, je.b, dsz.a);
   }

   public static void a(dby $$0, iz $$1, dsc $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dby $$0, iz $$1, dsc $$2, enu $$3) {
      evr $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      enu $$9 = a($$0, $$3);
      lg $$10 = $$9.a(awv.b) ? li.aL : li.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iz a(dsc $$0, dbz $$1, iz $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         je $$5 = $$0.c(b);
         BiPredicate<iz, dsc> $$6 = ($$1x, $$2x) -> $$2x.a(dfb.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static je b(dcb $$0, iz $$1, je $$2) {
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

   private static dsz a(dcb $$0, iz $$1, je $$2, boolean $$3) {
      je $$4 = $$2.g();
      dsc $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dsz.a ? dsz.b : dsz.a;
      } else if (!b($$5, $$2)) {
         return dsz.b;
      } else {
         dsz $$6 = $$5.c(c);
         if ($$6 != dsz.b && $$6 != dsz.a) {
            dsc $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dsz.e : dsz.d;
         } else {
            return dsz.c;
         }
      }
   }

   public static boolean m(dsc $$0) {
      return n($$0) && $$0.c(c) == dsz.b && !$$0.c(d);
   }

   private static boolean b(dsc $$0, arf $$1, iz $$2) {
      je $$3 = $$0.c(b);
      iz $$4 = $$2.a($$3);
      dsc $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iz> a(dby $$0, iz $$1, dsc $$2, int $$3) {
      je $$4 = $$2.c(b);
      BiPredicate<iz, dsc> $$5 = ($$1x, $$2x) -> $$2x.a(dfb.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dfb.st), $$3);
   }

   private static boolean c(dcb $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsc $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dsc $$0, boolean $$1) {
      if (!$$0.a(dfb.st)) {
         return false;
      } else {
         dsz $$2 = $$0.c(c);
         return $$2 == dsz.b || $$1 && $$2 == dsz.a;
      }
   }

   private static boolean a(dsc $$0, je $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dsc $$0) {
      return b($$0, je.a);
   }

   private static boolean o(dsc $$0) {
      return b($$0, je.b);
   }

   private static boolean b(dsc $$0, dcb $$1, iz $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dfb.st);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   private static boolean b(dsc $$0, je $$1) {
      return $$0.a(dfb.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iz a(dby $$0, iz $$1, enu $$2) {
      Predicate<dsc> $$3 = $$1x -> $$1x.b() instanceof dds && ((dds)$$1x.b()).a($$2);
      BiPredicate<iz, dsc> $$4 = ($$1x, $$2x) -> a((dbe)$$0, $$1x, $$2x);
      return a($$0, $$1, je.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iz a(dby $$0, iz $$1) {
      BiPredicate<iz, dsc> $$2 = ($$1x, $$2x) -> a((dbe)$$0, $$1x, $$2x);
      return a($$0, $$1, je.b.f(), $$2, dkr::m, 11).orElse(null);
   }

   public static enu a(arf $$0, iz $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dkr::a).orElse(enw.a);
   }

   private static Optional<dkr.a> b(dby $$0, iz $$1, dsc $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iz $$2x = $$1x.c();
         dsc $$3 = $$0.a_($$2x);
         enu $$4;
         if ($$3.a(dfb.sI) && !$$0.D_().i()) {
            $$4 = enw.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dkr.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(enu $$0) {
      return $$0 == enw.e || $$0 == enw.c;
   }

   private static boolean a(dsc $$0, dsc $$1) {
      return $$0.a(dfb.su) && $$1.a(dfb.G) && $$1.u().b();
   }

   private static enu a(dby $$0, enu $$1) {
      if ($$1.a(enw.a)) {
         return $$0.D_().i() ? enw.e : enw.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iz> a(dbz $$0, iz $$1, je.b $$2, BiPredicate<iz, dsc> $$3, Predicate<dsc> $$4, int $$5) {
      je $$6 = je.a($$2, je.a.b);
      iz.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dsc $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbe $$0, iz $$1, dsc $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ewk $$3 = $$2.k($$0, $$1);
         return !ewh.c(T, $$3, evv.i);
      }
   }

   static record a(iz a, enu b, dsc c) {
   }
}
