import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ckj {
   public static final int a = 8;
   public static final int b = 4;
   private static final bph c = aze.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bph j = bph.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bts<?> a(bts<cki> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cki> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bvp(45, 90), new bvt()));
   }

   private static void c(bts<cki> $$0) {
      $$0.a(
         cnn.b,
         10,
         ImmutableList.of(
            bui.a(cbu.aw, 200),
            new bud(bsc.Z, 0.6F, 2),
            bwn.a(cbu.aw, 1.0F, 8, true),
            bwv.a(ckj::d),
            bxw.a(cki::u, bwn.b(cbu.aq, 0.4F, 8, false)),
            bwj.a(8.0F, bph.a(30, 60)),
            bug.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bts<cki> $$0) {
      $$0.a(
         cnn.k,
         10,
         ImmutableList.of(
            bui.a(cbu.aw, 200), new bud(bsc.Z, 0.6F, 2), bwo.a(1.0F), bxw.a(cki::u, bvq.a(40)), bxw.a(brq::p_, bvq.a(15)), bwy.a(), buv.a(ckj::i, cbu.o)
         ),
         cbu.o
      );
   }

   private static void e(bts<cki> $$0) {
      $$0.a(cnn.n, 10, ImmutableList.of(bwn.b(cbu.z, 1.3F, 15, false), a(), bwj.a(8.0F, bph.a(30, 60)), buv.a(ckj::e, cbu.z)), cbu.z);
   }

   private static bwg<cki> a() {
      return new bwg<>(ImmutableList.of(Pair.of(bwb.a(0.4F), 2), Pair.of(bwq.a(0.4F, 3), 2), Pair.of(new but(30, 60), 1)));
   }

   protected static void a(cki $$0) {
      bts<cki> $$1 = $$0.dS();
      cnn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnn.k, cnn.n, cnn.b));
      cnn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbu.o));
   }

   protected static void a(cki $$0, bsq $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsc.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cki $$0, bsq $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cki $$0, bsq $$1) {
      bts<cki> $$3 = $$0.dS();
      bsq $$2 = bul.a($$0, $$3.c(cbu.z), $$1);
      $$2 = bul.a($$0, $$3.c(cbu.o), $$2);
      e($$0, $$2);
   }

   private static void e(cki $$0, bsq $$1) {
      $$0.dS().b(cbu.o);
      $$0.dS().b(cbu.m);
      $$0.dS().a(cbu.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends bsq> d(cki $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(cbu.l) : Optional.empty();
   }

   static boolean a(cki $$0, io $$1) {
      Optional<io> $$2 = $$0.dS().c(cbu.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cki $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cki $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(cbu.as).orElse(0);
         int $$2 = $$0.dS().c(cbu.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cki $$0, bsq $$1) {
      bts<cki> $$2 = $$0.dS();
      $$2.b(cbu.ax);
      $$2.b(cbu.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cki $$0, bsq $$1) {
      if (!$$0.dS().c(cnn.n) || $$1.ak() != bsc.aA) {
         if ($$1.ak() != bsc.Z) {
            if (!bul.a($$0, $$1, 4.0)) {
               if (cda.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cki $$0, bsq $$1) {
      bts<cki> $$2 = $$0.dS();
      $$2.b(cbu.E);
      $$2.b(cbu.r);
      $$2.a(cbu.o, $$1, 200L);
   }

   private static void h(cki $$0, bsq $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cki $$0, bsq $$1) {
      if (!c($$0)) {
         Optional<bsq> $$2 = $$0.dS().c(cbu.o);
         bsq $$3 = bul.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avh> b(cki $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avh a(cki $$0, cnn $$1) {
      if ($$1 == cnn.n || $$0.y()) {
         return avi.mu;
      } else if ($$1 == cnn.k) {
         return avi.mp;
      } else {
         return h($$0) ? avi.mu : avi.mo;
      }
   }

   private static List<cki> g(cki $$0) {
      return $$0.dS().c(cbu.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cki $$0) {
      return $$0.dS().a(cbu.aw);
   }

   private static boolean i(cki $$0) {
      return $$0.dS().a(cbu.r);
   }

   protected static boolean c(cki $$0) {
      return $$0.dS().a(cbu.ax);
   }
}
