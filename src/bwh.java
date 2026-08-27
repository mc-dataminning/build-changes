import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwh {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bgj f = bgj.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bwg $$0, asc $$1) {
      $$0.dN().a(bsh.R, f.a($$1));
   }

   protected static bkg<?> a(bkg<bwg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bwg> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bks(2.0F), new bmc(45, 90), new bmg(), new bld(bsh.O), new bld(bsh.R)));
   }

   private static void c(bkg<bwg> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(0, new bkr(biu.O, 1.0F)),
            Pair.of(1, new blk($$0x -> 1.25F)),
            Pair.of(2, bni.a(bwh::b, $$0x -> $$0x.dN().c(bsh.B))),
            Pair.of(3, bnt.a(6, 1.0F)),
            Pair.of(
               4,
               new bmt(
                  ImmutableMap.of(bsh.m, bsi.b),
                  ImmutableList.of(Pair.of(bmo.a(1.0F), 1), Pair.of(bnd.a(1.0F, 3), 1), Pair.of(new ble(), 3), Pair.of(boj.a(biq::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsh.S, bsi.b), Pair.of(bsh.W, bsi.b))
      );
   }

   private static void d(bkg<bwg> $$0) {
      $$0.a(
         cdf.t,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(1, new blk($$0x -> 1.25F)),
            Pair.of(2, bni.a(bwh::b, $$0x -> $$0x.dN().c(bsh.B))),
            Pair.of(3, bnt.a(8, 1.5F)),
            Pair.of(
               5,
               new bll(
                  ImmutableMap.of(bsh.m, bsi.b),
                  ImmutableSet.of(),
                  bll.a.a,
                  bll.b.b,
                  ImmutableList.of(Pair.of(bmo.c(0.75F), 1), Pair.of(bmo.a(1.0F, true), 1), Pair.of(bnd.a(1.0F, 3), 1), Pair.of(boj.a(biq::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsh.S, bsi.b), Pair.of(bsh.W, bsi.a))
      );
   }

   private static void e(bkg<bwg> $$0) {
      $$0.a(
         cdf.u,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(1, bni.a(bwh::b, $$0x -> $$0x.dN().c(bsh.B))),
            Pair.of(2, bnu.a(8, 1.0F)),
            Pair.of(3, bnw.a(csw.sm)),
            Pair.of(4, new bmt(ImmutableList.of(Pair.of(bmo.a(1.0F), 2), Pair.of(bnd.a(1.0F, 3), 1), Pair.of(new ble(), 2), Pair.of(boj.a(biq::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bsh.S, bsi.b), Pair.of(bsh.X, bsi.a))
      );
   }

   private static void f(bkg<bwg> $$0) {
      $$0.a(
         cdf.q,
         ImmutableList.of(Pair.of(0, new bly(f, ape.iK)), Pair.of(1, new blz<>(f, 2, 4, 1.5F, $$0x -> ape.iJ, apt.bK, 0.5F, bwh::a))),
         ImmutableSet.of(Pair.of(bsh.N, bsi.b), Pair.of(bsh.r, bsi.b), Pair.of(bsh.R, bsi.b), Pair.of(bsh.W, bsi.b))
      );
   }

   private static void g(bkg<bwg> $$0) {
      $$0.a(cdf.s, 0, ImmutableList.of(bnl.a(), new bwi(ape.iL, ape.iG)), bsh.o);
   }

   private static <E extends bji> boolean a(E $$0, gw $$1) {
      cpv $$2 = $$0.dL();
      gw $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dfj $$4 = $$2.a_($$1);
         dfj $$5 = $$2.a_($$3);
         if (!$$4.a(apt.bK) && !$$5.a(apt.bK)) {
            eax $$6 = ebg.a($$2, $$1.j());
            eax $$7 = ebg.a($$2, $$3.j());
            return $$6 != eax.e && (!$$4.i() || $$7 != eax.e) ? bma.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bwg $$0) {
      return !bkz.a($$0);
   }

   public static void a(bwg $$0) {
      $$0.dN().a(ImmutableList.of(cdf.s, cdf.u, cdf.q, cdf.t, cdf.b));
   }

   public static cmg a() {
      return bwg.bT;
   }
}
