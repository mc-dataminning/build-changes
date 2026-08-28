import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drq extends dlu implements doq, dtb {
   public static final MapCodec<drq> a = b(drq::new);
   public static final eam<ja> b = eae.bp;
   public static final eam<eal> c = eae.bq;
   public static final eaf d = eae.I;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float C = 0.17578125F;
   private static final float Q = 0.05859375F;
   private static final double R = 0.6;
   private static final float S = 1.0F;
   private static final int T = 40;
   private static final int U = 6;
   private static final float V = 2.5F;
   private static final int W = 2;
   private static final float X = 5.0F;
   private static final float Y = 0.011377778F;
   private static final int Z = 7;
   private static final int aa = 10;
   private static final feq ab = dlu.b(6.0, 0.0, 16.0);
   private static final feq ac = dlu.b(6.0, 0.0, 11.0);
   private static final feq ad = dlu.b(6.0, 5.0, 16.0);
   private static final feq ae = dlu.b(8.0, 0.0, 16.0);
   private static final feq af = dlu.b(10.0, 0.0, 16.0);
   private static final feq ag = dlu.b(12.0, 0.0, 16.0);
   private static final double ah = ad.b(ja.a.b);
   private static final float ai = (float)ag.b(ja.a.a);
   private static final feq aj = dlu.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.b).b(c, eal.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      if ($$4 != ja.b && $$4 != ja.a) {
         return $$0;
      } else {
         ja $$8 = $$0.c(b);
         if ($$8 == ja.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == ja.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == eal.a;
            eal $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         if ($$0 instanceof aro $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof csa && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      if ($$1.c(b) == ja.b && $$1.c(c) == eal.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (r($$0) && !this.a($$0, (dis)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dis)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dzo $$0, aro $$1, iu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dis)$$1, $$2)) {
            Optional<drq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               evu $$5 = $$4.get().b;
               float $$6;
               if ($$5 == evw.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != evw.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dlw.to) && $$5 == evw.c) {
                        dzo $$10 = dlw.ee.m();
                        $$1.b($$4.get().a, $$10);
                        dlu.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(eeo.c, $$4.get().a, eeo.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dzo $$14 = $$1.a_($$11);
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
   public dzo a(dcl $$0) {
      diq $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.e().g();
      ja $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         eal $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == evw.c));
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected feq d_(dzo $$0) {
      return fen.a();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      feq $$4 = switch ((eal)$$0.c(c)) {
         case a -> ab;
         case b -> $$0.c(b) == ja.a ? ad : ac;
         case c -> ae;
         case d -> af;
         case e -> ag;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dzo $$0, dhv $$1, iu $$2) {
      return false;
   }

   @Override
   protected float an_() {
      return ai;
   }

   @Override
   public void a(dip $$0, iu $$1, cmw $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bup a(bwa $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dzo $$0, aro $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      dzo $$4 = $$0;

      while (q($$4)) {
         cmw $$5 = cmw.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ja.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dzo $$4 = $$1.a_($$2.b(1));
      dzo $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dzo $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ja.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aro $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ja.a);
         dzo $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, ja.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ja.b);
            return;
         }

         if (c($$0, $$2, ja.b) && !$$0.A($$2.e())) {
            a($$0, $$2.e(), ja.b);
            return;
         }

         if (!a((dhv)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aro $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      dzo $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (diq)$$0, $$3);
      } else if ($$4.l() || $$4.a(dlw.J)) {
         a($$0, $$3, $$2, eal.b);
      }
   }

   private static void a(diq $$0, iu $$1, ja $$2, eal $$3) {
      dzo $$4 = dlw.sX.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == evw.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dzo $$0, diq $$1, iu $$2) {
      iu $$4;
      iu $$3;
      if ($$0.c(b) == ja.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, ja.a, eal.a);
      a($$1, $$3, ja.b, eal.a);
   }

   public static void a(dip $$0, iu $$1, dzo $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dip $$0, iu $$1, dzo $$2, evu $$3) {
      fdw $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ah - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      evu $$9 = a($$0, $$3);
      lv $$10 = $$9.a(axf.b) ? lx.aO : lx.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iu a(dzo $$0, diq $$1, iu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ja $$5 = $$0.c(b);
         BiPredicate<iu, dzo> $$6 = ($$1x, $$2x) -> $$2x.a(dlw.sX) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ja b(dis $$0, iu $$1, ja $$2) {
      ja $$3;
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

   private static eal a(dis $$0, iu $$1, ja $$2, boolean $$3) {
      ja $$4 = $$2.g();
      dzo $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != eal.a ? eal.b : eal.a;
      } else if (!b($$5, $$2)) {
         return eal.b;
      } else {
         eal $$6 = $$5.c(c);
         if ($$6 != eal.b && $$6 != eal.a) {
            dzo $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? eal.e : eal.d;
         } else {
            return eal.c;
         }
      }
   }

   public static boolean o(dzo $$0) {
      return q($$0) && $$0.c(c) == eal.b && !$$0.c(d);
   }

   private static boolean b(dzo $$0, aro $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      iu $$4 = $$2.a($$3);
      dzo $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iu> a(dip $$0, iu $$1, dzo $$2, int $$3) {
      ja $$4 = $$2.c(b);
      BiPredicate<iu, dzo> $$5 = ($$1x, $$2x) -> $$2x.a(dlw.sX) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dlw.sX), $$3);
   }

   private static boolean c(dis $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2.g());
      dzo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dzo $$0, boolean $$1) {
      if (!$$0.a(dlw.sX)) {
         return false;
      } else {
         eal $$2 = $$0.c(c);
         return $$2 == eal.b || $$1 && $$2 == eal.a;
      }
   }

   private static boolean a(dzo $$0, ja $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dzo $$0) {
      return b($$0, ja.a);
   }

   private static boolean r(dzo $$0) {
      return b($$0, ja.b);
   }

   private static boolean b(dzo $$0, dis $$1, iu $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dlw.sX);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   private static boolean b(dzo $$0, ja $$1) {
      return $$0.a(dlw.sX) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iu a(dip $$0, iu $$1, evu $$2) {
      Predicate<dzo> $$3 = $$1x -> $$1x.b() instanceof dkn && ((dkn)$$1x.b()).a($$2);
      BiPredicate<iu, dzo> $$4 = ($$1x, $$2x) -> a((dhv)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iu a(dip $$0, iu $$1) {
      BiPredicate<iu, dzo> $$2 = ($$1x, $$2x) -> a((dhv)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.b.f(), $$2, drq::o, 11).orElse(null);
   }

   public static evu a(aro $$0, iu $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(drq::a).orElse(evw.a);
   }

   private static Optional<drq.a> b(dip $$0, iu $$1, dzo $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iu $$2x = $$1x.d();
         dzo $$3 = $$0.a_($$2x);
         evu $$4;
         if ($$3.a(dlw.to) && !$$0.B_().i()) {
            $$4 = evw.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new drq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(evu $$0) {
      return $$0 == evw.e || $$0 == evw.c;
   }

   private static boolean a(dzo $$0, dzo $$1) {
      return $$0.a(dlw.sY) && $$1.a(dlw.J) && $$1.y().b();
   }

   private static evu a(dip $$0, evu $$1) {
      if ($$1.a(evw.a)) {
         return $$0.B_().i() ? evw.e : evw.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iu> a(diq $$0, iu $$1, ja.b $$2, BiPredicate<iu, dzo> $$3, Predicate<dzo> $$4, int $$5) {
      ja $$6 = ja.a($$2, ja.a.b);
      iu.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dzo $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dhv $$0, iu $$1, dzo $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         feq $$3 = $$2.g($$0, $$1);
         return !fen.c(aj, $$3, fea.i);
      }
   }

   static record a(iu a, evu b, dzo c) {
   }
}
