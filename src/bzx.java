import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class bzx {
   public static final int a = 8;
   public static final int b = 4;
   private static final bgb c = asm.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bgb j = bgb.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bjy<?> a(bjy<bzw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bzw> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new blu(45, 90), new bly()));
   }

   private static void c(bjy<bzw> $$0) {
      $$0.a(
         ccx.b,
         10,
         ImmutableList.of(
            bko.a(brz.av, 200),
            new bkj(bim.W, 0.6F),
            bms.a(brz.av, 1.0F, 8, true),
            bna.a(bzx::d),
            bob.a(bzw::q, bms.b(brz.ap, 0.4F, 8, false)),
            bmo.a(8.0F, bgb.a(30, 60)),
            bkm.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bjy<bzw> $$0) {
      $$0.a(
         ccx.k,
         10,
         ImmutableList.of(
            bko.a(brz.av, 200), new bkj(bim.W, 0.6F), bmt.a(1.0F), bob.a(bzw::q, blv.a(40)), bob.a(bid::i_, blv.a(15)), bnd.a(), blb.a(bzx::i, brz.o)
         ),
         brz.o
      );
   }

   private static void e(bjy<bzw> $$0) {
      $$0.a(ccx.n, 10, ImmutableList.of(bms.b(brz.z, 1.3F, 15, false), a(), bmo.a(8.0F, bgb.a(30, 60)), blb.a(bzx::e, brz.z)), brz.z);
   }

   private static bml<bzw> a() {
      return new bml<>(ImmutableList.of(Pair.of(bmg.a(0.4F), 2), Pair.of(bmv.a(0.4F, 3), 2), Pair.of(new bkz(30, 60), 1)));
   }

   protected static void a(bzw $$0) {
      bjy<bzw> $$1 = $$0.dM();
      ccx $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccx.k, ccx.n, ccx.b));
      ccx $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(brz.o));
   }

   protected static void a(bzw $$0, biy $$1) {
      if (!$$0.i_()) {
         if ($$1.ag() == bim.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(bzw $$0, biy $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(bzw $$0, biy $$1) {
      bjy<bzw> $$3 = $$0.dM();
      biy $$2 = bkr.a($$0, $$3.c(brz.z), $$1);
      $$2 = bkr.a($$0, $$3.c(brz.o), $$2);
      e($$0, $$2);
   }

   private static void e(bzw $$0, biy $$1) {
      $$0.dM().b(brz.o);
      $$0.dM().b(brz.m);
      $$0.dM().a(brz.z, $$1, (long)c.a($$0.dK().z));
   }

   private static Optional<? extends biy> d(bzw $$0) {
      return !c($$0) && !i($$0) ? $$0.dM().c(brz.l) : Optional.empty();
   }

   static boolean a(bzw $$0, gu $$1) {
      Optional<gu> $$2 = $$0.dM().c(brz.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(bzw $$0) {
      return $$0.q() && !f($$0);
   }

   private static boolean f(bzw $$0) {
      if ($$0.i_()) {
         return false;
      } else {
         int $$1 = $$0.dM().c(brz.ar).orElse(0);
         int $$2 = $$0.dM().c(brz.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(bzw $$0, biy $$1) {
      bjy<bzw> $$2 = $$0.dM();
      $$2.b(brz.aw);
      $$2.b(brz.r);
      if ($$0.i_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(bzw $$0, biy $$1) {
      if (!$$0.dM().c(ccx.n) || $$1.ag() != bim.aw) {
         if ($$1.ag() != bim.W) {
            if (!bkr.a($$0, $$1, 4.0)) {
               if (btd.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(bzw $$0, biy $$1) {
      bjy<bzw> $$2 = $$0.dM();
      $$2.b(brz.E);
      $$2.b(brz.r);
      $$2.a(brz.o, $$1, 200L);
   }

   private static void h(bzw $$0, biy $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(bzw $$0, biy $$1) {
      if (!c($$0)) {
         Optional<biy> $$2 = $$0.dM().c(brz.o);
         biy $$3 = bkr.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aov> b(bzw $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aov a(bzw $$0, ccx $$1) {
      if ($$1 == ccx.n || $$0.t()) {
         return aow.kS;
      } else if ($$1 == ccx.k) {
         return aow.kN;
      } else {
         return h($$0) ? aow.kS : aow.kM;
      }
   }

   private static List<bzw> g(bzw $$0) {
      return $$0.dM().c(brz.ao).orElse(ImmutableList.of());
   }

   private static boolean h(bzw $$0) {
      return $$0.dM().a(brz.av);
   }

   private static boolean i(bzw $$0) {
      return $$0.dM().a(brz.r);
   }

   protected static boolean c(bzw $$0) {
      return $$0.dM().a(brz.aw);
   }
}
