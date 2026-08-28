import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cls {
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

   protected static bus<?> a(clr $$0, bus<clr> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(coo.a));
      $$1.b(coo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clr $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(ccu.b, $$1);
   }

   private static void b(clr $$0, bus<clr> $$1) {
      $$1.a(coo.a, 0, ImmutableList.of(new bwp(45, 90), new bwt(), bwh.a(), bxz.a()));
   }

   private static void c(clr $$0, bus<clr> $$1) {
      $$1.a(coo.b, 10, ImmutableList.of(bxv.a(cls::a), a(), b(), bxl.a(btb.by, 4)));
   }

   private static void d(clr $$0, bus<clr> $$1) {
      $$1.a(coo.k, 10, ImmutableList.of(bxy.a($$1x -> !a((cln)$$0, $$1x)), bxo.a(1.0F), bwq.a(20)), ccu.o);
   }

   private static bxg<clr> a() {
      return new bxg<>(
         ImmutableList.of(
            Pair.of(bxi.a(btb.by, 8.0F), 1),
            Pair.of(bxi.a(btb.aA, 8.0F), 1),
            Pair.of(bxi.a(btb.aB, 8.0F), 1),
            Pair.of(bxi.a(8.0F), 1),
            Pair.of(new bvt(30, 60), 1)
         )
      );
   }

   private static bxg<clr> b() {
      return new bxg<>(
         ImmutableList.of(
            Pair.of(bxb.a(0.6F), 2),
            Pair.of(bwg.a(btb.aA, 8, ccu.q, 0.6F, 2), 2),
            Pair.of(bwg.a(btb.aB, 8, ccu.q, 0.6F, 2), 2),
            Pair.of(byb.a(ccu.b, 0.6F, 2, 100), 2),
            Pair.of(bya.a(ccu.b, 0.6F, 5), 2),
            Pair.of(new bvt(30, 60), 1)
         )
      );
   }

   protected static void b(clr $$0) {
      bus<clr> $$1 = $$0.dS();
      coo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coo.k, coo.b));
      coo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccu.o));
   }

   private static boolean a(cln $$0, btq $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btq> a(cln $$0) {
      Optional<btq> $$1 = bvl.a($$0, ccu.ab);
      if ($$1.isPresent() && cea.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btq> $$2 = a($$0, ccu.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(ccu.M);
      }
   }

   private static Optional<? extends btq> a(cln $$0, ccu<? extends btq> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clr $$0, btq $$1) {
      if (!($$1 instanceof cln)) {
         clp.a($$0, $$1);
      }
   }

   protected static void b(clr $$0, btq $$1) {
      $$0.dS().b(ccu.E);
      $$0.dS().a(ccu.ab, $$1.cz(), 600L);
   }

   protected static void c(clr $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clr $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == coo.k) {
            $$0.gx();
         }
      });
   }
}
