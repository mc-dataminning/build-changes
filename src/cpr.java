import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cpr {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static byc<?> a(cpq $$0, byc<cpq> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(csr.a));
      $$1.b(csr.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpq $$0) {
      jd $$1 = jd.a($$0.dV().aj(), $$0.dv());
      $$0.eb().a(cge.b, $$1);
   }

   private static void b(cpq $$0, byc<cpq> $$1) {
      $$1.a(csr.a, 0, ImmutableList.of(new bzz(45, 90), new cad(), bzr.a(), cbj.a()));
   }

   private static void c(cpq $$0, byc<cpq> $$1) {
      $$1.a(csr.b, 10, ImmutableList.of(cbf.a(cpr::a), a(), b(), cav.a(bwm.bS, 4)));
   }

   private static void d(cpq $$0, byc<cpq> $$1) {
      $$1.a(csr.k, 10, ImmutableList.of(cbi.a(($$1x, $$2) -> !a($$1x, (cpm)$$0, $$2)), cay.a(1.0F), caa.a(20)), cge.p);
   }

   private static caq<cpq> a() {
      return new caq<>(
         ImmutableList.of(
            Pair.of(cas.a(bwm.bS, 8.0F), 1),
            Pair.of(cas.a(bwm.aR, 8.0F), 1),
            Pair.of(cas.a(bwm.aS, 8.0F), 1),
            Pair.of(cas.a(8.0F), 1),
            Pair.of(new bzd(30, 60), 1)
         )
      );
   }

   private static caq<cpq> b() {
      return new caq<>(
         ImmutableList.of(
            Pair.of(cal.a(0.6F), 2),
            Pair.of(bzq.a(bwm.aR, 8, cge.r, 0.6F, 2), 2),
            Pair.of(bzq.a(bwm.aS, 8, cge.r, 0.6F, 2), 2),
            Pair.of(cbl.a(cge.b, 0.6F, 2, 100), 2),
            Pair.of(cbk.a(cge.b, 0.6F, 5), 2),
            Pair.of(new bzd(30, 60), 1)
         )
      );
   }

   protected static void b(cpq $$0) {
      byc<cpq> $$1 = $$0.eb();
      csr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csr.k, csr.b));
      csr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cge.p));
   }

   private static boolean a(arq $$0, cpm $$1, bxc $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bxc> a(arq $$0, cpm $$1) {
      Optional<bxc> $$2 = byv.a($$1, cge.ac);
      if ($$2.isPresent() && chk.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bxc> $$3 = $$1.eb().c(cge.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cge.N);
      }
   }

   protected static void a(arq $$0, cpq $$1, bxc $$2) {
      if (!($$2 instanceof cpm)) {
         cpo.a($$0, $$1, $$2);
      }
   }

   protected static void a(cpq $$0, bxc $$1) {
      $$0.eb().b(cge.F);
      $$0.eb().a(cge.ac, $$1.cG(), 600L);
   }

   protected static void c(cpq $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cpq $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == csr.k) {
            $$0.gu();
         }
      });
   }
}
