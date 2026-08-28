import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsk extends dmm implements dpj, dtx {
   public static final MapCodec<dsk> a = b(dsk::new);
   public static final ebm<jb> b = ebe.bp;
   public static final ebm<ebl> c = ebe.bq;
   public static final ebf d = ebe.I;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float D = 0.17578125F;
   private static final float R = 0.05859375F;
   private static final double S = 0.6;
   private static final float T = 1.0F;
   private static final int U = 40;
   private static final int V = 6;
   private static final float W = 2.5F;
   private static final int X = 2;
   private static final float Y = 5.0F;
   private static final float Z = 0.011377778F;
   private static final int aa = 7;
   private static final int ab = 10;
   private static final ffr ac = dmm.b(6.0, 0.0, 16.0);
   private static final ffr ad = dmm.b(6.0, 0.0, 11.0);
   private static final ffr ae = dmm.b(6.0, 5.0, 16.0);
   private static final ffr af = dmm.b(8.0, 0.0, 16.0);
   private static final ffr ag = dmm.b(10.0, 0.0, 16.0);
   private static final ffr ah = dmm.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(jb.a.b);
   private static final float aj = (float)ah.b(jb.a.a);
   private static final ffr ak = dmm.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.b).b(c, ebl.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      if ($$4 != jb.b && $$4 != jb.a) {
         return $$0;
      } else {
         jb $$8 = $$0.c(b);
         if ($$8 == jb.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jb.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == ebl.a;
            ebl $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      if (!$$0.C) {
         iv $$4 = $$2.b();
         if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof css && $$3.dx().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      if ($$1.c(b) == jb.b && $$1.c(c) == ebl.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (r($$0) && !this.a($$0, (djk)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (djk)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(eao $$0, arq $$1, iv $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (djk)$$1, $$2)) {
            Optional<dsk.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ewu $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eww.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eww.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iv $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dmo.ts) && $$5 == eww.c) {
                        eao $$10 = dmo.ei.m();
                        $$1.b($$4.get().a, $$10);
                        dmm.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(efo.c, $$4.get().a, efo.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iv $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           eao $$14 = $$1.a_($$11);
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
   public eao a(ddd $$0) {
      dji $$1 = $$0.q();
      iv $$2 = $$0.a();
      jb $$3 = $$0.e().g();
      jb $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         ebl $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == eww.c));
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffr d_(eao $$0) {
      return ffo.a();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      ffr $$4 = switch ((ebl)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == jb.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eao $$0, din $$1, iv $$2) {
      return false;
   }

   @Override
   protected float ao_() {
      return aj;
   }

   @Override
   public void a(djh $$0, iv $$1, cnn $$2) {
      if (!$$2.aZ()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bux a(bwi $$0) {
      return $$0.dV().c($$0);
   }

   private static void a(eao $$0, arq $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      eao $$4 = $$0;

      while (q($$4)) {
         cnn $$5 = cnn.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jb.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(eao $$0, arq $$1, iv $$2, azv $$3) {
      eao $$4 = $$1.a_($$2.b(1));
      eao $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iv $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            eao $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jb.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arq $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jb.a);
         eao $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jb.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jb.b);
            return;
         }

         if (c($$0, $$2, jb.b) && !$$0.A($$2.e())) {
            a($$0, $$2.e(), jb.b);
            return;
         }

         if (!a((din)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arq $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      eao $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dji)$$0, $$3);
      } else if ($$4.l() || $$4.a(dmo.J)) {
         a($$0, $$3, $$2, ebl.b);
      }
   }

   private static void a(dji $$0, iv $$1, jb $$2, ebl $$3) {
      eao $$4 = dmo.tb.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == eww.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(eao $$0, dji $$1, iv $$2) {
      iv $$4;
      iv $$3;
      if ($$0.c(b) == jb.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jb.a, ebl.a);
      a($$1, $$3, jb.b, ebl.a);
   }

   public static void a(djh $$0, iv $$1, eao $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(djh $$0, iv $$1, eao $$2, ewu $$3) {
      fex $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ai - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      ewu $$9 = a($$0, $$3);
      lw $$10 = $$9.a(axh.b) ? ly.aO : ly.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iv a(eao $$0, dji $$1, iv $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jb $$5 = $$0.c(b);
         BiPredicate<iv, eao> $$6 = ($$1x, $$2x) -> $$2x.a(dmo.tb) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jb b(djk $$0, iv $$1, jb $$2) {
      jb $$3;
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

   private static ebl a(djk $$0, iv $$1, jb $$2, boolean $$3) {
      jb $$4 = $$2.g();
      eao $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != ebl.a ? ebl.b : ebl.a;
      } else if (!b($$5, $$2)) {
         return ebl.b;
      } else {
         ebl $$6 = $$5.c(c);
         if ($$6 != ebl.b && $$6 != ebl.a) {
            eao $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? ebl.e : ebl.d;
         } else {
            return ebl.c;
         }
      }
   }

   public static boolean o(eao $$0) {
      return q($$0) && $$0.c(c) == ebl.b && !$$0.c(d);
   }

   private static boolean b(eao $$0, arq $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      iv $$4 = $$2.a($$3);
      eao $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iv> a(djh $$0, iv $$1, eao $$2, int $$3) {
      jb $$4 = $$2.c(b);
      BiPredicate<iv, eao> $$5 = ($$1x, $$2x) -> $$2x.a(dmo.tb) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dmo.tb), $$3);
   }

   private static boolean c(djk $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2.g());
      eao $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(eao $$0, boolean $$1) {
      if (!$$0.a(dmo.tb)) {
         return false;
      } else {
         ebl $$2 = $$0.c(c);
         return $$2 == ebl.b || $$1 && $$2 == ebl.a;
      }
   }

   private static boolean a(eao $$0, jb $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(eao $$0) {
      return b($$0, jb.a);
   }

   private static boolean r(eao $$0) {
      return b($$0, jb.b);
   }

   private static boolean b(eao $$0, djk $$1, iv $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dmo.tb);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   private static boolean b(eao $$0, jb $$1) {
      return $$0.a(dmo.tb) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iv a(djh $$0, iv $$1, ewu $$2) {
      Predicate<eao> $$3 = $$1x -> $$1x.b() instanceof dlf && ((dlf)$$1x.b()).a($$2);
      BiPredicate<iv, eao> $$4 = ($$1x, $$2x) -> a((din)$$0, $$1x, $$2x);
      return a($$0, $$1, jb.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iv a(djh $$0, iv $$1) {
      BiPredicate<iv, eao> $$2 = ($$1x, $$2x) -> a((din)$$0, $$1x, $$2x);
      return a($$0, $$1, jb.b.f(), $$2, dsk::o, 11).orElse(null);
   }

   public static ewu a(arq $$0, iv $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dsk::a).orElse(eww.a);
   }

   private static Optional<dsk.a> b(djh $$0, iv $$1, eao $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iv $$2x = $$1x.d();
         eao $$3 = $$0.a_($$2x);
         ewu $$4;
         if ($$3.a(dmo.ts) && !$$0.B_().i()) {
            $$4 = eww.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dsk.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ewu $$0) {
      return $$0 == eww.e || $$0 == eww.c;
   }

   private static boolean a(eao $$0, eao $$1) {
      return $$0.a(dmo.tc) && $$1.a(dmo.J) && $$1.y().b();
   }

   private static ewu a(djh $$0, ewu $$1) {
      if ($$1.a(eww.a)) {
         return $$0.B_().i() ? eww.e : eww.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iv> a(dji $$0, iv $$1, jb.b $$2, BiPredicate<iv, eao> $$3, Predicate<eao> $$4, int $$5) {
      jb $$6 = jb.a($$2, jb.a.b);
      iv.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         eao $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(din $$0, iv $$1, eao $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         ffr $$3 = $$2.g($$0, $$1);
         return !ffo.c(ak, $$3, ffb.i);
      }
   }

   static record a(iv a, ewu b, eao c) {
   }
}
