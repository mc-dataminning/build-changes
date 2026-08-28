import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chb {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqg e = bqg.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cha $$0, azh $$1) {
      $$0.dS().a(ccu.S, e.a($$1));
   }

   protected static bus<?> a(bus<cha> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cha> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bve(2.0F), new bwp(45, 90), new bwt(), new bvp(ccu.P), new bvp(ccu.S)));
   }

   private static void c(bus<cha> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(0, new bvd(btb.R)),
            Pair.of(1, new bvw($$0x -> 1.25F)),
            Pair.of(2, bxv.a(chb::b, $$0x -> $$0x.dS().c(ccu.B))),
            Pair.of(3, byg.a(6, 1.0F)),
            Pair.of(
               4,
               new bxg(
                  ImmutableMap.of(ccu.m, ccv.b),
                  ImmutableList.of(Pair.of(bxb.a(1.0F), 1), Pair.of(bxq.a(1.0F, 3), 1), Pair.of(new bvq(), 3), Pair.of(byw.a(bsv::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccu.T, ccv.b), Pair.of(ccu.X, ccv.b))
      );
   }

   private static void d(bus<cha> $$0) {
      $$0.a(
         coo.t,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, new bvw($$0x -> 1.25F)),
            Pair.of(2, bxv.a(chb::b, $$0x -> $$0x.dS().c(ccu.B))),
            Pair.of(3, byg.a(8, 1.5F)),
            Pair.of(
               5,
               new bvx(
                  ImmutableMap.of(ccu.m, ccv.b),
                  ImmutableSet.of(),
                  bvx.a.a,
                  bvx.b.b,
                  ImmutableList.of(Pair.of(bxb.c(0.75F), 1), Pair.of(bxb.a(1.0F, true), 1), Pair.of(bxq.a(1.0F, 3), 1), Pair.of(byw.a(bsv::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccu.T, ccv.b), Pair.of(ccu.X, ccv.a))
      );
   }

   private static void e(bus<cha> $$0) {
      $$0.a(
         coo.u,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, bxv.a(chb::b, $$0x -> $$0x.dS().c(ccu.B))),
            Pair.of(2, byh.a(8, 1.0F)),
            Pair.of(3, byj.a(dfc.tn)),
            Pair.of(4, new bxg(ImmutableList.of(Pair.of(bxb.a(1.0F), 2), Pair.of(bxq.a(1.0F, 3), 1), Pair.of(new bvq(), 2), Pair.of(byw.a(bsv::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(ccu.T, ccv.b), Pair.of(ccu.Y, ccv.a))
      );
   }

   private static void f(bus<cha> $$0) {
      $$0.a(
         coo.q,
         ImmutableList.of(Pair.of(0, new bwk(e, awa.jR)), Pair.of(1, new bwl<>(e, 2, 4, 3.5714288F, $$0x -> awa.jQ, awp.bR, 0.5F, chb::a))),
         ImmutableSet.of(Pair.of(ccu.O, ccv.b), Pair.of(ccu.r, ccv.b), Pair.of(ccu.S, ccv.b), Pair.of(ccu.X, ccv.b))
      );
   }

   private static void g(bus<cha> $$0) {
      $$0.a(coo.s, 0, ImmutableList.of(bxy.a(), new chc(awa.jS, awa.jN)), ccu.o);
   }

   private static <E extends bts> boolean a(E $$0, iz $$1) {
      dbz $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsd $$4 = $$2.a_($$1);
         dsd $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bR) && !$$5.a(awp.bR)) {
            eop $$6 = new eop($$0.dP(), $$0);
            eon $$7 = eos.a($$6, $$1.j());
            eon $$8 = eos.a($$6, $$3.j());
            return $$7 != eon.e && (!$$4.i() || $$8 != eon.e) ? bwm.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cha $$0) {
      return !bvl.a($$0);
   }

   public static void a(cha $$0) {
      $$0.dS().a(ImmutableList.of(coo.s, coo.u, coo.q, coo.t, coo.b));
   }

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awy.al);
   }
}
