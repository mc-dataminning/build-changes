import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bxc {
   private static final bhm a = bhm.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static blj<?> a(blj<bxb> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bxb> $$0) {
      $$0.a(cei.p, ImmutableList.of(Pair.of(0, new bxd()), Pair.of(1, bmm.a(bmc::a, btk.M))), ImmutableSet.of(Pair.of(btk.M, btl.a)), ImmutableSet.of(btk.M));
   }

   private static void c(blj<bxb> $$0) {
      $$0.a(cei.k, 0, ImmutableList.of(boo.a(bxb::a), boe.a(bxc::b), bng.a(20), bmm.a(bmc::a, btk.o)), btk.o);
   }

   private static void d(blj<bxb> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bnf(45, 90), new bnj(), bxe.a(), new bmg(btk.O)));
   }

   private static void e(blj<bxb> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(1, new blu(bjx.f, 0.2F)),
            Pair.of(2, new bnw(ImmutableList.of(Pair.of(new bmn(bxc::d), 1), Pair.of(blx.a(a, bxc::c), 1)))),
            Pair.of(3, bol.a(bxc::b)),
            Pair.of(3, boy.a(6, 0.15F)),
            Pair.of(
               4,
               new bmo(
                  ImmutableMap.of(btk.m, btl.b),
                  ImmutableSet.of(),
                  bmo.a.a,
                  bmo.b.b,
                  ImmutableList.of(
                     Pair.of(bnr.c(0.5F), 2),
                     Pair.of(bnr.a(0.15F, false), 2),
                     Pair.of(bog.a(bxc::a, bxc::d, 3), 3),
                     Pair.of(bpm.a(bjt::ba), 5),
                     Pair.of(bpm.a(bjt::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bkj $$0) {
      cqz $$1 = $$0.dL();
      Optional<bnn> $$2 = $$0.dN().c(btk.n);
      if ($$2.isPresent()) {
         ht $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bxb $$0) {
      blj<bxb> $$1 = $$0.dN();
      cei $$2 = $$1.g().orElse(null);
      if ($$2 != cei.p) {
         $$1.a(ImmutableList.of(cei.p, cei.k, cei.b));
         if ($$2 == cei.k && $$1.g().orElse(null) != cei.k) {
            $$1.a(btk.T, true, 2400L);
         }
      }
   }

   private static float b(bkj $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bkj $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bkj $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bkj> b(bxb $$0) {
      return bmc.a($$0) ? Optional.empty() : $$0.dN().c(btk.B);
   }

   public static cnk a() {
      return cnk.a(ara.aA);
   }
}
