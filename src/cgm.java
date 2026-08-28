import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgm {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bpr e = bpr.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgl $$0, ayo $$1) {
      $$0.dU().a(ccf.S, e.a($$1));
   }

   protected static bud<?> a(bud<cgl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cgl> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bup(2.0F), new bwa(45, 90), new bwe(), new bva(ccf.P), new bva(ccf.S)));
   }

   private static void c(bud<cgl> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(0, new buo(bsm.R)),
            Pair.of(1, new bvh($$0x -> 1.25F)),
            Pair.of(2, bxg.a(cgm::b, $$0x -> $$0x.dU().c(ccf.B))),
            Pair.of(3, bxr.a(6, 1.0F)),
            Pair.of(
               4,
               new bwr(
                  ImmutableMap.of(ccf.m, ccg.b),
                  ImmutableList.of(Pair.of(bwm.a(1.0F), 1), Pair.of(bxb.a(1.0F, 3), 1), Pair.of(new bvb(), 3), Pair.of(byh.a(bsg::aF), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccf.T, ccg.b), Pair.of(ccf.X, ccg.b))
      );
   }

   private static void d(bud<cgl> $$0) {
      $$0.a(
         cnz.t,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(1, new bvh($$0x -> 1.25F)),
            Pair.of(2, bxg.a(cgm::b, $$0x -> $$0x.dU().c(ccf.B))),
            Pair.of(3, bxr.a(8, 1.5F)),
            Pair.of(
               5,
               new bvi(
                  ImmutableMap.of(ccf.m, ccg.b),
                  ImmutableSet.of(),
                  bvi.a.a,
                  bvi.b.b,
                  ImmutableList.of(Pair.of(bwm.c(0.75F), 1), Pair.of(bwm.a(1.0F, true), 1), Pair.of(bxb.a(1.0F, 3), 1), Pair.of(byh.a(bsg::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccf.T, ccg.b), Pair.of(ccf.X, ccg.a))
      );
   }

   private static void e(bud<cgl> $$0) {
      $$0.a(
         cnz.u,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(1, bxg.a(cgm::b, $$0x -> $$0x.dU().c(ccf.B))),
            Pair.of(2, bxs.a(8, 1.0F)),
            Pair.of(3, bxu.a(dfj.tn)),
            Pair.of(4, new bwr(ImmutableList.of(Pair.of(bwm.a(1.0F), 2), Pair.of(bxb.a(1.0F, 3), 1), Pair.of(new bvb(), 2), Pair.of(byh.a(bsg::aF), 1))))
         ),
         ImmutableSet.of(Pair.of(ccf.T, ccg.b), Pair.of(ccf.Y, ccg.a))
      );
   }

   private static void f(bud<cgl> $$0) {
      $$0.a(
         cnz.q,
         ImmutableList.of(Pair.of(0, new bvv(e, avh.jR)), Pair.of(1, new bvw<>(e, 2, 4, 3.5714288F, $$0x -> avh.jQ, avw.bR, 0.5F, cgm::a))),
         ImmutableSet.of(Pair.of(ccf.O, ccg.b), Pair.of(ccf.r, ccg.b), Pair.of(ccf.S, ccg.b), Pair.of(ccf.X, ccg.b))
      );
   }

   private static void g(bud<cgl> $$0) {
      $$0.a(cnz.s, 0, ImmutableList.of(bxj.a(), new cgn(avh.jS, avh.jN)), ccf.o);
   }

   private static <E extends btd> boolean a(E $$0, ja $$1) {
      dcf $$2 = $$0.dQ();
      ja $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsk $$4 = $$2.a_($$1);
         dsk $$5 = $$2.a_($$3);
         if (!$$4.a(avw.bR) && !$$5.a(avw.bR)) {
            epa $$6 = new epa($$0.dQ(), $$0);
            eoy $$7 = epd.a($$6, $$1.j());
            eoy $$8 = epd.a($$6, $$3.j());
            return $$7 != eoy.e && (!$$4.i() || $$8 != eoy.e) ? bvx.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgl $$0) {
      return !buw.a($$0);
   }

   public static void a(cgl $$0) {
      $$0.dU().a(ImmutableList.of(cnz.s, cnz.u, cnz.q, cnz.t, cnz.b));
   }

   public static Predicate<cuc> a() {
      return $$0 -> $$0.a(awf.al);
   }
}
