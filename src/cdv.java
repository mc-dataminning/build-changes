import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cdv {
   private static final bnq a = bnq.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bru<?> a(bru<cdu> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cdu> $$0) {
      $$0.a(clp.p, ImmutableList.of(Pair.of(0, new cdw()), Pair.of(1, bsx.a(bsn::a, bzw.N))), ImmutableSet.of(Pair.of(bzw.N, bzx.a)), ImmutableSet.of(bzw.N));
   }

   private static void c(bru<cdu> $$0) {
      $$0.a(clp.k, 0, ImmutableList.of(bva.a(cdu::a), buq.a(cdv::b), bts.a(20), bsx.a(bsn::a, bzw.o)), bzw.o);
   }

   private static void d(bru<cdu> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new btr(45, 90), new btv(), cdx.a(), new bsr(bzw.P)));
   }

   private static void e(bru<cdu> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, new bsf(bqg.f, 0.2F, 2)),
            Pair.of(2, new bui(ImmutableList.of(Pair.of(new bsy(cdv::d), 1), Pair.of(bsi.a(a, cdv::c), 1)))),
            Pair.of(3, bux.a(cdv::b)),
            Pair.of(3, bvk.a(6, 0.15F)),
            Pair.of(
               4,
               new bsz(
                  ImmutableMap.of(bzw.m, bzx.b),
                  ImmutableSet.of(),
                  bsz.a.a,
                  bsz.b.b,
                  ImmutableList.of(
                     Pair.of(bud.c(0.5F), 2),
                     Pair.of(bud.a(0.15F, false), 2),
                     Pair.of(bus.a(cdv::a, cdv::d, 3), 3),
                     Pair.of(bvy.a(bqa::bf), 5),
                     Pair.of(bvy.a(bqa::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bqt $$0) {
      czg $$1 = $$0.dM();
      Optional<btz> $$2 = $$0.dP().c(bzw.n);
      if ($$2.isPresent()) {
         id $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(cdu $$0) {
      bru<cdu> $$1 = $$0.dP();
      clp $$2 = $$1.g().orElse(null);
      if ($$2 != clp.p) {
         $$1.a(ImmutableList.of(clp.p, clp.k, clp.b));
         if ($$2 == clp.k && $$1.g().orElse(null) != clp.k) {
            $$1.a(bzw.U, true, 2400L);
         }
      }
   }

   private static float b(bqt $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bqt $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bqt $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bqt> b(cdu $$0) {
      return bsn.a($$0) ? Optional.empty() : $$0.dP().c(bzw.B);
   }

   public static cvp a() {
      return cvp.a(avm.aA);
   }
}
