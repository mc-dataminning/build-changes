import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class din extends dcv implements dfq, djw {
   public static final MapCodec<din> a = b(din::new);
   public static final dqs b = dqo.bm;
   public static final dqw<dqv> c = dqo.bn;
   public static final dqp d = dqo.C;
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
   private static final ety M = dcv.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final ety N = dcv.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final ety O = dcv.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final ety P = dcv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final ety Q = dcv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final ety R = dcv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final ety T = dcv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.b).a(c, dqv.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      if ($$1 != ir.b && $$1 != ir.a) {
         return $$0;
      } else {
         ir $$6 = $$0.c(b);
         if ($$6 == ir.a && $$3.O().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (czx)$$3, $$4)) {
            if ($$6 == ir.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dqv.a;
            dqv $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      if (!$$0.B) {
         im $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof clq && $$3.dq().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      if ($$1.c(b) == ir.b && $$1.c(c) == dqv.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (o($$0) && !this.a($$0, (czx)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (czx)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dpy $$0, aqe $$1, im $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (czx)$$1, $$2)) {
            Optional<din.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               elq $$5 = $$4.get().b;
               float $$6;
               if ($$5 == els.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != els.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  im $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dcx.sI) && $$5 == els.c) {
                        dpy $$10 = dcx.dR.n();
                        $$1.b($$4.get().a, $$10);
                        dcv.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dur.c, $$4.get().a, dur.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        im $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dpy $$14 = $$1.a_($$11);
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
   public dpy a(cvl $$0) {
      czv $$1 = $$0.q();
      im $$2 = $$0.a();
      ir $$3 = $$0.e().g();
      ir $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dqv $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == els.c));
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return etv.a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      dqv $$4 = $$0.c(c);
      ety $$5;
      if ($$4 == dqv.a) {
         $$5 = M;
      } else if ($$4 == dqv.b) {
         if ($$0.c(b) == ir.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dqv.c) {
         $$5 = P;
      } else if ($$4 == dqv.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      etf $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dpy $$0, cza $$1, im $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(czu $$0, im $$1, cgu $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bpj a(bql $$0) {
      return $$0.dO().c($$0);
   }

   private static void a(dpy $$0, aqe $$1, im $$2) {
      im.a $$3 = $$2.j();
      dpy $$4 = $$0;

      while (n($$4)) {
         cgu $$5 = cgu.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ir.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      dpy $$4 = $$1.a_($$2.b(1));
      dpy $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         im $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dpy $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ir.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aqe $$0, im $$1) {
      im.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ir.a);
         dpy $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ir.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ir.b);
            return;
         }

         if (c($$0, $$2, ir.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ir.b);
            return;
         }

         if (!a((cza)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqe $$0, im $$1, ir $$2) {
      im $$3 = $$1.a($$2);
      dpy $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (czv)$$0, $$3);
      } else if ($$4.i() || $$4.a(dcx.G)) {
         a($$0, $$3, $$2, dqv.b);
      }
   }

   private static void a(czv $$0, im $$1, ir $$2, dqv $$3) {
      dpy $$4 = dcx.st.n().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == els.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dpy $$0, czv $$1, im $$2) {
      im $$4;
      im $$3;
      if ($$0.c(b) == ir.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ir.a, dqv.a);
      a($$1, $$3, ir.b, dqv.a);
   }

   public static void a(czu $$0, im $$1, dpy $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(czu $$0, im $$1, dpy $$2, elq $$3) {
      etf $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      elq $$9 = a($$0, $$3);
      ku $$10 = $$9.a(avt.b) ? kw.aI : kw.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static im a(dpy $$0, czv $$1, im $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ir $$5 = $$0.c(b);
         BiPredicate<im, dpy> $$6 = ($$1x, $$2x) -> $$2x.a(dcx.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ir b(czx $$0, im $$1, ir $$2) {
      ir $$3;
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

   private static dqv a(czx $$0, im $$1, ir $$2, boolean $$3) {
      ir $$4 = $$2.g();
      dpy $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dqv.a ? dqv.b : dqv.a;
      } else if (!b($$5, $$2)) {
         return dqv.b;
      } else {
         dqv $$6 = $$5.c(c);
         if ($$6 != dqv.b && $$6 != dqv.a) {
            dpy $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dqv.e : dqv.d;
         } else {
            return dqv.c;
         }
      }
   }

   public static boolean m(dpy $$0) {
      return n($$0) && $$0.c(c) == dqv.b && !$$0.c(d);
   }

   private static boolean b(dpy $$0, aqe $$1, im $$2) {
      ir $$3 = $$0.c(b);
      im $$4 = $$2.a($$3);
      dpy $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<im> a(czu $$0, im $$1, dpy $$2, int $$3) {
      ir $$4 = $$2.c(b);
      BiPredicate<im, dpy> $$5 = ($$1x, $$2x) -> $$2x.a(dcx.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dcx.st), $$3);
   }

   private static boolean c(czx $$0, im $$1, ir $$2) {
      im $$3 = $$1.a($$2.g());
      dpy $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dpy $$0, boolean $$1) {
      if (!$$0.a(dcx.st)) {
         return false;
      } else {
         dqv $$2 = $$0.c(c);
         return $$2 == dqv.b || $$1 && $$2 == dqv.a;
      }
   }

   private static boolean a(dpy $$0, ir $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dpy $$0) {
      return b($$0, ir.a);
   }

   private static boolean o(dpy $$0) {
      return b($$0, ir.b);
   }

   private static boolean b(dpy $$0, czx $$1, im $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dcx.st);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   private static boolean b(dpy $$0, ir $$1) {
      return $$0.a(dcx.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static im a(czu $$0, im $$1, elq $$2) {
      Predicate<dpy> $$3 = $$1x -> $$1x.b() instanceof dbo && ((dbo)$$1x.b()).a($$2);
      BiPredicate<im, dpy> $$4 = ($$1x, $$2x) -> a((cza)$$0, $$1x, $$2x);
      return a($$0, $$1, ir.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static im a(czu $$0, im $$1) {
      BiPredicate<im, dpy> $$2 = ($$1x, $$2x) -> a((cza)$$0, $$1x, $$2x);
      return a($$0, $$1, ir.b.f(), $$2, din::m, 11).orElse(null);
   }

   public static elq a(aqe $$0, im $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(din::a).orElse(els.a);
   }

   private static Optional<din.a> b(czu $$0, im $$1, dpy $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         im $$2x = $$1x.c();
         dpy $$3 = $$0.a_($$2x);
         elq $$4;
         if ($$3.a(dcx.sI) && !$$0.D_().i()) {
            $$4 = els.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new din.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(elq $$0) {
      return $$0 == els.e || $$0 == els.c;
   }

   private static boolean a(dpy $$0, dpy $$1) {
      return $$0.a(dcx.su) && $$1.a(dcx.G) && $$1.u().b();
   }

   private static elq a(czu $$0, elq $$1) {
      if ($$1.a(els.a)) {
         return $$0.D_().i() ? els.e : els.c;
      } else {
         return $$1;
      }
   }

   private static Optional<im> a(czv $$0, im $$1, ir.b $$2, BiPredicate<im, dpy> $$3, Predicate<dpy> $$4, int $$5) {
      ir $$6 = ir.a($$2, ir.a.b);
      im.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dpy $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cza $$0, im $$1, dpy $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         ety $$3 = $$2.k($$0, $$1);
         return !etv.c(T, $$3, etj.i);
      }
   }

   static record a(im a, elq b, dpy c) {
   }
}
