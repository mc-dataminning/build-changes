import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class def extends cyo implements dbj, dfo {
   public static final MapCodec<def> a = b(def::new);
   public static final dlz b = dlv.bm;
   public static final dmd<dmc> c = dlv.bn;
   public static final dlw d = dlv.C;
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
   private static final eol M = cyo.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eol N = cyo.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eol O = cyo.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eol P = cyo.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eol Q = cyo.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eol R = cyo.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eol T = cyo.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.b).a(c, dmc.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      if ($$1 != ie.b && $$1 != ie.a) {
         return $$0;
      } else {
         ie $$6 = $$0.c(b);
         if ($$6 == ie.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cvq)$$3, $$4)) {
            if ($$6 == ie.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dmc.a;
            dmc $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cim && $$3.dp().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      if ($$1.c(b) == ie.b && $$1.c(c) == dmc.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (o($$0) && !this.a($$0, (cvq)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cvq)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dlf $$0, aov $$1, hz $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cvq)$$1, $$2)) {
            Optional<def.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ego $$5 = $$4.get().b;
               float $$6;
               if ($$5 == egq.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != egq.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hz $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cyq.sI) && $$5 == egq.c) {
                        dlf $$10 = cyq.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cyo.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dpp.c, $$4.get().a, dpp.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hz $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dlf $$14 = $$1.a_($$11);
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
   public dlf a(crg $$0) {
      cvo $$1 = $$0.q();
      hz $$2 = $$0.a();
      ie $$3 = $$0.e().g();
      ie $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dmc $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == egq.c));
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return eoi.a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      dmc $$4 = $$0.c(c);
      eol $$5;
      if ($$4 == dmc.a) {
         $$5 = M;
      } else if ($$4 == dmc.b) {
         if ($$0.c(b) == ie.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dmc.c) {
         $$5 = P;
      } else if ($$4 == dmc.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ens $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dlf $$0, cut $$1, hz $$2) {
      return false;
   }

   @Override
   protected float aw_() {
      return 0.125F;
   }

   @Override
   public void a(cvn $$0, hz $$1, cdr $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bmn a(bno $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dlf $$0, aov $$1, hz $$2) {
      hz.a $$3 = $$2.j();
      dlf $$4 = $$0;

      while (n($$4)) {
         cdr $$5 = cdr.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ie.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dlf $$0, aov $$1, hz $$2, awo $$3) {
      dlf $$4 = $$1.a_($$2.b(1));
      dlf $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hz $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dlf $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ie.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aov $$0, hz $$1) {
      hz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ie.a);
         dlf $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ie.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ie.b);
            return;
         }

         if (c($$0, $$2, ie.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ie.b);
            return;
         }

         if (!a((cut)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aov $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2);
      dlf $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cvo)$$0, $$3);
      } else if ($$4.i() || $$4.a(cyq.G)) {
         a($$0, $$3, $$2, dmc.b);
      }
   }

   private static void a(cvo $$0, hz $$1, ie $$2, dmc $$3) {
      dlf $$4 = cyq.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == egq.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dlf $$0, cvo $$1, hz $$2) {
      hz $$4;
      hz $$3;
      if ($$0.c(b) == ie.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ie.a, dmc.a);
      a($$1, $$3, ie.b, dmc.a);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cvn $$0, hz $$1, dlf $$2, ego $$3) {
      ens $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ego $$9 = a($$0, $$3);
      jx $$10 = $$9.a(aue.b) ? jz.aI : jz.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hz a(dlf $$0, cvo $$1, hz $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ie $$5 = $$0.c(b);
         BiPredicate<hz, dlf> $$6 = ($$1x, $$2x) -> $$2x.a(cyq.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ie b(cvq $$0, hz $$1, ie $$2) {
      ie $$3;
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

   private static dmc a(cvq $$0, hz $$1, ie $$2, boolean $$3) {
      ie $$4 = $$2.g();
      dlf $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dmc.a ? dmc.b : dmc.a;
      } else if (!b($$5, $$2)) {
         return dmc.b;
      } else {
         dmc $$6 = $$5.c(c);
         if ($$6 != dmc.b && $$6 != dmc.a) {
            dlf $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dmc.e : dmc.d;
         } else {
            return dmc.c;
         }
      }
   }

   public static boolean m(dlf $$0) {
      return n($$0) && $$0.c(c) == dmc.b && !$$0.c(d);
   }

   private static boolean b(dlf $$0, aov $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      hz $$4 = $$2.a($$3);
      dlf $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hz> a(cvn $$0, hz $$1, dlf $$2, int $$3) {
      ie $$4 = $$2.c(b);
      BiPredicate<hz, dlf> $$5 = ($$1x, $$2x) -> $$2x.a(cyq.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cyq.st), $$3);
   }

   private static boolean c(cvq $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2.g());
      dlf $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dlf $$0, boolean $$1) {
      if (!$$0.a(cyq.st)) {
         return false;
      } else {
         dmc $$2 = $$0.c(c);
         return $$2 == dmc.b || $$1 && $$2 == dmc.a;
      }
   }

   private static boolean a(dlf $$0, ie $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dlf $$0) {
      return b($$0, ie.a);
   }

   private static boolean o(dlf $$0) {
      return b($$0, ie.b);
   }

   private static boolean b(dlf $$0, cvq $$1, hz $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cyq.st);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   private static boolean b(dlf $$0, ie $$1) {
      return $$0.a(cyq.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hz a(cvn $$0, hz $$1, ego $$2) {
      Predicate<dlf> $$3 = $$1x -> $$1x.b() instanceof cxh && ((cxh)$$1x.b()).a($$2);
      BiPredicate<hz, dlf> $$4 = ($$1x, $$2x) -> a((cut)$$0, $$1x, $$2x);
      return a($$0, $$1, ie.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hz a(cvn $$0, hz $$1) {
      BiPredicate<hz, dlf> $$2 = ($$1x, $$2x) -> a((cut)$$0, $$1x, $$2x);
      return a($$0, $$1, ie.b.f(), $$2, def::m, 11).orElse(null);
   }

   public static ego a(aov $$0, hz $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(def::a).orElse(egq.a);
   }

   private static Optional<def.a> b(cvn $$0, hz $$1, dlf $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hz $$2x = $$1x.c();
         dlf $$3 = $$0.a_($$2x);
         ego $$4;
         if ($$3.a(cyq.sI) && !$$0.E_().i()) {
            $$4 = egq.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new def.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ego $$0) {
      return $$0 == egq.e || $$0 == egq.c;
   }

   private static boolean a(dlf $$0, dlf $$1) {
      return $$0.a(cyq.su) && $$1.a(cyq.G) && $$1.u().b();
   }

   private static ego a(cvn $$0, ego $$1) {
      if ($$1.a(egq.a)) {
         return $$0.E_().i() ? egq.e : egq.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hz> a(cvo $$0, hz $$1, ie.b $$2, BiPredicate<hz, dlf> $$3, Predicate<dlf> $$4, int $$5) {
      ie $$6 = ie.a($$2, ie.a.b);
      hz.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dlf $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cut $$0, hz $$1, dlf $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eol $$3 = $$2.k($$0, $$1);
         return !eoi.c(T, $$3, enw.i);
      }
   }

   static record a(hz a, ego b, dlf c) {
   }
}
