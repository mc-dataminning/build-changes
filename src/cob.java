import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cob {
   public static final int a = 8;
   public static final int b = 4;
   private static final bsp c = bbg.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bsp j = bsp.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxd<?> a(bxd<coa> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<coa> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bza(45, 90), new bze()));
   }

   private static void c(bxd<coa> $$0) {
      $$0.a(
         crj.b,
         10,
         ImmutableList.of(
            bxt.a(cff.aw, 200),
            new bxo(bvm.ak, 0.6F, 2),
            bzy.a(cff.aw, 1.0F, 8, true),
            cag.a(cob::a),
            cbh.a(coa::t, bzy.b(cff.aq, 0.4F, 8, false)),
            bzu.a(8.0F, bsp.a(30, 60)),
            bxr.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxd<coa> $$0) {
      $$0.a(
         crj.k,
         10,
         ImmutableList.of(
            bxt.a(cff.aw, 200), new bxo(bvm.ak, 0.6F, 2), bzz.a(1.0F), cbh.a(coa::t, bzb.a(40)), cbh.a(buw::e_, bzb.a(15)), caj.a(), byg.a(cob::h, cff.o)
         ),
         cff.o
      );
   }

   private static void e(bxd<coa> $$0) {
      $$0.a(crj.n, 10, ImmutableList.of(bzy.b(cff.z, 1.3F, 15, false), a(), bzu.a(8.0F, bsp.a(30, 60)), byg.a(cob::d, cff.z)), cff.z);
   }

   private static bzr<coa> a() {
      return new bzr<>(ImmutableList.of(Pair.of(bzm.a(0.4F), 2), Pair.of(cab.a(0.4F, 3), 2), Pair.of(new bye(30, 60), 1)));
   }

   protected static void a(coa $$0) {
      bxd<coa> $$1 = $$0.eb();
      crj $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crj.k, crj.n, crj.b));
      crj $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cff.o));
   }

   protected static void a(coa $$0, bwb $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bvm.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(coa $$0, bwb $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(coa $$0, bwb $$1) {
      bxd<coa> $$3 = $$0.eb();
      bwb $$2 = bxw.a($$0, $$3.c(cff.z), $$1);
      $$2 = bxw.a($$0, $$3.c(cff.o), $$2);
      d($$0, $$2);
   }

   private static void d(coa $$0, bwb $$1) {
      $$0.eb().b(cff.o);
      $$0.eb().b(cff.m);
      $$0.eb().a(cff.z, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bwb> a(ash $$0, coa $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cff.l) : Optional.empty();
   }

   static boolean a(coa $$0, jh $$1) {
      Optional<jh> $$2 = $$0.eb().c(cff.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(coa $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(coa $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cff.as).orElse(0);
         int $$2 = $$0.eb().c(cff.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ash $$0, coa $$1, bwb $$2) {
      bxd<coa> $$3 = $$1.eb();
      $$3.b(cff.ax);
      $$3.b(cff.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ash $$0, coa $$1, bwb $$2) {
      if (!$$1.eb().c(crj.n) || $$2.aq() != bvm.aS) {
         if ($$2.aq() != bvm.ak) {
            if (!bxw.a($$1, $$2, 4.0)) {
               if (cgl.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(coa $$0, bwb $$1) {
      bxd<coa> $$2 = $$0.eb();
      $$2.b(cff.E);
      $$2.b(cff.r);
      $$2.a(cff.o, $$1, 200L);
   }

   private static void f(coa $$0, bwb $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(coa $$0, bwb $$1) {
      if (!c($$0)) {
         Optional<bwb> $$2 = $$0.eb().c(cff.o);
         bwb $$3 = bxw.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<axe> b(coa $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static axe a(coa $$0, crj $$1) {
      if ($$1 == crj.n || $$0.gm()) {
         return axf.mL;
      } else if ($$1 == crj.k) {
         return axf.mG;
      } else {
         return g($$0) ? axf.mL : axf.mF;
      }
   }

   private static List<coa> f(coa $$0) {
      return $$0.eb().c(cff.ap).orElse(ImmutableList.of());
   }

   private static boolean g(coa $$0) {
      return $$0.eb().a(cff.aw);
   }

   private static boolean h(coa $$0) {
      return $$0.eb().a(cff.r);
   }

   protected static boolean c(coa $$0) {
      return $$0.eb().a(cff.ax);
   }
}
