import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cbx {
   public static final int a = 8;
   public static final int b = 4;
   private static final bib c = aug.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bib j = bib.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bly<?> a(bly<cbw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<cbw> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bnu(45, 90), new bny()));
   }

   private static void c(bly<cbw> $$0) {
      $$0.a(
         cex.b,
         10,
         ImmutableList.of(
            bmo.a(btz.av, 200),
            new bmj(bkm.W, 0.6F),
            bos.a(btz.av, 1.0F, 8, true),
            bpa.a(cbx::d),
            bqb.a(cbw::t, bos.b(btz.ap, 0.4F, 8, false)),
            boo.a(8.0F, bib.a(30, 60)),
            bmm.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bly<cbw> $$0) {
      $$0.a(
         cex.k,
         10,
         ImmutableList.of(
            bmo.a(btz.av, 200), new bmj(bkm.W, 0.6F), bot.a(1.0F), bqb.a(cbw::t, bnv.a(40)), bqb.a(bkd::n_, bnv.a(15)), bpd.a(), bnb.a(cbx::i, btz.o)
         ),
         btz.o
      );
   }

   private static void e(bly<cbw> $$0) {
      $$0.a(cex.n, 10, ImmutableList.of(bos.b(btz.z, 1.3F, 15, false), a(), boo.a(8.0F, bib.a(30, 60)), bnb.a(cbx::e, btz.z)), btz.z);
   }

   private static bol<cbw> a() {
      return new bol<>(ImmutableList.of(Pair.of(bog.a(0.4F), 2), Pair.of(bov.a(0.4F, 3), 2), Pair.of(new bmz(30, 60), 1)));
   }

   protected static void a(cbw $$0) {
      bly<cbw> $$1 = $$0.dN();
      cex $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cex.k, cex.n, cex.b));
      cex $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(btz.o));
   }

   protected static void a(cbw $$0, bky $$1) {
      if (!$$0.n_()) {
         if ($$1.ag() == bkm.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cbw $$0, bky $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cbw $$0, bky $$1) {
      bly<cbw> $$3 = $$0.dN();
      bky $$2 = bmr.a($$0, $$3.c(btz.z), $$1);
      $$2 = bmr.a($$0, $$3.c(btz.o), $$2);
      e($$0, $$2);
   }

   private static void e(cbw $$0, bky $$1) {
      $$0.dN().b(btz.o);
      $$0.dN().b(btz.m);
      $$0.dN().a(btz.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bky> d(cbw $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(btz.l) : Optional.empty();
   }

   static boolean a(cbw $$0, ht $$1) {
      Optional<ht> $$2 = $$0.dN().c(btz.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cbw $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cbw $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(btz.ar).orElse(0);
         int $$2 = $$0.dN().c(btz.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cbw $$0, bky $$1) {
      bly<cbw> $$2 = $$0.dN();
      $$2.b(btz.aw);
      $$2.b(btz.r);
      if ($$0.n_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cbw $$0, bky $$1) {
      if (!$$0.dN().c(cex.n) || $$1.ag() != bkm.aw) {
         if ($$1.ag() != bkm.W) {
            if (!bmr.a($$0, $$1, 4.0)) {
               if (bvd.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cbw $$0, bky $$1) {
      bly<cbw> $$2 = $$0.dN();
      $$2.b(btz.E);
      $$2.b(btz.r);
      $$2.a(btz.o, $$1, 200L);
   }

   private static void h(cbw $$0, bky $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cbw $$0, bky $$1) {
      if (!c($$0)) {
         Optional<bky> $$2 = $$0.dN().c(btz.o);
         bky $$3 = bmr.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aqm> b(cbw $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static aqm a(cbw $$0, cex $$1) {
      if ($$1 == cex.n || $$0.y()) {
         return aqn.kW;
      } else if ($$1 == cex.k) {
         return aqn.kR;
      } else {
         return h($$0) ? aqn.kW : aqn.kQ;
      }
   }

   private static List<cbw> g(cbw $$0) {
      return $$0.dN().c(btz.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cbw $$0) {
      return $$0.dN().a(btz.av);
   }

   private static boolean i(cbw $$0) {
      return $$0.dN().a(btz.r);
   }

   protected static boolean c(cbw $$0) {
      return $$0.dN().a(btz.aw);
   }
}
