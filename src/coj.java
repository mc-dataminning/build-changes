import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class coj {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxa<?> a(coi $$0, bxa<coi> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cri.a));
      $$1.b(cri.b);
      $$1.f();
      return $$1;
   }

   protected static void a(coi $$0) {
      jq $$1 = jq.a($$0.dU().aj(), $$0.du());
      $$0.ea().a(cfc.b, $$1);
   }

   private static void b(coi $$0, bxa<coi> $$1) {
      $$1.a(cri.a, 0, ImmutableList.of(new byx(45, 90), new bzb(), byp.a(), cah.a()));
   }

   private static void c(coi $$0, bxa<coi> $$1) {
      $$1.a(cri.b, 10, ImmutableList.of(cad.a(coj::a), a(), b(), bzt.a(bvi.bR, 4)));
   }

   private static void d(coi $$0, bxa<coi> $$1) {
      $$1.a(cri.k, 10, ImmutableList.of(cag.a(($$1x, $$2) -> !a($$1x, (coe)$$0, $$2)), bzw.a(1.0F), byy.a(20)), cfc.o);
   }

   private static bzo<coi> a() {
      return new bzo<>(
         ImmutableList.of(
            Pair.of(bzq.a(bvi.bR, 8.0F), 1),
            Pair.of(bzq.a(bvi.aR, 8.0F), 1),
            Pair.of(bzq.a(bvi.aS, 8.0F), 1),
            Pair.of(bzq.a(8.0F), 1),
            Pair.of(new byb(30, 60), 1)
         )
      );
   }

   private static bzo<coi> b() {
      return new bzo<>(
         ImmutableList.of(
            Pair.of(bzj.a(0.6F), 2),
            Pair.of(byo.a(bvi.aR, 8, cfc.q, 0.6F, 2), 2),
            Pair.of(byo.a(bvi.aS, 8, cfc.q, 0.6F, 2), 2),
            Pair.of(caj.a(cfc.b, 0.6F, 2, 100), 2),
            Pair.of(cai.a(cfc.b, 0.6F, 5), 2),
            Pair.of(new byb(30, 60), 1)
         )
      );
   }

   protected static void b(coi $$0) {
      bxa<coi> $$1 = $$0.ea();
      cri $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cri.k, cri.b));
      cri $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cfc.o));
   }

   private static boolean a(ard $$0, coe $$1, bvy $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvy> a(ard $$0, coe $$1) {
      Optional<bvy> $$2 = bxt.a($$1, cfc.ab);
      if ($$2.isPresent() && cgi.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvy> $$3 = $$1.ea().c(cfc.l);
         return $$3.isPresent() ? $$3 : $$1.ea().c(cfc.M);
      }
   }

   protected static void a(ard $$0, coi $$1, bvy $$2) {
      if (!($$2 instanceof coe)) {
         cog.a($$0, $$1, $$2);
      }
   }

   protected static void a(coi $$0, bvy $$1) {
      $$0.ea().b(cfc.E);
      $$0.ea().a(cfc.ab, $$1.cF(), 600L);
   }

   protected static void c(coi $$0) {
      if ((double)$$0.dU().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(coi $$0) {
      $$0.ea().g().ifPresent($$1 -> {
         if ($$1 == cri.k) {
            $$0.gw();
         }
      });
   }
}
