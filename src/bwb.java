import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bwb {
   private static final bgl a = bgl.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bki<?> a(bki<bwa> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bwa> $$0) {
      $$0.a(cdh.p, ImmutableList.of(Pair.of(0, new bwc()), Pair.of(1, bll.a(blb::a, bsj.M))), ImmutableSet.of(Pair.of(bsj.M, bsk.a)), ImmutableSet.of(bsj.M));
   }

   private static void c(bki<bwa> $$0) {
      $$0.a(cdh.k, 0, ImmutableList.of(bnn.a(bwa::a), bnd.a(bwb::b), bmf.a(20), bll.a(blb::a, bsj.o)), bsj.o);
   }

   private static void d(bki<bwa> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bme(45, 90), new bmi(), bwd.a(), new blf(bsj.O)));
   }

   private static void e(bki<bwa> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(1, new bkt(biw.f, 0.2F)),
            Pair.of(2, new bmv(ImmutableList.of(Pair.of(new blm(bwb::d), 1), Pair.of(bkw.a(a, bwb::c), 1)))),
            Pair.of(3, bnk.a(bwb::b)),
            Pair.of(3, bnx.a(6, 0.15F)),
            Pair.of(
               4,
               new bln(
                  ImmutableMap.of(bsj.m, bsk.b),
                  ImmutableSet.of(),
                  bln.a.a,
                  bln.b.b,
                  ImmutableList.of(
                     Pair.of(bmq.c(0.5F), 2),
                     Pair.of(bmq.a(0.15F, false), 2),
                     Pair.of(bnf.a(bwb::a, bwb::d, 3), 3),
                     Pair.of(bol.a(bis::ba), 5),
                     Pair.of(bol.a(bis::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bji $$0) {
      cpx $$1 = $$0.dL();
      Optional<bmm> $$2 = $$0.dN().c(bsj.n);
      if ($$2.isPresent()) {
         gw $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bwa $$0) {
      bki<bwa> $$1 = $$0.dN();
      cdh $$2 = $$1.g().orElse(null);
      if ($$2 != cdh.p) {
         $$1.a(ImmutableList.of(cdh.p, cdh.k, cdh.b));
         if ($$2 == cdh.k && $$1.g().orElse(null) != cdh.k) {
            $$1.a(bsj.T, true, 2400L);
         }
      }
   }

   private static float b(bji $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bji $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bji $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bji> b(bwa $$0) {
      return blb.a($$0) ? Optional.empty() : $$0.dN().c(bsj.B);
   }

   public static cmi a() {
      return cmi.a(aqc.aA);
   }
}
