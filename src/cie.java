import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cie {
   public static final int a = 8;
   public static final int b = 4;
   private static final bnl c = ayj.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bnl j = bnl.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static brp<?> a(brp<cid> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cid> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new btm(45, 90), new btq()));
   }

   private static void c(brp<cid> $$0) {
      $$0.a(
         cli.b,
         10,
         ImmutableList.of(
            bsf.a(bzr.aw, 200),
            new bsa(bqb.Z, 0.6F, 2),
            buk.a(bzr.aw, 1.0F, 8, true),
            bus.a(cie::d),
            bvt.a(cid::u, buk.b(bzr.aq, 0.4F, 8, false)),
            bug.a(8.0F, bnl.a(30, 60)),
            bsd.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(brp<cid> $$0) {
      $$0.a(
         cli.k,
         10,
         ImmutableList.of(
            bsf.a(bzr.aw, 200), new bsa(bqb.Z, 0.6F, 2), bul.a(1.0F), bvt.a(cid::u, btn.a(40)), bvt.a(bpp::p_, btn.a(15)), buv.a(), bss.a(cie::i, bzr.o)
         ),
         bzr.o
      );
   }

   private static void e(brp<cid> $$0) {
      $$0.a(cli.n, 10, ImmutableList.of(buk.b(bzr.z, 1.3F, 15, false), a(), bug.a(8.0F, bnl.a(30, 60)), bss.a(cie::e, bzr.z)), bzr.z);
   }

   private static bud<cid> a() {
      return new bud<>(ImmutableList.of(Pair.of(bty.a(0.4F), 2), Pair.of(bun.a(0.4F, 3), 2), Pair.of(new bsq(30, 60), 1)));
   }

   protected static void a(cid $$0) {
      brp<cid> $$1 = $$0.dP();
      cli $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cli.k, cli.n, cli.b));
      cli $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bzr.o));
   }

   protected static void a(cid $$0, bqo $$1) {
      if (!$$0.p_()) {
         if ($$1.ai() == bqb.az && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cid $$0, bqo $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cid $$0, bqo $$1) {
      brp<cid> $$3 = $$0.dP();
      bqo $$2 = bsi.a($$0, $$3.c(bzr.z), $$1);
      $$2 = bsi.a($$0, $$3.c(bzr.o), $$2);
      e($$0, $$2);
   }

   private static void e(cid $$0, bqo $$1) {
      $$0.dP().b(bzr.o);
      $$0.dP().b(bzr.m);
      $$0.dP().a(bzr.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bqo> d(cid $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(bzr.l) : Optional.empty();
   }

   static boolean a(cid $$0, ib $$1) {
      Optional<ib> $$2 = $$0.dP().c(bzr.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cid $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cid $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(bzr.as).orElse(0);
         int $$2 = $$0.dP().c(bzr.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cid $$0, bqo $$1) {
      brp<cid> $$2 = $$0.dP();
      $$2.b(bzr.ax);
      $$2.b(bzr.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cid $$0, bqo $$1) {
      if (!$$0.dP().c(cli.n) || $$1.ai() != bqb.az) {
         if ($$1.ai() != bqb.Z) {
            if (!bsi.a($$0, $$1, 4.0)) {
               if (cax.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cid $$0, bqo $$1) {
      brp<cid> $$2 = $$0.dP();
      $$2.b(bzr.E);
      $$2.b(bzr.r);
      $$2.a(bzr.o, $$1, 200L);
   }

   private static void h(cid $$0, bqo $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cid $$0, bqo $$1) {
      if (!c($$0)) {
         Optional<bqo> $$2 = $$0.dP().c(bzr.o);
         bqo $$3 = bsi.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aul> b(cid $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static aul a(cid $$0, cli $$1) {
      if ($$1 == cli.n || $$0.y()) {
         return aum.mf;
      } else if ($$1 == cli.k) {
         return aum.ma;
      } else {
         return h($$0) ? aum.mf : aum.lZ;
      }
   }

   private static List<cid> g(cid $$0) {
      return $$0.dP().c(bzr.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cid $$0) {
      return $$0.dP().a(bzr.aw);
   }

   private static boolean i(cid $$0) {
      return $$0.dP().a(bzr.r);
   }

   protected static boolean c(cid $$0) {
      return $$0.dP().a(bzr.ax);
   }
}
