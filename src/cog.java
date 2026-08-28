import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cog {
   public static final int a = 8;
   public static final int b = 4;
   private static final bsu c = bbg.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bsu j = bsu.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxi<?> a(bxi<cof> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cof> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new bzf(45, 90), new bzj()));
   }

   private static void c(bxi<cof> $$0) {
      $$0.a(
         cro.b,
         10,
         ImmutableList.of(
            bxy.a(cfk.aw, 200),
            new bxt(bvr.ak, 0.6F, 2),
            cad.a(cfk.aw, 1.0F, 8, true),
            cal.a(cog::a),
            cbm.a(cof::t, cad.b(cfk.aq, 0.4F, 8, false)),
            bzz.a(8.0F, bsu.a(30, 60)),
            bxw.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxi<cof> $$0) {
      $$0.a(
         cro.k,
         10,
         ImmutableList.of(
            bxy.a(cfk.aw, 200), new bxt(bvr.ak, 0.6F, 2), cae.a(1.0F), cbm.a(cof::t, bzg.a(40)), cbm.a(bvb::e_, bzg.a(15)), cao.a(), byl.a(cog::h, cfk.o)
         ),
         cfk.o
      );
   }

   private static void e(bxi<cof> $$0) {
      $$0.a(cro.n, 10, ImmutableList.of(cad.b(cfk.z, 1.3F, 15, false), a(), bzz.a(8.0F, bsu.a(30, 60)), byl.a(cog::d, cfk.z)), cfk.z);
   }

   private static bzw<cof> a() {
      return new bzw<>(ImmutableList.of(Pair.of(bzr.a(0.4F), 2), Pair.of(cag.a(0.4F, 3), 2), Pair.of(new byj(30, 60), 1)));
   }

   protected static void a(cof $$0) {
      bxi<cof> $$1 = $$0.ec();
      cro $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cro.k, cro.n, cro.b));
      cro $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cfk.o));
   }

   protected static void a(cof $$0, bwg $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bvr.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cof $$0, bwg $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cof $$0, bwg $$1) {
      bxi<cof> $$3 = $$0.ec();
      bwg $$2 = byb.a($$0, $$3.c(cfk.z), $$1);
      $$2 = byb.a($$0, $$3.c(cfk.o), $$2);
      d($$0, $$2);
   }

   private static void d(cof $$0, bwg $$1) {
      $$0.ec().b(cfk.o);
      $$0.ec().b(cfk.m);
      $$0.ec().a(cfk.z, $$1, (long)c.a($$0.dW().A));
   }

   private static Optional<? extends bwg> a(ash $$0, cof $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cfk.l) : Optional.empty();
   }

   static boolean a(cof $$0, jh $$1) {
      Optional<jh> $$2 = $$0.ec().c(cfk.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cof $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(cof $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cfk.as).orElse(0);
         int $$2 = $$0.ec().c(cfk.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ash $$0, cof $$1, bwg $$2) {
      bxi<cof> $$3 = $$1.ec();
      $$3.b(cfk.ax);
      $$3.b(cfk.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ash $$0, cof $$1, bwg $$2) {
      if (!$$1.ec().c(cro.n) || $$2.aq() != bvr.aS) {
         if ($$2.aq() != bvr.ak) {
            if (!byb.a($$1, $$2, 4.0)) {
               if (cgq.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cof $$0, bwg $$1) {
      bxi<cof> $$2 = $$0.ec();
      $$2.b(cfk.E);
      $$2.b(cfk.r);
      $$2.a(cfk.o, $$1, 200L);
   }

   private static void f(cof $$0, bwg $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cof $$0, bwg $$1) {
      if (!c($$0)) {
         Optional<bwg> $$2 = $$0.ec().c(cfk.o);
         bwg $$3 = byb.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<axe> b(cof $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static axe a(cof $$0, cro $$1) {
      if ($$1 == cro.n || $$0.go()) {
         return axf.mM;
      } else if ($$1 == cro.k) {
         return axf.mH;
      } else {
         return g($$0) ? axf.mM : axf.mG;
      }
   }

   private static List<cof> f(cof $$0) {
      return $$0.ec().c(cfk.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cof $$0) {
      return $$0.ec().a(cfk.aw);
   }

   private static boolean h(cof $$0) {
      return $$0.ec().a(cfk.r);
   }

   protected static boolean c(cof $$0) {
      return $$0.ec().a(cfk.ax);
   }
}
