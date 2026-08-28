import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqc e = bqc.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgy $$0, ayw $$1) {
      $$0.dU().a(ccs.S, e.a($$1));
   }

   protected static buq<?> a(buq<cgy> $$0) {
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

   private static void b(buq<cgy> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bvc(2.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P), new bvn(ccs.S)));
   }

   private static void c(buq<cgy> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(0, new bvb(bsx.R)),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(2, bxt.a(cgz::b, $$0x -> $$0x.dU().c(ccs.B))),
            Pair.of(3, bye.a(6, 1.0F)),
            Pair.of(
               4,
               new bxe(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableList.of(Pair.of(bwz.a(1.0F), 1), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(new bvo(), 3), Pair.of(byu.a(bsr::aF), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.X, cct.b))
      );
   }

   private static void d(buq<cgy> $$0) {
      $$0.a(
         com.t,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(2, bxt.a(cgz::b, $$0x -> $$0x.dU().c(ccs.B))),
            Pair.of(3, bye.a(8, 1.5F)),
            Pair.of(
               5,
               new bvv(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableSet.of(),
                  bvv.a.a,
                  bvv.b.b,
                  ImmutableList.of(Pair.of(bwz.c(0.75F), 1), Pair.of(bwz.a(1.0F, true), 1), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(byu.a(bsr::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.X, cct.a))
      );
   }

   private static void e(buq<cgy> $$0) {
      $$0.a(
         com.u,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(1, bxt.a(cgz::b, $$0x -> $$0x.dU().c(ccs.B))),
            Pair.of(2, byf.a(8, 1.0F)),
            Pair.of(3, byh.a(dga.tn)),
            Pair.of(4, new bxe(ImmutableList.of(Pair.of(bwz.a(1.0F), 2), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(new bvo(), 2), Pair.of(byu.a(bsr::aF), 1))))
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.Y, cct.a))
      );
   }

   private static void f(buq<cgy> $$0) {
      $$0.a(
         com.q,
         ImmutableList.of(Pair.of(0, new bwi(e, avp.jR)), Pair.of(1, new bwj<>(e, 2, 4, 3.5714288F, $$0x -> avp.jQ, awe.bR, 0.5F, cgz::a))),
         ImmutableSet.of(Pair.of(ccs.O, cct.b), Pair.of(ccs.r, cct.b), Pair.of(ccs.S, cct.b), Pair.of(ccs.X, cct.b))
      );
   }

   private static void g(buq<cgy> $$0) {
      $$0.a(com.s, 0, ImmutableList.of(bxw.a(), new cha(avp.jS, avp.jN)), ccs.o);
   }

   private static <E extends btp> boolean a(E $$0, jd $$1) {
      dcw $$2 = $$0.dP();
      jd $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dtc $$4 = $$2.a_($$1);
         dtc $$5 = $$2.a_($$3);
         if (!$$4.a(awe.bR) && !$$5.a(awe.bR)) {
            epv $$6 = new epv($$0.dP(), $$0);
            ept $$7 = epy.a($$6, $$1.k());
            ept $$8 = epy.a($$6, $$3.k());
            return $$7 != ept.e && (!$$4.i() || $$8 != ept.e) ? bwk.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgy $$0) {
      return !bvj.a($$0);
   }

   public static void a(cgy $$0) {
      $$0.dU().a(ImmutableList.of(com.s, com.u, com.q, com.t, com.b));
   }

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awn.al);
   }
}
