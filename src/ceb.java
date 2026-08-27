import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ceb {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bnk<?> a(cea $$0, bnk<cea> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cgt.a));
      $$1.b(cgt.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cea $$0) {
      ig $$1 = ig.a($$0.dM().ae(), $$0.dm());
      $$0.dO().a(bvm.b, $$1);
   }

   private static void b(cea $$0, bnk<cea> $$1) {
      $$1.a(cgt.a, 0, ImmutableList.of(new bph(45, 90), new bpl(), boz.a(), bqr.a()));
   }

   private static void c(cea $$0, bnk<cea> $$1) {
      $$1.a(cgt.b, 10, ImmutableList.of(bqn.a(ceb::a), a(), b(), bqd.a(bly.bv, 4)));
   }

   private static void d(cea $$0, bnk<cea> $$1) {
      $$1.a(cgt.k, 10, ImmutableList.of(bqq.a($$1x -> !a((cdw)$$0, $$1x)), bqg.a(1.0F), bpi.a(20)), bvm.o);
   }

   private static bpy<cea> a() {
      return new bpy<>(
         ImmutableList.of(
            Pair.of(bqa.a(bly.bv, 8.0F), 1),
            Pair.of(bqa.a(bly.ax, 8.0F), 1),
            Pair.of(bqa.a(bly.ay, 8.0F), 1),
            Pair.of(bqa.a(8.0F), 1),
            Pair.of(new bol(30, 60), 1)
         )
      );
   }

   private static bpy<cea> b() {
      return new bpy<>(
         ImmutableList.of(
            Pair.of(bpt.a(0.6F), 2),
            Pair.of(boy.a(bly.ax, 8, bvm.q, 0.6F, 2), 2),
            Pair.of(boy.a(bly.ay, 8, bvm.q, 0.6F, 2), 2),
            Pair.of(bqt.a(bvm.b, 0.6F, 2, 100), 2),
            Pair.of(bqs.a(bvm.b, 0.6F, 5), 2),
            Pair.of(new bol(30, 60), 1)
         )
      );
   }

   protected static void b(cea $$0) {
      bnk<cea> $$1 = $$0.dO();
      cgt $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgt.k, cgt.b));
      cgt $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bvm.o));
   }

   private static boolean a(cdw $$0, bmk $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bmk> a(cdw $$0) {
      Optional<bmk> $$1 = bod.a($$0, bvm.aa);
      if ($$1.isPresent() && bwr.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bmk> $$2 = a($$0, bvm.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bvm.L);
      }
   }

   private static Optional<? extends bmk> a(cdw $$0, bvm<? extends bmk> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cea $$0, bmk $$1) {
      if (!($$1 instanceof cdw)) {
         cdy.a($$0, $$1);
      }
   }

   protected static void b(cea $$0, bmk $$1) {
      $$0.dO().b(bvm.E);
      $$0.dO().a(bvm.aa, $$1.cw(), 600L);
   }

   protected static void c(cea $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cea $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == cgt.k) {
            $$0.gl();
         }
      });
   }
}
