import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clp {
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

   protected static buo<?> a(clo $$0, buo<clo> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clo $$0) {
      jl $$1 = jl.a($$0.dQ().af(), $$0.dq());
      $$0.dU().a(ccq.b, $$1);
   }

   private static void b(clo $$0, buo<clo> $$1) {
      $$1.a(cok.a, 0, ImmutableList.of(new bwl(45, 90), new bwp(), bwd.a(), bxv.a()));
   }

   private static void c(clo $$0, buo<clo> $$1) {
      $$1.a(cok.b, 10, ImmutableList.of(bxr.a(clp::a), a(), b(), bxh.a(bsw.by, 4)));
   }

   private static void d(clo $$0, buo<clo> $$1) {
      $$1.a(cok.k, 10, ImmutableList.of(bxu.a($$1x -> !a((clk)$$0, $$1x)), bxk.a(1.0F), bwm.a(20)), ccq.o);
   }

   private static bxc<clo> a() {
      return new bxc<>(
         ImmutableList.of(
            Pair.of(bxe.a(bsw.by, 8.0F), 1),
            Pair.of(bxe.a(bsw.aA, 8.0F), 1),
            Pair.of(bxe.a(bsw.aB, 8.0F), 1),
            Pair.of(bxe.a(8.0F), 1),
            Pair.of(new bvp(30, 60), 1)
         )
      );
   }

   private static bxc<clo> b() {
      return new bxc<>(
         ImmutableList.of(
            Pair.of(bwx.a(0.6F), 2),
            Pair.of(bwc.a(bsw.aA, 8, ccq.q, 0.6F, 2), 2),
            Pair.of(bwc.a(bsw.aB, 8, ccq.q, 0.6F, 2), 2),
            Pair.of(bxx.a(ccq.b, 0.6F, 2, 100), 2),
            Pair.of(bxw.a(ccq.b, 0.6F, 5), 2),
            Pair.of(new bvp(30, 60), 1)
         )
      );
   }

   protected static void b(clo $$0) {
      buo<clo> $$1 = $$0.dU();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.k, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccq.o));
   }

   private static boolean a(clk $$0, btl $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btl> a(clk $$0) {
      Optional<btl> $$1 = bvh.a($$0, ccq.ab);
      if ($$1.isPresent() && cdw.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btl> $$2 = a($$0, ccq.l);
         return $$2.isPresent() ? $$2 : $$0.dU().c(ccq.M);
      }
   }

   private static Optional<? extends btl> a(clk $$0, ccq<? extends btl> $$1) {
      return $$0.dU().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clo $$0, btl $$1) {
      if (!($$1 instanceof clk)) {
         clm.a($$0, $$1);
      }
   }

   protected static void b(clo $$0, btl $$1) {
      $$0.dU().b(ccq.E);
      $$0.dU().a(ccq.ab, $$1.cA(), 600L);
   }

   protected static void c(clo $$0) {
      if ((double)$$0.dQ().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clo $$0) {
      $$0.dU().g().ifPresent($$1 -> {
         if ($$1 == cok.k) {
            $$0.gt();
         }
      });
   }
}
