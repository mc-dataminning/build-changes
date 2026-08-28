import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cko {
   private static final bto a = bto.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bye<?> a(bye<ckn> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<ckn> $$0) {
      $$0.a(csw.p, ImmutableList.of(Pair.of(0, new ckp()), Pair.of(1, bzh.a(byx::a, cgg.O))), ImmutableSet.of(Pair.of(cgg.O, cgh.a)), ImmutableSet.of(cgg.O));
   }

   private static void c(bye<ckn> $$0) {
      $$0.a(csw.k, 0, ImmutableList.of(cbk.a(ckn::a), cba.a(cko::b), cac.a(20), bzh.a(byx::a, cgg.p)), cgg.p);
   }

   private static void d(bye<ckn> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cab(45, 90), new caf(), ckq.a(), new bzb(cgg.Q)));
   }

   private static void e(bye<ckn> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, new byp(bwo.h, 0.2F, 2)),
            Pair.of(2, new cas(ImmutableList.of(Pair.of(new bzi(cko::d), 1), Pair.of(bys.a(a, cko::c), 1)))),
            Pair.of(3, cbh.a(cko::a)),
            Pair.of(3, cbu.a(6, 0.15F)),
            Pair.of(
               4,
               new bzj(
                  ImmutableMap.of(cgg.n, cgh.b),
                  ImmutableSet.of(),
                  bzj.a.a,
                  bzj.b.b,
                  ImmutableList.of(
                     Pair.of(can.c(0.5F), 2),
                     Pair.of(can.a(0.15F, false), 2),
                     Pair.of(cbc.a(cko::a, cko::d, 3), 3),
                     Pair.of(cci.a(bwf::bj), 5),
                     Pair.of(cci.a(bwf::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxe $$0) {
      dja $$1 = $$0.dV();
      Optional<caj> $$2 = $$0.ec().c(cgg.o);
      if ($$2.isPresent()) {
         iu $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(ckn $$0) {
      bye<ckn> $$1 = $$0.ec();
      csw $$2 = $$1.g().orElse(null);
      if ($$2 != csw.p) {
         $$1.a(ImmutableList.of(csw.p, csw.k, csw.b));
         if ($$2 == csw.k && $$1.g().orElse(null) != csw.k) {
            $$1.a(cgg.V, true, 2400L);
         }
      }
   }

   private static float b(bxe $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(bxe $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(bxe $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bxe> a(arq $$0, ckn $$1) {
      return byx.a($$1) ? Optional.empty() : $$1.ec().c(cgg.C);
   }

   public static Predicate<czd> a() {
      return $$0 -> $$0.a(axk.aD);
   }
}
