import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjs {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bsu e = bsu.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cjr $$0, bam $$1) {
      $$0.ec().a(cfk.S, e.a($$1));
   }

   protected static bxi<?> a(bxi<cjr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjr> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new bxu(2.0F), new bzf(45, 90), new bzj(), new byf(cfk.P), new byf(cfk.S)));
   }

   private static void c(bxi<cjr> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(0, new bxt(bvr.ac)),
            Pair.of(1, new bym($$0x -> 1.25F)),
            Pair.of(2, cal.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfk.B))),
            Pair.of(3, caw.a(6, 1.0F)),
            Pair.of(
               4,
               new bzw(
                  ImmutableMap.of(cfk.m, cfl.b),
                  ImmutableList.of(Pair.of(bzr.a(1.0F), 1), Pair.of(cag.a(1.0F, 3), 1), Pair.of(new byg(), 3), Pair.of(cbm.a(bvk::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfk.T, cfl.b), Pair.of(cfk.X, cfl.b))
      );
   }

   private static void d(bxi<cjr> $$0) {
      $$0.a(
         cro.t,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, new bym($$0x -> 1.25F)),
            Pair.of(2, cal.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfk.B))),
            Pair.of(3, caw.a(8, 1.5F)),
            Pair.of(
               5,
               new byn(
                  ImmutableMap.of(cfk.m, cfl.b),
                  ImmutableSet.of(),
                  byn.a.a,
                  byn.b.b,
                  ImmutableList.of(Pair.of(bzr.c(0.75F), 1), Pair.of(bzr.a(1.0F, true), 1), Pair.of(cag.a(1.0F, 3), 1), Pair.of(cbm.a(bvk::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfk.T, cfl.b), Pair.of(cfk.X, cfl.a))
      );
   }

   private static void e(bxi<cjr> $$0) {
      $$0.a(
         cro.u,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, cal.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfk.B))),
            Pair.of(2, cax.a(8, 1.0F)),
            Pair.of(3, caz.a(dko.tI)),
            Pair.of(4, new bzw(ImmutableList.of(Pair.of(bzr.a(1.0F), 2), Pair.of(cag.a(1.0F, 3), 1), Pair.of(new byg(), 2), Pair.of(cbm.a(bvk::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cfk.T, cfl.b), Pair.of(cfk.Y, cfl.a))
      );
   }

   private static void f(bxi<cjr> $$0) {
      $$0.a(
         cro.q,
         ImmutableList.of(Pair.of(0, new bza(e, axf.kl)), Pair.of(1, new bzb<>(e, 2, 4, 3.5714288F, $$0x -> axf.kk, axu.bT, 0.5F, cjs::a))),
         ImmutableSet.of(Pair.of(cfk.O, cfl.b), Pair.of(cfk.r, cfl.b), Pair.of(cfk.S, cfl.b), Pair.of(cfk.X, cfl.b))
      );
   }

   private static void g(bxi<cjr> $$0) {
      $$0.a(cro.s, 0, ImmutableList.of(cao.a(), new cjt(axf.km, axf.kh)), cfk.o);
   }

   private static <E extends bwi> boolean a(E $$0, jh $$1) {
      dhi $$2 = $$0.dW();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dxv $$4 = $$2.a_($$1);
         dxv $$5 = $$2.a_($$3);
         if (!$$4.a(axu.bT) && !$$5.a(axu.bT)) {
            euq $$6 = new euq($$0.dW(), $$0);
            euo $$7 = eut.a($$6, $$1.k());
            euo $$8 = eut.a($$6, $$3.k());
            return $$7 != euo.e && (!$$4.l() || $$8 != euo.e) ? bzc.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cjr $$0) {
      return !byb.a($$0);
   }

   public static void a(cjr $$0) {
      $$0.ec().a(ImmutableList.of(cro.s, cro.u, cro.q, cro.t, cro.b));
   }

   public static Predicate<cxp> a() {
      return $$0 -> $$0.a(ayd.aq);
   }
}
