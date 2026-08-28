import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cpl {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxz<?> a(cpk $$0, bxz<cpk> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(csl.a));
      $$1.b(csl.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpk $$0) {
      jd $$1 = jd.a($$0.dV().aj(), $$0.dv());
      $$0.eb().a(cgb.b, $$1);
   }

   private static void b(cpk $$0, bxz<cpk> $$1) {
      $$1.a(csl.a, 0, ImmutableList.of(new bzw(45, 90), new caa(), bzo.a(), cbg.a()));
   }

   private static void c(cpk $$0, bxz<cpk> $$1) {
      $$1.a(csl.b, 10, ImmutableList.of(cbc.a(cpl::a), a(), b(), cas.a(bwj.bS, 4)));
   }

   private static void d(cpk $$0, bxz<cpk> $$1) {
      $$1.a(csl.k, 10, ImmutableList.of(cbf.a(($$1x, $$2) -> !a($$1x, (cpg)$$0, $$2)), cav.a(1.0F), bzx.a(20)), cgb.p);
   }

   private static can<cpk> a() {
      return new can<>(
         ImmutableList.of(
            Pair.of(cap.a(bwj.bS, 8.0F), 1),
            Pair.of(cap.a(bwj.aR, 8.0F), 1),
            Pair.of(cap.a(bwj.aS, 8.0F), 1),
            Pair.of(cap.a(8.0F), 1),
            Pair.of(new bza(30, 60), 1)
         )
      );
   }

   private static can<cpk> b() {
      return new can<>(
         ImmutableList.of(
            Pair.of(cai.a(0.6F), 2),
            Pair.of(bzn.a(bwj.aR, 8, cgb.r, 0.6F, 2), 2),
            Pair.of(bzn.a(bwj.aS, 8, cgb.r, 0.6F, 2), 2),
            Pair.of(cbi.a(cgb.b, 0.6F, 2, 100), 2),
            Pair.of(cbh.a(cgb.b, 0.6F, 5), 2),
            Pair.of(new bza(30, 60), 1)
         )
      );
   }

   protected static void b(cpk $$0) {
      bxz<cpk> $$1 = $$0.eb();
      csl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csl.k, csl.b));
      csl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cgb.p));
   }

   private static boolean a(aro $$0, cpg $$1, bwz $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bwz> a(aro $$0, cpg $$1) {
      Optional<bwz> $$2 = bys.a($$1, cgb.ac);
      if ($$2.isPresent() && chh.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bwz> $$3 = $$1.eb().c(cgb.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cgb.N);
      }
   }

   protected static void a(aro $$0, cpk $$1, bwz $$2) {
      if (!($$2 instanceof cpg)) {
         cpi.a($$0, $$1, $$2);
      }
   }

   protected static void a(cpk $$0, bwz $$1) {
      $$0.eb().b(cgb.F);
      $$0.eb().a(cgb.ac, $$1.cG(), 600L);
   }

   protected static void c(cpk $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cpk $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == csl.k) {
            $$0.gu();
         }
      });
   }
}
