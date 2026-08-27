import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbr {
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

   protected static blj<?> a(cbq $$0, blj<cbq> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cei.a));
      $$1.b(cei.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cbq $$0) {
      ia $$1 = ia.a($$0.dL().ac(), $$0.dl());
      $$0.dN().a(btk.b, $$1);
   }

   private static void b(cbq $$0, blj<cbq> $$1) {
      $$1.a(cei.a, 0, ImmutableList.of(new bnf(45, 90), new bnj(), bmy.a(), bop.a()));
   }

   private static void c(cbq $$0, blj<cbq> $$1) {
      $$1.a(cei.b, 10, ImmutableList.of(bol.a(cbr::a), a(), b(), bob.a(bjx.bt, 4)));
   }

   private static void d(cbq $$0, blj<cbq> $$1) {
      $$1.a(cei.k, 10, ImmutableList.of(boo.a($$1x -> !a((cbm)$$0, $$1x)), boe.a(1.0F), bng.a(20)), btk.o);
   }

   private static bnw<cbq> a() {
      return new bnw<>(
         ImmutableList.of(
            Pair.of(bny.a(bjx.bt, 8.0F), 1),
            Pair.of(bny.a(bjx.aw, 8.0F), 1),
            Pair.of(bny.a(bjx.ax, 8.0F), 1),
            Pair.of(bny.a(8.0F), 1),
            Pair.of(new bmk(30, 60), 1)
         )
      );
   }

   private static bnw<cbq> b() {
      return new bnw<>(
         ImmutableList.of(
            Pair.of(bnr.a(0.6F), 2),
            Pair.of(bmx.a(bjx.aw, 8, btk.q, 0.6F, 2), 2),
            Pair.of(bmx.a(bjx.ax, 8, btk.q, 0.6F, 2), 2),
            Pair.of(bor.a(btk.b, 0.6F, 2, 100), 2),
            Pair.of(boq.a(btk.b, 0.6F, 5), 2),
            Pair.of(new bmk(30, 60), 1)
         )
      );
   }

   protected static void b(cbq $$0) {
      blj<cbq> $$1 = $$0.dN();
      cei $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cei.k, cei.b));
      cei $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(btk.o));
   }

   private static boolean a(cbm $$0, bkj $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bkj> a(cbm $$0) {
      Optional<bkj> $$1 = bmc.a($$0, btk.aa);
      if ($$1.isPresent() && buo.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bkj> $$2 = a($$0, btk.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(btk.L);
      }
   }

   private static Optional<? extends bkj> a(cbm $$0, btk<? extends bkj> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cbq $$0, bkj $$1) {
      if (!($$1 instanceof cbm)) {
         cbo.a($$0, $$1);
      }
   }

   protected static void b(cbq $$0, bkj $$1) {
      $$0.dN().b(btk.E);
      $$0.dN().a(btk.aa, $$1.cv(), 600L);
   }

   protected static void c(cbq $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cbq $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == cei.k) {
            $$0.gl();
         }
      });
   }
}
