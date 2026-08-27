import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cbi {
   public static final int a = 8;
   public static final int b = 4;
   private static final bhm c = atw.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bhm j = bhm.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static blj<?> a(blj<cbh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<cbh> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bnf(45, 90), new bnj()));
   }

   private static void c(blj<cbh> $$0) {
      $$0.a(
         cei.b,
         10,
         ImmutableList.of(
            blz.a(btk.av, 200),
            new blu(bjx.W, 0.6F),
            bod.a(btk.av, 1.0F, 8, true),
            bol.a(cbi::d),
            bpm.a(cbh::t, bod.b(btk.ap, 0.4F, 8, false)),
            bnz.a(8.0F, bhm.a(30, 60)),
            blx.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(blj<cbh> $$0) {
      $$0.a(
         cei.k,
         10,
         ImmutableList.of(
            blz.a(btk.av, 200), new blu(bjx.W, 0.6F), boe.a(1.0F), bpm.a(cbh::t, bng.a(40)), bpm.a(bjo::n_, bng.a(15)), boo.a(), bmm.a(cbi::i, btk.o)
         ),
         btk.o
      );
   }

   private static void e(blj<cbh> $$0) {
      $$0.a(cei.n, 10, ImmutableList.of(bod.b(btk.z, 1.3F, 15, false), a(), bnz.a(8.0F, bhm.a(30, 60)), bmm.a(cbi::e, btk.z)), btk.z);
   }

   private static bnw<cbh> a() {
      return new bnw<>(ImmutableList.of(Pair.of(bnr.a(0.4F), 2), Pair.of(bog.a(0.4F, 3), 2), Pair.of(new bmk(30, 60), 1)));
   }

   protected static void a(cbh $$0) {
      blj<cbh> $$1 = $$0.dN();
      cei $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cei.k, cei.n, cei.b));
      cei $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(btk.o));
   }

   protected static void a(cbh $$0, bkj $$1) {
      if (!$$0.n_()) {
         if ($$1.ag() == bjx.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cbh $$0, bkj $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cbh $$0, bkj $$1) {
      blj<cbh> $$3 = $$0.dN();
      bkj $$2 = bmc.a($$0, $$3.c(btk.z), $$1);
      $$2 = bmc.a($$0, $$3.c(btk.o), $$2);
      e($$0, $$2);
   }

   private static void e(cbh $$0, bkj $$1) {
      $$0.dN().b(btk.o);
      $$0.dN().b(btk.m);
      $$0.dN().a(btk.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bkj> d(cbh $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(btk.l) : Optional.empty();
   }

   static boolean a(cbh $$0, ht $$1) {
      Optional<ht> $$2 = $$0.dN().c(btk.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cbh $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cbh $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(btk.ar).orElse(0);
         int $$2 = $$0.dN().c(btk.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cbh $$0, bkj $$1) {
      blj<cbh> $$2 = $$0.dN();
      $$2.b(btk.aw);
      $$2.b(btk.r);
      if ($$0.n_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cbh $$0, bkj $$1) {
      if (!$$0.dN().c(cei.n) || $$1.ag() != bjx.aw) {
         if ($$1.ag() != bjx.W) {
            if (!bmc.a($$0, $$1, 4.0)) {
               if (buo.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cbh $$0, bkj $$1) {
      blj<cbh> $$2 = $$0.dN();
      $$2.b(btk.E);
      $$2.b(btk.r);
      $$2.a(btk.o, $$1, 200L);
   }

   private static void h(cbh $$0, bkj $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cbh $$0, bkj $$1) {
      if (!c($$0)) {
         Optional<bkj> $$2 = $$0.dN().c(btk.o);
         bkj $$3 = bmc.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aqc> b(cbh $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static aqc a(cbh $$0, cei $$1) {
      if ($$1 == cei.n || $$0.y()) {
         return aqd.kU;
      } else if ($$1 == cei.k) {
         return aqd.kP;
      } else {
         return h($$0) ? aqd.kU : aqd.kO;
      }
   }

   private static List<cbh> g(cbh $$0) {
      return $$0.dN().c(btk.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cbh $$0) {
      return $$0.dN().a(btk.av);
   }

   private static boolean i(cbh $$0) {
      return $$0.dN().a(btk.r);
   }

   protected static boolean c(cbh $$0) {
      return $$0.dN().a(btk.aw);
   }
}
