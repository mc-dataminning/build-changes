import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnp {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwj<?> a(cno $$0, bwj<cno> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqo.a));
      $$1.b(cqo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cno $$0) {
      jq $$1 = jq.a($$0.dV().ai(), $$0.dv());
      $$0.eb().a(cel.b, $$1);
   }

   private static void b(cno $$0, bwj<cno> $$1) {
      $$1.a(cqo.a, 0, ImmutableList.of(new byg(45, 90), new byk(), bxy.a(), bzq.a()));
   }

   private static void c(cno $$0, bwj<cno> $$1) {
      $$1.a(cqo.b, 10, ImmutableList.of(bzm.a(cnp::a), a(), b(), bzc.a(bus.bR, 4)));
   }

   private static void d(cno $$0, bwj<cno> $$1) {
      $$1.a(cqo.k, 10, ImmutableList.of(bzp.a(($$1x, $$2) -> !a($$1x, (cnk)$$0, $$2)), bzf.a(1.0F), byh.a(20)), cel.o);
   }

   private static byx<cno> a() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(byz.a(bus.bR, 8.0F), 1),
            Pair.of(byz.a(bus.aR, 8.0F), 1),
            Pair.of(byz.a(bus.aS, 8.0F), 1),
            Pair.of(byz.a(8.0F), 1),
            Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   private static byx<cno> b() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(bys.a(0.6F), 2),
            Pair.of(bxx.a(bus.aR, 8, cel.q, 0.6F, 2), 2),
            Pair.of(bxx.a(bus.aS, 8, cel.q, 0.6F, 2), 2),
            Pair.of(bzs.a(cel.b, 0.6F, 2, 100), 2),
            Pair.of(bzr.a(cel.b, 0.6F, 5), 2),
            Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   protected static void b(cno $$0) {
      bwj<cno> $$1 = $$0.eb();
      cqo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqo.k, cqo.b));
      cqo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cel.o));
   }

   private static boolean a(ard $$0, cnk $$1, bvh $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvh> a(ard $$0, cnk $$1) {
      Optional<bvh> $$2 = bxc.a($$1, cel.ab);
      if ($$2.isPresent() && cfr.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvh> $$3 = $$1.eb().c(cel.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cel.M);
      }
   }

   protected static void a(ard $$0, cno $$1, bvh $$2) {
      if (!($$2 instanceof cnk)) {
         cnm.a($$0, $$1, $$2);
      }
   }

   protected static void a(cno $$0, bvh $$1) {
      $$0.eb().b(cel.E);
      $$0.eb().a(cel.ab, $$1.cG(), 600L);
   }

   protected static void c(cno $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cno $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == cqo.k) {
            $$0.gy();
         }
      });
   }
}
