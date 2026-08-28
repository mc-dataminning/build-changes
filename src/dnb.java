import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnb extends dhj implements dke, dol {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final dvi b = dve.bm;
   public static final dvm<dvl> c = dve.bn;
   public static final dvf d = dve.C;
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
   private static final float G = 2.0F;
   private static final int H = 2;
   private static final float I = 5.0F;
   private static final float J = 0.011377778F;
   private static final int K = 7;
   private static final int L = 10;
   private static final float M = 0.6875F;
   private static final ezm N = dhj.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ezm O = dhj.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ezm P = dhj.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ezm Q = dhj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ezm R = dhj.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ezm S = dhj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float T = 0.125F;
   private static final ezm U = dhj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.b).b(c, dvl.b).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      if ($$1 != jj.b && $$1 != jj.a) {
         return $$0;
      } else {
         jj $$6 = $$0.c(b);
         if ($$6 == jj.a && $$3.R().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dej)$$3, $$4)) {
            if ($$6 == jj.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dvl.a;
            dvl $$8 = a($$3, $$4, $$6, $$7);
            return $$0.b(c, $$8);
         }
      }
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      if (!$$0.B) {
         je $$4 = $$2.b();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cpb && $$3.dv().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      if ($$1.c(b) == jj.b && $$1.c(c) == dvl.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ak().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (r($$0) && !this.a($$0, (dej)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dej)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(duo $$0, arh $$1, je $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dej)$$1, $$2)) {
            Optional<dnb.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eqo $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eqq.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eqq.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  je $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dhl.sI) && $$5 == eqq.c) {
                        duo $$10 = dhl.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dhj.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dzl.c, $$4.get().a, dzl.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        je $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           duo $$14 = $$1.a_($$11);
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
   public duo a(czk $$0) {
      deh $$1 = $$0.q();
      je $$2 = $$0.a();
      jj $$3 = $$0.e().g();
      jj $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dvl $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().b(b, $$4).b(c, $$6).b(d, Boolean.valueOf($$1.b_($$2).a() == eqq.c));
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected ezm d_(duo $$0) {
      return ezj.a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      dvl $$4 = $$0.c(c);
      ezm $$5;
      if ($$4 == dvl.a) {
         $$5 = N;
      } else if ($$4 == dvl.b) {
         if ($$0.c(b) == jj.a) {
            $$5 = P;
         } else {
            $$5 = O;
         }
      } else if ($$4 == dvl.c) {
         $$5 = Q;
      } else if ($$4 == dvl.d) {
         $$5 = R;
      } else {
         $$5 = S;
      }

      eys $$11 = $$0.a($$2);
      return $$5.a($$11.d, 0.0, $$11.f);
   }

   @Override
   protected boolean a_(duo $$0, ddl $$1, je $$2) {
      return false;
   }

   @Override
   protected float as_() {
      return 0.125F;
   }

   @Override
   public void a(deg $$0, je $$1, ckd $$2) {
      if (!$$2.ba()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bsg a(bto $$0) {
      return $$0.dT().c($$0);
   }

   private static void a(duo $$0, arh $$1, je $$2) {
      je.a $$3 = $$2.k();
      duo $$4 = $$0;

      while (q($$4)) {
         ckd $$5 = ckd.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jj.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(duo $$0, arh $$1, je $$2, azl $$3) {
      duo $$4 = $$1.a_($$2.b(1));
      duo $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         je $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            duo $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jj.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(arh $$0, je $$1) {
      je.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jj.a);
         duo $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jj.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jj.b);
            return;
         }

         if (c($$0, $$2, jj.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), jj.b);
            return;
         }

         if (!a((ddl)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(arh $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2);
      duo $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (deh)$$0, $$3);
      } else if ($$4.l() || $$4.a(dhl.G)) {
         a($$0, $$3, $$2, dvl.b);
      }
   }

   private static void a(deh $$0, je $$1, jj $$2, dvl $$3) {
      duo $$4 = dhl.st.o().b(b, $$2).b(c, $$3).b(d, Boolean.valueOf($$0.b_($$1).a() == eqq.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(duo $$0, deh $$1, je $$2) {
      je $$4;
      je $$3;
      if ($$0.c(b) == jj.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jj.a, dvl.a);
      a($$1, $$3, jj.b, dvl.a);
   }

   public static void a(deg $$0, je $$1, duo $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(deg $$0, je $$1, duo $$2, eqo $$3) {
      eys $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.d;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.f;
      eqo $$9 = a($$0, $$3);
      ll $$10 = $$9.a(awz.b) ? ln.aL : ln.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static je a(duo $$0, deh $$1, je $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jj $$5 = $$0.c(b);
         BiPredicate<je, duo> $$6 = ($$1x, $$2x) -> $$2x.a(dhl.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jj b(dej $$0, je $$1, jj $$2) {
      jj $$3;
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

   private static dvl a(dej $$0, je $$1, jj $$2, boolean $$3) {
      jj $$4 = $$2.g();
      duo $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dvl.a ? dvl.b : dvl.a;
      } else if (!b($$5, $$2)) {
         return dvl.b;
      } else {
         dvl $$6 = $$5.c(c);
         if ($$6 != dvl.b && $$6 != dvl.a) {
            duo $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dvl.e : dvl.d;
         } else {
            return dvl.c;
         }
      }
   }

   public static boolean o(duo $$0) {
      return q($$0) && $$0.c(c) == dvl.b && !$$0.c(d);
   }

   private static boolean b(duo $$0, arh $$1, je $$2) {
      jj $$3 = $$0.c(b);
      je $$4 = $$2.a($$3);
      duo $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<je> a(deg $$0, je $$1, duo $$2, int $$3) {
      jj $$4 = $$2.c(b);
      BiPredicate<je, duo> $$5 = ($$1x, $$2x) -> $$2x.a(dhl.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dhl.st), $$3);
   }

   private static boolean c(dej $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2.g());
      duo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(duo $$0, boolean $$1) {
      if (!$$0.a(dhl.st)) {
         return false;
      } else {
         dvl $$2 = $$0.c(c);
         return $$2 == dvl.b || $$1 && $$2 == dvl.a;
      }
   }

   private static boolean a(duo $$0, jj $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(duo $$0) {
      return b($$0, jj.a);
   }

   private static boolean r(duo $$0) {
      return b($$0, jj.b);
   }

   private static boolean b(duo $$0, dej $$1, je $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dhl.st);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   private static boolean b(duo $$0, jj $$1) {
      return $$0.a(dhl.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static je a(deg $$0, je $$1, eqo $$2) {
      Predicate<duo> $$3 = $$1x -> $$1x.b() instanceof dgc && ((dgc)$$1x.b()).a($$2);
      BiPredicate<je, duo> $$4 = ($$1x, $$2x) -> a((ddl)$$0, $$1x, $$2x);
      return a($$0, $$1, jj.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static je a(deg $$0, je $$1) {
      BiPredicate<je, duo> $$2 = ($$1x, $$2x) -> a((ddl)$$0, $$1x, $$2x);
      return a($$0, $$1, jj.b.f(), $$2, dnb::o, 11).orElse(null);
   }

   public static eqo a(arh $$0, je $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dnb::a).orElse(eqq.a);
   }

   private static Optional<dnb.a> b(deg $$0, je $$1, duo $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         je $$2x = $$1x.d();
         duo $$3 = $$0.a_($$2x);
         eqo $$4;
         if ($$3.a(dhl.sI) && !$$0.B_().i()) {
            $$4 = eqq.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dnb.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eqo $$0) {
      return $$0 == eqq.e || $$0 == eqq.c;
   }

   private static boolean a(duo $$0, duo $$1) {
      return $$0.a(dhl.su) && $$1.a(dhl.G) && $$1.y().b();
   }

   private static eqo a(deg $$0, eqo $$1) {
      if ($$1.a(eqq.a)) {
         return $$0.B_().i() ? eqq.e : eqq.c;
      } else {
         return $$1;
      }
   }

   private static Optional<je> a(deh $$0, je $$1, jj.b $$2, BiPredicate<je, duo> $$3, Predicate<duo> $$4, int $$5) {
      jj $$6 = jj.a($$2, jj.a.b);
      je.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         duo $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(ddl $$0, je $$1, duo $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         ezm $$3 = $$2.g($$0, $$1);
         return !ezj.c(U, $$3, eyw.i);
      }
   }

   static record a(je a, eqo b, duo c) {
   }
}
