import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class ckk {
   private static final btm a = btm.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static byc<?> a(byc<ckj> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckj> $$0) {
      $$0.a(csr.p, ImmutableList.of(Pair.of(0, new ckl()), Pair.of(1, bzf.a(byv::a, cge.O))), ImmutableSet.of(Pair.of(cge.O, cgf.a)), ImmutableSet.of(cge.O));
   }

   private static void c(byc<ckj> $$0) {
      $$0.a(csr.k, 0, ImmutableList.of(cbi.a(ckj::a), cay.a(ckk::b), caa.a(20), bzf.a(byv::a, cge.p)), cge.p);
   }

   private static void d(byc<ckj> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new bzz(45, 90), new cad(), ckm.a(), new byz(cge.Q)));
   }

   private static void e(byc<ckj> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, new byn(bwm.h, 0.2F, 2)),
            Pair.of(2, new caq(ImmutableList.of(Pair.of(new bzg(ckk::d), 1), Pair.of(byq.a(a, ckk::c), 1)))),
            Pair.of(3, cbf.a(ckk::a)),
            Pair.of(3, cbs.a(6, 0.15F)),
            Pair.of(
               4,
               new bzh(
                  ImmutableMap.of(cge.n, cgf.b),
                  ImmutableSet.of(),
                  bzh.a.a,
                  bzh.b.b,
                  ImmutableList.of(
                     Pair.of(cal.c(0.5F), 2),
                     Pair.of(cal.a(0.15F, false), 2),
                     Pair.of(cba.a(ckk::a, ckk::d, 3), 3),
                     Pair.of(ccg.a(bwd::bj), 5),
                     Pair.of(ccg.a(bwd::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxc $$0) {
      div $$1 = $$0.dV();
      Optional<cah> $$2 = $$0.eb().c(cge.o);
      if ($$2.isPresent()) {
         iu $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(ckj $$0) {
      byc<ckj> $$1 = $$0.eb();
      csr $$2 = $$1.g().orElse(null);
      if ($$2 != csr.p) {
         $$1.a(ImmutableList.of(csr.p, csr.k, csr.b));
         if ($$2 == csr.k && $$1.g().orElse(null) != csr.k) {
            $$1.a(cge.V, true, 2400L);
         }
      }
   }

   private static float b(bxc $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(bxc $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(bxc $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bxc> a(arq $$0, ckj $$1) {
      return byv.a($$1) ? Optional.empty() : $$1.eb().c(cge.C);
   }

   public static Predicate<cyy> a() {
      return $$0 -> $$0.a(axk.aC);
   }
}
