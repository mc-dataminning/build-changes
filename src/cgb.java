import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cgb {
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

   protected static bpf<?> a(cga $$0, bpf<cga> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ciu.a));
      $$1.b(ciu.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cga $$0) {
      ii $$1 = ii.a($$0.dM().ae(), $$0.dm());
      $$0.dO().a(bxh.b, $$1);
   }

   private static void b(cga $$0, bpf<cga> $$1) {
      $$1.a(ciu.a, 0, ImmutableList.of(new brc(45, 90), new brg(), bqu.a(), bsm.a()));
   }

   private static void c(cga $$0, bpf<cga> $$1) {
      $$1.a(ciu.b, 10, ImmutableList.of(bsi.a(cgb::a), a(), b(), bry.a(bnu.bw, 4)));
   }

   private static void d(cga $$0, bpf<cga> $$1) {
      $$1.a(ciu.k, 10, ImmutableList.of(bsl.a($$1x -> !a((cfw)$$0, $$1x)), bsb.a(1.0F), brd.a(20)), bxh.o);
   }

   private static brt<cga> a() {
      return new brt<>(
         ImmutableList.of(
            Pair.of(brv.a(bnu.bw, 8.0F), 1),
            Pair.of(brv.a(bnu.ay, 8.0F), 1),
            Pair.of(brv.a(bnu.az, 8.0F), 1),
            Pair.of(brv.a(8.0F), 1),
            Pair.of(new bqg(30, 60), 1)
         )
      );
   }

   private static brt<cga> b() {
      return new brt<>(
         ImmutableList.of(
            Pair.of(bro.a(0.6F), 2),
            Pair.of(bqt.a(bnu.ay, 8, bxh.q, 0.6F, 2), 2),
            Pair.of(bqt.a(bnu.az, 8, bxh.q, 0.6F, 2), 2),
            Pair.of(bso.a(bxh.b, 0.6F, 2, 100), 2),
            Pair.of(bsn.a(bxh.b, 0.6F, 5), 2),
            Pair.of(new bqg(30, 60), 1)
         )
      );
   }

   protected static void b(cga $$0) {
      bpf<cga> $$1 = $$0.dO();
      ciu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciu.k, ciu.b));
      ciu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bxh.o));
   }

   private static boolean a(cfw $$0, bog $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bog> a(cfw $$0) {
      Optional<bog> $$1 = bpy.a($$0, bxh.ab);
      if ($$1.isPresent() && byn.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bog> $$2 = a($$0, bxh.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bxh.M);
      }
   }

   private static Optional<? extends bog> a(cfw $$0, bxh<? extends bog> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cga $$0, bog $$1) {
      if (!($$1 instanceof cfw)) {
         cfy.a($$0, $$1);
      }
   }

   protected static void b(cga $$0, bog $$1) {
      $$0.dO().b(bxh.E);
      $$0.dO().a(bxh.ab, $$1.cw(), 600L);
   }

   protected static void c(cga $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cga $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == ciu.k) {
            $$0.gn();
         }
      });
   }
}
