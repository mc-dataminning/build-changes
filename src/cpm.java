import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpm {
   public static final int a = 8;
   public static final int b = 4;
   private static final bto c = baq.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bto j = bto.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bye<?> a(bye<cpl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<cpl> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cab(45, 90), new caf()));
   }

   private static void c(bye<cpl> $$0) {
      $$0.a(
         csw.b,
         10,
         ImmutableList.of(
            byu.a(cgg.ax, 200),
            new byp(bwo.aj, 0.6F, 2),
            caz.a(cgg.ax, 1.0F, 8, true),
            cbh.a(cpm::a),
            cci.a(cpl::x, caz.b(cgg.ar, 0.4F, 8, false)),
            cav.a(8.0F, bto.a(30, 60)),
            bys.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bye<cpl> $$0) {
      $$0.a(
         csw.k,
         10,
         ImmutableList.of(
            byu.a(cgg.ax, 200), new byp(bwo.aj, 0.6F, 2), cba.a(1.0F), cci.a(cpl::x, cac.a(40)), cci.a(bvv::n_, cac.a(15)), cbk.a(), bzh.a(cpm::h, cgg.p)
         ),
         cgg.p
      );
   }

   private static void e(bye<cpl> $$0) {
      $$0.a(csw.n, 10, ImmutableList.of(caz.b(cgg.A, 1.3F, 15, false), a(), cav.a(8.0F, bto.a(30, 60)), bzh.a(cpm::d, cgg.A)), cgg.A);
   }

   private static cas<cpl> a() {
      return new cas<>(ImmutableList.of(Pair.of(can.a(0.4F), 2), Pair.of(cbc.a(0.4F, 3), 2), Pair.of(new bzf(30, 60), 1)));
   }

   protected static void a(cpl $$0) {
      bye<cpl> $$1 = $$0.ec();
      csw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csw.k, csw.n, csw.b));
      csw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgg.p));
   }

   protected static void a(cpl $$0, bxe $$1) {
      if (!$$0.n_()) {
         if ($$1.aq() == bwo.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cpl $$0, bxe $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cpl $$0, bxe $$1) {
      bye<cpl> $$3 = $$0.ec();
      bxe $$2 = byx.a($$0, $$3.c(cgg.A), $$1);
      $$2 = byx.a($$0, $$3.c(cgg.p), $$2);
      d($$0, $$2);
   }

   private static void d(cpl $$0, bxe $$1) {
      $$0.ec().b(cgg.p);
      $$0.ec().b(cgg.n);
      $$0.ec().a(cgg.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bxe> a(arq $$0, cpl $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cgg.l) : Optional.empty();
   }

   static boolean a(cpl $$0, iu $$1) {
      Optional<iu> $$2 = $$0.ec().c(cgg.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cpl $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cpl $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cgg.at).orElse(0);
         int $$2 = $$0.ec().c(cgg.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arq $$0, cpl $$1, bxe $$2) {
      bye<cpl> $$3 = $$1.ec();
      $$3.b(cgg.ay);
      $$3.b(cgg.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arq $$0, cpl $$1, bxe $$2) {
      if (!$$1.ec().c(csw.n) || $$2.aq() != bwo.aR) {
         if ($$2.aq() != bwo.aj) {
            if (!byx.a($$1, $$2, 4.0)) {
               if (chm.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cpl $$0, bxe $$1) {
      bye<cpl> $$2 = $$0.ec();
      $$2.b(cgg.F);
      $$2.b(cgg.s);
      $$2.a(cgg.p, $$1, 200L);
   }

   private static void f(cpl $$0, bxe $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cpl $$0, bxe $$1) {
      if (!c($$0)) {
         Optional<bxe> $$2 = $$0.ec().c(cgg.p);
         bxe $$3 = byx.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awm> b(cpl $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cpl $$0, csw $$1) {
      if ($$1 == csw.n || $$0.gr()) {
         return awn.mW;
      } else if ($$1 == csw.k) {
         return awn.mR;
      } else {
         return g($$0) ? awn.mW : awn.mQ;
      }
   }

   private static List<cpl> f(cpl $$0) {
      return $$0.ec().c(cgg.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cpl $$0) {
      return $$0.ec().a(cgg.ax);
   }

   private static boolean h(cpl $$0) {
      return $$0.ec().a(cgg.s);
   }

   protected static boolean c(cpl $$0) {
      return $$0.ec().a(cgg.ay);
   }
}
