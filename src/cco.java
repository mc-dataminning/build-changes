import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cco {
   private static final bmn a = bmn.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bqp<?> a(bqp<ccn> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<ccn> $$0) {
      $$0.a(ckh.p, ImmutableList.of(Pair.of(0, new ccp()), Pair.of(1, brs.a(bri::a, byr.N))), ImmutableSet.of(Pair.of(byr.N, bys.a)), ImmutableSet.of(byr.N));
   }

   private static void c(bqp<ccn> $$0) {
      $$0.a(ckh.k, 0, ImmutableList.of(btv.a(ccn::a), btl.a(cco::b), bsn.a(20), brs.a(bri::a, byr.o)), byr.o);
   }

   private static void d(bqp<ccn> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bsm(45, 90), new bsq(), ccq.a(), new brm(byr.P)));
   }

   private static void e(bqp<ccn> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, new bra(bpc.g, 0.2F, 2)),
            Pair.of(2, new btd(ImmutableList.of(Pair.of(new brt(cco::d), 1), Pair.of(brd.a(a, cco::c), 1)))),
            Pair.of(3, bts.a(cco::b)),
            Pair.of(3, buf.a(6, 0.15F)),
            Pair.of(
               4,
               new bru(
                  ImmutableMap.of(byr.m, bys.b),
                  ImmutableSet.of(),
                  bru.a.a,
                  bru.b.b,
                  ImmutableList.of(
                     Pair.of(bsy.c(0.5F), 2),
                     Pair.of(bsy.a(0.15F, false), 2),
                     Pair.of(btn.a(cco::a, cco::d, 3), 3),
                     Pair.of(but.a(bow::bf), 5),
                     Pair.of(but.a(bow::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bpo $$0) {
      cwz $$1 = $$0.dM();
      Optional<bsu> $$2 = $$0.dP().c(byr.n);
      if ($$2.isPresent()) {
         ib $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(ccn $$0) {
      bqp<ccn> $$1 = $$0.dP();
      ckh $$2 = $$1.g().orElse(null);
      if ($$2 != ckh.p) {
         $$1.a(ImmutableList.of(ckh.p, ckh.k, ckh.b));
         if ($$2 == ckh.k && $$1.g().orElse(null) != ckh.k) {
            $$1.a(byr.U, true, 2400L);
         }
      }
   }

   private static float b(bpo $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bpo $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bpo $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bpo> b(ccn $$0) {
      return bri.a($$0) ? Optional.empty() : $$0.dP().c(byr.B);
   }

   public static ctk a() {
      return ctk.a(auv.aA);
   }
}
