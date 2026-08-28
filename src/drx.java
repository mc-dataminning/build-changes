import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drx extends dma implements dow, dtj {
   public static final MapCodec<drx> a = b(drx::new);
   public static final eax<ja> b = eap.bp;
   public static final eax<eaw> c = eap.bq;
   public static final eaq d = eap.I;
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
   private static final ffc ab = dma.b(6.0, 0.0, 16.0);
   private static final ffc ac = dma.b(6.0, 0.0, 11.0);
   private static final ffc ad = dma.b(6.0, 5.0, 16.0);
   private static final ffc ae = dma.b(8.0, 0.0, 16.0);
   private static final ffc af = dma.b(10.0, 0.0, 16.0);
   private static final ffc ag = dma.b(12.0, 0.0, 16.0);
   private static final double ah = ad.b(ja.a.b);
   private static final float ai = (float)ag.b(ja.a.a);
   private static final ffc aj = dma.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   public drx(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.b).b(c, eaw.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
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
            boolean $$9 = $$0.c(c) == eaw.a;
            eaw $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof csg && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      if ($$1.c(b) == ja.b && $$1.c(c) == eaw.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (r($$0) && !this.a($$0, (diy)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (diy)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dzz $$0, arq $$1, iu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (diy)$$1, $$2)) {
            Optional<drx.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ewf $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ewh.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ewh.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dmc.tp) && $$5 == ewh.c) {
                        dzz $$10 = dmc.ef.m();
                        $$1.b($$4.get().a, $$10);
                        dma.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(eez.c, $$4.get().a, eez.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dzz $$14 = $$1.a_($$11);
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
   public dzz a(dcr $$0) {
      diw $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.e().g();
      ja $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         eaw $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == ewh.c));
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffc d_(dzz $$0) {
      return fez.a();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      ffc $$4 = switch ((eaw)$$0.c(c)) {
         case a -> ab;
         case b -> $$0.c(b) == ja.a ? ad : ac;
         case c -> ae;
         case d -> af;
         case e -> ag;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dzz $$0, dib $$1, iu $$2) {
      return false;
   }

   @Override
   protected float an_() {
      return ai;
   }

   @Override
   public void a(div $$0, iu $$1, cnc $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bus a(bwd $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(dzz $$0, arq $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      dzz $$4 = $$0;

      while (q($$4)) {
         cnc $$5 = cnc.a($$1, $$3, $$4);
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
   public static void c(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dzz $$4 = $$1.a_($$2.b(1));
      dzz $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dzz $$7 = $$1.a_($$6);
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

   private static void b(arq $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ja.a);
         dzz $$4 = $$0.a_($$2);
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

         if (!a((dib)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arq $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      dzz $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (diw)$$0, $$3);
      } else if ($$4.l() || $$4.a(dmc.J)) {
         a($$0, $$3, $$2, eaw.b);
      }
   }

   private static void a(diw $$0, iu $$1, ja $$2, eaw $$3) {
      dzz $$4 = dmc.sY.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == ewh.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dzz $$0, diw $$1, iu $$2) {
      iu $$4;
      iu $$3;
      if ($$0.c(b) == ja.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, ja.a, eaw.a);
      a($$1, $$3, ja.b, eaw.a);
   }

   public static void a(div $$0, iu $$1, dzz $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(div $$0, iu $$1, dzz $$2, ewf $$3) {
      fei $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ah - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      ewf $$9 = a($$0, $$3);
      lv $$10 = $$9.a(axh.b) ? lx.aO : lx.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iu a(dzz $$0, diw $$1, iu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ja $$5 = $$0.c(b);
         BiPredicate<iu, dzz> $$6 = ($$1x, $$2x) -> $$2x.a(dmc.sY) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ja b(diy $$0, iu $$1, ja $$2) {
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

   private static eaw a(diy $$0, iu $$1, ja $$2, boolean $$3) {
      ja $$4 = $$2.g();
      dzz $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != eaw.a ? eaw.b : eaw.a;
      } else if (!b($$5, $$2)) {
         return eaw.b;
      } else {
         eaw $$6 = $$5.c(c);
         if ($$6 != eaw.b && $$6 != eaw.a) {
            dzz $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? eaw.e : eaw.d;
         } else {
            return eaw.c;
         }
      }
   }

   public static boolean o(dzz $$0) {
      return q($$0) && $$0.c(c) == eaw.b && !$$0.c(d);
   }

   private static boolean b(dzz $$0, arq $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      iu $$4 = $$2.a($$3);
      dzz $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iu> a(div $$0, iu $$1, dzz $$2, int $$3) {
      ja $$4 = $$2.c(b);
      BiPredicate<iu, dzz> $$5 = ($$1x, $$2x) -> $$2x.a(dmc.sY) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dmc.sY), $$3);
   }

   private static boolean c(diy $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2.g());
      dzz $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dzz $$0, boolean $$1) {
      if (!$$0.a(dmc.sY)) {
         return false;
      } else {
         eaw $$2 = $$0.c(c);
         return $$2 == eaw.b || $$1 && $$2 == eaw.a;
      }
   }

   private static boolean a(dzz $$0, ja $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dzz $$0) {
      return b($$0, ja.a);
   }

   private static boolean r(dzz $$0) {
      return b($$0, ja.b);
   }

   private static boolean b(dzz $$0, diy $$1, iu $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dmc.sY);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   private static boolean b(dzz $$0, ja $$1) {
      return $$0.a(dmc.sY) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iu a(div $$0, iu $$1, ewf $$2) {
      Predicate<dzz> $$3 = $$1x -> $$1x.b() instanceof dkt && ((dkt)$$1x.b()).a($$2);
      BiPredicate<iu, dzz> $$4 = ($$1x, $$2x) -> a((dib)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iu a(div $$0, iu $$1) {
      BiPredicate<iu, dzz> $$2 = ($$1x, $$2x) -> a((dib)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.b.f(), $$2, drx::o, 11).orElse(null);
   }

   public static ewf a(arq $$0, iu $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(drx::a).orElse(ewh.a);
   }

   private static Optional<drx.a> b(div $$0, iu $$1, dzz $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iu $$2x = $$1x.d();
         dzz $$3 = $$0.a_($$2x);
         ewf $$4;
         if ($$3.a(dmc.tp) && !$$0.B_().i()) {
            $$4 = ewh.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new drx.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ewf $$0) {
      return $$0 == ewh.e || $$0 == ewh.c;
   }

   private static boolean a(dzz $$0, dzz $$1) {
      return $$0.a(dmc.sZ) && $$1.a(dmc.J) && $$1.y().b();
   }

   private static ewf a(div $$0, ewf $$1) {
      if ($$1.a(ewh.a)) {
         return $$0.B_().i() ? ewh.e : ewh.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iu> a(diw $$0, iu $$1, ja.b $$2, BiPredicate<iu, dzz> $$3, Predicate<dzz> $$4, int $$5) {
      ja $$6 = ja.a($$2, ja.a.b);
      iu.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dzz $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dib $$0, iu $$1, dzz $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         ffc $$3 = $$2.g($$0, $$1);
         return !fez.c(aj, $$3, fem.i);
      }
   }

   static record a(iu a, ewf b, dzz c) {
   }
}
