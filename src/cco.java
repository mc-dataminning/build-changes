import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cco {
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

   protected static bmg<?> a(ccn $$0, bmg<ccn> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cff.a));
      $$1.b(cff.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ccn $$0) {
      ia $$1 = ia.a($$0.dN().ad(), $$0.dn());
      $$0.dP().a(buh.b, $$1);
   }

   private static void b(ccn $$0, bmg<ccn> $$1) {
      $$1.a(cff.a, 0, ImmutableList.of(new boc(45, 90), new bog(), bnv.a(), bpm.a()));
   }

   private static void c(ccn $$0, bmg<ccn> $$1) {
      $$1.a(cff.b, 10, ImmutableList.of(bpi.a(cco::a), a(), b(), boy.a(bku.bt, 4)));
   }

   private static void d(ccn $$0, bmg<ccn> $$1) {
      $$1.a(cff.k, 10, ImmutableList.of(bpl.a($$1x -> !a((ccj)$$0, $$1x)), bpb.a(1.0F), bod.a(20)), buh.o);
   }

   private static bot<ccn> a() {
      return new bot<>(
         ImmutableList.of(
            Pair.of(bov.a(bku.bt, 8.0F), 1),
            Pair.of(bov.a(bku.aw, 8.0F), 1),
            Pair.of(bov.a(bku.ax, 8.0F), 1),
            Pair.of(bov.a(8.0F), 1),
            Pair.of(new bnh(30, 60), 1)
         )
      );
   }

   private static bot<ccn> b() {
      return new bot<>(
         ImmutableList.of(
            Pair.of(boo.a(0.6F), 2),
            Pair.of(bnu.a(bku.aw, 8, buh.q, 0.6F, 2), 2),
            Pair.of(bnu.a(bku.ax, 8, buh.q, 0.6F, 2), 2),
            Pair.of(bpo.a(buh.b, 0.6F, 2, 100), 2),
            Pair.of(bpn.a(buh.b, 0.6F, 5), 2),
            Pair.of(new bnh(30, 60), 1)
         )
      );
   }

   protected static void b(ccn $$0) {
      bmg<ccn> $$1 = $$0.dP();
      cff $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cff.k, cff.b));
      cff $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(buh.o));
   }

   private static boolean a(ccj $$0, blg $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends blg> a(ccj $$0) {
      Optional<blg> $$1 = bmz.a($$0, buh.aa);
      if ($$1.isPresent() && bvl.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends blg> $$2 = a($$0, buh.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(buh.L);
      }
   }

   private static Optional<? extends blg> a(ccj $$0, buh<? extends blg> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ccn $$0, blg $$1) {
      if (!($$1 instanceof ccj)) {
         ccl.a($$0, $$1);
      }
   }

   protected static void b(ccn $$0, blg $$1) {
      $$0.dP().b(buh.E);
      $$0.dP().a(buh.aa, $$1.cw(), 600L);
   }

   protected static void c(ccn $$0) {
      if ((double)$$0.dN().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ccn $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == cff.k) {
            $$0.gm();
         }
      });
   }
}
