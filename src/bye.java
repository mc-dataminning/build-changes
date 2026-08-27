import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bye {
   private static final bim a = bim.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bml<?> a(bml<byd> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<byd> $$0) {
      $$0.a(cfk.p, ImmutableList.of(Pair.of(0, new byf()), Pair.of(1, bno.a(bne::a, bum.M))), ImmutableSet.of(Pair.of(bum.M, bun.a)), ImmutableSet.of(bum.M));
   }

   private static void c(bml<byd> $$0) {
      $$0.a(cfk.k, 0, ImmutableList.of(bpq.a(byd::a), bpg.a(bye::b), boi.a(20), bno.a(bne::a, bum.o)), bum.o);
   }

   private static void d(bml<byd> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new boh(45, 90), new bol(), byg.a(), new bni(bum.O)));
   }

   private static void e(bml<byd> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(1, new bmw(bkz.f, 0.2F)),
            Pair.of(2, new boy(ImmutableList.of(Pair.of(new bnp(bye::d), 1), Pair.of(bmz.a(a, bye::c), 1)))),
            Pair.of(3, bpn.a(bye::b)),
            Pair.of(3, bqa.a(6, 0.15F)),
            Pair.of(
               4,
               new bnq(
                  ImmutableMap.of(bum.m, bun.b),
                  ImmutableSet.of(),
                  bnq.a.a,
                  bnq.b.b,
                  ImmutableList.of(
                     Pair.of(bot.c(0.5F), 2),
                     Pair.of(bot.a(0.15F, false), 2),
                     Pair.of(bpi.a(bye::a, bye::d, 3), 3),
                     Pair.of(bqo.a(bkv::bc), 5),
                     Pair.of(bqo.a(bkv::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bll $$0) {
      csf $$1 = $$0.dN();
      Optional<bop> $$2 = $$0.dP().c(bum.n);
      if ($$2.isPresent()) {
         hx $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(byd $$0) {
      bml<byd> $$1 = $$0.dP();
      cfk $$2 = $$1.g().orElse(null);
      if ($$2 != cfk.p) {
         $$1.a(ImmutableList.of(cfk.p, cfk.k, cfk.b));
         if ($$2 == cfk.k && $$1.g().orElse(null) != cfk.k) {
            $$1.a(bum.T, true, 2400L);
         }
      }
   }

   private static float b(bll $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bll $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bll $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bll> b(byd $$0) {
      return bne.a($$0) ? Optional.empty() : $$0.dP().c(bum.B);
   }

   public static coq a() {
      return coq.a(ars.aA);
   }
}
