import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cna {
   public static final int a = 8;
   public static final int b = 4;
   private static final brs c = bap.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brs j = brs.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwg<?> a(bwg<cmz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cmz> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new byd(45, 90), new byh()));
   }

   private static void c(bwg<cmz> $$0) {
      $$0.a(
         cqi.b,
         10,
         ImmutableList.of(
            bww.a(cei.aw, 200),
            new bwr(bup.Z, 0.6F, 2),
            bzb.a(cei.aw, 1.0F, 8, true),
            bzj.a(cna::d),
            cak.a(cmz::t, bzb.b(cei.aq, 0.4F, 8, false)),
            byx.a(8.0F, brs.a(30, 60)),
            bwu.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwg<cmz> $$0) {
      $$0.a(
         cqi.k,
         10,
         ImmutableList.of(
            bww.a(cei.aw, 200), new bwr(bup.Z, 0.6F, 2), bzc.a(1.0F), cak.a(cmz::t, bye.a(40)), cak.a(btz::p_, bye.a(15)), bzm.a(), bxj.a(cna::i, cei.o)
         ),
         cei.o
      );
   }

   private static void e(bwg<cmz> $$0) {
      $$0.a(cqi.n, 10, ImmutableList.of(bzb.b(cei.z, 1.3F, 15, false), a(), byx.a(8.0F, brs.a(30, 60)), bxj.a(cna::e, cei.z)), cei.z);
   }

   private static byu<cmz> a() {
      return new byu<>(ImmutableList.of(Pair.of(byp.a(0.4F), 2), Pair.of(bze.a(0.4F, 3), 2), Pair.of(new bxh(30, 60), 1)));
   }

   protected static void a(cmz $$0) {
      bwg<cmz> $$1 = $$0.ee();
      cqi $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqi.k, cqi.n, cqi.b));
      cqi $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cei.o));
   }

   protected static void a(cmz $$0, bve $$1) {
      if (!$$0.p_()) {
         if ($$1.ar() == bup.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cmz $$0, bve $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cmz $$0, bve $$1) {
      bwg<cmz> $$3 = $$0.ee();
      bve $$2 = bwz.a($$0, $$3.c(cei.z), $$1);
      $$2 = bwz.a($$0, $$3.c(cei.o), $$2);
      e($$0, $$2);
   }

   private static void e(cmz $$0, bve $$1) {
      $$0.ee().b(cei.o);
      $$0.ee().b(cei.m);
      $$0.ee().a(cei.z, $$1, (long)c.a($$0.dY().A));
   }

   private static Optional<? extends bve> d(cmz $$0) {
      return !c($$0) && !i($$0) ? $$0.ee().c(cei.l) : Optional.empty();
   }

   static boolean a(cmz $$0, jh $$1) {
      Optional<jh> $$2 = $$0.ee().c(cei.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cmz $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cmz $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.ee().c(cei.as).orElse(0);
         int $$2 = $$0.ee().c(cei.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cmz $$0, bve $$1) {
      bwg<cmz> $$2 = $$0.ee();
      $$2.b(cei.ax);
      $$2.b(cei.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cmz $$0, bve $$1) {
      if (!$$0.ee().c(cqi.n) || $$1.ar() != bup.aA) {
         if ($$1.ar() != bup.Z) {
            if (!bwz.a($$0, $$1, 4.0)) {
               if (cfo.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cmz $$0, bve $$1) {
      bwg<cmz> $$2 = $$0.ee();
      $$2.b(cei.E);
      $$2.b(cei.r);
      $$2.a(cei.o, $$1, 200L);
   }

   private static void h(cmz $$0, bve $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cmz $$0, bve $$1) {
      if (!c($$0)) {
         Optional<bve> $$2 = $$0.ee().c(cei.o);
         bve $$3 = bwz.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awn> b(cmz $$0) {
      return $$0.ee().g().map($$1 -> a($$0, $$1));
   }

   private static awn a(cmz $$0, cqi $$1) {
      if ($$1 == cqi.n || $$0.y()) {
         return awo.mt;
      } else if ($$1 == cqi.k) {
         return awo.mo;
      } else {
         return h($$0) ? awo.mt : awo.mn;
      }
   }

   private static List<cmz> g(cmz $$0) {
      return $$0.ee().c(cei.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cmz $$0) {
      return $$0.ee().a(cei.aw);
   }

   private static boolean i(cmz $$0) {
      return $$0.ee().a(cei.r);
   }

   protected static boolean c(cmz $$0) {
      return $$0.ee().a(cei.ax);
   }
}
