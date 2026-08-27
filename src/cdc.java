import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cdc {
   public static final int a = 8;
   public static final int b = 4;
   private static final biw c = auz.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final biw j = biw.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bmv<?> a(bmv<cdb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<cdb> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bos(45, 90), new bow()));
   }

   private static void c(bmv<cdb> $$0) {
      $$0.a(
         cgd.b,
         10,
         ImmutableList.of(
            bnl.a(bux.av, 200),
            new bng(blj.X, 0.6F),
            bpq.a(bux.av, 1.0F, 8, true),
            bpy.a(cdc::d),
            bqz.a(cdb::w, bpq.b(bux.ap, 0.4F, 8, false)),
            bpm.a(8.0F, biw.a(30, 60)),
            bnj.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bmv<cdb> $$0) {
      $$0.a(
         cgd.k,
         10,
         ImmutableList.of(
            bnl.a(bux.av, 200), new bng(blj.X, 0.6F), bpr.a(1.0F), bqz.a(cdb::w, bot.a(40)), bqz.a(bla::o_, bot.a(15)), bqb.a(), bny.a(cdc::i, bux.o)
         ),
         bux.o
      );
   }

   private static void e(bmv<cdb> $$0) {
      $$0.a(cgd.n, 10, ImmutableList.of(bpq.b(bux.z, 1.3F, 15, false), a(), bpm.a(8.0F, biw.a(30, 60)), bny.a(cdc::e, bux.z)), bux.z);
   }

   private static bpj<cdb> a() {
      return new bpj<>(ImmutableList.of(Pair.of(bpe.a(0.4F), 2), Pair.of(bpt.a(0.4F, 3), 2), Pair.of(new bnw(30, 60), 1)));
   }

   protected static void a(cdb $$0) {
      bmv<cdb> $$1 = $$0.dO();
      cgd $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgd.k, cgd.n, cgd.b));
      cgd $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bux.o));
   }

   protected static void a(cdb $$0, blv $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == blj.ax && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cdb $$0, blv $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cdb $$0, blv $$1) {
      bmv<cdb> $$3 = $$0.dO();
      blv $$2 = bno.a($$0, $$3.c(bux.z), $$1);
      $$2 = bno.a($$0, $$3.c(bux.o), $$2);
      e($$0, $$2);
   }

   private static void e(cdb $$0, blv $$1) {
      $$0.dO().b(bux.o);
      $$0.dO().b(bux.m);
      $$0.dO().a(bux.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends blv> d(cdb $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bux.l) : Optional.empty();
   }

   static boolean a(cdb $$0, hv $$1) {
      Optional<hv> $$2 = $$0.dO().c(bux.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cdb $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cdb $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bux.ar).orElse(0);
         int $$2 = $$0.dO().c(bux.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cdb $$0, blv $$1) {
      bmv<cdb> $$2 = $$0.dO();
      $$2.b(bux.aw);
      $$2.b(bux.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cdb $$0, blv $$1) {
      if (!$$0.dO().c(cgd.n) || $$1.ai() != blj.ax) {
         if ($$1.ai() != blj.X) {
            if (!bno.a($$0, $$1, 4.0)) {
               if (bwc.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cdb $$0, blv $$1) {
      bmv<cdb> $$2 = $$0.dO();
      $$2.b(bux.E);
      $$2.b(bux.r);
      $$2.a(bux.o, $$1, 200L);
   }

   private static void h(cdb $$0, blv $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cdb $$0, blv $$1) {
      if (!c($$0)) {
         Optional<blv> $$2 = $$0.dO().c(bux.o);
         blv $$3 = bno.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<arb> b(cdb $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arb a(cdb $$0, cgd $$1) {
      if ($$1 == cgd.n || $$0.A()) {
         return arc.lG;
      } else if ($$1 == cgd.k) {
         return arc.lB;
      } else {
         return h($$0) ? arc.lG : arc.lA;
      }
   }

   private static List<cdb> g(cdb $$0) {
      return $$0.dO().c(bux.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cdb $$0) {
      return $$0.dO().a(bux.av);
   }

   private static boolean i(cdb $$0) {
      return $$0.dO().a(bux.r);
   }

   protected static boolean c(cdb $$0) {
      return $$0.dO().a(bux.aw);
   }
}
