import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtc extends dne implements dqb, dup {
   public static final MapCodec<dtc> a = b(dtc::new);
   public static final ece<jc> b = ebw.bp;
   public static final ece<ecd> c = ebw.bq;
   public static final ebx d = ebw.I;
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
   private static final fgm ac = dne.b(6.0, 0.0, 16.0);
   private static final fgm ad = dne.b(6.0, 0.0, 11.0);
   private static final fgm ae = dne.b(6.0, 5.0, 16.0);
   private static final fgm af = dne.b(8.0, 0.0, 16.0);
   private static final fgm ag = dne.b(10.0, 0.0, 16.0);
   private static final fgm ah = dne.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(jc.a.b);
   private static final float aj = (float)ah.b(jc.a.a);
   private static final fgm ak = dne.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   public dtc(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.b).b(c, ecd.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      if ($$4 != jc.b && $$4 != jc.a) {
         return $$0;
      } else {
         jc $$8 = $$0.c(b);
         if ($$8 == jc.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jc.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == ecd.a;
            ecd $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      if (!$$0.C) {
         iw $$4 = $$2.b();
         if ($$0 instanceof aru $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cti && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      if ($$1.c(b) == jc.b && $$1.c(c) == ecd.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (r($$0) && !this.a($$0, (dkc)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dkc)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(ebg $$0, aru $$1, iw $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dkc)$$1, $$2)) {
            Optional<dtc.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               exp $$5 = $$4.get().b;
               float $$6;
               if ($$5 == exr.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != exr.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iw $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dng.ts) && $$5 == exr.c) {
                        ebg $$10 = dng.ei.m();
                        $$1.b($$4.get().a, $$10);
                        dne.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(egg.c, $$4.get().a, egg.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iw $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           ebg $$14 = $$1.a_($$11);
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
   public ebg a(ddt $$0) {
      dka $$1 = $$0.q();
      iw $$2 = $$0.a();
      jc $$3 = $$0.e().g();
      jc $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         ecd $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == exr.c));
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgm d_(ebg $$0) {
      return fgj.a();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      fgm $$4 = switch ((ecd)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == jc.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebg $$0, djd $$1, iw $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return aj;
   }

   @Override
   public void a(djz $$0, iw $$1, cod $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bvk a(bwv $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(ebg $$0, aru $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      ebg $$4 = $$0;

      while (q($$4)) {
         cod $$5 = cod.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jc.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(ebg $$0, aru $$1, iw $$2, azz $$3) {
      ebg $$4 = $$1.a_($$2.b(1));
      ebg $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iw $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            ebg $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jc.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aru $$0, iw $$1) {
      iw.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jc.a);
         ebg $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jc.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jc.b);
            return;
         }

         if (c($$0, $$2, jc.b) && !$$0.A($$2.e())) {
            a($$0, $$2.e(), jc.b);
            return;
         }

         if (!a((djd)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aru $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      ebg $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dka)$$0, $$3);
      } else if ($$4.l() || $$4.a(dng.J)) {
         a($$0, $$3, $$2, ecd.b);
      }
   }

   private static void a(dka $$0, iw $$1, jc $$2, ecd $$3) {
      ebg $$4 = dng.tb.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == exr.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(ebg $$0, dka $$1, iw $$2) {
      iw $$4;
      iw $$3;
      if ($$0.c(b) == jc.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jc.a, ecd.a);
      a($$1, $$3, jc.b, ecd.a);
   }

   public static void a(djz $$0, iw $$1, ebg $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(djz $$0, iw $$1, ebg $$2, exp $$3) {
      ffs $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ai - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      exp $$9 = a($$0, $$3);
      lx $$10 = $$9.a(axl.b) ? lz.aO : lz.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iw a(ebg $$0, dka $$1, iw $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jc $$5 = $$0.c(b);
         BiPredicate<iw, ebg> $$6 = ($$1x, $$2x) -> $$2x.a(dng.tb) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jc b(dkc $$0, iw $$1, jc $$2) {
      jc $$3;
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

   private static ecd a(dkc $$0, iw $$1, jc $$2, boolean $$3) {
      jc $$4 = $$2.g();
      ebg $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != ecd.a ? ecd.b : ecd.a;
      } else if (!b($$5, $$2)) {
         return ecd.b;
      } else {
         ecd $$6 = $$5.c(c);
         if ($$6 != ecd.b && $$6 != ecd.a) {
            ebg $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? ecd.e : ecd.d;
         } else {
            return ecd.c;
         }
      }
   }

   public static boolean o(ebg $$0) {
      return q($$0) && $$0.c(c) == ecd.b && !$$0.c(d);
   }

   private static boolean b(ebg $$0, aru $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      iw $$4 = $$2.a($$3);
      ebg $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iw> a(djz $$0, iw $$1, ebg $$2, int $$3) {
      jc $$4 = $$2.c(b);
      BiPredicate<iw, ebg> $$5 = ($$1x, $$2x) -> $$2x.a(dng.tb) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dng.tb), $$3);
   }

   private static boolean c(dkc $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2.g());
      ebg $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(ebg $$0, boolean $$1) {
      if (!$$0.a(dng.tb)) {
         return false;
      } else {
         ecd $$2 = $$0.c(c);
         return $$2 == ecd.b || $$1 && $$2 == ecd.a;
      }
   }

   private static boolean a(ebg $$0, jc $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(ebg $$0) {
      return b($$0, jc.a);
   }

   private static boolean r(ebg $$0) {
      return b($$0, jc.b);
   }

   private static boolean b(ebg $$0, dkc $$1, iw $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dng.tb);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   private static boolean b(ebg $$0, jc $$1) {
      return $$0.a(dng.tb) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iw a(djz $$0, iw $$1, exp $$2) {
      Predicate<ebg> $$3 = $$1x -> $$1x.b() instanceof dlx && ((dlx)$$1x.b()).a($$2);
      BiPredicate<iw, ebg> $$4 = ($$1x, $$2x) -> a((djd)$$0, $$1x, $$2x);
      return a($$0, $$1, jc.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iw a(djz $$0, iw $$1) {
      BiPredicate<iw, ebg> $$2 = ($$1x, $$2x) -> a((djd)$$0, $$1x, $$2x);
      return a($$0, $$1, jc.b.f(), $$2, dtc::o, 11).orElse(null);
   }

   public static exp a(aru $$0, iw $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dtc::a).orElse(exr.a);
   }

   private static Optional<dtc.a> b(djz $$0, iw $$1, ebg $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iw $$2x = $$1x.d();
         ebg $$3 = $$0.a_($$2x);
         exp $$4;
         if ($$3.a(dng.ts) && !$$0.F_().i()) {
            $$4 = exr.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dtc.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(exp $$0) {
      return $$0 == exr.e || $$0 == exr.c;
   }

   private static boolean a(ebg $$0, ebg $$1) {
      return $$0.a(dng.tc) && $$1.a(dng.J) && $$1.y().b();
   }

   private static exp a(djz $$0, exp $$1) {
      if ($$1.a(exr.a)) {
         return $$0.F_().i() ? exr.e : exr.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iw> a(dka $$0, iw $$1, jc.b $$2, BiPredicate<iw, ebg> $$3, Predicate<ebg> $$4, int $$5) {
      jc $$6 = jc.a($$2, jc.a.b);
      iw.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         ebg $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(djd $$0, iw $$1, ebg $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fgm $$3 = $$2.g($$0, $$1);
         return !fgj.c(ak, $$3, ffw.i);
      }
   }

   static record a(iw a, exp b, ebg c) {
   }
}
