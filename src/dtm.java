import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtm extends dno implements dql, duz {
   public static final MapCodec<dtm> a = b(dtm::new);
   public static final eco<jc> b = ecg.bp;
   public static final eco<ecn> c = ecg.bq;
   public static final ech d = ecg.I;
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
   private static final fgw ac = dno.b(6.0, 0.0, 16.0);
   private static final fgw ad = dno.b(6.0, 0.0, 11.0);
   private static final fgw ae = dno.b(6.0, 5.0, 16.0);
   private static final fgw af = dno.b(8.0, 0.0, 16.0);
   private static final fgw ag = dno.b(10.0, 0.0, 16.0);
   private static final fgw ah = dno.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(jc.a.b);
   private static final float aj = (float)ah.b(jc.a.a);
   private static final fgw ak = dno.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.b).b(c, ecn.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
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
            boolean $$9 = $$0.c(c) == ecn.a;
            ecn $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      if (!$$0.C) {
         iw $$4 = $$2.b();
         if ($$0 instanceof asb $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof ctr && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      if ($$1.c(b) == jc.b && $$1.c(c) == ecn.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (r($$0) && !this.a($$0, (dkm)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dkm)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(ebq $$0, asb $$1, iw $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dkm)$$1, $$2)) {
            Optional<dtm.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               exz $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eyb.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eyb.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iw $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dnq.ts) && $$5 == eyb.c) {
                        ebq $$10 = dnq.ei.m();
                        $$1.b($$4.get().a, $$10);
                        dno.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(egq.c, $$4.get().a, egq.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iw $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           ebq $$14 = $$1.a_($$11);
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
   public ebq a(ded $$0) {
      dkk $$1 = $$0.q();
      iw $$2 = $$0.a();
      jc $$3 = $$0.e().g();
      jc $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         ecn $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == eyb.c));
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgw d_(ebq $$0) {
      return fgt.a();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      fgw $$4 = switch ((ecn)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == jc.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebq $$0, djn $$1, iw $$2) {
      return false;
   }

   @Override
   protected float ao_() {
      return aj;
   }

   @Override
   public void a(dkj $$0, iw $$1, com $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bvt a(bxe $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(ebq $$0, asb $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      ebq $$4 = $$0;

      while (q($$4)) {
         com $$5 = com.a($$1, $$3, $$4);
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
   public static void c(ebq $$0, asb $$1, iw $$2, bai $$3) {
      ebq $$4 = $$1.a_($$2.b(1));
      ebq $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iw $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            ebq $$7 = $$1.a_($$6);
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

   private static void b(asb $$0, iw $$1) {
      iw.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jc.a);
         ebq $$4 = $$0.a_($$2);
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

         if (!a((djn)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(asb $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      ebq $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dkk)$$0, $$3);
      } else if ($$4.l() || $$4.a(dnq.J)) {
         a($$0, $$3, $$2, ecn.b);
      }
   }

   private static void a(dkk $$0, iw $$1, jc $$2, ecn $$3) {
      ebq $$4 = dnq.tb.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == eyb.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(ebq $$0, dkk $$1, iw $$2) {
      iw $$4;
      iw $$3;
      if ($$0.c(b) == jc.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jc.a, ecn.a);
      a($$1, $$3, jc.b, ecn.a);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dkj $$0, iw $$1, ebq $$2, exz $$3) {
      fgc $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ai - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      exz $$9 = a($$0, $$3);
      lx $$10 = $$9.a(axs.b) ? lz.aO : lz.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iw a(ebq $$0, dkk $$1, iw $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jc $$5 = $$0.c(b);
         BiPredicate<iw, ebq> $$6 = ($$1x, $$2x) -> $$2x.a(dnq.tb) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jc b(dkm $$0, iw $$1, jc $$2) {
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

   private static ecn a(dkm $$0, iw $$1, jc $$2, boolean $$3) {
      jc $$4 = $$2.g();
      ebq $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != ecn.a ? ecn.b : ecn.a;
      } else if (!b($$5, $$2)) {
         return ecn.b;
      } else {
         ecn $$6 = $$5.c(c);
         if ($$6 != ecn.b && $$6 != ecn.a) {
            ebq $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? ecn.e : ecn.d;
         } else {
            return ecn.c;
         }
      }
   }

   public static boolean o(ebq $$0) {
      return q($$0) && $$0.c(c) == ecn.b && !$$0.c(d);
   }

   private static boolean b(ebq $$0, asb $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      iw $$4 = $$2.a($$3);
      ebq $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iw> a(dkj $$0, iw $$1, ebq $$2, int $$3) {
      jc $$4 = $$2.c(b);
      BiPredicate<iw, ebq> $$5 = ($$1x, $$2x) -> $$2x.a(dnq.tb) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dnq.tb), $$3);
   }

   private static boolean c(dkm $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2.g());
      ebq $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(ebq $$0, boolean $$1) {
      if (!$$0.a(dnq.tb)) {
         return false;
      } else {
         ecn $$2 = $$0.c(c);
         return $$2 == ecn.b || $$1 && $$2 == ecn.a;
      }
   }

   private static boolean a(ebq $$0, jc $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(ebq $$0) {
      return b($$0, jc.a);
   }

   private static boolean r(ebq $$0) {
      return b($$0, jc.b);
   }

   private static boolean b(ebq $$0, dkm $$1, iw $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dnq.tb);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   private static boolean b(ebq $$0, jc $$1) {
      return $$0.a(dnq.tb) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iw a(dkj $$0, iw $$1, exz $$2) {
      Predicate<ebq> $$3 = $$1x -> $$1x.b() instanceof dmh && ((dmh)$$1x.b()).a($$2);
      BiPredicate<iw, ebq> $$4 = ($$1x, $$2x) -> a((djn)$$0, $$1x, $$2x);
      return a($$0, $$1, jc.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iw a(dkj $$0, iw $$1) {
      BiPredicate<iw, ebq> $$2 = ($$1x, $$2x) -> a((djn)$$0, $$1x, $$2x);
      return a($$0, $$1, jc.b.f(), $$2, dtm::o, 11).orElse(null);
   }

   public static exz a(asb $$0, iw $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dtm::a).orElse(eyb.a);
   }

   private static Optional<dtm.a> b(dkj $$0, iw $$1, ebq $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iw $$2x = $$1x.d();
         ebq $$3 = $$0.a_($$2x);
         exz $$4;
         if ($$3.a(dnq.ts) && !$$0.F_().i()) {
            $$4 = eyb.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dtm.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(exz $$0) {
      return $$0 == eyb.e || $$0 == eyb.c;
   }

   private static boolean a(ebq $$0, ebq $$1) {
      return $$0.a(dnq.tc) && $$1.a(dnq.J) && $$1.y().b();
   }

   private static exz a(dkj $$0, exz $$1) {
      if ($$1.a(eyb.a)) {
         return $$0.F_().i() ? eyb.e : eyb.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iw> a(dkk $$0, iw $$1, jc.b $$2, BiPredicate<iw, ebq> $$3, Predicate<ebq> $$4, int $$5) {
      jc $$6 = jc.a($$2, jc.a.b);
      iw.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         ebq $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(djn $$0, iw $$1, ebq $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fgw $$3 = $$2.g($$0, $$1);
         return !fgt.c(ak, $$3, fgg.i);
      }
   }

   static record a(iw a, exz b, ebq c) {
   }
}
