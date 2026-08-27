import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ceg {
   private static final bob a = bob.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bsf<?> a(bsf<cef> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cef> $$0) {
      $$0.a(cma.p, ImmutableList.of(Pair.of(0, new ceh()), Pair.of(1, bti.a(bsy::a, cah.N))), ImmutableSet.of(Pair.of(cah.N, cai.a)), ImmutableSet.of(cah.N));
   }

   private static void c(bsf<cef> $$0) {
      $$0.a(cma.k, 0, ImmutableList.of(bvl.a(cef::a), bvb.a(ceg::b), bud.a(20), bti.a(bsy::a, cah.o)), cah.o);
   }

   private static void d(bsf<cef> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new buc(45, 90), new bug(), cei.a(), new btc(cah.P)));
   }

   private static void e(bsf<cef> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, new bsq(bqr.f, 0.2F, 2)),
            Pair.of(2, new but(ImmutableList.of(Pair.of(new btj(ceg::d), 1), Pair.of(bst.a(a, ceg::c), 1)))),
            Pair.of(3, bvi.a(ceg::b)),
            Pair.of(3, bvv.a(6, 0.15F)),
            Pair.of(
               4,
               new btk(
                  ImmutableMap.of(cah.m, cai.b),
                  ImmutableSet.of(),
                  btk.a.a,
                  btk.b.b,
                  ImmutableList.of(
                     Pair.of(buo.c(0.5F), 2),
                     Pair.of(buo.a(0.15F, false), 2),
                     Pair.of(bvd.a(ceg::a, ceg::d, 3), 3),
                     Pair.of(bwj.a(bql::bf), 5),
                     Pair.of(bwj.a(bql::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bre $$0) {
      czu $$1 = $$0.dN();
      Optional<buk> $$2 = $$0.dQ().c(cah.n);
      if ($$2.isPresent()) {
         im $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(cef $$0) {
      bsf<cef> $$1 = $$0.dQ();
      cma $$2 = $$1.g().orElse(null);
      if ($$2 != cma.p) {
         $$1.a(ImmutableList.of(cma.p, cma.k, cma.b));
         if ($$2 == cma.k && $$1.g().orElse(null) != cma.k) {
            $$1.a(cah.U, true, 2400L);
         }
      }
   }

   private static float b(bre $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bre $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bre $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bre> b(cef $$0) {
      return bsy.a($$0) ? Optional.empty() : $$0.dQ().c(cah.B);
   }

   public static cwd a() {
      return cwd.a(avw.aA);
   }
}
