import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cdo {
   private static final bnl a = bnl.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static brp<?> a(brp<cdn> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cdn> $$0) {
      $$0.a(cli.p, ImmutableList.of(Pair.of(0, new cdp()), Pair.of(1, bss.a(bsi::a, bzr.N))), ImmutableSet.of(Pair.of(bzr.N, bzs.a)), ImmutableSet.of(bzr.N));
   }

   private static void c(brp<cdn> $$0) {
      $$0.a(cli.k, 0, ImmutableList.of(buv.a(cdn::a), bul.a(cdo::b), btn.a(20), bss.a(bsi::a, bzr.o)), bzr.o);
   }

   private static void d(brp<cdn> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new btm(45, 90), new btq(), cdq.a(), new bsm(bzr.P)));
   }

   private static void e(brp<cdn> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, new bsa(bqb.f, 0.2F, 2)),
            Pair.of(2, new bud(ImmutableList.of(Pair.of(new bst(cdo::d), 1), Pair.of(bsd.a(a, cdo::c), 1)))),
            Pair.of(3, bus.a(cdo::b)),
            Pair.of(3, bvf.a(6, 0.15F)),
            Pair.of(
               4,
               new bsu(
                  ImmutableMap.of(bzr.m, bzs.b),
                  ImmutableSet.of(),
                  bsu.a.a,
                  bsu.b.b,
                  ImmutableList.of(
                     Pair.of(bty.c(0.5F), 2),
                     Pair.of(bty.a(0.15F, false), 2),
                     Pair.of(bun.a(cdo::a, cdo::d, 3), 3),
                     Pair.of(bvt.a(bpv::bf), 5),
                     Pair.of(bvt.a(bpv::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bqo $$0) {
      cyx $$1 = $$0.dM();
      Optional<btu> $$2 = $$0.dP().c(bzr.n);
      if ($$2.isPresent()) {
         ib $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(cdn $$0) {
      brp<cdn> $$1 = $$0.dP();
      cli $$2 = $$1.g().orElse(null);
      if ($$2 != cli.p) {
         $$1.a(ImmutableList.of(cli.p, cli.k, cli.b));
         if ($$2 == cli.k && $$1.g().orElse(null) != cli.k) {
            $$1.a(bzr.U, true, 2400L);
         }
      }
   }

   private static float b(bqo $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bqo $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bqo $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bqo> b(cdn $$0) {
      return bsi.a($$0) ? Optional.empty() : $$0.dP().c(bzr.B);
   }

   public static cvg a() {
      return cvg.a(avk.aA);
   }
}
