import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chc {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqh e = bqh.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(chb $$0, azh $$1) {
      $$0.dS().a(ccv.S, e.a($$1));
   }

   protected static but<?> a(but<chb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<chb> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bvf(2.0F), new bwq(45, 90), new bwu(), new bvq(ccv.P), new bvq(ccv.S)));
   }

   private static void c(but<chb> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(0, new bve(btc.R)),
            Pair.of(1, new bvx($$0x -> 1.25F)),
            Pair.of(2, bxw.a(chc::b, $$0x -> $$0x.dS().c(ccv.B))),
            Pair.of(3, byh.a(6, 1.0F)),
            Pair.of(
               4,
               new bxh(
                  ImmutableMap.of(ccv.m, ccw.b),
                  ImmutableList.of(Pair.of(bxc.a(1.0F), 1), Pair.of(bxr.a(1.0F, 3), 1), Pair.of(new bvr(), 3), Pair.of(byx.a(bsw::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccv.T, ccw.b), Pair.of(ccv.X, ccw.b))
      );
   }

   private static void d(but<chb> $$0) {
      $$0.a(
         cop.t,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(1, new bvx($$0x -> 1.25F)),
            Pair.of(2, bxw.a(chc::b, $$0x -> $$0x.dS().c(ccv.B))),
            Pair.of(3, byh.a(8, 1.5F)),
            Pair.of(
               5,
               new bvy(
                  ImmutableMap.of(ccv.m, ccw.b),
                  ImmutableSet.of(),
                  bvy.a.a,
                  bvy.b.b,
                  ImmutableList.of(Pair.of(bxc.c(0.75F), 1), Pair.of(bxc.a(1.0F, true), 1), Pair.of(bxr.a(1.0F, 3), 1), Pair.of(byx.a(bsw::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccv.T, ccw.b), Pair.of(ccv.X, ccw.a))
      );
   }

   private static void e(but<chb> $$0) {
      $$0.a(
         cop.u,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(1, bxw.a(chc::b, $$0x -> $$0x.dS().c(ccv.B))),
            Pair.of(2, byi.a(8, 1.0F)),
            Pair.of(3, byk.a(dfd.tn)),
            Pair.of(4, new bxh(ImmutableList.of(Pair.of(bxc.a(1.0F), 2), Pair.of(bxr.a(1.0F, 3), 1), Pair.of(new bvr(), 2), Pair.of(byx.a(bsw::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(ccv.T, ccw.b), Pair.of(ccv.Y, ccw.a))
      );
   }

   private static void f(but<chb> $$0) {
      $$0.a(
         cop.q,
         ImmutableList.of(Pair.of(0, new bwl(e, awa.jR)), Pair.of(1, new bwm<>(e, 2, 4, 3.5714288F, $$0x -> awa.jQ, awp.bR, 0.5F, chc::a))),
         ImmutableSet.of(Pair.of(ccv.O, ccw.b), Pair.of(ccv.r, ccw.b), Pair.of(ccv.S, ccw.b), Pair.of(ccv.X, ccw.b))
      );
   }

   private static void g(but<chb> $$0) {
      $$0.a(cop.s, 0, ImmutableList.of(bxz.a(), new chd(awa.jS, awa.jN)), ccv.o);
   }

   private static <E extends btt> boolean a(E $$0, iz $$1) {
      dca $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dse $$4 = $$2.a_($$1);
         dse $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bR) && !$$5.a(awp.bR)) {
            eoq $$6 = new eoq($$0.dP(), $$0);
            eoo $$7 = eot.a($$6, $$1.j());
            eoo $$8 = eot.a($$6, $$3.j());
            return $$7 != eoo.e && (!$$4.i() || $$8 != eoo.e) ? bwn.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(chb $$0) {
      return !bvm.a($$0);
   }

   public static void a(chb $$0) {
      $$0.dS().a(ImmutableList.of(cop.s, cop.u, cop.q, cop.t, cop.b));
   }

   public static Predicate<cur> a() {
      return $$0 -> $$0.a(awy.al);
   }
}
