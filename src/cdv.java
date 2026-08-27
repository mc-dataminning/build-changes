import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cdv {
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

   protected static bnf<?> a(cdu $$0, bnf<cdu> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cgn.a));
      $$1.b(cgn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cdu $$0) {
      ig $$1 = ig.a($$0.dM().ae(), $$0.dm());
      $$0.dO().a(bvh.b, $$1);
   }

   private static void b(cdu $$0, bnf<cdu> $$1) {
      $$1.a(cgn.a, 0, ImmutableList.of(new bpc(45, 90), new bpg(), bou.a(), bqm.a()));
   }

   private static void c(cdu $$0, bnf<cdu> $$1) {
      $$1.a(cgn.b, 10, ImmutableList.of(bqi.a(cdv::a), a(), b(), bpy.a(blt.bv, 4)));
   }

   private static void d(cdu $$0, bnf<cdu> $$1) {
      $$1.a(cgn.k, 10, ImmutableList.of(bql.a($$1x -> !a((cdq)$$0, $$1x)), bqb.a(1.0F), bpd.a(20)), bvh.o);
   }

   private static bpt<cdu> a() {
      return new bpt<>(
         ImmutableList.of(
            Pair.of(bpv.a(blt.bv, 8.0F), 1),
            Pair.of(bpv.a(blt.ax, 8.0F), 1),
            Pair.of(bpv.a(blt.ay, 8.0F), 1),
            Pair.of(bpv.a(8.0F), 1),
            Pair.of(new bog(30, 60), 1)
         )
      );
   }

   private static bpt<cdu> b() {
      return new bpt<>(
         ImmutableList.of(
            Pair.of(bpo.a(0.6F), 2),
            Pair.of(bot.a(blt.ax, 8, bvh.q, 0.6F, 2), 2),
            Pair.of(bot.a(blt.ay, 8, bvh.q, 0.6F, 2), 2),
            Pair.of(bqo.a(bvh.b, 0.6F, 2, 100), 2),
            Pair.of(bqn.a(bvh.b, 0.6F, 5), 2),
            Pair.of(new bog(30, 60), 1)
         )
      );
   }

   protected static void b(cdu $$0) {
      bnf<cdu> $$1 = $$0.dO();
      cgn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgn.k, cgn.b));
      cgn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bvh.o));
   }

   private static boolean a(cdq $$0, bmf $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bmf> a(cdq $$0) {
      Optional<bmf> $$1 = bny.a($$0, bvh.aa);
      if ($$1.isPresent() && bwm.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bmf> $$2 = a($$0, bvh.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bvh.L);
      }
   }

   private static Optional<? extends bmf> a(cdq $$0, bvh<? extends bmf> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cdu $$0, bmf $$1) {
      if (!($$1 instanceof cdq)) {
         cds.a($$0, $$1);
      }
   }

   protected static void b(cdu $$0, bmf $$1) {
      $$0.dO().b(bvh.E);
      $$0.dO().a(bvh.aa, $$1.cw(), 600L);
   }

   protected static void c(cdu $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cdu $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == cgn.k) {
            $$0.gl();
         }
      });
   }
}
