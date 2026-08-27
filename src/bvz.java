import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bvz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bgb f = bgb.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bvy $$0, aru $$1) {
      $$0.dM().a(brz.R, f.a($$1));
   }

   protected static bjy<?> a(bjy<bvy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bvy> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bkk(2.0F), new blu(45, 90), new bly(), new bkv(brz.O), new bkv(brz.R)));
   }

   private static void c(bjy<bvy> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(0, new bkj(bim.O, 1.0F)),
            Pair.of(1, new blc($$0x -> 1.25F)),
            Pair.of(2, bna.a(bvz::b, $$0x -> $$0x.dM().c(brz.B))),
            Pair.of(3, bnl.a(6, 1.0F)),
            Pair.of(
               4,
               new bml(
                  ImmutableMap.of(brz.m, bsa.b),
                  ImmutableList.of(Pair.of(bmg.a(1.0F), 1), Pair.of(bmv.a(1.0F, 3), 1), Pair.of(new bkw(), 3), Pair.of(bob.a(bii::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(brz.S, bsa.b), Pair.of(brz.W, bsa.b))
      );
   }

   private static void d(bjy<bvy> $$0) {
      $$0.a(
         ccx.t,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new blc($$0x -> 1.25F)),
            Pair.of(2, bna.a(bvz::b, $$0x -> $$0x.dM().c(brz.B))),
            Pair.of(3, bnl.a(8, 1.5F)),
            Pair.of(
               5,
               new bld(
                  ImmutableMap.of(brz.m, bsa.b),
                  ImmutableSet.of(),
                  bld.a.a,
                  bld.b.b,
                  ImmutableList.of(Pair.of(bmg.c(0.75F), 1), Pair.of(bmg.a(1.0F, true), 1), Pair.of(bmv.a(1.0F, 3), 1), Pair.of(bob.a(bii::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(brz.S, bsa.b), Pair.of(brz.W, bsa.a))
      );
   }

   private static void e(bjy<bvy> $$0) {
      $$0.a(
         ccx.u,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, bna.a(bvz::b, $$0x -> $$0x.dM().c(brz.B))),
            Pair.of(2, bnm.a(8, 1.0F)),
            Pair.of(3, bno.a(csm.sm)),
            Pair.of(4, new bml(ImmutableList.of(Pair.of(bmg.a(1.0F), 2), Pair.of(bmv.a(1.0F, 3), 1), Pair.of(new bkw(), 2), Pair.of(bob.a(bii::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(brz.S, bsa.b), Pair.of(brz.X, bsa.a))
      );
   }

   private static void f(bjy<bvy> $$0) {
      $$0.a(
         ccx.q,
         ImmutableList.of(Pair.of(0, new blq(f, aow.iK)), Pair.of(1, new blr<>(f, 2, 4, 1.5F, $$0x -> aow.iJ, apl.bK, 0.5F, bvz::a))),
         ImmutableSet.of(Pair.of(brz.N, bsa.b), Pair.of(brz.r, bsa.b), Pair.of(brz.R, bsa.b), Pair.of(brz.W, bsa.b))
      );
   }

   private static void g(bjy<bvy> $$0) {
      $$0.a(ccx.s, 0, ImmutableList.of(bnd.a(), new bwa(aow.iL, aow.iG)), brz.o);
   }

   private static <E extends bja> boolean a(E $$0, gu $$1) {
      cpl $$2 = $$0.dK();
      gu $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dez $$4 = $$2.a_($$1);
         dez $$5 = $$2.a_($$3);
         if (!$$4.a(apl.bK) && !$$5.a(apl.bK)) {
            ean $$6 = eaw.a($$2, $$1.j());
            ean $$7 = eaw.a($$2, $$3.j());
            return $$6 != ean.e && (!$$4.i() || $$7 != ean.e) ? bls.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bvy $$0) {
      return !bkr.a($$0);
   }

   public static void a(bvy $$0) {
      $$0.dM().a(ImmutableList.of(ccx.s, ccx.u, ccx.q, ccx.t, ccx.b));
   }

   public static clx a() {
      return bvy.bT;
   }
}
