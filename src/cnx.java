import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cnx {
   public static final int a = 8;
   public static final int b = 4;
   private static final bsl c = baw.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bsl j = bsl.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwz<?> a(bwz<cnw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cnw> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new byw(45, 90), new bza()));
   }

   private static void c(bwz<cnw> $$0) {
      $$0.a(
         crf.b,
         10,
         ImmutableList.of(
            bxp.a(cfb.aw, 200),
            new bxk(bvi.ak, 0.6F, 2),
            bzu.a(cfb.aw, 1.0F, 8, true),
            cac.a(cnx::a),
            cbd.a(cnw::t, bzu.b(cfb.aq, 0.4F, 8, false)),
            bzq.a(8.0F, bsl.a(30, 60)),
            bxn.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwz<cnw> $$0) {
      $$0.a(
         crf.k,
         10,
         ImmutableList.of(
            bxp.a(cfb.aw, 200), new bxk(bvi.ak, 0.6F, 2), bzv.a(1.0F), cbd.a(cnw::t, byx.a(40)), cbd.a(bus::e_, byx.a(15)), caf.a(), byc.a(cnx::h, cfb.o)
         ),
         cfb.o
      );
   }

   private static void e(bwz<cnw> $$0) {
      $$0.a(crf.n, 10, ImmutableList.of(bzu.b(cfb.z, 1.3F, 15, false), a(), bzq.a(8.0F, bsl.a(30, 60)), byc.a(cnx::d, cfb.z)), cfb.z);
   }

   private static bzn<cnw> a() {
      return new bzn<>(ImmutableList.of(Pair.of(bzi.a(0.4F), 2), Pair.of(bzx.a(0.4F, 3), 2), Pair.of(new bya(30, 60), 1)));
   }

   protected static void a(cnw $$0) {
      bwz<cnw> $$1 = $$0.ec();
      crf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crf.k, crf.n, crf.b));
      crf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cfb.o));
   }

   protected static void a(cnw $$0, bvx $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bvi.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cnw $$0, bvx $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cnw $$0, bvx $$1) {
      bwz<cnw> $$3 = $$0.ec();
      bvx $$2 = bxs.a($$0, $$3.c(cfb.z), $$1);
      $$2 = bxs.a($$0, $$3.c(cfb.o), $$2);
      d($$0, $$2);
   }

   private static void d(cnw $$0, bvx $$1) {
      $$0.ec().b(cfb.o);
      $$0.ec().b(cfb.m);
      $$0.ec().a(cfb.z, $$1, (long)c.a($$0.dW().A));
   }

   private static Optional<? extends bvx> a(arx $$0, cnw $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cfb.l) : Optional.empty();
   }

   static boolean a(cnw $$0, jh $$1) {
      Optional<jh> $$2 = $$0.ec().c(cfb.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cnw $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(cnw $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cfb.as).orElse(0);
         int $$2 = $$0.ec().c(cfb.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arx $$0, cnw $$1, bvx $$2) {
      bwz<cnw> $$3 = $$1.ec();
      $$3.b(cfb.ax);
      $$3.b(cfb.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arx $$0, cnw $$1, bvx $$2) {
      if (!$$1.ec().c(crf.n) || $$2.aq() != bvi.aS) {
         if ($$2.aq() != bvi.ak) {
            if (!bxs.a($$1, $$2, 4.0)) {
               if (cgh.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cnw $$0, bvx $$1) {
      bwz<cnw> $$2 = $$0.ec();
      $$2.b(cfb.E);
      $$2.b(cfb.r);
      $$2.a(cfb.o, $$1, 200L);
   }

   private static void f(cnw $$0, bvx $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cnw $$0, bvx $$1) {
      if (!c($$0)) {
         Optional<bvx> $$2 = $$0.ec().c(cfb.o);
         bvx $$3 = bxs.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awu> b(cnw $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awu a(cnw $$0, crf $$1) {
      if ($$1 == crf.n || $$0.go()) {
         return awv.mS;
      } else if ($$1 == crf.k) {
         return awv.mN;
      } else {
         return g($$0) ? awv.mS : awv.mM;
      }
   }

   private static List<cnw> f(cnw $$0) {
      return $$0.ec().c(cfb.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cnw $$0) {
      return $$0.ec().a(cfb.aw);
   }

   private static boolean h(cnw $$0) {
      return $$0.ec().a(cfb.r);
   }

   protected static boolean c(cnw $$0) {
      return $$0.ec().a(cfb.ax);
   }
}
