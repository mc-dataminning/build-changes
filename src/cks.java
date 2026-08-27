import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cks {
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

   protected static bts<?> a(ckr $$0, bts<ckr> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cnn.a));
      $$1.b(cnn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ckr $$0) {
      iw $$1 = iw.a($$0.dP().ae(), $$0.dp());
      $$0.dS().a(cbu.b, $$1);
   }

   private static void b(ckr $$0, bts<ckr> $$1) {
      $$1.a(cnn.a, 0, ImmutableList.of(new bvp(45, 90), new bvt(), bvh.a(), bwz.a()));
   }

   private static void c(ckr $$0, bts<ckr> $$1) {
      $$1.a(cnn.b, 10, ImmutableList.of(bwv.a(cks::a), a(), b(), bwl.a(bsc.by, 4)));
   }

   private static void d(ckr $$0, bts<ckr> $$1) {
      $$1.a(cnn.k, 10, ImmutableList.of(bwy.a($$1x -> !a((ckn)$$0, $$1x)), bwo.a(1.0F), bvq.a(20)), cbu.o);
   }

   private static bwg<ckr> a() {
      return new bwg<>(
         ImmutableList.of(
            Pair.of(bwi.a(bsc.by, 8.0F), 1),
            Pair.of(bwi.a(bsc.aA, 8.0F), 1),
            Pair.of(bwi.a(bsc.aB, 8.0F), 1),
            Pair.of(bwi.a(8.0F), 1),
            Pair.of(new but(30, 60), 1)
         )
      );
   }

   private static bwg<ckr> b() {
      return new bwg<>(
         ImmutableList.of(
            Pair.of(bwb.a(0.6F), 2),
            Pair.of(bvg.a(bsc.aA, 8, cbu.q, 0.6F, 2), 2),
            Pair.of(bvg.a(bsc.aB, 8, cbu.q, 0.6F, 2), 2),
            Pair.of(bxb.a(cbu.b, 0.6F, 2, 100), 2),
            Pair.of(bxa.a(cbu.b, 0.6F, 5), 2),
            Pair.of(new but(30, 60), 1)
         )
      );
   }

   protected static void b(ckr $$0) {
      bts<ckr> $$1 = $$0.dS();
      cnn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnn.k, cnn.b));
      cnn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cbu.o));
   }

   private static boolean a(ckn $$0, bsq $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bsq> a(ckn $$0) {
      Optional<bsq> $$1 = bul.a($$0, cbu.ab);
      if ($$1.isPresent() && cda.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bsq> $$2 = a($$0, cbu.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(cbu.M);
      }
   }

   private static Optional<? extends bsq> a(ckn $$0, cbu<? extends bsq> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ckr $$0, bsq $$1) {
      if (!($$1 instanceof ckn)) {
         ckp.a($$0, $$1);
      }
   }

   protected static void b(ckr $$0, bsq $$1) {
      $$0.dS().b(cbu.E);
      $$0.dS().a(cbu.ab, $$1.cz(), 600L);
   }

   protected static void c(ckr $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ckr $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == cnn.k) {
            $$0.gw();
         }
      });
   }
}
