import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cof {
   public static final int a = 8;
   public static final int b = 4;
   private static final bst c = bbg.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bst j = bst.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxh<?> a(bxh<coe> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<coe> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new bze(45, 90), new bzi()));
   }

   private static void c(bxh<coe> $$0) {
      $$0.a(
         crn.b,
         10,
         ImmutableList.of(
            bxx.a(cfj.aw, 200),
            new bxs(bvq.ak, 0.6F, 2),
            cac.a(cfj.aw, 1.0F, 8, true),
            cak.a(cof::a),
            cbl.a(coe::t, cac.b(cfj.aq, 0.4F, 8, false)),
            bzy.a(8.0F, bst.a(30, 60)),
            bxv.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxh<coe> $$0) {
      $$0.a(
         crn.k,
         10,
         ImmutableList.of(
            bxx.a(cfj.aw, 200), new bxs(bvq.ak, 0.6F, 2), cad.a(1.0F), cbl.a(coe::t, bzf.a(40)), cbl.a(bva::e_, bzf.a(15)), can.a(), byk.a(cof::h, cfj.o)
         ),
         cfj.o
      );
   }

   private static void e(bxh<coe> $$0) {
      $$0.a(crn.n, 10, ImmutableList.of(cac.b(cfj.z, 1.3F, 15, false), a(), bzy.a(8.0F, bst.a(30, 60)), byk.a(cof::d, cfj.z)), cfj.z);
   }

   private static bzv<coe> a() {
      return new bzv<>(ImmutableList.of(Pair.of(bzq.a(0.4F), 2), Pair.of(caf.a(0.4F, 3), 2), Pair.of(new byi(30, 60), 1)));
   }

   protected static void a(coe $$0) {
      bxh<coe> $$1 = $$0.eb();
      crn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crn.k, crn.n, crn.b));
      crn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cfj.o));
   }

   protected static void a(coe $$0, bwf $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bvq.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(coe $$0, bwf $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(coe $$0, bwf $$1) {
      bxh<coe> $$3 = $$0.eb();
      bwf $$2 = bya.a($$0, $$3.c(cfj.z), $$1);
      $$2 = bya.a($$0, $$3.c(cfj.o), $$2);
      d($$0, $$2);
   }

   private static void d(coe $$0, bwf $$1) {
      $$0.eb().b(cfj.o);
      $$0.eb().b(cfj.m);
      $$0.eb().a(cfj.z, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bwf> a(ash $$0, coe $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cfj.l) : Optional.empty();
   }

   static boolean a(coe $$0, jh $$1) {
      Optional<jh> $$2 = $$0.eb().c(cfj.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(coe $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(coe $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cfj.as).orElse(0);
         int $$2 = $$0.eb().c(cfj.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ash $$0, coe $$1, bwf $$2) {
      bxh<coe> $$3 = $$1.eb();
      $$3.b(cfj.ax);
      $$3.b(cfj.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ash $$0, coe $$1, bwf $$2) {
      if (!$$1.eb().c(crn.n) || $$2.aq() != bvq.aS) {
         if ($$2.aq() != bvq.ak) {
            if (!bya.a($$1, $$2, 4.0)) {
               if (cgp.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(coe $$0, bwf $$1) {
      bxh<coe> $$2 = $$0.eb();
      $$2.b(cfj.E);
      $$2.b(cfj.r);
      $$2.a(cfj.o, $$1, 200L);
   }

   private static void f(coe $$0, bwf $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(coe $$0, bwf $$1) {
      if (!c($$0)) {
         Optional<bwf> $$2 = $$0.eb().c(cfj.o);
         bwf $$3 = bya.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<axe> b(coe $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static axe a(coe $$0, crn $$1) {
      if ($$1 == crn.n || $$0.gm()) {
         return axf.mM;
      } else if ($$1 == crn.k) {
         return axf.mH;
      } else {
         return g($$0) ? axf.mM : axf.mG;
      }
   }

   private static List<coe> f(coe $$0) {
      return $$0.eb().c(cfj.ap).orElse(ImmutableList.of());
   }

   private static boolean g(coe $$0) {
      return $$0.eb().a(cfj.aw);
   }

   private static boolean h(coe $$0) {
      return $$0.eb().a(cfj.r);
   }

   protected static boolean c(coe $$0) {
      return $$0.eb().a(cfj.ax);
   }
}
