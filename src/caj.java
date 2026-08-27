import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class caj {
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

   protected static bkb<?> a(cai $$0, bkb<cai> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cda.a));
      $$1.b(cda.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cai $$0) {
      hf $$1 = hf.a($$0.dK().ac(), $$0.dk());
      $$0.dM().a(bsc.b, $$1);
   }

   private static void b(cai $$0, bkb<cai> $$1) {
      $$1.a(cda.a, 0, ImmutableList.of(new blx(45, 90), new bmb(), blq.a(), bnh.a()));
   }

   private static void c(cai $$0, bkb<cai> $$1) {
      $$1.a(cda.b, 10, ImmutableList.of(bnd.a(caj::a), a(), b(), bmt.a(bip.bt, 4)));
   }

   private static void d(cai $$0, bkb<cai> $$1) {
      $$1.a(cda.k, 10, ImmutableList.of(bng.a($$1x -> !a((cae)$$0, $$1x)), bmw.a(1.0F), bly.a(20)), bsc.o);
   }

   private static bmo<cai> a() {
      return new bmo<>(
         ImmutableList.of(
            Pair.of(bmq.a(bip.bt, 8.0F), 1),
            Pair.of(bmq.a(bip.aw, 8.0F), 1),
            Pair.of(bmq.a(bip.ax, 8.0F), 1),
            Pair.of(bmq.a(8.0F), 1),
            Pair.of(new blc(30, 60), 1)
         )
      );
   }

   private static bmo<cai> b() {
      return new bmo<>(
         ImmutableList.of(
            Pair.of(bmj.a(0.6F), 2),
            Pair.of(blp.a(bip.aw, 8, bsc.q, 0.6F, 2), 2),
            Pair.of(blp.a(bip.ax, 8, bsc.q, 0.6F, 2), 2),
            Pair.of(bnj.a(bsc.b, 0.6F, 2, 100), 2),
            Pair.of(bni.a(bsc.b, 0.6F, 5), 2),
            Pair.of(new blc(30, 60), 1)
         )
      );
   }

   protected static void b(cai $$0) {
      bkb<cai> $$1 = $$0.dM();
      cda $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cda.k, cda.b));
      cda $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bsc.o));
   }

   private static boolean a(cae $$0, bjb $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bjb> a(cae $$0) {
      Optional<bjb> $$1 = bku.a($$0, bsc.aa);
      if ($$1.isPresent() && btg.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bjb> $$2 = a($$0, bsc.l);
         return $$2.isPresent() ? $$2 : $$0.dM().c(bsc.L);
      }
   }

   private static Optional<? extends bjb> a(cae $$0, bsc<? extends bjb> $$1) {
      return $$0.dM().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cai $$0, bjb $$1) {
      if (!($$1 instanceof cae)) {
         cag.a($$0, $$1);
      }
   }

   protected static void b(cai $$0, bjb $$1) {
      $$0.dM().b(bsc.E);
      $$0.dM().a(bsc.aa, $$1.cv(), 600L);
   }

   protected static void c(cai $$0) {
      if ((double)$$0.dK().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cai $$0) {
      $$0.dM().g().ifPresent($$1 -> {
         if ($$1 == cda.k) {
            $$0.gh();
         }
      });
   }
}
