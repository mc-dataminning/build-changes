import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ceb {
   public static final int a = 8;
   public static final int b = 4;
   private static final bjn c = avq.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bjn j = bjn.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bno<?> a(bno<cea> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<cea> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bpl(45, 90), new bpp()));
   }

   private static void c(bno<cea> $$0) {
      $$0.a(
         chc.b,
         10,
         ImmutableList.of(
            boe.a(bvq.aw, 200),
            new bnz(bmc.Y, 0.6F),
            bqj.a(bvq.aw, 1.0F, 8, true),
            bqr.a(ceb::d),
            brs.a(cea::w, bqj.b(bvq.aq, 0.4F, 8, false)),
            bqf.a(8.0F, bjn.a(30, 60)),
            boc.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bno<cea> $$0) {
      $$0.a(
         chc.k,
         10,
         ImmutableList.of(
            boe.a(bvq.aw, 200), new bnz(bmc.Y, 0.6F), bqk.a(1.0F), brs.a(cea::w, bpm.a(40)), brs.a(blr::o_, bpm.a(15)), bqu.a(), bor.a(ceb::i, bvq.o)
         ),
         bvq.o
      );
   }

   private static void e(bno<cea> $$0) {
      $$0.a(chc.n, 10, ImmutableList.of(bqj.b(bvq.z, 1.3F, 15, false), a(), bqf.a(8.0F, bjn.a(30, 60)), bor.a(ceb::e, bvq.z)), bvq.z);
   }

   private static bqc<cea> a() {
      return new bqc<>(ImmutableList.of(Pair.of(bpx.a(0.4F), 2), Pair.of(bqm.a(0.4F, 3), 2), Pair.of(new bop(30, 60), 1)));
   }

   protected static void a(cea $$0) {
      bno<cea> $$1 = $$0.dN();
      chc $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(chc.k, chc.n, chc.b));
      chc $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvq.o));
   }

   protected static void a(cea $$0, bmo $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bmc.ay && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cea $$0, bmo $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cea $$0, bmo $$1) {
      bno<cea> $$3 = $$0.dN();
      bmo $$2 = boh.a($$0, $$3.c(bvq.z), $$1);
      $$2 = boh.a($$0, $$3.c(bvq.o), $$2);
      e($$0, $$2);
   }

   private static void e(cea $$0, bmo $$1) {
      $$0.dN().b(bvq.o);
      $$0.dN().b(bvq.m);
      $$0.dN().a(bvq.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bmo> d(cea $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(bvq.l) : Optional.empty();
   }

   static boolean a(cea $$0, hx $$1) {
      Optional<hx> $$2 = $$0.dN().c(bvq.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cea $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cea $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(bvq.as).orElse(0);
         int $$2 = $$0.dN().c(bvq.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cea $$0, bmo $$1) {
      bno<cea> $$2 = $$0.dN();
      $$2.b(bvq.ax);
      $$2.b(bvq.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cea $$0, bmo $$1) {
      if (!$$0.dN().c(chc.n) || $$1.ai() != bmc.ay) {
         if ($$1.ai() != bmc.Y) {
            if (!boh.a($$0, $$1, 4.0)) {
               if (bww.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cea $$0, bmo $$1) {
      bno<cea> $$2 = $$0.dN();
      $$2.b(bvq.E);
      $$2.b(bvq.r);
      $$2.a(bvq.o, $$1, 200L);
   }

   private static void h(cea $$0, bmo $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cea $$0, bmo $$1) {
      if (!c($$0)) {
         Optional<bmo> $$2 = $$0.dN().c(bvq.o);
         bmo $$3 = boh.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<ars> b(cea $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static ars a(cea $$0, chc $$1) {
      if ($$1 == chc.n || $$0.A()) {
         return art.lV;
      } else if ($$1 == chc.k) {
         return art.lQ;
      } else {
         return h($$0) ? art.lV : art.lP;
      }
   }

   private static List<cea> g(cea $$0) {
      return $$0.dN().c(bvq.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cea $$0) {
      return $$0.dN().a(bvq.aw);
   }

   private static boolean i(cea $$0) {
      return $$0.dN().a(bvq.r);
   }

   protected static boolean c(cea $$0) {
      return $$0.dN().a(bvq.ax);
   }
}
