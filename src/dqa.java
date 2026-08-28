import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqa extends dke implements dna, drl {
   public static final MapCodec<dqa> a = b(dqa::new);
   public static final dyo<jn> b = dyg.bp;
   public static final dyo<dyn> c = dyg.bq;
   public static final dyh d = dyg.I;
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
   private static final float V = 2.0F;
   private static final int W = 2;
   private static final float X = 5.0F;
   private static final float Y = 0.011377778F;
   private static final int Z = 7;
   private static final int aa = 10;
   private static final fcr ab = dke.b(6.0, 0.0, 16.0);
   private static final fcr ac = dke.b(6.0, 0.0, 11.0);
   private static final fcr ad = dke.b(6.0, 5.0, 16.0);
   private static final fcr ae = dke.b(8.0, 0.0, 16.0);
   private static final fcr af = dke.b(10.0, 0.0, 16.0);
   private static final fcr ag = dke.b(12.0, 0.0, 16.0);
   private static final double ah = ad.b(jn.a.b);
   private static final float ai = (float)ag.b(jn.a.a);
   private static final fcr aj = dke.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.b).b(c, dyn.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if ($$4 != jn.b && $$4 != jn.a) {
         return $$0;
      } else {
         jn $$8 = $$0.c(b);
         if ($$8 == jn.a && $$2.U().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jn.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == dyn.a;
            dyn $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cqx && $$3.dx().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      if ($$1.c(b) == jn.b && $$1.c(c) == dyn.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (r($$0) && !this.a($$0, (dhc)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dhc)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dxq $$0, ard $$1, ji $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dhc)$$1, $$2)) {
            Optional<dqa.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               etv $$5 = $$4.get().b;
               float $$6;
               if ($$5 == etx.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != etx.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  ji $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dkg.tm) && $$5 == etx.c) {
                        dxq $$10 = dkg.ee.m();
                        $$1.b($$4.get().a, $$10);
                        dke.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ecp.c, $$4.get().a, ecp.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        ji $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dxq $$14 = $$1.a_($$11);
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
   public dxq a(dax $$0) {
      dha $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.e().g();
      jn $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dyn $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == etx.c));
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcr d_(dxq $$0) {
      return fco.a();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      fcr $$4 = switch ((dyn)$$0.c(c)) {
         case a -> ab;
         case b -> $$0.c(b) == jn.a ? ad : ac;
         case c -> ae;
         case d -> af;
         case e -> ag;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(dxq $$0, dgf $$1, ji $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return ai;
   }

   @Override
   public void a(dgz $$0, ji $$1, clv $$2) {
      if (!$$2.bb()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public btp a(bva $$0) {
      return $$0.dV().c($$0);
   }

   private static void a(dxq $$0, ard $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      dxq $$4 = $$0;

      while (q($$4)) {
         clv $$5 = clv.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jn.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dxq $$4 = $$1.a_($$2.b(1));
      dxq $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         ji $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dxq $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jn.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(ard $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jn.a);
         dxq $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jn.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jn.b);
            return;
         }

         if (c($$0, $$2, jn.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jn.b);
            return;
         }

         if (!a((dgf)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dxq $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dha)$$0, $$3);
      } else if ($$4.l() || $$4.a(dkg.J)) {
         a($$0, $$3, $$2, dyn.b);
      }
   }

   private static void a(dha $$0, ji $$1, jn $$2, dyn $$3) {
      dxq $$4 = dkg.sV.m().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == etx.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dxq $$0, dha $$1, ji $$2) {
      ji $$4;
      ji $$3;
      if ($$0.c(b) == jn.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jn.a, dyn.a);
      a($$1, $$3, jn.b, dyn.a);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dgz $$0, ji $$1, dxq $$2, etv $$3) {
      fbx $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)$$1.v() + ah - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      etv $$9 = a($$0, $$3);
      lr $$10 = $$9.a(awv.b) ? lt.aO : lt.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static ji a(dxq $$0, dha $$1, ji $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jn $$5 = $$0.c(b);
         BiPredicate<ji, dxq> $$6 = ($$1x, $$2x) -> $$2x.a(dkg.sV) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jn b(dhc $$0, ji $$1, jn $$2) {
      jn $$3;
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

   private static dyn a(dhc $$0, ji $$1, jn $$2, boolean $$3) {
      jn $$4 = $$2.g();
      dxq $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dyn.a ? dyn.b : dyn.a;
      } else if (!b($$5, $$2)) {
         return dyn.b;
      } else {
         dyn $$6 = $$5.c(c);
         if ($$6 != dyn.b && $$6 != dyn.a) {
            dxq $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dyn.e : dyn.d;
         } else {
            return dyn.c;
         }
      }
   }

   public static boolean o(dxq $$0) {
      return q($$0) && $$0.c(c) == dyn.b && !$$0.c(d);
   }

   private static boolean b(dxq $$0, ard $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      ji $$4 = $$2.a($$3);
      dxq $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<ji> a(dgz $$0, ji $$1, dxq $$2, int $$3) {
      jn $$4 = $$2.c(b);
      BiPredicate<ji, dxq> $$5 = ($$1x, $$2x) -> $$2x.a(dkg.sV) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dkg.sV), $$3);
   }

   private static boolean c(dhc $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2.g());
      dxq $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dxq $$0, boolean $$1) {
      if (!$$0.a(dkg.sV)) {
         return false;
      } else {
         dyn $$2 = $$0.c(c);
         return $$2 == dyn.b || $$1 && $$2 == dyn.a;
      }
   }

   private static boolean a(dxq $$0, jn $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(dxq $$0) {
      return b($$0, jn.a);
   }

   private static boolean r(dxq $$0) {
      return b($$0, jn.b);
   }

   private static boolean b(dxq $$0, dhc $$1, ji $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dkg.sV);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   private static boolean b(dxq $$0, jn $$1) {
      return $$0.a(dkg.sV) && $$0.c(b) == $$1;
   }

   @Nullable
   private static ji a(dgz $$0, ji $$1, etv $$2) {
      Predicate<dxq> $$3 = $$1x -> $$1x.b() instanceof dix && ((dix)$$1x.b()).a($$2);
      BiPredicate<ji, dxq> $$4 = ($$1x, $$2x) -> a((dgf)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static ji a(dgz $$0, ji $$1) {
      BiPredicate<ji, dxq> $$2 = ($$1x, $$2x) -> a((dgf)$$0, $$1x, $$2x);
      return a($$0, $$1, jn.b.f(), $$2, dqa::o, 11).orElse(null);
   }

   public static etv a(ard $$0, ji $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dqa::a).orElse(etx.a);
   }

   private static Optional<dqa.a> b(dgz $$0, ji $$1, dxq $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         ji $$2x = $$1x.d();
         dxq $$3 = $$0.a_($$2x);
         etv $$4;
         if ($$3.a(dkg.tm) && !$$0.B_().i()) {
            $$4 = etx.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dqa.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(etv $$0) {
      return $$0 == etx.e || $$0 == etx.c;
   }

   private static boolean a(dxq $$0, dxq $$1) {
      return $$0.a(dkg.sW) && $$1.a(dkg.J) && $$1.y().b();
   }

   private static etv a(dgz $$0, etv $$1) {
      if ($$1.a(etx.a)) {
         return $$0.B_().i() ? etx.e : etx.c;
      } else {
         return $$1;
      }
   }

   private static Optional<ji> a(dha $$0, ji $$1, jn.b $$2, BiPredicate<ji, dxq> $$3, Predicate<dxq> $$4, int $$5) {
      jn $$6 = jn.a($$2, jn.a.b);
      ji.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dxq $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dgf $$0, ji $$1, dxq $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fcr $$3 = $$2.g($$0, $$1);
         return !fco.c(aj, $$3, fcb.i);
      }
   }

   static record a(ji a, etv b, dxq c) {
   }
}
