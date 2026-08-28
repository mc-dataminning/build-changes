import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class coa {
   public static final int a = 8;
   public static final int b = 4;
   private static final bsj c = bab.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bsj j = bsj.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxa<?> a(bxa<cnz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cnz> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new byx(45, 90), new bzb()));
   }

   private static void c(bxa<cnz> $$0) {
      $$0.a(
         cri.b,
         10,
         ImmutableList.of(
            bxq.a(cfc.aw, 200),
            new bxl(bvi.aj, 0.6F, 2),
            bzv.a(cfc.aw, 1.0F, 8, true),
            cad.a(coa::a),
            cbe.a(cnz::x, bzv.b(cfc.aq, 0.4F, 8, false)),
            bzr.a(8.0F, bsj.a(30, 60)),
            bxo.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxa<cnz> $$0) {
      $$0.a(
         cri.k,
         10,
         ImmutableList.of(
            bxq.a(cfc.aw, 200), new bxl(bvi.aj, 0.6F, 2), bzw.a(1.0F), cbe.a(cnz::x, byy.a(40)), cbe.a(buq::n_, byy.a(15)), cag.a(), byd.a(coa::h, cfc.o)
         ),
         cfc.o
      );
   }

   private static void e(bxa<cnz> $$0) {
      $$0.a(cri.n, 10, ImmutableList.of(bzv.b(cfc.z, 1.3F, 15, false), a(), bzr.a(8.0F, bsj.a(30, 60)), byd.a(coa::d, cfc.z)), cfc.z);
   }

   private static bzo<cnz> a() {
      return new bzo<>(ImmutableList.of(Pair.of(bzj.a(0.4F), 2), Pair.of(bzy.a(0.4F, 3), 2), Pair.of(new byb(30, 60), 1)));
   }

   protected static void a(cnz $$0) {
      bxa<cnz> $$1 = $$0.ea();
      cri $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cri.k, cri.n, cri.b));
      cri $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cfc.o));
   }

   protected static void a(cnz $$0, bvy $$1) {
      if (!$$0.n_()) {
         if ($$1.aq() == bvi.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cnz $$0, bvy $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cnz $$0, bvy $$1) {
      bxa<cnz> $$3 = $$0.ea();
      bvy $$2 = bxt.a($$0, $$3.c(cfc.z), $$1);
      $$2 = bxt.a($$0, $$3.c(cfc.o), $$2);
      d($$0, $$2);
   }

   private static void d(cnz $$0, bvy $$1) {
      $$0.ea().b(cfc.o);
      $$0.ea().b(cfc.m);
      $$0.ea().a(cfc.z, $$1, (long)c.a($$0.dU().A));
   }

   private static Optional<? extends bvy> a(ard $$0, cnz $$1) {
      return !c($$1) && !h($$1) ? $$1.ea().c(cfc.l) : Optional.empty();
   }

   static boolean a(cnz $$0, ji $$1) {
      Optional<ji> $$2 = $$0.ea().c(cfc.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cnz $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cnz $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.ea().c(cfc.as).orElse(0);
         int $$2 = $$0.ea().c(cfc.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ard $$0, cnz $$1, bvy $$2) {
      bxa<cnz> $$3 = $$1.ea();
      $$3.b(cfc.ax);
      $$3.b(cfc.r);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ard $$0, cnz $$1, bvy $$2) {
      if (!$$1.ea().c(cri.n) || $$2.aq() != bvi.aR) {
         if ($$2.aq() != bvi.aj) {
            if (!bxt.a($$1, $$2, 4.0)) {
               if (cgi.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cnz $$0, bvy $$1) {
      bxa<cnz> $$2 = $$0.ea();
      $$2.b(cfc.E);
      $$2.b(cfc.r);
      $$2.a(cfc.o, $$1, 200L);
   }

   private static void f(cnz $$0, bvy $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cnz $$0, bvy $$1) {
      if (!c($$0)) {
         Optional<bvy> $$2 = $$0.ea().c(cfc.o);
         bvy $$3 = bxt.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<avz> b(cnz $$0) {
      return $$0.ea().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cnz $$0, cri $$1) {
      if ($$1 == cri.n || $$0.gs()) {
         return awa.mS;
      } else if ($$1 == cri.k) {
         return awa.mN;
      } else {
         return g($$0) ? awa.mS : awa.mM;
      }
   }

   private static List<cnz> f(cnz $$0) {
      return $$0.ea().c(cfc.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cnz $$0) {
      return $$0.ea().a(cfc.aw);
   }

   private static boolean h(cnz $$0) {
      return $$0.ea().a(cfc.r);
   }

   protected static boolean c(cnz $$0) {
      return $$0.ea().a(cfc.ax);
   }
}
