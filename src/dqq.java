import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqq extends dku implements dnq, dsb {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final dzk<jo> b = dzc.bp;
   public static final dzk<dzj> c = dzc.bq;
   public static final dzd d = dzc.I;
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
   private static final fdo ab = dku.b(6.0, 0.0, 16.0);
   private static final fdo ac = dku.b(6.0, 0.0, 11.0);
   private static final fdo ad = dku.b(6.0, 5.0, 16.0);
   private static final fdo ae = dku.b(8.0, 0.0, 16.0);
   private static final fdo af = dku.b(10.0, 0.0, 16.0);
   private static final fdo ag = dku.b(12.0, 0.0, 16.0);
   private static final double ah = ad.b(jo.a.b);
   private static final float ai = (float)ag.b(jo.a.a);
   private static final fdo aj = dku.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.b).b(c, dzj.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      if ($$4 != jo.b && $$4 != jo.a) {
         return $$0;
      } else {
         jo $$8 = $$0.c(b);
         if ($$8 == jo.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jo.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == dzj.a;
            dzj $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      if (!$$0.C) {
         jj $$4 = $$2.b();
         if ($$0 instanceof arn $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cro && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      if ($$1.c(b) == jo.b && $$1.c(c) == dzj.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (r($$0) && !this.a($$0, (dhs)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dhs)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dym $$0, arn $$1, jj $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dhs)$$1, $$2)) {
            Optional<dqq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eus $$5 = $$4.get().b;
               float $$6;
               if ($$5 == euu.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != euu.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jj $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dkw.to) && $$5 == euu.c) {
                        dym $$10 = dkw.ee.m();
                        $$1.b($$4.get().a, $$10);
                        dku.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(edm.c, $$4.get().a, edm.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jj $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dym $$14 = $$1.a_($$11);
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
   public dym a(dbn $$0) {
      dhq $$1 = $$0.q();
      jj $$2 = $$0.a();
      jo $$3 = $$0.e().g();
      jo $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dzj $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == euu.c));
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected fdo d_(dym $$0) {
      return fdl.a();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      fdo $$4 = switch ((dzj)$$0.c(c)) {
         case a -> ab;
         case b -> $$0.c(b) == jo.a ? ad : ac;
         case c -> ae;
         case d -> af;
         case e -> ag;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dym $$0, dgv $$1, jj $$2) {
      return false;
   }

   @Override
   protected float an_() {
      return ai;
   }

   @Override
   public void a(dhp $$0, jj $$1, cmm $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public buh a(bvs $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dym $$0, arn $$1, jj $$2) {
      jj.a $$3 = $$2.k();
      dym $$4 = $$0;

      while (q($$4)) {
         cmm $$5 = cmm.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jo.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dym $$0, arn $$1, jj $$2, azs $$3) {
      dym $$4 = $$1.a_($$2.b(1));
      dym $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jj $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dym $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jo.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arn $$0, jj $$1) {
      jj.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jo.a);
         dym $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jo.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jo.b);
            return;
         }

         if (c($$0, $$2, jo.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jo.b);
            return;
         }

         if (!a((dgv)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arn $$0, jj $$1, jo $$2) {
      jj $$3 = $$1.a($$2);
      dym $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dhq)$$0, $$3);
      } else if ($$4.l() || $$4.a(dkw.J)) {
         a($$0, $$3, $$2, dzj.b);
      }
   }

   private static void a(dhq $$0, jj $$1, jo $$2, dzj $$3) {
      dym $$4 = dkw.sX.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == euu.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dym $$0, dhq $$1, jj $$2) {
      jj $$4;
      jj $$3;
      if ($$0.c(b) == jo.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jo.a, dzj.a);
      a($$1, $$3, jo.b, dzj.a);
   }

   public static void a(dhp $$0, jj $$1, dym $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dhp $$0, jj $$1, dym $$2, eus $$3) {
      fcu $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ah - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      eus $$9 = a($$0, $$3);
      lt $$10 = $$9.a(axf.b) ? lv.aO : lv.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jj a(dym $$0, dhq $$1, jj $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jo $$5 = $$0.c(b);
         BiPredicate<jj, dym> $$6 = ($$1x, $$2x) -> $$2x.a(dkw.sX) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jo b(dhs $$0, jj $$1, jo $$2) {
      jo $$3;
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

   private static dzj a(dhs $$0, jj $$1, jo $$2, boolean $$3) {
      jo $$4 = $$2.g();
      dym $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dzj.a ? dzj.b : dzj.a;
      } else if (!b($$5, $$2)) {
         return dzj.b;
      } else {
         dzj $$6 = $$5.c(c);
         if ($$6 != dzj.b && $$6 != dzj.a) {
            dym $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dzj.e : dzj.d;
         } else {
            return dzj.c;
         }
      }
   }

   public static boolean o(dym $$0) {
      return q($$0) && $$0.c(c) == dzj.b && !$$0.c(d);
   }

   private static boolean b(dym $$0, arn $$1, jj $$2) {
      jo $$3 = $$0.c(b);
      jj $$4 = $$2.a($$3);
      dym $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jj> a(dhp $$0, jj $$1, dym $$2, int $$3) {
      jo $$4 = $$2.c(b);
      BiPredicate<jj, dym> $$5 = ($$1x, $$2x) -> $$2x.a(dkw.sX) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dkw.sX), $$3);
   }

   private static boolean c(dhs $$0, jj $$1, jo $$2) {
      jj $$3 = $$1.a($$2.g());
      dym $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dym $$0, boolean $$1) {
      if (!$$0.a(dkw.sX)) {
         return false;
      } else {
         dzj $$2 = $$0.c(c);
         return $$2 == dzj.b || $$1 && $$2 == dzj.a;
      }
   }

   private static boolean a(dym $$0, jo $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dym $$0) {
      return b($$0, jo.a);
   }

   private static boolean r(dym $$0) {
      return b($$0, jo.b);
   }

   private static boolean b(dym $$0, dhs $$1, jj $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dkw.sX);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   private static boolean b(dym $$0, jo $$1) {
      return $$0.a(dkw.sX) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jj a(dhp $$0, jj $$1, eus $$2) {
      Predicate<dym> $$3 = $$1x -> $$1x.b() instanceof djn && ((djn)$$1x.b()).a($$2);
      BiPredicate<jj, dym> $$4 = ($$1x, $$2x) -> a((dgv)$$0, $$1x, $$2x);
      return a($$0, $$1, jo.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jj a(dhp $$0, jj $$1) {
      BiPredicate<jj, dym> $$2 = ($$1x, $$2x) -> a((dgv)$$0, $$1x, $$2x);
      return a($$0, $$1, jo.b.f(), $$2, dqq::o, 11).orElse(null);
   }

   public static eus a(arn $$0, jj $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dqq::a).orElse(euu.a);
   }

   private static Optional<dqq.a> b(dhp $$0, jj $$1, dym $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jj $$2x = $$1x.d();
         dym $$3 = $$0.a_($$2x);
         eus $$4;
         if ($$3.a(dkw.to) && !$$0.B_().i()) {
            $$4 = euu.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dqq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eus $$0) {
      return $$0 == euu.e || $$0 == euu.c;
   }

   private static boolean a(dym $$0, dym $$1) {
      return $$0.a(dkw.sY) && $$1.a(dkw.J) && $$1.y().b();
   }

   private static eus a(dhp $$0, eus $$1) {
      if ($$1.a(euu.a)) {
         return $$0.B_().i() ? euu.e : euu.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jj> a(dhq $$0, jj $$1, jo.b $$2, BiPredicate<jj, dym> $$3, Predicate<dym> $$4, int $$5) {
      jo $$6 = jo.a($$2, jo.a.b);
      jj.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dym $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dgv $$0, jj $$1, dym $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fdo $$3 = $$2.g($$0, $$1);
         return !fdl.c(aj, $$3, fcy.i);
      }
   }

   static record a(jj a, eus b, dym c) {
   }
}
