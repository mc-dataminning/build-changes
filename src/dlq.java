import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlq extends dfy implements dit, dna {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final dtw b = dts.bm;
   public static final dua<dtz> c = dts.bn;
   public static final dtt d = dts.C;
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
   private static final float F = 2.0F;
   private static final int G = 2;
   private static final float H = 5.0F;
   private static final float I = 0.011377778F;
   private static final int J = 7;
   private static final int K = 10;
   private static final float L = 0.6875F;
   private static final ext M = dfy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ext N = dfy.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ext O = dfy.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ext P = dfy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ext Q = dfy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ext R = dfy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ext T = dfy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.b).a(c, dtz.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      if ($$1 != ji.b && $$1 != ji.a) {
         return $$0;
      } else {
         ji $$6 = $$0.c(b);
         if ($$6 == ji.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcz)$$3, $$4)) {
            if ($$6 == ji.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dtz.a;
            dtz $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof coc && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      if ($$1.c(b) == ji.b && $$1.c(c) == dtz.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().v());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (o($$0) && !this.a($$0, (dcz)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dcz)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dtc $$0, aqu $$1, jd $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dcz)$$1, $$2)) {
            Optional<dlq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               epb $$5 = $$4.get().b;
               float $$6;
               if ($$5 == epd.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != epd.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jd $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dga.sI) && $$5 == epd.c) {
                        dtc $$10 = dga.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dfy.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dxz.c, $$4.get().a, dxz.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jd $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dtc $$14 = $$1.a_($$11);
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
   public dtc a(cyd $$0) {
      dcx $$1 = $$0.q();
      jd $$2 = $$0.a();
      ji $$3 = $$0.e().g();
      ji $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dtz $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == epd.c));
      }
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(d) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected ext f(dtc $$0, dcc $$1, jd $$2) {
      return exq.a();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      dtz $$4 = $$0.c(c);
      ext $$5;
      if ($$4 == dtz.a) {
         $$5 = M;
      } else if ($$4 == dtz.b) {
         if ($$0.c(b) == ji.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dtz.c) {
         $$5 = P;
      } else if ($$4 == dtz.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      exa $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dtc $$0, dcc $$1, jd $$2) {
      return false;
   }

   @Override
   protected float av_() {
      return 0.125F;
   }

   @Override
   public void a(dcw $$0, jd $$1, cjg $$2) {
      if (!$$2.aX()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public brk a(bsr $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(dtc $$0, aqu $$1, jd $$2) {
      jd.a $$3 = $$2.k();
      dtc $$4 = $$0;

      while (n($$4)) {
         cjg $$5 = cjg.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ji.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dtc $$4 = $$1.a_($$2.b(1));
      dtc $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jd $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dtc $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ji.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aqu $$0, jd $$1) {
      jd.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ji.a);
         dtc $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ji.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ji.b);
            return;
         }

         if (c($$0, $$2, ji.b) && !$$0.z($$2.e())) {
            a($$0, $$2.e(), ji.b);
            return;
         }

         if (!a((dcc)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqu $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2);
      dtc $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dcx)$$0, $$3);
      } else if ($$4.i() || $$4.a(dga.G)) {
         a($$0, $$3, $$2, dtz.b);
      }
   }

   private static void a(dcx $$0, jd $$1, ji $$2, dtz $$3) {
      dtc $$4 = dga.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == epd.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dtc $$0, dcx $$1, jd $$2) {
      jd $$4;
      jd $$3;
      if ($$0.c(b) == ji.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, ji.a, dtz.a);
      a($$1, $$3, ji.b, dtz.a);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dcw $$0, jd $$1, dtc $$2, epb $$3) {
      exa $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      epb $$9 = a($$0, $$3);
      lk $$10 = $$9.a(awk.b) ? lm.aL : lm.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jd a(dtc $$0, dcx $$1, jd $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ji $$5 = $$0.c(b);
         BiPredicate<jd, dtc> $$6 = ($$1x, $$2x) -> $$2x.a(dga.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ji b(dcz $$0, jd $$1, ji $$2) {
      ji $$3;
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

   private static dtz a(dcz $$0, jd $$1, ji $$2, boolean $$3) {
      ji $$4 = $$2.g();
      dtc $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dtz.a ? dtz.b : dtz.a;
      } else if (!b($$5, $$2)) {
         return dtz.b;
      } else {
         dtz $$6 = $$5.c(c);
         if ($$6 != dtz.b && $$6 != dtz.a) {
            dtc $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dtz.e : dtz.d;
         } else {
            return dtz.c;
         }
      }
   }

   public static boolean m(dtc $$0) {
      return n($$0) && $$0.c(c) == dtz.b && !$$0.c(d);
   }

   private static boolean b(dtc $$0, aqu $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      jd $$4 = $$2.a($$3);
      dtc $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jd> a(dcw $$0, jd $$1, dtc $$2, int $$3) {
      ji $$4 = $$2.c(b);
      BiPredicate<jd, dtc> $$5 = ($$1x, $$2x) -> $$2x.a(dga.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dga.st), $$3);
   }

   private static boolean c(dcz $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2.g());
      dtc $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dtc $$0, boolean $$1) {
      if (!$$0.a(dga.st)) {
         return false;
      } else {
         dtz $$2 = $$0.c(c);
         return $$2 == dtz.b || $$1 && $$2 == dtz.a;
      }
   }

   private static boolean a(dtc $$0, ji $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dtc $$0) {
      return b($$0, ji.a);
   }

   private static boolean o(dtc $$0) {
      return b($$0, ji.b);
   }

   private static boolean b(dtc $$0, dcz $$1, jd $$2) {
      return n($$0) && !$$1.a_($$2.d()).a(dga.st);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   private static boolean b(dtc $$0, ji $$1) {
      return $$0.a(dga.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jd a(dcw $$0, jd $$1, epb $$2) {
      Predicate<dtc> $$3 = $$1x -> $$1x.b() instanceof der && ((der)$$1x.b()).a($$2);
      BiPredicate<jd, dtc> $$4 = ($$1x, $$2x) -> a((dcc)$$0, $$1x, $$2x);
      return a($$0, $$1, ji.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jd a(dcw $$0, jd $$1) {
      BiPredicate<jd, dtc> $$2 = ($$1x, $$2x) -> a((dcc)$$0, $$1x, $$2x);
      return a($$0, $$1, ji.b.f(), $$2, dlq::m, 11).orElse(null);
   }

   public static epb a(aqu $$0, jd $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dlq::a).orElse(epd.a);
   }

   private static Optional<dlq.a> b(dcw $$0, jd $$1, dtc $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jd $$2x = $$1x.d();
         dtc $$3 = $$0.a_($$2x);
         epb $$4;
         if ($$3.a(dga.sI) && !$$0.D_().i()) {
            $$4 = epd.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dlq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(epb $$0) {
      return $$0 == epd.e || $$0 == epd.c;
   }

   private static boolean a(dtc $$0, dtc $$1) {
      return $$0.a(dga.su) && $$1.a(dga.G) && $$1.u().b();
   }

   private static epb a(dcw $$0, epb $$1) {
      if ($$1.a(epd.a)) {
         return $$0.D_().i() ? epd.e : epd.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jd> a(dcx $$0, jd $$1, ji.b $$2, BiPredicate<jd, dtc> $$3, Predicate<dtc> $$4, int $$5) {
      ji $$6 = ji.a($$2, ji.a.b);
      jd.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dtc $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dcc $$0, jd $$1, dtc $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ext $$3 = $$2.k($$0, $$1);
         return !exq.c(T, $$3, exe.i);
      }
   }

   static record a(jd a, epb b, dtc c) {
   }
}
