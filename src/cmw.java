import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cmw {
   public static final int a = 8;
   public static final int b = 4;
   private static final bro c = bal.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bro j = bro.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwc<?> a(bwc<cmv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cmv> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bxz(45, 90), new byd()));
   }

   private static void c(bwc<cmv> $$0) {
      $$0.a(
         cqe.b,
         10,
         ImmutableList.of(
            bws.a(cee.aw, 200),
            new bwn(bul.Z, 0.6F, 2),
            byx.a(cee.aw, 1.0F, 8, true),
            bzf.a(cmw::d),
            cag.a(cmv::t, byx.b(cee.aq, 0.4F, 8, false)),
            byt.a(8.0F, bro.a(30, 60)),
            bwq.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwc<cmv> $$0) {
      $$0.a(
         cqe.k,
         10,
         ImmutableList.of(
            bws.a(cee.aw, 200), new bwn(bul.Z, 0.6F, 2), byy.a(1.0F), cag.a(cmv::t, bya.a(40)), cag.a(btv::p_, bya.a(15)), bzi.a(), bxf.a(cmw::i, cee.o)
         ),
         cee.o
      );
   }

   private static void e(bwc<cmv> $$0) {
      $$0.a(cqe.n, 10, ImmutableList.of(byx.b(cee.z, 1.3F, 15, false), a(), byt.a(8.0F, bro.a(30, 60)), bxf.a(cmw::e, cee.z)), cee.z);
   }

   private static byq<cmv> a() {
      return new byq<>(ImmutableList.of(Pair.of(byl.a(0.4F), 2), Pair.of(bza.a(0.4F, 3), 2), Pair.of(new bxd(30, 60), 1)));
   }

   protected static void a(cmv $$0) {
      bwc<cmv> $$1 = $$0.ed();
      cqe $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqe.k, cqe.n, cqe.b));
      cqe $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cee.o));
   }

   protected static void a(cmv $$0, bva $$1) {
      if (!$$0.p_()) {
         if ($$1.ar() == bul.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cmv $$0, bva $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cmv $$0, bva $$1) {
      bwc<cmv> $$3 = $$0.ed();
      bva $$2 = bwv.a($$0, $$3.c(cee.z), $$1);
      $$2 = bwv.a($$0, $$3.c(cee.o), $$2);
      e($$0, $$2);
   }

   private static void e(cmv $$0, bva $$1) {
      $$0.ed().b(cee.o);
      $$0.ed().b(cee.m);
      $$0.ed().a(cee.z, $$1, (long)c.a($$0.dX().A));
   }

   private static Optional<? extends bva> d(cmv $$0) {
      return !c($$0) && !i($$0) ? $$0.ed().c(cee.l) : Optional.empty();
   }

   static boolean a(cmv $$0, jh $$1) {
      Optional<jh> $$2 = $$0.ed().c(cee.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cmv $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cmv $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.ed().c(cee.as).orElse(0);
         int $$2 = $$0.ed().c(cee.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cmv $$0, bva $$1) {
      bwc<cmv> $$2 = $$0.ed();
      $$2.b(cee.ax);
      $$2.b(cee.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cmv $$0, bva $$1) {
      if (!$$0.ed().c(cqe.n) || $$1.ar() != bul.aA) {
         if ($$1.ar() != bul.Z) {
            if (!bwv.a($$0, $$1, 4.0)) {
               if (cfk.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cmv $$0, bva $$1) {
      bwc<cmv> $$2 = $$0.ed();
      $$2.b(cee.E);
      $$2.b(cee.r);
      $$2.a(cee.o, $$1, 200L);
   }

   private static void h(cmv $$0, bva $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cmv $$0, bva $$1) {
      if (!c($$0)) {
         Optional<bva> $$2 = $$0.ed().c(cee.o);
         bva $$3 = bwv.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awk> b(cmv $$0) {
      return $$0.ed().g().map($$1 -> a($$0, $$1));
   }

   private static awk a(cmv $$0, cqe $$1) {
      if ($$1 == cqe.n || $$0.y()) {
         return awl.mt;
      } else if ($$1 == cqe.k) {
         return awl.mo;
      } else {
         return h($$0) ? awl.mt : awl.mn;
      }
   }

   private static List<cmv> g(cmv $$0) {
      return $$0.ed().c(cee.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cmv $$0) {
      return $$0.ed().a(cee.aw);
   }

   private static boolean i(cmv $$0) {
      return $$0.ed().a(cee.r);
   }

   protected static boolean c(cmv $$0) {
      return $$0.ed().a(cee.ax);
   }
}
