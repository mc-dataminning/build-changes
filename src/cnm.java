import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnm {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwj<?> a(cnl $$0, bwj<cnl> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cql.a));
      $$1.b(cql.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnl $$0) {
      jp $$1 = jp.a($$0.dV().ag(), $$0.dv());
      $$0.eb().a(cel.b, $$1);
   }

   private static void b(cnl $$0, bwj<cnl> $$1) {
      $$1.a(cql.a, 0, ImmutableList.of(new byg(45, 90), new byk(), bxy.a(), bzq.a()));
   }

   private static void c(cnl $$0, bwj<cnl> $$1) {
      $$1.a(cql.b, 10, ImmutableList.of(bzm.a(cnm::a), a(), b(), bzc.a(bus.bO, 4)));
   }

   private static void d(cnl $$0, bwj<cnl> $$1) {
      $$1.a(cql.k, 10, ImmutableList.of(bzp.a(($$1x, $$2) -> !a($$1x, (cnh)$$0, $$2)), bzf.a(1.0F), byh.a(20)), cel.o);
   }

   private static byx<cnl> a() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(byz.a(bus.bO, 8.0F), 1),
            Pair.of(byz.a(bus.aO, 8.0F), 1),
            Pair.of(byz.a(bus.aP, 8.0F), 1),
            Pair.of(byz.a(8.0F), 1),
            Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   private static byx<cnl> b() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(bys.a(0.6F), 2),
            Pair.of(bxx.a(bus.aO, 8, cel.q, 0.6F, 2), 2),
            Pair.of(bxx.a(bus.aP, 8, cel.q, 0.6F, 2), 2),
            Pair.of(bzs.a(cel.b, 0.6F, 2, 100), 2),
            Pair.of(bzr.a(cel.b, 0.6F, 5), 2),
            Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   protected static void b(cnl $$0) {
      bwj<cnl> $$1 = $$0.eb();
      cql $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cql.k, cql.b));
      cql $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cel.o));
   }

   private static boolean a(arp $$0, cnh $$1, bvh $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvh> a(arp $$0, cnh $$1) {
      Optional<bvh> $$2 = bxc.a($$1, cel.ab);
      if ($$2.isPresent() && cfr.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvh> $$3 = $$1.eb().c(cel.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cel.M);
      }
   }

   protected static void a(arp $$0, cnl $$1, bvh $$2) {
      if (!($$2 instanceof cnh)) {
         cnj.a($$0, $$1, $$2);
      }
   }

   protected static void a(cnl $$0, bvh $$1) {
      $$0.eb().b(cel.E);
      $$0.eb().a(cel.ab, $$1.cG(), 600L);
   }

   protected static void c(cnl $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cnl $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == cql.k) {
            $$0.gt();
         }
      });
   }
}
