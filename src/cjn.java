import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bsp e = bsp.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cjm $$0, bam $$1) {
      $$0.eb().a(cff.S, e.a($$1));
   }

   protected static bxd<?> a(bxd<cjm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cjm> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bxp(2.0F), new bza(45, 90), new bze(), new bya(cff.P), new bya(cff.S)));
   }

   private static void c(bxd<cjm> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(0, new bxo(bvm.ac)),
            Pair.of(1, new byh($$0x -> 1.25F)),
            Pair.of(2, cag.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cff.B))),
            Pair.of(3, car.a(6, 1.0F)),
            Pair.of(
               4,
               new bzr(
                  ImmutableMap.of(cff.m, cfg.b),
                  ImmutableList.of(Pair.of(bzm.a(1.0F), 1), Pair.of(cab.a(1.0F, 3), 1), Pair.of(new byb(), 3), Pair.of(cbh.a(bvf::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cff.T, cfg.b), Pair.of(cff.X, cfg.b))
      );
   }

   private static void d(bxd<cjm> $$0) {
      $$0.a(
         crj.t,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, new byh($$0x -> 1.25F)),
            Pair.of(2, cag.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cff.B))),
            Pair.of(3, car.a(8, 1.5F)),
            Pair.of(
               5,
               new byi(
                  ImmutableMap.of(cff.m, cfg.b),
                  ImmutableSet.of(),
                  byi.a.a,
                  byi.b.b,
                  ImmutableList.of(Pair.of(bzm.c(0.75F), 1), Pair.of(bzm.a(1.0F, true), 1), Pair.of(cab.a(1.0F, 3), 1), Pair.of(cbh.a(bvf::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cff.T, cfg.b), Pair.of(cff.X, cfg.a))
      );
   }

   private static void e(bxd<cjm> $$0) {
      $$0.a(
         crj.u,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, cag.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cff.B))),
            Pair.of(2, cas.a(8, 1.0F)),
            Pair.of(3, cau.a(dkg.tI)),
            Pair.of(4, new bzr(ImmutableList.of(Pair.of(bzm.a(1.0F), 2), Pair.of(cab.a(1.0F, 3), 1), Pair.of(new byb(), 2), Pair.of(cbh.a(bvf::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cff.T, cfg.b), Pair.of(cff.Y, cfg.a))
      );
   }

   private static void f(bxd<cjm> $$0) {
      $$0.a(
         crj.q,
         ImmutableList.of(Pair.of(0, new byv(e, axf.kk)), Pair.of(1, new byw<>(e, 2, 4, 3.5714288F, $$0x -> axf.kj, axu.bT, 0.5F, cjn::a))),
         ImmutableSet.of(Pair.of(cff.O, cfg.b), Pair.of(cff.r, cfg.b), Pair.of(cff.S, cfg.b), Pair.of(cff.X, cfg.b))
      );
   }

   private static void g(bxd<cjm> $$0) {
      $$0.a(crj.s, 0, ImmutableList.of(caj.a(), new cjo(axf.kl, axf.kg)), cff.o);
   }

   private static <E extends bwd> boolean a(E $$0, jh $$1) {
      dha $$2 = $$0.dV();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dxn $$4 = $$2.a_($$1);
         dxn $$5 = $$2.a_($$3);
         if (!$$4.a(axu.bT) && !$$5.a(axu.bT)) {
            eui $$6 = new eui($$0.dV(), $$0);
            eug $$7 = eul.a($$6, $$1.k());
            eug $$8 = eul.a($$6, $$3.k());
            return $$7 != eug.e && (!$$4.l() || $$8 != eug.e) ? byx.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cjm $$0) {
      return !bxw.a($$0);
   }

   public static void a(cjm $$0) {
      $$0.eb().a(ImmutableList.of(crj.s, crj.u, crj.q, crj.t, crj.b));
   }

   public static Predicate<cxk> a() {
      return $$0 -> $$0.a(ayd.aq);
   }
}
