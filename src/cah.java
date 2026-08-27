import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cah {
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

   protected static bjz<?> a(cag $$0, bjz<cag> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ccy.a));
      $$1.b(ccy.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cag $$0) {
      hd $$1 = hd.a($$0.dK().ac(), $$0.dk());
      $$0.dM().a(bsa.b, $$1);
   }

   private static void b(cag $$0, bjz<cag> $$1) {
      $$1.a(ccy.a, 0, ImmutableList.of(new blv(45, 90), new blz(), blo.a(), bnf.a()));
   }

   private static void c(cag $$0, bjz<cag> $$1) {
      $$1.a(ccy.b, 10, ImmutableList.of(bnb.a(cah::a), a(), b(), bmr.a(bim.bt, 4)));
   }

   private static void d(cag $$0, bjz<cag> $$1) {
      $$1.a(ccy.k, 10, ImmutableList.of(bne.a($$1x -> !a((cac)$$0, $$1x)), bmu.a(1.0F), blw.a(20)), bsa.o);
   }

   private static bmm<cag> a() {
      return new bmm<>(
         ImmutableList.of(
            Pair.of(bmo.a(bim.bt, 8.0F), 1),
            Pair.of(bmo.a(bim.aw, 8.0F), 1),
            Pair.of(bmo.a(bim.ax, 8.0F), 1),
            Pair.of(bmo.a(8.0F), 1),
            Pair.of(new bla(30, 60), 1)
         )
      );
   }

   private static bmm<cag> b() {
      return new bmm<>(
         ImmutableList.of(
            Pair.of(bmh.a(0.6F), 2),
            Pair.of(bln.a(bim.aw, 8, bsa.q, 0.6F, 2), 2),
            Pair.of(bln.a(bim.ax, 8, bsa.q, 0.6F, 2), 2),
            Pair.of(bnh.a(bsa.b, 0.6F, 2, 100), 2),
            Pair.of(bng.a(bsa.b, 0.6F, 5), 2),
            Pair.of(new bla(30, 60), 1)
         )
      );
   }

   protected static void b(cag $$0) {
      bjz<cag> $$1 = $$0.dM();
      ccy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccy.k, ccy.b));
      ccy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bsa.o));
   }

   private static boolean a(cac $$0, biy $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends biy> a(cac $$0) {
      Optional<biy> $$1 = bks.a($$0, bsa.aa);
      if ($$1.isPresent() && bte.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends biy> $$2 = a($$0, bsa.l);
         return $$2.isPresent() ? $$2 : $$0.dM().c(bsa.L);
      }
   }

   private static Optional<? extends biy> a(cac $$0, bsa<? extends biy> $$1) {
      return $$0.dM().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cag $$0, biy $$1) {
      if (!($$1 instanceof cac)) {
         cae.a($$0, $$1);
      }
   }

   protected static void b(cag $$0, biy $$1) {
      $$0.dM().b(bsa.E);
      $$0.dM().a(bsa.aa, $$1.cv(), 600L);
   }

   protected static void c(cag $$0) {
      if ((double)$$0.dK().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cag $$0) {
      $$0.dM().g().ifPresent($$1 -> {
         if ($$1 == ccy.k) {
            $$0.gg();
         }
      });
   }
}
