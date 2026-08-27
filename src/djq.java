import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djq extends ddy implements dgt, dkz {
   public static final MapCodec<djq> a = b(djq::new);
   public static final drv b = drr.bm;
   public static final drz<dry> c = drr.bn;
   public static final drs d = drr.C;
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
   private static final evd M = ddy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final evd N = ddy.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final evd O = ddy.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final evd P = ddy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final evd Q = ddy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final evd R = ddy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final evd T = ddy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.b).a(c, dry.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      if ($$1 != it.b && $$1 != it.a) {
         return $$0;
      } else {
         it $$6 = $$0.c(b);
         if ($$6 == it.a && $$3.O().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (dba)$$3, $$4)) {
            if ($$6 == it.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dry.a;
            dry $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      if (!$$0.B) {
         io $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cnb && $$3.ds().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      if ($$1.c(b) == it.b && $$1.c(c) == dry.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if (m($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (o($$0) && !this.a($$0, (dba)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dba)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(drb $$0, aqm $$1, io $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dba)$$1, $$2)) {
            Optional<djq.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               emt $$5 = $$4.get().b;
               float $$6;
               if ($$5 == emv.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != emv.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  io $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dea.sI) && $$5 == emv.c) {
                        drb $$10 = dea.dR.n();
                        $$1.b($$4.get().a, $$10);
                        ddy.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dvu.c, $$4.get().a, dvu.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        io $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           drb $$14 = $$1.a_($$11);
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
   public drb a(cwz $$0) {
      day $$1 = $$0.q();
      io $$2 = $$0.a();
      it $$3 = $$0.e().g();
      it $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dry $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == emv.c));
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      return eva.a();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      dry $$4 = $$0.c(c);
      evd $$5;
      if ($$4 == dry.a) {
         $$5 = M;
      } else if ($$4 == dry.b) {
         if ($$0.c(b) == it.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dry.c) {
         $$5 = P;
      } else if ($$4 == dry.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      euk $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   protected boolean c(drb $$0, dad $$1, io $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return 0.125F;
   }

   @Override
   public void a(dax $$0, io $$1, cif $$2) {
      if (!$$2.aW()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bqn a(bru $$0) {
      return $$0.dQ().c($$0);
   }

   private static void a(drb $$0, aqm $$1, io $$2) {
      io.a $$3 = $$2.j();
      drb $$4 = $$0;

      while (n($$4)) {
         cif $$5 = cif.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(it.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(drb $$0, aqm $$1, io $$2, ayk $$3) {
      drb $$4 = $$1.a_($$2.b(1));
      drb $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         io $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            drb $$7 = $$1.a_($$6);
            if (m($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, it.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aqm $$0, io $$1) {
      io.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(it.a);
         drb $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, it.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, it.b);
            return;
         }

         if (c($$0, $$2, it.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), it.b);
            return;
         }

         if (!a((dad)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aqm $$0, io $$1, it $$2) {
      io $$3 = $$1.a($$2);
      drb $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (day)$$0, $$3);
      } else if ($$4.i() || $$4.a(dea.G)) {
         a($$0, $$3, $$2, dry.b);
      }
   }

   private static void a(day $$0, io $$1, it $$2, dry $$3) {
      drb $$4 = dea.st.n().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == emv.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(drb $$0, day $$1, io $$2) {
      io $$4;
      io $$3;
      if ($$0.c(b) == it.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, it.a, dry.a);
      a($$1, $$3, it.b, dry.a);
   }

   public static void a(dax $$0, io $$1, drb $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dax $$0, io $$1, drb $$2, emt $$3) {
      euk $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      emt $$9 = a($$0, $$3);
      kw $$10 = $$9.a(awb.b) ? ky.aL : ky.aN;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static io a(drb $$0, day $$1, io $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         it $$5 = $$0.c(b);
         BiPredicate<io, drb> $$6 = ($$1x, $$2x) -> $$2x.a(dea.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static it b(dba $$0, io $$1, it $$2) {
      it $$3;
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

   private static dry a(dba $$0, io $$1, it $$2, boolean $$3) {
      it $$4 = $$2.g();
      drb $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dry.a ? dry.b : dry.a;
      } else if (!b($$5, $$2)) {
         return dry.b;
      } else {
         dry $$6 = $$5.c(c);
         if ($$6 != dry.b && $$6 != dry.a) {
            drb $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dry.e : dry.d;
         } else {
            return dry.c;
         }
      }
   }

   public static boolean m(drb $$0) {
      return n($$0) && $$0.c(c) == dry.b && !$$0.c(d);
   }

   private static boolean b(drb $$0, aqm $$1, io $$2) {
      it $$3 = $$0.c(b);
      io $$4 = $$2.a($$3);
      drb $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<io> a(dax $$0, io $$1, drb $$2, int $$3) {
      it $$4 = $$2.c(b);
      BiPredicate<io, drb> $$5 = ($$1x, $$2x) -> $$2x.a(dea.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dea.st), $$3);
   }

   private static boolean c(dba $$0, io $$1, it $$2) {
      io $$3 = $$1.a($$2.g());
      drb $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(drb $$0, boolean $$1) {
      if (!$$0.a(dea.st)) {
         return false;
      } else {
         dry $$2 = $$0.c(c);
         return $$2 == dry.b || $$1 && $$2 == dry.a;
      }
   }

   private static boolean a(drb $$0, it $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(drb $$0) {
      return b($$0, it.a);
   }

   private static boolean o(drb $$0) {
      return b($$0, it.b);
   }

   private static boolean b(drb $$0, dba $$1, io $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(dea.st);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   private static boolean b(drb $$0, it $$1) {
      return $$0.a(dea.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static io a(dax $$0, io $$1, emt $$2) {
      Predicate<drb> $$3 = $$1x -> $$1x.b() instanceof dcr && ((dcr)$$1x.b()).a($$2);
      BiPredicate<io, drb> $$4 = ($$1x, $$2x) -> a((dad)$$0, $$1x, $$2x);
      return a($$0, $$1, it.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static io a(dax $$0, io $$1) {
      BiPredicate<io, drb> $$2 = ($$1x, $$2x) -> a((dad)$$0, $$1x, $$2x);
      return a($$0, $$1, it.b.f(), $$2, djq::m, 11).orElse(null);
   }

   public static emt a(aqm $$0, io $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(djq::a).orElse(emv.a);
   }

   private static Optional<djq.a> b(dax $$0, io $$1, drb $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         io $$2x = $$1x.c();
         drb $$3 = $$0.a_($$2x);
         emt $$4;
         if ($$3.a(dea.sI) && !$$0.D_().i()) {
            $$4 = emv.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new djq.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(emt $$0) {
      return $$0 == emv.e || $$0 == emv.c;
   }

   private static boolean a(drb $$0, drb $$1) {
      return $$0.a(dea.su) && $$1.a(dea.G) && $$1.u().b();
   }

   private static emt a(dax $$0, emt $$1) {
      if ($$1.a(emv.a)) {
         return $$0.D_().i() ? emv.e : emv.c;
      } else {
         return $$1;
      }
   }

   private static Optional<io> a(day $$0, io $$1, it.b $$2, BiPredicate<io, drb> $$3, Predicate<drb> $$4, int $$5) {
      it $$6 = it.a($$2, it.a.b);
      io.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         drb $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dad $$0, io $$1, drb $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         evd $$3 = $$2.k($$0, $$1);
         return !eva.c(T, $$3, euo.i);
      }
   }

   static record a(io a, emt b, drb c) {
   }
}
