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

   protected static bup<?> a(clo $$0, bup<clo> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clo $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(ccr.b, $$1);
   }

   private static void b(clo $$0, bup<clo> $$1) {
      $$1.a(cok.a, 0, ImmutableList.of(new bwm(45, 90), new bwq(), bwe.a(), bxw.a()));
   }

   private static void c(clo $$0, bup<clo> $$1) {
      $$1.a(cok.b, 10, ImmutableList.of(bxs.a(clp::a), a(), b(), bxi.a(bsy.by, 4)));
   }

   private static void d(clo $$0, bup<clo> $$1) {
      $$1.a(cok.k, 10, ImmutableList.of(bxv.a($$1x -> !a((clk)$$0, $$1x)), bxl.a(1.0F), bwn.a(20)), ccr.o);
   }

   private static bxd<clo> a() {
      return new bxd<>(
         ImmutableList.of(
            Pair.of(bxf.a(bsy.by, 8.0F), 1),
            Pair.of(bxf.a(bsy.aA, 8.0F), 1),
            Pair.of(bxf.a(bsy.aB, 8.0F), 1),
            Pair.of(bxf.a(8.0F), 1),
            Pair.of(new bvq(30, 60), 1)
         )
      );
   }

   private static bxd<clo> b() {
      return new bxd<>(
         ImmutableList.of(
            Pair.of(bwy.a(0.6F), 2),
            Pair.of(bwd.a(bsy.aA, 8, ccr.q, 0.6F, 2), 2),
            Pair.of(bwd.a(bsy.aB, 8, ccr.q, 0.6F, 2), 2),
            Pair.of(bxy.a(ccr.b, 0.6F, 2, 100), 2),
            Pair.of(bxx.a(ccr.b, 0.6F, 5), 2),
            Pair.of(new bvq(30, 60), 1)
         )
      );
   }

   protected static void b(clo $$0) {
      bup<clo> $$1 = $$0.dS();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.k, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccr.o));
   }

   private static boolean a(clk $$0, btn $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btn> a(clk $$0) {
      Optional<btn> $$1 = bvi.a($$0, ccr.ab);
      if ($$1.isPresent() && cdx.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btn> $$2 = a($$0, ccr.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(ccr.M);
      }
   }

   private static Optional<? extends btn> a(clk $$0, ccr<? extends btn> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clo $$0, btn $$1) {
      if (!($$1 instanceof clk)) {
         clm.a($$0, $$1);
      }
   }

   protected static void b(clo $$0, btn $$1) {
      $$0.dS().b(ccr.E);
      $$0.dS().a(ccr.ab, $$1.cz(), 600L);
   }

   protected static void c(clo $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clo $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == cok.k) {
            $$0.gx();
         }
      });
   }
}
