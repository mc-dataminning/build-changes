import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkx extends dff implements dia, dmg {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dtb b = dsx.bm;
   public static final dtf<dte> c = dsx.bn;
   public static final dsy d = dsx.C;
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
   private static final ews M = dff.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ews N = dff.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ews O = dff.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ews P = dff.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ews Q = dff.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ews R = dff.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ews T = dff.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.b).a(c, dte.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      if ($$1 != jf.b && $$1 != jf.a) {
         return $$0;
      } else {
         jf $$6 = $$0.c(b);
         if ($$6 == jf.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcg)$$3, $$4)) {
            if ($$6 == jf.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dte.a;
            dte $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cnm && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      if ($$1.c(b) == jf.b && $$1.c(c) == dte.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().v());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (o($$0) && !this.a($$0, (dcg)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dcg)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dsh $$0, aqk $$1, ja $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dcg)$$1, $$2)) {
            Optional<dkx.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eoa $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eoc.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eoc.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ja $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfh.sI) && $$5 == eoc.c) {
                        dsh $$10 = dfh.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dff.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dxa.c, $$4.get().a, dxa.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ja $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dsh $$14 = $$1.a_($$11);
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
   public dsh a(cxk $$0) {
      dce $$1 = $$0.q();
      ja $$2 = $$0.a();
      jf $$3 = $$0.e().g();
      jf $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dte $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eoc.c));
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return ewp.a();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      dte $$4 = $$0.c(c);
      ews $$5;
      if ($$4 == dte.a) {
         $$5 = M;
      } else if ($$4 == dte.b) {
         if ($$0.c(b) == jf.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dte.c) {
         $$5 = P;
      } else if ($$4 == dte.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      evz $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dcd $$0, ja $$1, ciq $$2) {
      if (!$$2.aW()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bqw a(bsd $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(dsh $$0, aqk $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      dsh $$4 = $$0;

      while (n($$4)) {
         ciq $$5 = ciq.a($$1, $$3, $$4);
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
   public static void c(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dsh $$4 = $$1.a_($$2.b(1));
      dsh $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ja $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dsh $$7 = $$1.a_($$6);
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

   private static void b(aqk $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jf.a);
         dsh $$4 = $$0.a_($$2);
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

         if (!a((dbj)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqk $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      dsh $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dce)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfh.G)) {
         a($$0, $$3, $$2, dte.b);
      }
   }

   private static void a(dce $$0, ja $$1, jf $$2, dte $$3) {
      dsh $$4 = dfh.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eoc.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dsh $$0, dce $$1, ja $$2) {
      ja $$4;
      ja $$3;
      if ($$0.c(b) == jf.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, jf.a, dte.a);
      a($$1, $$3, jf.b, dte.a);
   }

   public static void a(dcd $$0, ja $$1, dsh $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dcd $$0, ja $$1, dsh $$2, eoa $$3) {
      evz $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eoa $$9 = a($$0, $$3);
      lh $$10 = $$9.a(awa.b) ? lj.aL : lj.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ja a(dsh $$0, dce $$1, ja $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jf $$5 = $$0.c(b);
         BiPredicate<ja, dsh> $$6 = ($$1x, $$2x) -> $$2x.a(dfh.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jf b(dcg $$0, ja $$1, jf $$2) {
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

   private static dte a(dcg $$0, ja $$1, jf $$2, boolean $$3) {
      jf $$4 = $$2.g();
      dsh $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dte.a ? dte.b : dte.a;
      } else if (!b($$5, $$2)) {
         return dte.b;
      } else {
         dte $$6 = $$5.c(c);
         if ($$6 != dte.b && $$6 != dte.a) {
            dsh $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dte.e : dte.d;
         } else {
            return dte.c;
         }
      }
   }

   public static boolean m(dsh $$0) {
      return n($$0) && $$0.c(c) == dte.b && !$$0.c(d);
   }

   private static boolean b(dsh $$0, aqk $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      ja $$4 = $$2.a($$3);
      dsh $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ja> a(dcd $$0, ja $$1, dsh $$2, int $$3) {
      jf $$4 = $$2.c(b);
      BiPredicate<ja, dsh> $$5 = ($$1x, $$2x) -> $$2x.a(dfh.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dfh.st), $$3);
   }

   private static boolean c(dcg $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2.g());
      dsh $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dsh $$0, boolean $$1) {
      if (!$$0.a(dfh.st)) {
         return false;
      } else {
         dte $$2 = $$0.c(c);
         return $$2 == dte.b || $$1 && $$2 == dte.a;
      }
   }

   private static boolean a(dsh $$0, jf $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dsh $$0) {
      return b($$0, jf.a);
   }

   private static boolean o(dsh $$0) {
      return b($$0, jf.b);
   }

   private static boolean b(dsh $$0, dcg $$1, ja $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dfh.st);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   private static boolean b(dsh $$0, jf $$1) {
      return $$0.a(dfh.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ja a(dcd $$0, ja $$1, eoa $$2) {
      Predicate<dsh> $$3 = $$1x -> $$1x.b() instanceof ddy && ((ddy)$$1x.b()).a($$2);
      BiPredicate<ja, dsh> $$4 = ($$1x, $$2x) -> a((dbj)$$0, $$1x, $$2x);
      return a($$0, $$1, jf.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ja a(dcd $$0, ja $$1) {
      BiPredicate<ja, dsh> $$2 = ($$1x, $$2x) -> a((dbj)$$0, $$1x, $$2x);
      return a($$0, $$1, jf.b.f(), $$2, dkx::m, 11).orElse(null);
   }

   public static eoa a(aqk $$0, ja $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dkx::a).orElse(eoc.a);
   }

   private static Optional<dkx.a> b(dcd $$0, ja $$1, dsh $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ja $$2x = $$1x.c();
         dsh $$3 = $$0.a_($$2x);
         eoa $$4;
         if ($$3.a(dfh.sI) && !$$0.D_().i()) {
            $$4 = eoc.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dkx.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eoa $$0) {
      return $$0 == eoc.e || $$0 == eoc.c;
   }

   private static boolean a(dsh $$0, dsh $$1) {
      return $$0.a(dfh.su) && $$1.a(dfh.G) && $$1.u().b();
   }

   private static eoa a(dcd $$0, eoa $$1) {
      if ($$1.a(eoc.a)) {
         return $$0.D_().i() ? eoc.e : eoc.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ja> a(dce $$0, ja $$1, jf.b $$2, BiPredicate<ja, dsh> $$3, Predicate<dsh> $$4, int $$5) {
      jf $$6 = jf.a($$2, jf.a.b);
      ja.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dsh $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dbj $$0, ja $$1, dsh $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ews $$3 = $$2.k($$0, $$1);
         return !ewp.c(T, $$3, ewd.i);
      }
   }

   static record a(ja a, eoa b, dsh c) {
   }
}
