import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class clh {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqe c = azy.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqe j = bqe.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static buq<?> a(buq<clg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<clg> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new bwn(45, 90), new bwr()));
   }

   private static void c(buq<clg> $$0) {
      $$0.a(
         col.b,
         10,
         ImmutableList.of(
            bvg.a(ccs.aw, 200),
            new bvb(bsz.Z, 0.6F, 2),
            bxl.a(ccs.aw, 1.0F, 8, true),
            bxt.a(clh::d),
            byu.a(clg::u, bxl.b(ccs.aq, 0.4F, 8, false)),
            bxh.a(8.0F, bqe.a(30, 60)),
            bve.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(buq<clg> $$0) {
      $$0.a(
         col.k,
         10,
         ImmutableList.of(
            bvg.a(ccs.aw, 200), new bvb(bsz.Z, 0.6F, 2), bxm.a(1.0F), byu.a(clg::u, bwo.a(40)), byu.a(bsn::p_, bwo.a(15)), bxw.a(), bvt.a(clh::i, ccs.o)
         ),
         ccs.o
      );
   }

   private static void e(buq<clg> $$0) {
      $$0.a(col.n, 10, ImmutableList.of(bxl.b(ccs.z, 1.3F, 15, false), a(), bxh.a(8.0F, bqe.a(30, 60)), bvt.a(clh::e, ccs.z)), ccs.z);
   }

   private static bxe<clg> a() {
      return new bxe<>(ImmutableList.of(Pair.of(bwz.a(0.4F), 2), Pair.of(bxo.a(0.4F, 3), 2), Pair.of(new bvr(30, 60), 1)));
   }

   protected static void a(clg $$0) {
      buq<clg> $$1 = $$0.dS();
      col $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(col.k, col.n, col.b));
      col $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccs.o));
   }

   protected static void a(clg $$0, bto $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsz.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clg $$0, bto $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clg $$0, bto $$1) {
      buq<clg> $$3 = $$0.dS();
      bto $$2 = bvj.a($$0, $$3.c(ccs.z), $$1);
      $$2 = bvj.a($$0, $$3.c(ccs.o), $$2);
      e($$0, $$2);
   }

   private static void e(clg $$0, bto $$1) {
      $$0.dS().b(ccs.o);
      $$0.dS().b(ccs.m);
      $$0.dS().a(ccs.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends bto> d(clg $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(ccs.l) : Optional.empty();
   }

   static boolean a(clg $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(ccs.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clg $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(clg $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(ccs.as).orElse(0);
         int $$2 = $$0.dS().c(ccs.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clg $$0, bto $$1) {
      buq<clg> $$2 = $$0.dS();
      $$2.b(ccs.ax);
      $$2.b(ccs.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clg $$0, bto $$1) {
      if (!$$0.dS().c(col.n) || $$1.ak() != bsz.aA) {
         if ($$1.ak() != bsz.Z) {
            if (!bvj.a($$0, $$1, 4.0)) {
               if (cdy.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clg $$0, bto $$1) {
      buq<clg> $$2 = $$0.dS();
      $$2.b(ccs.E);
      $$2.b(ccs.r);
      $$2.a(ccs.o, $$1, 200L);
   }

   private static void h(clg $$0, bto $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clg $$0, bto $$1) {
      if (!c($$0)) {
         Optional<bto> $$2 = $$0.dS().c(ccs.o);
         bto $$3 = bvj.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avy> b(clg $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avy a(clg $$0, col $$1) {
      if ($$1 == col.n || $$0.y()) {
         return avz.mu;
      } else if ($$1 == col.k) {
         return avz.mp;
      } else {
         return h($$0) ? avz.mu : avz.mo;
      }
   }

   private static List<clg> g(clg $$0) {
      return $$0.dS().c(ccs.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clg $$0) {
      return $$0.dS().a(ccs.aw);
   }

   private static boolean i(clg $$0) {
      return $$0.dS().a(ccs.r);
   }

   protected static boolean c(clg $$0) {
      return $$0.dS().a(ccs.ax);
   }
}
