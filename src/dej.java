import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dej extends cys implements dbn, dfs {
   public static final MapCodec<dej> a = b(dej::new);
   public static final dmd b = dlz.bm;
   public static final dmh<dmg> c = dlz.bn;
   public static final dma d = dlz.C;
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
   private static final eos M = cys.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eos N = cys.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eos O = cys.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eos P = cys.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eos Q = cys.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eos R = cys.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eos T = cys.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   public dej(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.b).a(c, dmg.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      if ($$1 != ie.b && $$1 != ie.a) {
         return $$0;
      } else {
         ie $$6 = $$0.c(b);
         if ($$6 == ie.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cvu)$$3, $$4)) {
            if ($$6 == ie.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dmg.a;
            dmg $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof ciq && $$3.dp().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      if ($$1.c(b) == ie.b && $$1.c(c) == dmg.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (o($$0) && !this.a($$0, (cvu)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cvu)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dlj $$0, aow $$1, hz $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cvu)$$1, $$2)) {
            Optional<dej.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               egv $$5 = $$4.get().b;
               float $$6;
               if ($$5 == egx.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != egx.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hz $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cyu.sI) && $$5 == egx.c) {
                        dlj $$10 = cyu.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cys.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dpw.c, $$4.get().a, dpw.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hz $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dlj $$14 = $$1.a_($$11);
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
   public dlj a(crk $$0) {
      cvs $$1 = $$0.q();
      hz $$2 = $$0.a();
      ie $$3 = $$0.e().g();
      ie $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dmg $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == egx.c));
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return eop.a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      dmg $$4 = $$0.c(c);
      eos $$5;
      if ($$4 == dmg.a) {
         $$5 = M;
      } else if ($$4 == dmg.b) {
         if ($$0.c(b) == ie.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dmg.c) {
         $$5 = P;
      } else if ($$4 == dmg.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      enz $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dlj $$0, cux $$1, hz $$2) {
      return false;
   }

   @Override
   protected float aw_() {
      return 0.125F;
   }

   @Override
   public void a(cvr $$0, hz $$1, cdv $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bmp a(bnq $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dlj $$0, aow $$1, hz $$2) {
      hz.a $$3 = $$2.j();
      dlj $$4 = $$0;

      while (n($$4)) {
         cdv $$5 = cdv.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ie.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dlj $$0, aow $$1, hz $$2, awp $$3) {
      dlj $$4 = $$1.a_($$2.b(1));
      dlj $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hz $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dlj $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ie.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aow $$0, hz $$1) {
      hz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ie.a);
         dlj $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ie.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ie.b);
            return;
         }

         if (c($$0, $$2, ie.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ie.b);
            return;
         }

         if (!a((cux)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aow $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2);
      dlj $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cvs)$$0, $$3);
      } else if ($$4.i() || $$4.a(cyu.G)) {
         a($$0, $$3, $$2, dmg.b);
      }
   }

   private static void a(cvs $$0, hz $$1, ie $$2, dmg $$3) {
      dlj $$4 = cyu.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == egx.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dlj $$0, cvs $$1, hz $$2) {
      hz $$4;
      hz $$3;
      if ($$0.c(b) == ie.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ie.a, dmg.a);
      a($$1, $$3, ie.b, dmg.a);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cvr $$0, hz $$1, dlj $$2, egv $$3) {
      enz $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      egv $$9 = a($$0, $$3);
      jx $$10 = $$9.a(auf.b) ? jz.aI : jz.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hz a(dlj $$0, cvs $$1, hz $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ie $$5 = $$0.c(b);
         BiPredicate<hz, dlj> $$6 = ($$1x, $$2x) -> $$2x.a(cyu.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ie b(cvu $$0, hz $$1, ie $$2) {
      ie $$3;
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

   private static dmg a(cvu $$0, hz $$1, ie $$2, boolean $$3) {
      ie $$4 = $$2.g();
      dlj $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dmg.a ? dmg.b : dmg.a;
      } else if (!b($$5, $$2)) {
         return dmg.b;
      } else {
         dmg $$6 = $$5.c(c);
         if ($$6 != dmg.b && $$6 != dmg.a) {
            dlj $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dmg.e : dmg.d;
         } else {
            return dmg.c;
         }
      }
   }

   public static boolean m(dlj $$0) {
      return n($$0) && $$0.c(c) == dmg.b && !$$0.c(d);
   }

   private static boolean b(dlj $$0, aow $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      hz $$4 = $$2.a($$3);
      dlj $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hz> a(cvr $$0, hz $$1, dlj $$2, int $$3) {
      ie $$4 = $$2.c(b);
      BiPredicate<hz, dlj> $$5 = ($$1x, $$2x) -> $$2x.a(cyu.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cyu.st), $$3);
   }

   private static boolean c(cvu $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2.g());
      dlj $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dlj $$0, boolean $$1) {
      if (!$$0.a(cyu.st)) {
         return false;
      } else {
         dmg $$2 = $$0.c(c);
         return $$2 == dmg.b || $$1 && $$2 == dmg.a;
      }
   }

   private static boolean a(dlj $$0, ie $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dlj $$0) {
      return b($$0, ie.a);
   }

   private static boolean o(dlj $$0) {
      return b($$0, ie.b);
   }

   private static boolean b(dlj $$0, cvu $$1, hz $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cyu.st);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   private static boolean b(dlj $$0, ie $$1) {
      return $$0.a(cyu.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hz a(cvr $$0, hz $$1, egv $$2) {
      Predicate<dlj> $$3 = $$1x -> $$1x.b() instanceof cxl && ((cxl)$$1x.b()).a($$2);
      BiPredicate<hz, dlj> $$4 = ($$1x, $$2x) -> a((cux)$$0, $$1x, $$2x);
      return a($$0, $$1, ie.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hz a(cvr $$0, hz $$1) {
      BiPredicate<hz, dlj> $$2 = ($$1x, $$2x) -> a((cux)$$0, $$1x, $$2x);
      return a($$0, $$1, ie.b.f(), $$2, dej::m, 11).orElse(null);
   }

   public static egv a(aow $$0, hz $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dej::a).orElse(egx.a);
   }

   private static Optional<dej.a> b(cvr $$0, hz $$1, dlj $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hz $$2x = $$1x.c();
         dlj $$3 = $$0.a_($$2x);
         egv $$4;
         if ($$3.a(cyu.sI) && !$$0.E_().i()) {
            $$4 = egx.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dej.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(egv $$0) {
      return $$0 == egx.e || $$0 == egx.c;
   }

   private static boolean a(dlj $$0, dlj $$1) {
      return $$0.a(cyu.su) && $$1.a(cyu.G) && $$1.u().b();
   }

   private static egv a(cvr $$0, egv $$1) {
      if ($$1.a(egx.a)) {
         return $$0.E_().i() ? egx.e : egx.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hz> a(cvs $$0, hz $$1, ie.b $$2, BiPredicate<hz, dlj> $$3, Predicate<dlj> $$4, int $$5) {
      ie $$6 = ie.a($$2, ie.a.b);
      hz.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dlj $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cux $$0, hz $$1, dlj $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eos $$3 = $$2.k($$0, $$1);
         return !eop.c(T, $$3, eod.i);
      }
   }

   static record a(hz a, egv b, dlj c) {
   }
}
