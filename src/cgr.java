import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgr {
   private static final bqe a = bqe.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static buq<?> a(buq<cgq> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgq> $$0) {
      $$0.a(col.p, ImmutableList.of(Pair.of(0, new cgs()), Pair.of(1, bvt.a(bvj::a, ccs.N))), ImmutableSet.of(Pair.of(ccs.N, cct.a)), ImmutableSet.of(ccs.N));
   }

   private static void c(buq<cgq> $$0) {
      $$0.a(col.k, 0, ImmutableList.of(bxw.a(cgq::a), bxm.a(cgr::b), bwo.a(20), bvt.a(bvj::a, ccs.o)), ccs.o);
   }

   private static void d(buq<cgq> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new bwn(45, 90), new bwr(), cgt.a(), new bvn(ccs.P)));
   }

   private static void e(buq<cgq> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(1, new bvb(bsz.f, 0.2F, 2)),
            Pair.of(2, new bxe(ImmutableList.of(Pair.of(new bvu(cgr::d), 1), Pair.of(bve.a(a, cgr::c), 1)))),
            Pair.of(3, bxt.a(cgr::b)),
            Pair.of(3, byg.a(6, 0.15F)),
            Pair.of(
               4,
               new bvv(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableSet.of(),
                  bvv.a.a,
                  bvv.b.b,
                  ImmutableList.of(
                     Pair.of(bwz.c(0.5F), 2),
                     Pair.of(bwz.a(0.15F, false), 2),
                     Pair.of(bxo.a(cgr::a, cgr::d, 3), 3),
                     Pair.of(byu.a(bst::bh), 5),
                     Pair.of(byu.a(bst::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bto $$0) {
      dbx $$1 = $$0.dP();
      Optional<bwv> $$2 = $$0.dS().c(ccs.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgq $$0) {
      buq<cgq> $$1 = $$0.dS();
      col $$2 = $$1.g().orElse(null);
      if ($$2 != col.p) {
         $$1.a(ImmutableList.of(col.p, col.k, col.b));
         if ($$2 == col.k && $$1.g().orElse(null) != col.k) {
            $$1.a(ccs.U, true, 2400L);
         }
      }
   }

   private static float b(bto $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(bto $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(bto $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bto> b(cgq $$0) {
      return bvj.a($$0) ? Optional.empty() : $$0.dS().c(ccs.B);
   }

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awx.ay);
   }
}
