import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlo extends dfw implements dir, dmy {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final dtu b = dtq.bm;
   public static final dty<dtx> c = dtq.bn;
   public static final dtr d = dtq.C;
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
   private static final exp M = dfw.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final exp N = dfw.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final exp O = dfw.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final exp P = dfw.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final exp Q = dfw.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final exp R = dfw.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final exp T = dfw.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.b).a(c, dtx.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      if ($$1 != ji.b && $$1 != ji.a) {
         return $$0;
      } else {
         ji $$6 = $$0.c(b);
         if ($$6 == ji.a && $$3.P().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dcx)$$3, $$4)) {
            if ($$6 == ji.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dtx.a;
            dtx $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof coa && $$3.dt().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      if ($$1.c(b) == ji.b && $$1.c(c) == dtx.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.aj().v());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (o($$0) && !this.a($$0, (dcx)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dcx)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dta $$0, aqt $$1, jd $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dcx)$$1, $$2)) {
            Optional<dlo.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eox $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eoz.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eoz.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jd $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dfy.sI) && $$5 == eoz.c) {
                        dta $$10 = dfy.dR.o();
                        $$1.b($$4.get().a, $$10);
                        dfw.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dxw.c, $$4.get().a, dxw.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jd $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dta $$14 = $$1.a_($$11);
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
   public dta a(cyb $$0) {
      dcv $$1 = $$0.q();
      jd $$2 = $$0.a();
      ji $$3 = $$0.e().g();
      ji $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dtx $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eoz.c));
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return exm.a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      dtx $$4 = $$0.c(c);
      exp $$5;
      if ($$4 == dtx.a) {
         $$5 = M;
      } else if ($$4 == dtx.b) {
         if ($$0.c(b) == ji.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dtx.c) {
         $$5 = P;
      } else if ($$4 == dtx.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      eww $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dcu $$0, jd $$1, cje $$2) {
      if (!$$2.aX()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public brj a(bsq $$0) {
      return $$0.dR().c($$0);
   }

   private static void a(dta $$0, aqt $$1, jd $$2) {
      jd.a $$3 = $$2.j();
      dta $$4 = $$0;

      while (n($$4)) {
         cje $$5 = cje.a($$1, $$3, $$4);
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
   public static void c(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dta $$4 = $$1.a_($$2.b(1));
      dta $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jd $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dta $$7 = $$1.a_($$6);
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

   private static void b(aqt $$0, jd $$1) {
      jd.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ji.a);
         dta $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ji.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ji.b);
            return;
         }

         if (c($$0, $$2, ji.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ji.b);
            return;
         }

         if (!a((dca)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqt $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2);
      dta $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dcv)$$0, $$3);
      } else if ($$4.i() || $$4.a(dfy.G)) {
         a($$0, $$3, $$2, dtx.b);
      }
   }

   private static void a(dcv $$0, jd $$1, ji $$2, dtx $$3) {
      dta $$4 = dfy.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eoz.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dta $$0, dcv $$1, jd $$2) {
      jd $$4;
      jd $$3;
      if ($$0.c(b) == ji.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ji.a, dtx.a);
      a($$1, $$3, ji.b, dtx.a);
   }

   public static void a(dcu $$0, jd $$1, dta $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dcu $$0, jd $$1, dta $$2, eox $$3) {
      eww $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eox $$9 = a($$0, $$3);
      lk $$10 = $$9.a(awj.b) ? lm.aL : lm.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jd a(dta $$0, dcv $$1, jd $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ji $$5 = $$0.c(b);
         BiPredicate<jd, dta> $$6 = ($$1x, $$2x) -> $$2x.a(dfy.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ji b(dcx $$0, jd $$1, ji $$2) {
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

   private static dtx a(dcx $$0, jd $$1, ji $$2, boolean $$3) {
      ji $$4 = $$2.g();
      dta $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dtx.a ? dtx.b : dtx.a;
      } else if (!b($$5, $$2)) {
         return dtx.b;
      } else {
         dtx $$6 = $$5.c(c);
         if ($$6 != dtx.b && $$6 != dtx.a) {
            dta $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dtx.e : dtx.d;
         } else {
            return dtx.c;
         }
      }
   }

   public static boolean m(dta $$0) {
      return n($$0) && $$0.c(c) == dtx.b && !$$0.c(d);
   }

   private static boolean b(dta $$0, aqt $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      jd $$4 = $$2.a($$3);
      dta $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jd> a(dcu $$0, jd $$1, dta $$2, int $$3) {
      ji $$4 = $$2.c(b);
      BiPredicate<jd, dta> $$5 = ($$1x, $$2x) -> $$2x.a(dfy.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dfy.st), $$3);
   }

   private static boolean c(dcx $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2.g());
      dta $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dta $$0, boolean $$1) {
      if (!$$0.a(dfy.st)) {
         return false;
      } else {
         dtx $$2 = $$0.c(c);
         return $$2 == dtx.b || $$1 && $$2 == dtx.a;
      }
   }

   private static boolean a(dta $$0, ji $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dta $$0) {
      return b($$0, ji.a);
   }

   private static boolean o(dta $$0) {
      return b($$0, ji.b);
   }

   private static boolean b(dta $$0, dcx $$1, jd $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dfy.st);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   private static boolean b(dta $$0, ji $$1) {
      return $$0.a(dfy.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jd a(dcu $$0, jd $$1, eox $$2) {
      Predicate<dta> $$3 = $$1x -> $$1x.b() instanceof dep && ((dep)$$1x.b()).a($$2);
      BiPredicate<jd, dta> $$4 = ($$1x, $$2x) -> a((dca)$$0, $$1x, $$2x);
      return a($$0, $$1, ji.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jd a(dcu $$0, jd $$1) {
      BiPredicate<jd, dta> $$2 = ($$1x, $$2x) -> a((dca)$$0, $$1x, $$2x);
      return a($$0, $$1, ji.b.f(), $$2, dlo::m, 11).orElse(null);
   }

   public static eox a(aqt $$0, jd $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dlo::a).orElse(eoz.a);
   }

   private static Optional<dlo.a> b(dcu $$0, jd $$1, dta $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jd $$2x = $$1x.c();
         dta $$3 = $$0.a_($$2x);
         eox $$4;
         if ($$3.a(dfy.sI) && !$$0.D_().i()) {
            $$4 = eoz.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dlo.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eox $$0) {
      return $$0 == eoz.e || $$0 == eoz.c;
   }

   private static boolean a(dta $$0, dta $$1) {
      return $$0.a(dfy.su) && $$1.a(dfy.G) && $$1.u().b();
   }

   private static eox a(dcu $$0, eox $$1) {
      if ($$1.a(eoz.a)) {
         return $$0.D_().i() ? eoz.e : eoz.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jd> a(dcv $$0, jd $$1, ji.b $$2, BiPredicate<jd, dta> $$3, Predicate<dta> $$4, int $$5) {
      ji $$6 = ji.a($$2, ji.a.b);
      jd.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dta $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dca $$0, jd $$1, dta $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         exp $$3 = $$2.k($$0, $$1);
         return !exm.c(T, $$3, exa.i);
      }
   }

   static record a(jd a, eox b, dta c) {
   }
}
