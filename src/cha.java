import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cha {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqf e = bqf.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgz $$0, azh $$1) {
      $$0.dS().a(cct.S, e.a($$1));
   }

   protected static bur<?> a(bur<cgz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<cgz> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bvd(2.0F), new bwo(45, 90), new bws(), new bvo(cct.P), new bvo(cct.S)));
   }

   private static void c(bur<cgz> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(0, new bvc(bta.R)),
            Pair.of(1, new bvv($$0x -> 1.25F)),
            Pair.of(2, bxu.a(cha::b, $$0x -> $$0x.dS().c(cct.B))),
            Pair.of(3, byf.a(6, 1.0F)),
            Pair.of(
               4,
               new bxf(
                  ImmutableMap.of(cct.m, ccu.b),
                  ImmutableList.of(Pair.of(bxa.a(1.0F), 1), Pair.of(bxp.a(1.0F, 3), 1), Pair.of(new bvp(), 3), Pair.of(byv.a(bsu::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cct.T, ccu.b), Pair.of(cct.X, ccu.b))
      );
   }

   private static void d(bur<cgz> $$0) {
      $$0.a(
         com.t,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, new bvv($$0x -> 1.25F)),
            Pair.of(2, bxu.a(cha::b, $$0x -> $$0x.dS().c(cct.B))),
            Pair.of(3, byf.a(8, 1.5F)),
            Pair.of(
               5,
               new bvw(
                  ImmutableMap.of(cct.m, ccu.b),
                  ImmutableSet.of(),
                  bvw.a.a,
                  bvw.b.b,
                  ImmutableList.of(Pair.of(bxa.c(0.75F), 1), Pair.of(bxa.a(1.0F, true), 1), Pair.of(bxp.a(1.0F, 3), 1), Pair.of(byv.a(bsu::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cct.T, ccu.b), Pair.of(cct.X, ccu.a))
      );
   }

   private static void e(bur<cgz> $$0) {
      $$0.a(
         com.u,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, bxu.a(cha::b, $$0x -> $$0x.dS().c(cct.B))),
            Pair.of(2, byg.a(8, 1.0F)),
            Pair.of(3, byi.a(dfb.tn)),
            Pair.of(4, new bxf(ImmutableList.of(Pair.of(bxa.a(1.0F), 2), Pair.of(bxp.a(1.0F, 3), 1), Pair.of(new bvp(), 2), Pair.of(byv.a(bsu::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(cct.T, ccu.b), Pair.of(cct.Y, ccu.a))
      );
   }

   private static void f(bur<cgz> $$0) {
      $$0.a(
         com.q,
         ImmutableList.of(Pair.of(0, new bwj(e, awa.jR)), Pair.of(1, new bwk<>(e, 2, 4, 3.5714288F, $$0x -> awa.jQ, awp.bR, 0.5F, cha::a))),
         ImmutableSet.of(Pair.of(cct.O, ccu.b), Pair.of(cct.r, ccu.b), Pair.of(cct.S, ccu.b), Pair.of(cct.X, ccu.b))
      );
   }

   private static void g(bur<cgz> $$0) {
      $$0.a(com.s, 0, ImmutableList.of(bxx.a(), new chb(awa.jS, awa.jN)), cct.o);
   }

   private static <E extends btr> boolean a(E $$0, iz $$1) {
      dby $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsc $$4 = $$2.a_($$1);
         dsc $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bR) && !$$5.a(awp.bR)) {
            eoo $$6 = new eoo($$0.dP(), $$0);
            eom $$7 = eor.a($$6, $$1.j());
            eom $$8 = eor.a($$6, $$3.j());
            return $$7 != eom.e && (!$$4.i() || $$8 != eom.e) ? bwl.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgz $$0) {
      return !bvk.a($$0);
   }

   public static void a(cgz $$0) {
      $$0.dS().a(ImmutableList.of(com.s, com.u, com.q, com.t, com.b));
   }

   public static Predicate<cup> a() {
      return $$0 -> $$0.a(awy.al);
   }
}
