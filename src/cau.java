import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cau {
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

   protected static bkm<?> a(cat $$0, bkm<cat> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cdl.a));
      $$1.b(cdl.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cat $$0) {
      hd $$1 = hd.a($$0.dL().ac(), $$0.dl());
      $$0.dN().a(bsn.b, $$1);
   }

   private static void b(cat $$0, bkm<cat> $$1) {
      $$1.a(cdl.a, 0, ImmutableList.of(new bmi(45, 90), new bmm(), bmb.a(), bns.a()));
   }

   private static void c(cat $$0, bkm<cat> $$1) {
      $$1.a(cdl.b, 10, ImmutableList.of(bno.a(cau::a), a(), b(), bne.a(bja.bt, 4)));
   }

   private static void d(cat $$0, bkm<cat> $$1) {
      $$1.a(cdl.k, 10, ImmutableList.of(bnr.a($$1x -> !a((cap)$$0, $$1x)), bnh.a(1.0F), bmj.a(20)), bsn.o);
   }

   private static bmz<cat> a() {
      return new bmz<>(
         ImmutableList.of(
            Pair.of(bnb.a(bja.bt, 8.0F), 1),
            Pair.of(bnb.a(bja.aw, 8.0F), 1),
            Pair.of(bnb.a(bja.ax, 8.0F), 1),
            Pair.of(bnb.a(8.0F), 1),
            Pair.of(new bln(30, 60), 1)
         )
      );
   }

   private static bmz<cat> b() {
      return new bmz<>(
         ImmutableList.of(
            Pair.of(bmu.a(0.6F), 2),
            Pair.of(bma.a(bja.aw, 8, bsn.q, 0.6F, 2), 2),
            Pair.of(bma.a(bja.ax, 8, bsn.q, 0.6F, 2), 2),
            Pair.of(bnu.a(bsn.b, 0.6F, 2, 100), 2),
            Pair.of(bnt.a(bsn.b, 0.6F, 5), 2),
            Pair.of(new bln(30, 60), 1)
         )
      );
   }

   protected static void b(cat $$0) {
      bkm<cat> $$1 = $$0.dN();
      cdl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdl.k, cdl.b));
      cdl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bsn.o));
   }

   private static boolean a(cap $$0, bjm $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bjm> a(cap $$0) {
      Optional<bjm> $$1 = blf.a($$0, bsn.aa);
      if ($$1.isPresent() && btr.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bjm> $$2 = a($$0, bsn.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(bsn.L);
      }
   }

   private static Optional<? extends bjm> a(cap $$0, bsn<? extends bjm> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cat $$0, bjm $$1) {
      if (!($$1 instanceof cap)) {
         car.a($$0, $$1);
      }
   }

   protected static void b(cat $$0, bjm $$1) {
      $$0.dN().b(bsn.E);
      $$0.dN().a(bsn.aa, $$1.cv(), 600L);
   }

   protected static void c(cat $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cat $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == cdl.k) {
            $$0.gl();
         }
      });
   }
}
