import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cie {
   private static final bro a = bro.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwc<?> a(bwc<cid> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cid> $$0) {
      $$0.a(cqe.p, ImmutableList.of(Pair.of(0, new cif()), Pair.of(1, bxf.a(bwv::a, cee.N))), ImmutableSet.of(Pair.of(cee.N, cef.a)), ImmutableSet.of(cee.N));
   }

   private static void c(bwc<cid> $$0) {
      $$0.a(cqe.k, 0, ImmutableList.of(bzi.a(cid::a), byy.a(cie::b), bya.a(20), bxf.a(bwv::a, cee.o)), cee.o);
   }

   private static void d(bwc<cid> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bxz(45, 90), new byd(), cig.a(), new bwz(cee.P)));
   }

   private static void e(bwc<cid> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, new bwn(bul.f, 0.2F, 2)),
            Pair.of(2, new byq(ImmutableList.of(Pair.of(new bxg(cie::d), 1), Pair.of(bwq.a(a, cie::c), 1)))),
            Pair.of(3, bzf.a(cie::b)),
            Pair.of(3, bzs.a(6, 0.15F)),
            Pair.of(
               4,
               new bxh(
                  ImmutableMap.of(cee.m, cef.b),
                  ImmutableSet.of(),
                  bxh.a.a,
                  bxh.b.b,
                  ImmutableList.of(
                     Pair.of(byl.c(0.5F), 2),
                     Pair.of(byl.a(0.15F, false), 2),
                     Pair.of(bza.a(cie::a, cie::d, 3), 3),
                     Pair.of(cag.a(bue::bn), 5),
                     Pair.of(cag.a(bue::aK), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bva $$0) {
      dfb $$1 = $$0.dX();
      Optional<byh> $$2 = $$0.ed().c(cee.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bn();
      } else {
         return false;
      }
   }

   public static void a(cid $$0) {
      bwc<cid> $$1 = $$0.ed();
      cqe $$2 = $$1.g().orElse(null);
      if ($$2 != cqe.p) {
         $$1.a(ImmutableList.of(cqe.p, cqe.k, cqe.b));
         if ($$2 == cqe.k && $$1.g().orElse(null) != cqe.k) {
            $$1.a(cee.U, true, 2400L);
         }
      }
   }

   private static float b(bva $$0) {
      return $$0.bn() ? 0.6F : 0.15F;
   }

   private static float c(bva $$0) {
      return $$0.bn() ? 0.6F : 0.15F;
   }

   private static float d(bva $$0) {
      return $$0.bn() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bva> b(cid $$0) {
      return bwv.a($$0) ? Optional.empty() : $$0.ed().c(cee.B);
   }

   public static Predicate<cwb> a() {
      return $$0 -> $$0.a(axj.aC);
   }
}
