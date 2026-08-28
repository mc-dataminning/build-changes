import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clr {
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

   protected static bur<?> a(clq $$0, bur<clq> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(com.a));
      $$1.b(com.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clq $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(cct.b, $$1);
   }

   private static void b(clq $$0, bur<clq> $$1) {
      $$1.a(com.a, 0, ImmutableList.of(new bwo(45, 90), new bws(), bwg.a(), bxy.a()));
   }

   private static void c(clq $$0, bur<clq> $$1) {
      $$1.a(com.b, 10, ImmutableList.of(bxu.a(clr::a), a(), b(), bxk.a(bta.by, 4)));
   }

   private static void d(clq $$0, bur<clq> $$1) {
      $$1.a(com.k, 10, ImmutableList.of(bxx.a($$1x -> !a((clm)$$0, $$1x)), bxn.a(1.0F), bwp.a(20)), cct.o);
   }

   private static bxf<clq> a() {
      return new bxf<>(
         ImmutableList.of(
            Pair.of(bxh.a(bta.by, 8.0F), 1),
            Pair.of(bxh.a(bta.aA, 8.0F), 1),
            Pair.of(bxh.a(bta.aB, 8.0F), 1),
            Pair.of(bxh.a(8.0F), 1),
            Pair.of(new bvs(30, 60), 1)
         )
      );
   }

   private static bxf<clq> b() {
      return new bxf<>(
         ImmutableList.of(
            Pair.of(bxa.a(0.6F), 2),
            Pair.of(bwf.a(bta.aA, 8, cct.q, 0.6F, 2), 2),
            Pair.of(bwf.a(bta.aB, 8, cct.q, 0.6F, 2), 2),
            Pair.of(bya.a(cct.b, 0.6F, 2, 100), 2),
            Pair.of(bxz.a(cct.b, 0.6F, 5), 2),
            Pair.of(new bvs(30, 60), 1)
         )
      );
   }

   protected static void b(clq $$0) {
      bur<clq> $$1 = $$0.dS();
      com $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(com.k, com.b));
      com $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cct.o));
   }

   private static boolean a(clm $$0, btp $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btp> a(clm $$0) {
      Optional<btp> $$1 = bvk.a($$0, cct.ab);
      if ($$1.isPresent() && cdz.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btp> $$2 = a($$0, cct.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(cct.M);
      }
   }

   private static Optional<? extends btp> a(clm $$0, cct<? extends btp> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clq $$0, btp $$1) {
      if (!($$1 instanceof clm)) {
         clo.a($$0, $$1);
      }
   }

   protected static void b(clq $$0, btp $$1) {
      $$0.dS().b(cct.E);
      $$0.dS().a(cct.ab, $$1.cz(), 600L);
   }

   protected static void c(clq $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clq $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == com.k) {
            $$0.gx();
         }
      });
   }
}
