import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgb {
   private static final bpo a = bpo.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bua<?> a(bua<cga> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cga> $$0) {
      $$0.a(cnw.p, ImmutableList.of(Pair.of(0, new cgc()), Pair.of(1, bvd.a(but::a, ccc.N))), ImmutableSet.of(Pair.of(ccc.N, ccd.a)), ImmutableSet.of(ccc.N));
   }

   private static void c(bua<cga> $$0) {
      $$0.a(cnw.k, 0, ImmutableList.of(bxg.a(cga::a), bww.a(cgb::b), bvy.a(20), bvd.a(but::a, ccc.o)), ccc.o);
   }

   private static void d(bua<cga> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bvx(45, 90), new bwb(), cgd.a(), new bux(ccc.P)));
   }

   private static void e(bua<cga> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, new bul(bsj.f, 0.2F, 2)),
            Pair.of(2, new bwo(ImmutableList.of(Pair.of(new bve(cgb::d), 1), Pair.of(buo.a(a, cgb::c), 1)))),
            Pair.of(3, bxd.a(cgb::b)),
            Pair.of(3, bxq.a(6, 0.15F)),
            Pair.of(
               4,
               new bvf(
                  ImmutableMap.of(ccc.m, ccd.b),
                  ImmutableSet.of(),
                  bvf.a.a,
                  bvf.b.b,
                  ImmutableList.of(
                     Pair.of(bwj.c(0.5F), 2),
                     Pair.of(bwj.a(0.15F, false), 2),
                     Pair.of(bwy.a(cgb::a, cgb::d, 3), 3),
                     Pair.of(bye.a(bsd::bh), 5),
                     Pair.of(bye.a(bsd::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bsy $$0) {
      dcd $$1 = $$0.dP();
      Optional<bwf> $$2 = $$0.dT().c(ccc.n);
      if ($$2.isPresent()) {
         ja $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cga $$0) {
      bua<cga> $$1 = $$0.dT();
      cnw $$2 = $$1.g().orElse(null);
      if ($$2 != cnw.p) {
         $$1.a(ImmutableList.of(cnw.p, cnw.k, cnw.b));
         if ($$2 == cnw.k && $$1.g().orElse(null) != cnw.k) {
            $$1.a(ccc.U, true, 2400L);
         }
      }
   }

   private static float b(bsy $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(bsy $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(bsy $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bsy> b(cga $$0) {
      return but.a($$0) ? Optional.empty() : $$0.dT().c(ccc.B);
   }

   public static Predicate<cua> a() {
      return $$0 -> $$0.a(awd.ay);
   }
}
