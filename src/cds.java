import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cds {
   public static final int a = 8;
   public static final int b = 4;
   private static final bjl c = avo.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bjl j = bjl.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bnk<?> a(bnk<cdr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<cdr> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bph(45, 90), new bpl()));
   }

   private static void c(bnk<cdr> $$0) {
      $$0.a(
         cgt.b,
         10,
         ImmutableList.of(
            boa.a(bvm.av, 200),
            new bnv(bly.X, 0.6F),
            bqf.a(bvm.av, 1.0F, 8, true),
            bqn.a(cds::d),
            bro.a(cdr::w, bqf.b(bvm.ap, 0.4F, 8, false)),
            bqb.a(8.0F, bjl.a(30, 60)),
            bny.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bnk<cdr> $$0) {
      $$0.a(
         cgt.k,
         10,
         ImmutableList.of(
            boa.a(bvm.av, 200), new bnv(bly.X, 0.6F), bqg.a(1.0F), bro.a(cdr::w, bpi.a(40)), bro.a(blp::o_, bpi.a(15)), bqq.a(), bon.a(cds::i, bvm.o)
         ),
         bvm.o
      );
   }

   private static void e(bnk<cdr> $$0) {
      $$0.a(cgt.n, 10, ImmutableList.of(bqf.b(bvm.z, 1.3F, 15, false), a(), bqb.a(8.0F, bjl.a(30, 60)), bon.a(cds::e, bvm.z)), bvm.z);
   }

   private static bpy<cdr> a() {
      return new bpy<>(ImmutableList.of(Pair.of(bpt.a(0.4F), 2), Pair.of(bqi.a(0.4F, 3), 2), Pair.of(new bol(30, 60), 1)));
   }

   protected static void a(cdr $$0) {
      bnk<cdr> $$1 = $$0.dO();
      cgt $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgt.k, cgt.n, cgt.b));
      cgt $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvm.o));
   }

   protected static void a(cdr $$0, bmk $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bly.ax && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cdr $$0, bmk $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cdr $$0, bmk $$1) {
      bnk<cdr> $$3 = $$0.dO();
      bmk $$2 = bod.a($$0, $$3.c(bvm.z), $$1);
      $$2 = bod.a($$0, $$3.c(bvm.o), $$2);
      e($$0, $$2);
   }

   private static void e(cdr $$0, bmk $$1) {
      $$0.dO().b(bvm.o);
      $$0.dO().b(bvm.m);
      $$0.dO().a(bvm.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bmk> d(cdr $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bvm.l) : Optional.empty();
   }

   static boolean a(cdr $$0, hx $$1) {
      Optional<hx> $$2 = $$0.dO().c(bvm.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cdr $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cdr $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bvm.ar).orElse(0);
         int $$2 = $$0.dO().c(bvm.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cdr $$0, bmk $$1) {
      bnk<cdr> $$2 = $$0.dO();
      $$2.b(bvm.aw);
      $$2.b(bvm.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cdr $$0, bmk $$1) {
      if (!$$0.dO().c(cgt.n) || $$1.ai() != bly.ax) {
         if ($$1.ai() != bly.X) {
            if (!bod.a($$0, $$1, 4.0)) {
               if (bwr.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cdr $$0, bmk $$1) {
      bnk<cdr> $$2 = $$0.dO();
      $$2.b(bvm.E);
      $$2.b(bvm.r);
      $$2.a(bvm.o, $$1, 200L);
   }

   private static void h(cdr $$0, bmk $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cdr $$0, bmk $$1) {
      if (!c($$0)) {
         Optional<bmk> $$2 = $$0.dO().c(bvm.o);
         bmk $$3 = bod.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<arq> b(cdr $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arq a(cdr $$0, cgt $$1) {
      if ($$1 == cgt.n || $$0.A()) {
         return arr.lG;
      } else if ($$1 == cgt.k) {
         return arr.lB;
      } else {
         return h($$0) ? arr.lG : arr.lA;
      }
   }

   private static List<cdr> g(cdr $$0) {
      return $$0.dO().c(bvm.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cdr $$0) {
      return $$0.dO().a(bvm.av);
   }

   private static boolean i(cdr $$0) {
      return $$0.dO().a(bvm.r);
   }

   protected static boolean c(cdr $$0) {
      return $$0.dO().a(bvm.aw);
   }
}
