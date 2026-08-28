import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class clc {
   private static final bue a = bue.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static byw<?> a(byw<clb> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<clb> $$0) {
      $$0.a(ctt.p, ImmutableList.of(Pair.of(0, new cld()), Pair.of(1, bzz.a(bzp::a, cgy.O))), ImmutableSet.of(Pair.of(cgy.O, cgz.a)), ImmutableSet.of(cgy.O));
   }

   private static void c(byw<clb> $$0) {
      $$0.a(ctt.k, 0, ImmutableList.of(ccc.a(clb::a), cbs.a(clc::b), cau.a(20), bzz.a(bzp::a, cgy.p)), cgy.p);
   }

   private static void d(byw<clb> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cat(45, 90), new cax(), cle.a(), new bzt(cgy.Q)));
   }

   private static void e(byw<clb> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, new bzh(bxe.i, 0.2F, 2)),
            Pair.of(2, new cbk(ImmutableList.of(Pair.of(new caa(clc::d), 1), Pair.of(bzk.a(a, clc::c), 1)))),
            Pair.of(3, cbz.a(clc::a)),
            Pair.of(3, ccm.a(6, 0.15F)),
            Pair.of(
               4,
               new cab(
                  ImmutableMap.of(cgy.n, cgz.b),
                  ImmutableSet.of(),
                  cab.a.a,
                  cab.b.b,
                  ImmutableList.of(
                     Pair.of(cbf.c(0.5F), 2),
                     Pair.of(cbf.a(0.15F, false), 2),
                     Pair.of(cbu.a(clc::a, clc::d, 3), 3),
                     Pair.of(cda.a(bwv::bi), 5),
                     Pair.of(cda.a(bwv::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxw $$0) {
      djz $$1 = $$0.dV();
      Optional<cbb> $$2 = $$0.ec().c(cgy.o);
      if ($$2.isPresent()) {
         iw $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bi();
      } else {
         return false;
      }
   }

   public static void a(clb $$0) {
      byw<clb> $$1 = $$0.ec();
      ctt $$2 = $$1.g().orElse(null);
      if ($$2 != ctt.p) {
         $$1.a(ImmutableList.of(ctt.p, ctt.k, ctt.b));
         if ($$2 == ctt.k && $$1.g().orElse(null) != ctt.k) {
            $$1.a(cgy.V, true, 2400L);
         }
      }
   }

   private static float b(bxw $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float c(bxw $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float d(bxw $$0) {
      return $$0.bi() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bxw> a(aru $$0, clb $$1) {
      return bzp.a($$1) ? Optional.empty() : $$1.ec().c(cgy.C);
   }

   public static Predicate<daa> a() {
      return $$0 -> $$0.a(axo.aE);
   }
}
