import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsd extends dmf implements dpc, dtq {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final ebf<ja> b = eax.bp;
   public static final ebf<ebe> c = eax.bq;
   public static final eay d = eax.I;
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
   private static final ffk ac = dmf.b(6.0, 0.0, 16.0);
   private static final ffk ad = dmf.b(6.0, 0.0, 11.0);
   private static final ffk ae = dmf.b(6.0, 5.0, 16.0);
   private static final ffk af = dmf.b(8.0, 0.0, 16.0);
   private static final ffk ag = dmf.b(10.0, 0.0, 16.0);
   private static final ffk ah = dmf.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(ja.a.b);
   private static final float aj = (float)ah.b(ja.a.a);
   private static final ffk ak = dmf.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.b).b(c, ebe.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
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
            boolean $$9 = $$0.c(c) == ebe.a;
            ebe $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof csl && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      if ($$1.c(b) == ja.b && $$1.c(c) == ebe.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (r($$0) && !this.a($$0, (djd)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (djd)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(eah $$0, arq $$1, iu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (djd)$$1, $$2)) {
            Optional<dsd.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ewn $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ewp.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ewp.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dmh.ts) && $$5 == ewp.c) {
                        eah $$10 = dmh.ei.m();
                        $$1.b($$4.get().a, $$10);
                        dmf.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(efh.c, $$4.get().a, efh.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           eah $$14 = $$1.a_($$11);
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
   public eah a(dcw $$0) {
      djb $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.e().g();
      ja $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         ebe $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == ewp.c));
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffk d_(eah $$0) {
      return ffh.a();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      ffk $$4 = switch ((ebe)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == ja.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eah $$0, dig $$1, iu $$2) {
      return false;
   }

   @Override
   protected float ao_() {
      return aj;
   }

   @Override
   public void a(dja $$0, iu $$1, cng $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public buu a(bwf $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(eah $$0, arq $$1, iu $$2) {
      iu.a $$3 = $$2.k();
      eah $$4 = $$0;

      while (q($$4)) {
         cng $$5 = cng.a($$1, $$3, $$4);
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
   public static void c(eah $$0, arq $$1, iu $$2, azv $$3) {
      eah $$4 = $$1.a_($$2.b(1));
      eah $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            eah $$7 = $$1.a_($$6);
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
         eah $$4 = $$0.a_($$2);
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

         if (!a((dig)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arq $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      eah $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (djb)$$0, $$3);
      } else if ($$4.l() || $$4.a(dmh.J)) {
         a($$0, $$3, $$2, ebe.b);
      }
   }

   private static void a(djb $$0, iu $$1, ja $$2, ebe $$3) {
      eah $$4 = dmh.tb.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == ewp.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(eah $$0, djb $$1, iu $$2) {
      iu $$4;
      iu $$3;
      if ($$0.c(b) == ja.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, ja.a, ebe.a);
      a($$1, $$3, ja.b, ebe.a);
   }

   public static void a(dja $$0, iu $$1, eah $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dja $$0, iu $$1, eah $$2, ewn $$3) {
      feq $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ai - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      ewn $$9 = a($$0, $$3);
      lv $$10 = $$9.a(axh.b) ? lx.aO : lx.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iu a(eah $$0, djb $$1, iu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ja $$5 = $$0.c(b);
         BiPredicate<iu, eah> $$6 = ($$1x, $$2x) -> $$2x.a(dmh.tb) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ja b(djd $$0, iu $$1, ja $$2) {
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

   private static ebe a(djd $$0, iu $$1, ja $$2, boolean $$3) {
      ja $$4 = $$2.g();
      eah $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != ebe.a ? ebe.b : ebe.a;
      } else if (!b($$5, $$2)) {
         return ebe.b;
      } else {
         ebe $$6 = $$5.c(c);
         if ($$6 != ebe.b && $$6 != ebe.a) {
            eah $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? ebe.e : ebe.d;
         } else {
            return ebe.c;
         }
      }
   }

   public static boolean o(eah $$0) {
      return q($$0) && $$0.c(c) == ebe.b && !$$0.c(d);
   }

   private static boolean b(eah $$0, arq $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      iu $$4 = $$2.a($$3);
      eah $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iu> a(dja $$0, iu $$1, eah $$2, int $$3) {
      ja $$4 = $$2.c(b);
      BiPredicate<iu, eah> $$5 = ($$1x, $$2x) -> $$2x.a(dmh.tb) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dmh.tb), $$3);
   }

   private static boolean c(djd $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2.g());
      eah $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(eah $$0, boolean $$1) {
      if (!$$0.a(dmh.tb)) {
         return false;
      } else {
         ebe $$2 = $$0.c(c);
         return $$2 == ebe.b || $$1 && $$2 == ebe.a;
      }
   }

   private static boolean a(eah $$0, ja $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(eah $$0) {
      return b($$0, ja.a);
   }

   private static boolean r(eah $$0) {
      return b($$0, ja.b);
   }

   private static boolean b(eah $$0, djd $$1, iu $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dmh.tb);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   private static boolean b(eah $$0, ja $$1) {
      return $$0.a(dmh.tb) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iu a(dja $$0, iu $$1, ewn $$2) {
      Predicate<eah> $$3 = $$1x -> $$1x.b() instanceof dky && ((dky)$$1x.b()).a($$2);
      BiPredicate<iu, eah> $$4 = ($$1x, $$2x) -> a((dig)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iu a(dja $$0, iu $$1) {
      BiPredicate<iu, eah> $$2 = ($$1x, $$2x) -> a((dig)$$0, $$1x, $$2x);
      return a($$0, $$1, ja.b.f(), $$2, dsd::o, 11).orElse(null);
   }

   public static ewn a(arq $$0, iu $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dsd::a).orElse(ewp.a);
   }

   private static Optional<dsd.a> b(dja $$0, iu $$1, eah $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iu $$2x = $$1x.d();
         eah $$3 = $$0.a_($$2x);
         ewn $$4;
         if ($$3.a(dmh.ts) && !$$0.B_().i()) {
            $$4 = ewp.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dsd.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ewn $$0) {
      return $$0 == ewp.e || $$0 == ewp.c;
   }

   private static boolean a(eah $$0, eah $$1) {
      return $$0.a(dmh.tc) && $$1.a(dmh.J) && $$1.y().b();
   }

   private static ewn a(dja $$0, ewn $$1) {
      if ($$1.a(ewp.a)) {
         return $$0.B_().i() ? ewp.e : ewp.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iu> a(djb $$0, iu $$1, ja.b $$2, BiPredicate<iu, eah> $$3, Predicate<eah> $$4, int $$5) {
      ja $$6 = ja.a($$2, ja.a.b);
      iu.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         eah $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dig $$0, iu $$1, eah $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         ffk $$3 = $$2.g($$0, $$1);
         return !ffh.c(ak, $$3, feu.i);
      }
   }

   static record a(iu a, ewn b, eah c) {
   }
}
