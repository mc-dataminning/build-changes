import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cao {
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

   protected static bkg<?> a(can $$0, bkg<can> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cdf.a));
      $$1.b(cdf.b);
      $$1.f();
      return $$1;
   }

   protected static void a(can $$0) {
      hf $$1 = hf.a($$0.dL().ac(), $$0.dl());
      $$0.dN().a(bsh.b, $$1);
   }

   private static void b(can $$0, bkg<can> $$1) {
      $$1.a(cdf.a, 0, ImmutableList.of(new bmc(45, 90), new bmg(), blv.a(), bnm.a()));
   }

   private static void c(can $$0, bkg<can> $$1) {
      $$1.a(cdf.b, 10, ImmutableList.of(bni.a(cao::a), a(), b(), bmy.a(biu.bt, 4)));
   }

   private static void d(can $$0, bkg<can> $$1) {
      $$1.a(cdf.k, 10, ImmutableList.of(bnl.a($$1x -> !a((caj)$$0, $$1x)), bnb.a(1.0F), bmd.a(20)), bsh.o);
   }

   private static bmt<can> a() {
      return new bmt<>(
         ImmutableList.of(
            Pair.of(bmv.a(biu.bt, 8.0F), 1),
            Pair.of(bmv.a(biu.aw, 8.0F), 1),
            Pair.of(bmv.a(biu.ax, 8.0F), 1),
            Pair.of(bmv.a(8.0F), 1),
            Pair.of(new blh(30, 60), 1)
         )
      );
   }

   private static bmt<can> b() {
      return new bmt<>(
         ImmutableList.of(
            Pair.of(bmo.a(0.6F), 2),
            Pair.of(blu.a(biu.aw, 8, bsh.q, 0.6F, 2), 2),
            Pair.of(blu.a(biu.ax, 8, bsh.q, 0.6F, 2), 2),
            Pair.of(bno.a(bsh.b, 0.6F, 2, 100), 2),
            Pair.of(bnn.a(bsh.b, 0.6F, 5), 2),
            Pair.of(new blh(30, 60), 1)
         )
      );
   }

   protected static void b(can $$0) {
      bkg<can> $$1 = $$0.dN();
      cdf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdf.k, cdf.b));
      cdf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bsh.o));
   }

   private static boolean a(caj $$0, bjg $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bjg> a(caj $$0) {
      Optional<bjg> $$1 = bkz.a($$0, bsh.aa);
      if ($$1.isPresent() && btl.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bjg> $$2 = a($$0, bsh.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(bsh.L);
      }
   }

   private static Optional<? extends bjg> a(caj $$0, bsh<? extends bjg> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(can $$0, bjg $$1) {
      if (!($$1 instanceof caj)) {
         cal.a($$0, $$1);
      }
   }

   protected static void b(can $$0, bjg $$1) {
      $$0.dN().b(bsh.E);
      $$0.dN().a(bsh.aa, $$1.cv(), 600L);
   }

   protected static void c(can $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(can $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == cdf.k) {
            $$0.gk();
         }
      });
   }
}
