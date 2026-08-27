import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhy extends dch implements dfc, djh {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final dqc b = dpy.bm;
   public static final dqg<dqf> c = dpy.bn;
   public static final dpz d = dpy.C;
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
   private static final etc M = dch.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final etc N = dch.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final etc O = dch.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final etc P = dch.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final etc Q = dch.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final etc R = dch.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final etc T = dch.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.b).a(c, dqf.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      if ($$1 != ij.b && $$1 != ij.a) {
         return $$0;
      } else {
         ij $$6 = $$0.c(b);
         if ($$6 == ij.a && $$3.O().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (czj)$$3, $$4)) {
            if ($$6 == ij.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dqf.a;
            dqf $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      if (!$$0.B) {
         id $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof clf && $$3.dp().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      if ($$1.c(b) == ij.b && $$1.c(c) == dqf.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (o($$0) && !this.a($$0, (czj)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (czj)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dpi $$0, apu $$1, id $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (czj)$$1, $$2)) {
            Optional<dhy.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ela $$5 = $$4.get().b;
               float $$6;
               if ($$5 == elc.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != elc.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  id $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dcj.sI) && $$5 == elc.c) {
                        dpi $$10 = dcj.dR.n();
                        $$1.b($$4.get().a, $$10);
                        dch.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dub.c, $$4.get().a, dub.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        id $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dpi $$14 = $$1.a_($$11);
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
   public dpi a(cux $$0) {
      czh $$1 = $$0.q();
      id $$2 = $$0.a();
      ij $$3 = $$0.e().g();
      ij $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dqf $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == elc.c));
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return esz.a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      dqf $$4 = $$0.c(c);
      etc $$5;
      if ($$4 == dqf.a) {
         $$5 = M;
      } else if ($$4 == dqf.b) {
         if ($$0.c(b) == ij.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dqf.c) {
         $$5 = P;
      } else if ($$4 == dqf.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      esj $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(dpi $$0, cym $$1, id $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(czg $$0, id $$1, cgj $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public boy a(bqa $$0) {
      return $$0.dN().c($$0);
   }

   private static void a(dpi $$0, apu $$1, id $$2) {
      id.a $$3 = $$2.j();
      dpi $$4 = $$0;

      while (n($$4)) {
         cgj $$5 = cgj.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ij.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dpi $$0, apu $$1, id $$2, axt $$3) {
      dpi $$4 = $$1.a_($$2.b(1));
      dpi $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         id $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dpi $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ij.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(apu $$0, id $$1) {
      id.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ij.a);
         dpi $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ij.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ij.b);
            return;
         }

         if (c($$0, $$2, ij.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ij.b);
            return;
         }

         if (!a((cym)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(apu $$0, id $$1, ij $$2) {
      id $$3 = $$1.a($$2);
      dpi $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (czh)$$0, $$3);
      } else if ($$4.i() || $$4.a(dcj.G)) {
         a($$0, $$3, $$2, dqf.b);
      }
   }

   private static void a(czh $$0, id $$1, ij $$2, dqf $$3) {
      dpi $$4 = dcj.st.n().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == elc.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dpi $$0, czh $$1, id $$2) {
      id $$4;
      id $$3;
      if ($$0.c(b) == ij.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ij.a, dqf.a);
      a($$1, $$3, ij.b, dqf.a);
   }

   public static void a(czg $$0, id $$1, dpi $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(czg $$0, id $$1, dpi $$2, ela $$3) {
      esj $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ela $$9 = a($$0, $$3);
      kl $$10 = $$9.a(avj.b) ? kn.aJ : kn.aL;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static id a(dpi $$0, czh $$1, id $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ij $$5 = $$0.c(b);
         BiPredicate<id, dpi> $$6 = ($$1x, $$2x) -> $$2x.a(dcj.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ij b(czj $$0, id $$1, ij $$2) {
      ij $$3;
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

   private static dqf a(czj $$0, id $$1, ij $$2, boolean $$3) {
      ij $$4 = $$2.g();
      dpi $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dqf.a ? dqf.b : dqf.a;
      } else if (!b($$5, $$2)) {
         return dqf.b;
      } else {
         dqf $$6 = $$5.c(c);
         if ($$6 != dqf.b && $$6 != dqf.a) {
            dpi $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dqf.e : dqf.d;
         } else {
            return dqf.c;
         }
      }
   }

   public static boolean m(dpi $$0) {
      return n($$0) && $$0.c(c) == dqf.b && !$$0.c(d);
   }

   private static boolean b(dpi $$0, apu $$1, id $$2) {
      ij $$3 = $$0.c(b);
      id $$4 = $$2.a($$3);
      dpi $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<id> a(czg $$0, id $$1, dpi $$2, int $$3) {
      ij $$4 = $$2.c(b);
      BiPredicate<id, dpi> $$5 = ($$1x, $$2x) -> $$2x.a(dcj.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dcj.st), $$3);
   }

   private static boolean c(czj $$0, id $$1, ij $$2) {
      id $$3 = $$1.a($$2.g());
      dpi $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dpi $$0, boolean $$1) {
      if (!$$0.a(dcj.st)) {
         return false;
      } else {
         dqf $$2 = $$0.c(c);
         return $$2 == dqf.b || $$1 && $$2 == dqf.a;
      }
   }

   private static boolean a(dpi $$0, ij $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dpi $$0) {
      return b($$0, ij.a);
   }

   private static boolean o(dpi $$0) {
      return b($$0, ij.b);
   }

   private static boolean b(dpi $$0, czj $$1, id $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dcj.st);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   private static boolean b(dpi $$0, ij $$1) {
      return $$0.a(dcj.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static id a(czg $$0, id $$1, ela $$2) {
      Predicate<dpi> $$3 = $$1x -> $$1x.b() instanceof dba && ((dba)$$1x.b()).a($$2);
      BiPredicate<id, dpi> $$4 = ($$1x, $$2x) -> a((cym)$$0, $$1x, $$2x);
      return a($$0, $$1, ij.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static id a(czg $$0, id $$1) {
      BiPredicate<id, dpi> $$2 = ($$1x, $$2x) -> a((cym)$$0, $$1x, $$2x);
      return a($$0, $$1, ij.b.f(), $$2, dhy::m, 11).orElse(null);
   }

   public static ela a(apu $$0, id $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dhy::a).orElse(elc.a);
   }

   private static Optional<dhy.a> b(czg $$0, id $$1, dpi $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         id $$2x = $$1x.c();
         dpi $$3 = $$0.a_($$2x);
         ela $$4;
         if ($$3.a(dcj.sI) && !$$0.D_().i()) {
            $$4 = elc.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dhy.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ela $$0) {
      return $$0 == elc.e || $$0 == elc.c;
   }

   private static boolean a(dpi $$0, dpi $$1) {
      return $$0.a(dcj.su) && $$1.a(dcj.G) && $$1.u().b();
   }

   private static ela a(czg $$0, ela $$1) {
      if ($$1.a(elc.a)) {
         return $$0.D_().i() ? elc.e : elc.c;
      } else {
         return $$1;
      }
   }

   private static Optional<id> a(czh $$0, id $$1, ij.b $$2, BiPredicate<id, dpi> $$3, Predicate<dpi> $$4, int $$5) {
      ij $$6 = ij.a($$2, ij.a.b);
      id.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dpi $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cym $$0, id $$1, dpi $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         etc $$3 = $$2.k($$0, $$1);
         return !esz.c(T, $$3, esn.i);
      }
   }

   static record a(id a, ela b, dpi c) {
   }
}
