import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clt {
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

   protected static but<?> a(cls $$0, but<cls> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cop.a));
      $$1.b(cop.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cls $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(ccv.b, $$1);
   }

   private static void b(cls $$0, but<cls> $$1) {
      $$1.a(cop.a, 0, ImmutableList.of(new bwq(45, 90), new bwu(), bwi.a(), bya.a()));
   }

   private static void c(cls $$0, but<cls> $$1) {
      $$1.a(cop.b, 10, ImmutableList.of(bxw.a(clt::a), a(), b(), bxm.a(btc.by, 4)));
   }

   private static void d(cls $$0, but<cls> $$1) {
      $$1.a(cop.k, 10, ImmutableList.of(bxz.a($$1x -> !a((clo)$$0, $$1x)), bxp.a(1.0F), bwr.a(20)), ccv.o);
   }

   private static bxh<cls> a() {
      return new bxh<>(
         ImmutableList.of(
            Pair.of(bxj.a(btc.by, 8.0F), 1),
            Pair.of(bxj.a(btc.aA, 8.0F), 1),
            Pair.of(bxj.a(btc.aB, 8.0F), 1),
            Pair.of(bxj.a(8.0F), 1),
            Pair.of(new bvu(30, 60), 1)
         )
      );
   }

   private static bxh<cls> b() {
      return new bxh<>(
         ImmutableList.of(
            Pair.of(bxc.a(0.6F), 2),
            Pair.of(bwh.a(btc.aA, 8, ccv.q, 0.6F, 2), 2),
            Pair.of(bwh.a(btc.aB, 8, ccv.q, 0.6F, 2), 2),
            Pair.of(byc.a(ccv.b, 0.6F, 2, 100), 2),
            Pair.of(byb.a(ccv.b, 0.6F, 5), 2),
            Pair.of(new bvu(30, 60), 1)
         )
      );
   }

   protected static void b(cls $$0) {
      but<cls> $$1 = $$0.dS();
      cop $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cop.k, cop.b));
      cop $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccv.o));
   }

   private static boolean a(clo $$0, btr $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btr> a(clo $$0) {
      Optional<btr> $$1 = bvm.a($$0, ccv.ab);
      if ($$1.isPresent() && ceb.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btr> $$2 = a($$0, ccv.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(ccv.M);
      }
   }

   private static Optional<? extends btr> a(clo $$0, ccv<? extends btr> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cls $$0, btr $$1) {
      if (!($$1 instanceof clo)) {
         clq.a($$0, $$1);
      }
   }

   protected static void b(cls $$0, btr $$1) {
      $$0.dS().b(ccv.E);
      $$0.dS().a(ccv.ab, $$1.cz(), 600L);
   }

   protected static void c(cls $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cls $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == cop.k) {
            $$0.gx();
         }
      });
   }
}
