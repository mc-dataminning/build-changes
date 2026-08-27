import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ccp {
   private static final bmo a = bmo.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bqq<?> a(bqq<cco> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<cco> $$0) {
      $$0.a(ckj.p, ImmutableList.of(Pair.of(0, new ccq()), Pair.of(1, brt.a(brj::a, bys.N))), ImmutableSet.of(Pair.of(bys.N, byt.a)), ImmutableSet.of(bys.N));
   }

   private static void c(bqq<cco> $$0) {
      $$0.a(ckj.k, 0, ImmutableList.of(btw.a(cco::a), btm.a(ccp::b), bso.a(20), brt.a(brj::a, bys.o)), bys.o);
   }

   private static void d(bqq<cco> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bsn(45, 90), new bsr(), ccr.a(), new brn(bys.P)));
   }

   private static void e(bqq<cco> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, new brb(bpd.g, 0.2F, 2)),
            Pair.of(2, new bte(ImmutableList.of(Pair.of(new bru(ccp::d), 1), Pair.of(bre.a(a, ccp::c), 1)))),
            Pair.of(3, btt.a(ccp::b)),
            Pair.of(3, bug.a(6, 0.15F)),
            Pair.of(
               4,
               new brv(
                  ImmutableMap.of(bys.m, byt.b),
                  ImmutableSet.of(),
                  brv.a.a,
                  brv.b.b,
                  ImmutableList.of(
                     Pair.of(bsz.c(0.5F), 2),
                     Pair.of(bsz.a(0.15F, false), 2),
                     Pair.of(bto.a(ccp::a, ccp::d, 3), 3),
                     Pair.of(buu.a(box::bf), 5),
                     Pair.of(buu.a(box::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bpp $$0) {
      cxb $$1 = $$0.dM();
      Optional<bsv> $$2 = $$0.dP().c(bys.n);
      if ($$2.isPresent()) {
         ib $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bf();
      } else {
         return false;
      }
   }

   public static void a(cco $$0) {
      bqq<cco> $$1 = $$0.dP();
      ckj $$2 = $$1.g().orElse(null);
      if ($$2 != ckj.p) {
         $$1.a(ImmutableList.of(ckj.p, ckj.k, ckj.b));
         if ($$2 == ckj.k && $$1.g().orElse(null) != ckj.k) {
            $$1.a(bys.U, true, 2400L);
         }
      }
   }

   private static float b(bpp $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float c(bpp $$0) {
      return $$0.bf() ? 0.6F : 0.15F;
   }

   private static float d(bpp $$0) {
      return $$0.bf() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bpp> b(cco $$0) {
      return brj.a($$0) ? Optional.empty() : $$0.dP().c(bys.B);
   }

   public static ctm a() {
      return ctm.a(auv.aA);
   }
}
