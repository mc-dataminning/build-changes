import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class diw extends dde implements dfz, dkf {
   public static final MapCodec<diw> a = b(diw::new);
   public static final drb b = dqx.bm;
   public static final drf<dre> c = dqx.bn;
   public static final dqy d = dqx.C;
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
   private static final eui M = dde.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eui N = dde.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eui O = dde.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eui P = dde.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eui Q = dde.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eui R = dde.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eui T = dde.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.b).a(c, dre.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      if ($$1 != is.b && $$1 != is.a) {
         return $$0;
      } else {
         is $$6 = $$0.c(b);
         if ($$6 == is.a && $$3.O().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dag)$$3, $$4)) {
            if ($$6 == is.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dre.a;
            dre $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      if (!$$0.B) {
         in $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cmm && $$3.dq().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      if ($$1.c(b) == is.b && $$1.c(c) == dre.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (o($$0) && !this.a($$0, (dag)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dag)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dqh $$0, aqh $$1, in $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dag)$$1, $$2)) {
            Optional<diw.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               elz $$5 = $$4.get().b;
               float $$6;
               if ($$5 == emb.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != emb.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  in $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(ddg.sI) && $$5 == emb.c) {
                        dqh $$10 = ddg.dR.n();
                        $$1.b($$4.get().a, $$10);
                        dde.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dva.c, $$4.get().a, dva.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        in $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dqh $$14 = $$1.a_($$11);
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
   public dqh a(cwi $$0) {
      dae $$1 = $$0.q();
      in $$2 = $$0.a();
      is $$3 = $$0.e().g();
      is $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dre $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == emb.c));
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return euf.a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      dre $$4 = $$0.c(c);
      eui $$5;
      if ($$4 == dre.a) {
         $$5 = M;
      } else if ($$4 == dre.b) {
         if ($$0.c(b) == is.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dre.c) {
         $$5 = P;
      } else if ($$4 == dre.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      etp $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dqh $$0, czj $$1, in $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dad $$0, in $$1, chq $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bqf a(brh $$0) {
      return $$0.dO().c($$0);
   }

   private static void a(dqh $$0, aqh $$1, in $$2) {
      in.a $$3 = $$2.j();
      dqh $$4 = $$0;

      while (n($$4)) {
         chq $$5 = chq.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(is.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      dqh $$4 = $$1.a_($$2.b(1));
      dqh $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         in $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dqh $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, is.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aqh $$0, in $$1) {
      in.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(is.a);
         dqh $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, is.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, is.b);
            return;
         }

         if (c($$0, $$2, is.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), is.b);
            return;
         }

         if (!a((czj)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqh $$0, in $$1, is $$2) {
      in $$3 = $$1.a($$2);
      dqh $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dae)$$0, $$3);
      } else if ($$4.i() || $$4.a(ddg.G)) {
         a($$0, $$3, $$2, dre.b);
      }
   }

   private static void a(dae $$0, in $$1, is $$2, dre $$3) {
      dqh $$4 = ddg.st.n().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == emb.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dqh $$0, dae $$1, in $$2) {
      in $$4;
      in $$3;
      if ($$0.c(b) == is.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, is.a, dre.a);
      a($$1, $$3, is.b, dre.a);
   }

   public static void a(dad $$0, in $$1, dqh $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dad $$0, in $$1, dqh $$2, elz $$3) {
      etp $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      elz $$9 = a($$0, $$3);
      kv $$10 = $$9.a(avw.b) ? kx.aI : kx.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static in a(dqh $$0, dae $$1, in $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         is $$5 = $$0.c(b);
         BiPredicate<in, dqh> $$6 = ($$1x, $$2x) -> $$2x.a(ddg.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static is b(dag $$0, in $$1, is $$2) {
      is $$3;
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

   private static dre a(dag $$0, in $$1, is $$2, boolean $$3) {
      is $$4 = $$2.g();
      dqh $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dre.a ? dre.b : dre.a;
      } else if (!b($$5, $$2)) {
         return dre.b;
      } else {
         dre $$6 = $$5.c(c);
         if ($$6 != dre.b && $$6 != dre.a) {
            dqh $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dre.e : dre.d;
         } else {
            return dre.c;
         }
      }
   }

   public static boolean m(dqh $$0) {
      return n($$0) && $$0.c(c) == dre.b && !$$0.c(d);
   }

   private static boolean b(dqh $$0, aqh $$1, in $$2) {
      is $$3 = $$0.c(b);
      in $$4 = $$2.a($$3);
      dqh $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<in> a(dad $$0, in $$1, dqh $$2, int $$3) {
      is $$4 = $$2.c(b);
      BiPredicate<in, dqh> $$5 = ($$1x, $$2x) -> $$2x.a(ddg.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(ddg.st), $$3);
   }

   private static boolean c(dag $$0, in $$1, is $$2) {
      in $$3 = $$1.a($$2.g());
      dqh $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dqh $$0, boolean $$1) {
      if (!$$0.a(ddg.st)) {
         return false;
      } else {
         dre $$2 = $$0.c(c);
         return $$2 == dre.b || $$1 && $$2 == dre.a;
      }
   }

   private static boolean a(dqh $$0, is $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dqh $$0) {
      return b($$0, is.a);
   }

   private static boolean o(dqh $$0) {
      return b($$0, is.b);
   }

   private static boolean b(dqh $$0, dag $$1, in $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(ddg.st);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   private static boolean b(dqh $$0, is $$1) {
      return $$0.a(ddg.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static in a(dad $$0, in $$1, elz $$2) {
      Predicate<dqh> $$3 = $$1x -> $$1x.b() instanceof dbx && ((dbx)$$1x.b()).a($$2);
      BiPredicate<in, dqh> $$4 = ($$1x, $$2x) -> a((czj)$$0, $$1x, $$2x);
      return a($$0, $$1, is.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static in a(dad $$0, in $$1) {
      BiPredicate<in, dqh> $$2 = ($$1x, $$2x) -> a((czj)$$0, $$1x, $$2x);
      return a($$0, $$1, is.b.f(), $$2, diw::m, 11).orElse(null);
   }

   public static elz a(aqh $$0, in $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(diw::a).orElse(emb.a);
   }

   private static Optional<diw.a> b(dad $$0, in $$1, dqh $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         in $$2x = $$1x.c();
         dqh $$3 = $$0.a_($$2x);
         elz $$4;
         if ($$3.a(ddg.sI) && !$$0.D_().i()) {
            $$4 = emb.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new diw.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(elz $$0) {
      return $$0 == emb.e || $$0 == emb.c;
   }

   private static boolean a(dqh $$0, dqh $$1) {
      return $$0.a(ddg.su) && $$1.a(ddg.G) && $$1.u().b();
   }

   private static elz a(dad $$0, elz $$1) {
      if ($$1.a(emb.a)) {
         return $$0.D_().i() ? emb.e : emb.c;
      } else {
         return $$1;
      }
   }

   private static Optional<in> a(dae $$0, in $$1, is.b $$2, BiPredicate<in, dqh> $$3, Predicate<dqh> $$4, int $$5) {
      is $$6 = is.a($$2, is.a.b);
      in.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dqh $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(czj $$0, in $$1, dqh $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eui $$3 = $$2.k($$0, $$1);
         return !euf.c(T, $$3, ett.i);
      }
   }

   static record a(in a, elz b, dqh c) {
   }
}
