import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cfc {
   private static final box a = box.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static btb<?> a(btb<cfb> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cfb> $$0) {
      $$0.a(cmw.p, ImmutableList.of(Pair.of(0, new cfd()), Pair.of(1, bue.a(btu::a, cbd.N))), ImmutableSet.of(Pair.of(cbd.N, cbe.a)), ImmutableSet.of(cbd.N));
   }

   private static void c(btb<cfb> $$0) {
      $$0.a(cmw.k, 0, ImmutableList.of(bwh.a(cfb::a), bvx.a(cfc::b), buz.a(20), bue.a(btu::a, cbd.o)), cbd.o);
   }

   private static void d(btb<cfb> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new buy(45, 90), new bvc(), cfe.a(), new bty(cbd.P)));
   }

   private static void e(btb<cfb> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(1, new btm(brn.f, 0.2F, 2)),
            Pair.of(2, new bvp(ImmutableList.of(Pair.of(new buf(cfc::d), 1), Pair.of(btp.a(a, cfc::c), 1)))),
            Pair.of(3, bwe.a(cfc::b)),
            Pair.of(3, bwr.a(6, 0.15F)),
            Pair.of(
               4,
               new bug(
                  ImmutableMap.of(cbd.m, cbe.b),
                  ImmutableSet.of(),
                  bug.a.a,
                  bug.b.b,
                  ImmutableList.of(
                     Pair.of(bvk.c(0.5F), 2),
                     Pair.of(bvk.a(0.15F, false), 2),
                     Pair.of(bvz.a(cfc::a, cfc::d, 3), 3),
                     Pair.of(bxf.a(brh::bf), 5),
                     Pair.of(bxf.a(brh::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bsa $$0) {
      dad $$1 = $$0.dN();
      Optional<bvg> $$2 = $$0.dQ().c(cbd.n);
      if ($$2.isPresent()) {
         in $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(cfb $$0) {
      btb<cfb> $$1 = $$0.dQ();
      cmw $$2 = $$1.g().orElse(null);
      if ($$2 != cmw.p) {
         $$1.a(ImmutableList.of(cmw.p, cmw.k, cmw.b));
         if ($$2 == cmw.k && $$1.g().orElse(null) != cmw.k) {
            $$1.a(cbd.U, true, 2400L);
         }
      }
   }

   private static float b(bsa $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bsa $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bsa $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bsa> b(cfb $$0) {
      return btu.a($$0) ? Optional.empty() : $$0.dQ().c(cbd.B);
   }

   public static Predicate<csz> a() {
      return $$0 -> $$0.a(avz.ay);
   }
}
