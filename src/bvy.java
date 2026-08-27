import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bvy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bfz f = bfz.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bvx $$0, art $$1) {
      $$0.dM().a(bry.R, f.a($$1));
   }

   protected static bjx<?> a(bjx<bvx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bvx> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bkj(2.0F), new blt(45, 90), new blx(), new bku(bry.O), new bku(bry.R)));
   }

   private static void c(bjx<bvx> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(0, new bki(bik.O, 1.0F)),
            Pair.of(1, new blb($$0x -> 1.25F)),
            Pair.of(2, bmz.a(bvy::b, $$0x -> $$0x.dM().c(bry.B))),
            Pair.of(3, bnk.a(6, 1.0F)),
            Pair.of(
               4,
               new bmk(
                  ImmutableMap.of(bry.m, brz.b),
                  ImmutableList.of(Pair.of(bmf.a(1.0F), 1), Pair.of(bmu.a(1.0F, 3), 1), Pair.of(new bkv(), 3), Pair.of(boa.a(big::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bry.S, brz.b), Pair.of(bry.W, brz.b))
      );
   }

   private static void d(bjx<bvx> $$0) {
      $$0.a(
         ccw.t,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(1, new blb($$0x -> 1.25F)),
            Pair.of(2, bmz.a(bvy::b, $$0x -> $$0x.dM().c(bry.B))),
            Pair.of(3, bnk.a(8, 1.5F)),
            Pair.of(
               5,
               new blc(
                  ImmutableMap.of(bry.m, brz.b),
                  ImmutableSet.of(),
                  blc.a.a,
                  blc.b.b,
                  ImmutableList.of(Pair.of(bmf.c(0.75F), 1), Pair.of(bmf.a(1.0F, true), 1), Pair.of(bmu.a(1.0F, 3), 1), Pair.of(boa.a(big::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bry.S, brz.b), Pair.of(bry.W, brz.a))
      );
   }

   private static void e(bjx<bvx> $$0) {
      $$0.a(
         ccw.u,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(1, bmz.a(bvy::b, $$0x -> $$0x.dM().c(bry.B))),
            Pair.of(2, bnl.a(8, 1.0F)),
            Pair.of(3, bnn.a(csl.sm)),
            Pair.of(4, new bmk(ImmutableList.of(Pair.of(bmf.a(1.0F), 2), Pair.of(bmu.a(1.0F, 3), 1), Pair.of(new bkv(), 2), Pair.of(boa.a(big::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bry.S, brz.b), Pair.of(bry.X, brz.a))
      );
   }

   private static void f(bjx<bvx> $$0) {
      $$0.a(
         ccw.q,
         ImmutableList.of(Pair.of(0, new blp(f, aou.iK)), Pair.of(1, new blq<>(f, 2, 4, 1.5F, $$0x -> aou.iJ, apj.bK, 0.5F, bvy::a))),
         ImmutableSet.of(Pair.of(bry.N, brz.b), Pair.of(bry.r, brz.b), Pair.of(bry.R, brz.b), Pair.of(bry.W, brz.b))
      );
   }

   private static void g(bjx<bvx> $$0) {
      $$0.a(ccw.s, 0, ImmutableList.of(bnc.a(), new bvz(aou.iL, aou.iG)), bry.o);
   }

   private static <E extends biy> boolean a(E $$0, gv $$1) {
      cpk $$2 = $$0.dK();
      gv $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dey $$4 = $$2.a_($$1);
         dey $$5 = $$2.a_($$3);
         if (!$$4.a(apj.bK) && !$$5.a(apj.bK)) {
            eam $$6 = eav.a($$2, $$1.j());
            eam $$7 = eav.a($$2, $$3.j());
            return $$6 != eam.e && (!$$4.i() || $$7 != eam.e) ? blr.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bvx $$0) {
      return !bkq.a($$0);
   }

   public static void a(bvx $$0) {
      $$0.dM().a(ImmutableList.of(ccw.s, ccw.u, ccw.q, ccw.t, ccw.b));
   }

   public static clw a() {
      return bvx.bT;
   }
}
