import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cle {
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

   protected static bud<?> a(cld $$0, bud<cld> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cnz.a));
      $$1.b(cnz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cld $$0) {
      ji $$1 = ji.a($$0.dQ().af(), $$0.dq());
      $$0.dU().a(ccf.b, $$1);
   }

   private static void b(cld $$0, bud<cld> $$1) {
      $$1.a(cnz.a, 0, ImmutableList.of(new bwa(45, 90), new bwe(), bvs.a(), bxk.a()));
   }

   private static void c(cld $$0, bud<cld> $$1) {
      $$1.a(cnz.b, 10, ImmutableList.of(bxg.a(cle::a), a(), b(), bww.a(bsm.by, 4)));
   }

   private static void d(cld $$0, bud<cld> $$1) {
      $$1.a(cnz.k, 10, ImmutableList.of(bxj.a($$1x -> !a((ckz)$$0, $$1x)), bwz.a(1.0F), bwb.a(20)), ccf.o);
   }

   private static bwr<cld> a() {
      return new bwr<>(
         ImmutableList.of(
            Pair.of(bwt.a(bsm.by, 8.0F), 1),
            Pair.of(bwt.a(bsm.aA, 8.0F), 1),
            Pair.of(bwt.a(bsm.aB, 8.0F), 1),
            Pair.of(bwt.a(8.0F), 1),
            Pair.of(new bve(30, 60), 1)
         )
      );
   }

   private static bwr<cld> b() {
      return new bwr<>(
         ImmutableList.of(
            Pair.of(bwm.a(0.6F), 2),
            Pair.of(bvr.a(bsm.aA, 8, ccf.q, 0.6F, 2), 2),
            Pair.of(bvr.a(bsm.aB, 8, ccf.q, 0.6F, 2), 2),
            Pair.of(bxm.a(ccf.b, 0.6F, 2, 100), 2),
            Pair.of(bxl.a(ccf.b, 0.6F, 5), 2),
            Pair.of(new bve(30, 60), 1)
         )
      );
   }

   protected static void b(cld $$0) {
      bud<cld> $$1 = $$0.dU();
      cnz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnz.k, cnz.b));
      cnz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccf.o));
   }

   private static boolean a(ckz $$0, btb $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btb> a(ckz $$0) {
      Optional<btb> $$1 = buw.a($$0, ccf.ab);
      if ($$1.isPresent() && cdl.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btb> $$2 = a($$0, ccf.l);
         return $$2.isPresent() ? $$2 : $$0.dU().c(ccf.M);
      }
   }

   private static Optional<? extends btb> a(ckz $$0, ccf<? extends btb> $$1) {
      return $$0.dU().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cld $$0, btb $$1) {
      if (!($$1 instanceof ckz)) {
         clb.a($$0, $$1);
      }
   }

   protected static void b(cld $$0, btb $$1) {
      $$0.dU().b(ccf.E);
      $$0.dU().a(ccf.ab, $$1.cA(), 600L);
   }

   protected static void c(cld $$0) {
      if ((double)$$0.dQ().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cld $$0) {
      $$0.dU().g().ifPresent($$1 -> {
         if ($$1 == cnz.k) {
            $$0.gv();
         }
      });
   }
}
