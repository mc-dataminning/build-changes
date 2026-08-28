import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjr {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bst e = bst.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cjq $$0, bam $$1) {
      $$0.eb().a(cfj.S, e.a($$1));
   }

   protected static bxh<?> a(bxh<cjq> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjq> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new bxt(2.0F), new bze(45, 90), new bzi(), new bye(cfj.P), new bye(cfj.S)));
   }

   private static void c(bxh<cjq> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(0, new bxs(bvq.ac)),
            Pair.of(1, new byl($$0x -> 1.25F)),
            Pair.of(2, cak.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cfj.B))),
            Pair.of(3, cav.a(6, 1.0F)),
            Pair.of(
               4,
               new bzv(
                  ImmutableMap.of(cfj.m, cfk.b),
                  ImmutableList.of(Pair.of(bzq.a(1.0F), 1), Pair.of(caf.a(1.0F, 3), 1), Pair.of(new byf(), 3), Pair.of(cbl.a(bvj::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfj.T, cfk.b), Pair.of(cfj.X, cfk.b))
      );
   }

   private static void d(bxh<cjq> $$0) {
      $$0.a(
         crn.t,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, new byl($$0x -> 1.25F)),
            Pair.of(2, cak.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cfj.B))),
            Pair.of(3, cav.a(8, 1.5F)),
            Pair.of(
               5,
               new bym(
                  ImmutableMap.of(cfj.m, cfk.b),
                  ImmutableSet.of(),
                  bym.a.a,
                  bym.b.b,
                  ImmutableList.of(Pair.of(bzq.c(0.75F), 1), Pair.of(bzq.a(1.0F, true), 1), Pair.of(caf.a(1.0F, 3), 1), Pair.of(cbl.a(bvj::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfj.T, cfk.b), Pair.of(cfj.X, cfk.a))
      );
   }

   private static void e(bxh<cjq> $$0) {
      $$0.a(
         crn.u,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, cak.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cfj.B))),
            Pair.of(2, caw.a(8, 1.0F)),
            Pair.of(3, cay.a(dkn.tI)),
            Pair.of(4, new bzv(ImmutableList.of(Pair.of(bzq.a(1.0F), 2), Pair.of(caf.a(1.0F, 3), 1), Pair.of(new byf(), 2), Pair.of(cbl.a(bvj::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cfj.T, cfk.b), Pair.of(cfj.Y, cfk.a))
      );
   }

   private static void f(bxh<cjq> $$0) {
      $$0.a(
         crn.q,
         ImmutableList.of(Pair.of(0, new byz(e, axf.kl)), Pair.of(1, new bza<>(e, 2, 4, 3.5714288F, $$0x -> axf.kk, axu.bT, 0.5F, cjr::a))),
         ImmutableSet.of(Pair.of(cfj.O, cfk.b), Pair.of(cfj.r, cfk.b), Pair.of(cfj.S, cfk.b), Pair.of(cfj.X, cfk.b))
      );
   }

   private static void g(bxh<cjq> $$0) {
      $$0.a(crn.s, 0, ImmutableList.of(can.a(), new cjs(axf.km, axf.kh)), cfj.o);
   }

   private static <E extends bwh> boolean a(E $$0, jh $$1) {
      dhh $$2 = $$0.dV();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dxu $$4 = $$2.a_($$1);
         dxu $$5 = $$2.a_($$3);
         if (!$$4.a(axu.bT) && !$$5.a(axu.bT)) {
            eup $$6 = new eup($$0.dV(), $$0);
            eun $$7 = eus.a($$6, $$1.k());
            eun $$8 = eus.a($$6, $$3.k());
            return $$7 != eun.e && (!$$4.l() || $$8 != eun.e) ? bzb.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cjq $$0) {
      return !bya.a($$0);
   }

   public static void a(cjq $$0) {
      $$0.eb().a(ImmutableList.of(crn.s, crn.u, crn.q, crn.t, crn.b));
   }

   public static Predicate<cxo> a() {
      return $$0 -> $$0.a(ayd.aq);
   }
}
