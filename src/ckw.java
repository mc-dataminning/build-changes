import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ckw {
   public static final int a = 8;
   public static final int b = 4;
   private static final bps c = azh.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bps j = bps.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bue<?> a(bue<ckv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<ckv> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bwb(45, 90), new bwf()));
   }

   private static void c(bue<ckv> $$0) {
      $$0.a(
         coa.b,
         10,
         ImmutableList.of(
            buu.a(ccg.aw, 200),
            new bup(bsn.Z, 0.6F, 2),
            bwz.a(ccg.aw, 1.0F, 8, true),
            bxh.a(ckw::d),
            byi.a(ckv::t, bwz.b(ccg.aq, 0.4F, 8, false)),
            bwv.a(8.0F, bps.a(30, 60)),
            bus.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bue<ckv> $$0) {
      $$0.a(
         coa.k,
         10,
         ImmutableList.of(
            buu.a(ccg.aw, 200), new bup(bsn.Z, 0.6F, 2), bxa.a(1.0F), byi.a(ckv::t, bwc.a(40)), byi.a(bsb::o_, bwc.a(15)), bxk.a(), bvh.a(ckw::i, ccg.o)
         ),
         ccg.o
      );
   }

   private static void e(bue<ckv> $$0) {
      $$0.a(coa.n, 10, ImmutableList.of(bwz.b(ccg.z, 1.3F, 15, false), a(), bwv.a(8.0F, bps.a(30, 60)), bvh.a(ckw::e, ccg.z)), ccg.z);
   }

   private static bws<ckv> a() {
      return new bws<>(ImmutableList.of(Pair.of(bwn.a(0.4F), 2), Pair.of(bxc.a(0.4F, 3), 2), Pair.of(new bvf(30, 60), 1)));
   }

   protected static void a(ckv $$0) {
      bue<ckv> $$1 = $$0.dV();
      coa $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coa.k, coa.n, coa.b));
      coa $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccg.o));
   }

   protected static void a(ckv $$0, btc $$1) {
      if (!$$0.o_()) {
         if ($$1.am() == bsn.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(ckv $$0, btc $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(ckv $$0, btc $$1) {
      bue<ckv> $$3 = $$0.dV();
      btc $$2 = bux.a($$0, $$3.c(ccg.z), $$1);
      $$2 = bux.a($$0, $$3.c(ccg.o), $$2);
      e($$0, $$2);
   }

   private static void e(ckv $$0, btc $$1) {
      $$0.dV().b(ccg.o);
      $$0.dV().b(ccg.m);
      $$0.dV().a(ccg.z, $$1, (long)c.a($$0.dR().z));
   }

   private static Optional<? extends btc> d(ckv $$0) {
      return !c($$0) && !i($$0) ? $$0.dV().c(ccg.l) : Optional.empty();
   }

   static boolean a(ckv $$0, ja $$1) {
      Optional<ja> $$2 = $$0.dV().c(ccg.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(ckv $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(ckv $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dV().c(ccg.as).orElse(0);
         int $$2 = $$0.dV().c(ccg.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(ckv $$0, btc $$1) {
      bue<ckv> $$2 = $$0.dV();
      $$2.b(ccg.ax);
      $$2.b(ccg.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(ckv $$0, btc $$1) {
      if (!$$0.dV().c(coa.n) || $$1.am() != bsn.aA) {
         if ($$1.am() != bsn.Z) {
            if (!bux.a($$0, $$1, 4.0)) {
               if (cdm.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(ckv $$0, btc $$1) {
      bue<ckv> $$2 = $$0.dV();
      $$2.b(ccg.E);
      $$2.b(ccg.r);
      $$2.a(ccg.o, $$1, 200L);
   }

   private static void h(ckv $$0, btc $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(ckv $$0, btc $$1) {
      if (!c($$0)) {
         Optional<btc> $$2 = $$0.dV().c(ccg.o);
         btc $$3 = bux.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avg> b(ckv $$0) {
      return $$0.dV().g().map($$1 -> a($$0, $$1));
   }

   private static avg a(ckv $$0, coa $$1) {
      if ($$1 == coa.n || $$0.x()) {
         return avh.mu;
      } else if ($$1 == coa.k) {
         return avh.mp;
      } else {
         return h($$0) ? avh.mu : avh.mo;
      }
   }

   private static List<ckv> g(ckv $$0) {
      return $$0.dV().c(ccg.ap).orElse(ImmutableList.of());
   }

   private static boolean h(ckv $$0) {
      return $$0.dV().a(ccg.aw);
   }

   private static boolean i(ckv $$0) {
      return $$0.dV().a(ccg.r);
   }

   protected static boolean c(ckv $$0) {
      return $$0.dV().a(ccg.ax);
   }
}
