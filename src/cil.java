import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cil {
   private static final brv a = brv.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwj<?> a(bwj<cik> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cik> $$0) {
      $$0.a(cql.p, ImmutableList.of(Pair.of(0, new cim()), Pair.of(1, bxm.a(bxc::a, cel.N))), ImmutableSet.of(Pair.of(cel.N, cem.a)), ImmutableSet.of(cel.N));
   }

   private static void c(bwj<cik> $$0) {
      $$0.a(cql.k, 0, ImmutableList.of(bzp.a(cik::a), bzf.a(cil::b), byh.a(20), bxm.a(bxc::a, cel.o)), cel.o);
   }

   private static void d(bwj<cik> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new byg(45, 90), new byk(), cin.a(), new bxg(cel.P)));
   }

   private static void e(bwj<cik> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(1, new bwu(bus.h, 0.2F, 2)),
            Pair.of(2, new byx(ImmutableList.of(Pair.of(new bxn(cil::d), 1), Pair.of(bwx.a(a, cil::c), 1)))),
            Pair.of(3, bzm.a(cil::a)),
            Pair.of(3, bzz.a(6, 0.15F)),
            Pair.of(
               4,
               new bxo(
                  ImmutableMap.of(cel.m, cem.b),
                  ImmutableSet.of(),
                  bxo.a.a,
                  bxo.b.b,
                  ImmutableList.of(
                     Pair.of(bys.c(0.5F), 2),
                     Pair.of(bys.a(0.15F, false), 2),
                     Pair.of(bzh.a(cil::a, cil::d, 3), 3),
                     Pair.of(can.a(bul::bm), 5),
                     Pair.of(can.a(bul::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvh $$0) {
      dfm $$1 = $$0.dV();
      Optional<byo> $$2 = $$0.eb().c(cel.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cik $$0) {
      bwj<cik> $$1 = $$0.eb();
      cql $$2 = $$1.g().orElse(null);
      if ($$2 != cql.p) {
         $$1.a(ImmutableList.of(cql.p, cql.k, cql.b));
         if ($$2 == cql.k && $$1.g().orElse(null) != cql.k) {
            $$1.a(cel.U, true, 2400L);
         }
      }
   }

   private static float b(bvh $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bvh $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bvh $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvh> a(arp $$0, cik $$1) {
      return bxc.a($$1) ? Optional.empty() : $$1.eb().c(cel.B);
   }

   public static Predicate<cwm> a() {
      return $$0 -> $$0.a(axl.aD);
   }
}
