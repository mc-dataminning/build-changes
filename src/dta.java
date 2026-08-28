import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dta extends dnc implements dpz, dun {
   public static final MapCodec<dta> a = b(dta::new);
   public static final ecc<jb> b = ebu.bp;
   public static final ecc<ecb> c = ebu.bq;
   public static final ebv d = ebu.I;
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
   private static final fgk ac = dnc.b(6.0, 0.0, 16.0);
   private static final fgk ad = dnc.b(6.0, 0.0, 11.0);
   private static final fgk ae = dnc.b(6.0, 5.0, 16.0);
   private static final fgk af = dnc.b(8.0, 0.0, 16.0);
   private static final fgk ag = dnc.b(10.0, 0.0, 16.0);
   private static final fgk ah = dnc.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(jb.a.b);
   private static final float aj = (float)ah.b(jb.a.a);
   private static final fgk ak = dnc.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   public dta(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.b).b(c, ecb.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
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
            boolean $$9 = $$0.c(c) == ecb.a;
            ecb $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      if (!$$0.C) {
         iv $$4 = $$2.b();
         if ($$0 instanceof ars $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof ctg && $$3.dy().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      if ($$1.c(b) == jb.b && $$1.c(c) == ecb.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (r($$0) && !this.a($$0, (dka)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dka)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(ebe $$0, ars $$1, iv $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dka)$$1, $$2)) {
            Optional<dta.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               exn $$5 = $$4.get().b;
               float $$6;
               if ($$5 == exp.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != exp.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  iv $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dne.ts) && $$5 == exp.c) {
                        ebe $$10 = dne.ei.m();
                        $$1.b($$4.get().a, $$10);
                        dnc.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ege.c, $$4.get().a, ege.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        iv $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           ebe $$14 = $$1.a_($$11);
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
   public ebe a(ddr $$0) {
      djy $$1 = $$0.q();
      iv $$2 = $$0.a();
      jb $$3 = $$0.e().g();
      jb $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         ecb $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == exp.c));
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgk d_(ebe $$0) {
      return fgh.a();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      fgk $$4 = switch ((ecb)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == jb.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebe $$0, djb $$1, iv $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return aj;
   }

   @Override
   public void a(djx $$0, iv $$1, cob $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bvi a(bwt $$0) {
      return $$0.dW().c($$0);
   }

   private static void a(ebe $$0, ars $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      ebe $$4 = $$0;

      while (q($$4)) {
         cob $$5 = cob.a($$1, $$3, $$4);
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
   public static void c(ebe $$0, ars $$1, iv $$2, azx $$3) {
      ebe $$4 = $$1.a_($$2.b(1));
      ebe $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         iv $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            ebe $$7 = $$1.a_($$6);
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

   private static void b(ars $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jb.a);
         ebe $$4 = $$0.a_($$2);
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

         if (!a((djb)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ars $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      ebe $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (djy)$$0, $$3);
      } else if ($$4.l() || $$4.a(dne.J)) {
         a($$0, $$3, $$2, ecb.b);
      }
   }

   private static void a(djy $$0, iv $$1, jb $$2, ecb $$3) {
      ebe $$4 = dne.tb.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == exp.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(ebe $$0, djy $$1, iv $$2) {
      iv $$4;
      iv $$3;
      if ($$0.c(b) == jb.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jb.a, ecb.a);
      a($$1, $$3, jb.b, ecb.a);
   }

   public static void a(djx $$0, iv $$1, ebe $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(djx $$0, iv $$1, ebe $$2, exn $$3) {
      ffq $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ai - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      exn $$9 = a($$0, $$3);
      lw $$10 = $$9.a(axj.b) ? ly.aO : ly.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static iv a(ebe $$0, djy $$1, iv $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jb $$5 = $$0.c(b);
         BiPredicate<iv, ebe> $$6 = ($$1x, $$2x) -> $$2x.a(dne.tb) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jb b(dka $$0, iv $$1, jb $$2) {
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

   private static ecb a(dka $$0, iv $$1, jb $$2, boolean $$3) {
      jb $$4 = $$2.g();
      ebe $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != ecb.a ? ecb.b : ecb.a;
      } else if (!b($$5, $$2)) {
         return ecb.b;
      } else {
         ecb $$6 = $$5.c(c);
         if ($$6 != ecb.b && $$6 != ecb.a) {
            ebe $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? ecb.e : ecb.d;
         } else {
            return ecb.c;
         }
      }
   }

   public static boolean o(ebe $$0) {
      return q($$0) && $$0.c(c) == ecb.b && !$$0.c(d);
   }

   private static boolean b(ebe $$0, ars $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      iv $$4 = $$2.a($$3);
      ebe $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<iv> a(djx $$0, iv $$1, ebe $$2, int $$3) {
      jb $$4 = $$2.c(b);
      BiPredicate<iv, ebe> $$5 = ($$1x, $$2x) -> $$2x.a(dne.tb) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dne.tb), $$3);
   }

   private static boolean c(dka $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2.g());
      ebe $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(ebe $$0, boolean $$1) {
      if (!$$0.a(dne.tb)) {
         return false;
      } else {
         ecb $$2 = $$0.c(c);
         return $$2 == ecb.b || $$1 && $$2 == ecb.a;
      }
   }

   private static boolean a(ebe $$0, jb $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(ebe $$0) {
      return b($$0, jb.a);
   }

   private static boolean r(ebe $$0) {
      return b($$0, jb.b);
   }

   private static boolean b(ebe $$0, dka $$1, iv $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dne.tb);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   private static boolean b(ebe $$0, jb $$1) {
      return $$0.a(dne.tb) && $$0.c(b) == $$1;
   }

   @Nullable
   private static iv a(djx $$0, iv $$1, exn $$2) {
      Predicate<ebe> $$3 = $$1x -> $$1x.b() instanceof dlv && ((dlv)$$1x.b()).a($$2);
      BiPredicate<iv, ebe> $$4 = ($$1x, $$2x) -> a((djb)$$0, $$1x, $$2x);
      return a($$0, $$1, jb.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static iv a(djx $$0, iv $$1) {
      BiPredicate<iv, ebe> $$2 = ($$1x, $$2x) -> a((djb)$$0, $$1x, $$2x);
      return a($$0, $$1, jb.b.f(), $$2, dta::o, 11).orElse(null);
   }

   public static exn a(ars $$0, iv $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dta::a).orElse(exp.a);
   }

   private static Optional<dta.a> b(djx $$0, iv $$1, ebe $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         iv $$2x = $$1x.d();
         ebe $$3 = $$0.a_($$2x);
         exn $$4;
         if ($$3.a(dne.ts) && !$$0.F_().i()) {
            $$4 = exp.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dta.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(exn $$0) {
      return $$0 == exp.e || $$0 == exp.c;
   }

   private static boolean a(ebe $$0, ebe $$1) {
      return $$0.a(dne.tc) && $$1.a(dne.J) && $$1.y().b();
   }

   private static exn a(djx $$0, exn $$1) {
      if ($$1.a(exp.a)) {
         return $$0.F_().i() ? exp.e : exp.c;
      } else {
         return $$1;
      }
   }

   private static Optional<iv> a(djy $$0, iv $$1, jb.b $$2, BiPredicate<iv, ebe> $$3, Predicate<ebe> $$4, int $$5) {
      jb $$6 = jb.a($$2, jb.a.b);
      iv.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         ebe $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(djb $$0, iv $$1, ebe $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fgk $$3 = $$2.g($$0, $$1);
         return !fgh.c(ak, $$3, ffu.i);
      }
   }

   static record a(iv a, exn b, ebe c) {
   }
}
