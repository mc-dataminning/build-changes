import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class caq {
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

   protected static bki<?> a(cap $$0, bki<cap> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cdh.a));
      $$1.b(cdh.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cap $$0) {
      hf $$1 = hf.a($$0.dL().ac(), $$0.dl());
      $$0.dN().a(bsj.b, $$1);
   }

   private static void b(cap $$0, bki<cap> $$1) {
      $$1.a(cdh.a, 0, ImmutableList.of(new bme(45, 90), new bmi(), blx.a(), bno.a()));
   }

   private static void c(cap $$0, bki<cap> $$1) {
      $$1.a(cdh.b, 10, ImmutableList.of(bnk.a(caq::a), a(), b(), bna.a(biw.bt, 4)));
   }

   private static void d(cap $$0, bki<cap> $$1) {
      $$1.a(cdh.k, 10, ImmutableList.of(bnn.a($$1x -> !a((cal)$$0, $$1x)), bnd.a(1.0F), bmf.a(20)), bsj.o);
   }

   private static bmv<cap> a() {
      return new bmv<>(
         ImmutableList.of(
            Pair.of(bmx.a(biw.bt, 8.0F), 1),
            Pair.of(bmx.a(biw.aw, 8.0F), 1),
            Pair.of(bmx.a(biw.ax, 8.0F), 1),
            Pair.of(bmx.a(8.0F), 1),
            Pair.of(new blj(30, 60), 1)
         )
      );
   }

   private static bmv<cap> b() {
      return new bmv<>(
         ImmutableList.of(
            Pair.of(bmq.a(0.6F), 2),
            Pair.of(blw.a(biw.aw, 8, bsj.q, 0.6F, 2), 2),
            Pair.of(blw.a(biw.ax, 8, bsj.q, 0.6F, 2), 2),
            Pair.of(bnq.a(bsj.b, 0.6F, 2, 100), 2),
            Pair.of(bnp.a(bsj.b, 0.6F, 5), 2),
            Pair.of(new blj(30, 60), 1)
         )
      );
   }

   protected static void b(cap $$0) {
      bki<cap> $$1 = $$0.dN();
      cdh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdh.k, cdh.b));
      cdh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bsj.o));
   }

   private static boolean a(cal $$0, bji $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bji> a(cal $$0) {
      Optional<bji> $$1 = blb.a($$0, bsj.aa);
      if ($$1.isPresent() && btn.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bji> $$2 = a($$0, bsj.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(bsj.L);
      }
   }

   private static Optional<? extends bji> a(cal $$0, bsj<? extends bji> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cap $$0, bji $$1) {
      if (!($$1 instanceof cal)) {
         can.a($$0, $$1);
      }
   }

   protected static void b(cap $$0, bji $$1) {
      $$0.dN().b(bsj.E);
      $$0.dN().a(bsj.aa, $$1.cv(), 600L);
   }

   protected static void c(cap $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cap $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == cdh.k) {
            $$0.gk();
         }
      });
   }
}
