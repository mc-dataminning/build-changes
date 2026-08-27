import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bzn {
   private static final bjn a = bjn.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bno<?> a(bno<bzm> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<bzm> $$0) {
      $$0.a(chc.p, ImmutableList.of(Pair.of(0, new bzo()), Pair.of(1, bor.a(boh::a, bvq.N))), ImmutableSet.of(Pair.of(bvq.N, bvr.a)), ImmutableSet.of(bvq.N));
   }

   private static void c(bno<bzm> $$0) {
      $$0.a(chc.k, 0, ImmutableList.of(bqu.a(bzm::a), bqk.a(bzn::b), bpm.a(20), bor.a(boh::a, bvq.o)), bvq.o);
   }

   private static void d(bno<bzm> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bpl(45, 90), new bpp(), bzp.a(), new bol(bvq.P)));
   }

   private static void e(bno<bzm> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, new bnz(bmc.g, 0.2F)),
            Pair.of(2, new bqc(ImmutableList.of(Pair.of(new bos(bzn::d), 1), Pair.of(boc.a(a, bzn::c), 1)))),
            Pair.of(3, bqr.a(bzn::b)),
            Pair.of(3, bre.a(6, 0.15F)),
            Pair.of(
               4,
               new bot(
                  ImmutableMap.of(bvq.m, bvr.b),
                  ImmutableSet.of(),
                  bot.a.a,
                  bot.b.b,
                  ImmutableList.of(
                     Pair.of(bpx.c(0.5F), 2),
                     Pair.of(bpx.a(0.15F, false), 2),
                     Pair.of(bqm.a(bzn::a, bzn::d, 3), 3),
                     Pair.of(brs.a(blw::bc), 5),
                     Pair.of(brs.a(blw::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bmo $$0) {
      ctx $$1 = $$0.dL();
      Optional<bpt> $$2 = $$0.dN().c(bvq.n);
      if ($$2.isPresent()) {
         hx $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(bzm $$0) {
      bno<bzm> $$1 = $$0.dN();
      chc $$2 = $$1.g().orElse(null);
      if ($$2 != chc.p) {
         $$1.a(ImmutableList.of(chc.p, chc.k, chc.b));
         if ($$2 == chc.k && $$1.g().orElse(null) != chc.k) {
            $$1.a(bvq.U, true, 2400L);
         }
      }
   }

   private static float b(bmo $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bmo $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bmo $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bmo> b(bzm $$0) {
      return boh.a($$0) ? Optional.empty() : $$0.dN().c(bvq.B);
   }

   public static cqh a() {
      return cqh.a(asq.aA);
   }
}
