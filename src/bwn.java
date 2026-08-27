import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bgp f = bgp.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bwm $$0, ash $$1) {
      $$0.dN().a(bsn.R, f.a($$1));
   }

   protected static bkm<?> a(bkm<bwm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bwm> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bky(2.0F), new bmi(45, 90), new bmm(), new blj(bsn.O), new blj(bsn.R)));
   }

   private static void c(bkm<bwm> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(0, new bkx(bja.O, 1.0F)),
            Pair.of(1, new blq($$0x -> 1.25F)),
            Pair.of(2, bno.a(bwn::b, $$0x -> $$0x.dN().c(bsn.B))),
            Pair.of(3, bnz.a(6, 1.0F)),
            Pair.of(
               4,
               new bmz(
                  ImmutableMap.of(bsn.m, bso.b),
                  ImmutableList.of(Pair.of(bmu.a(1.0F), 1), Pair.of(bnj.a(1.0F, 3), 1), Pair.of(new blk(), 3), Pair.of(bop.a(biw::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsn.S, bso.b), Pair.of(bsn.W, bso.b))
      );
   }

   private static void d(bkm<bwm> $$0) {
      $$0.a(
         cdl.t,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(1, new blq($$0x -> 1.25F)),
            Pair.of(2, bno.a(bwn::b, $$0x -> $$0x.dN().c(bsn.B))),
            Pair.of(3, bnz.a(8, 1.5F)),
            Pair.of(
               5,
               new blr(
                  ImmutableMap.of(bsn.m, bso.b),
                  ImmutableSet.of(),
                  blr.a.a,
                  blr.b.b,
                  ImmutableList.of(Pair.of(bmu.c(0.75F), 1), Pair.of(bmu.a(1.0F, true), 1), Pair.of(bnj.a(1.0F, 3), 1), Pair.of(bop.a(biw::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsn.S, bso.b), Pair.of(bsn.W, bso.a))
      );
   }

   private static void e(bkm<bwm> $$0) {
      $$0.a(
         cdl.u,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(1, bno.a(bwn::b, $$0x -> $$0x.dN().c(bsn.B))),
            Pair.of(2, boa.a(8, 1.0F)),
            Pair.of(3, boc.a(cte.sm)),
            Pair.of(4, new bmz(ImmutableList.of(Pair.of(bmu.a(1.0F), 2), Pair.of(bnj.a(1.0F, 3), 1), Pair.of(new blk(), 2), Pair.of(bop.a(biw::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bsn.S, bso.b), Pair.of(bsn.X, bso.a))
      );
   }

   private static void f(bkm<bwm> $$0) {
      $$0.a(
         cdl.q,
         ImmutableList.of(Pair.of(0, new bme(f, apg.iK)), Pair.of(1, new bmf<>(f, 2, 4, 1.5F, $$0x -> apg.iJ, apv.bK, 0.5F, bwn::a))),
         ImmutableSet.of(Pair.of(bsn.N, bso.b), Pair.of(bsn.r, bso.b), Pair.of(bsn.R, bso.b), Pair.of(bsn.W, bso.b))
      );
   }

   private static void g(bkm<bwm> $$0) {
      $$0.a(cdl.s, 0, ImmutableList.of(bnr.a(), new bwo(apg.iL, apg.iG)), bsn.o);
   }

   private static <E extends bjo> boolean a(E $$0, gw $$1) {
      cqb $$2 = $$0.dL();
      gw $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dfd $$4 = $$2.a_($$1);
         dfd $$5 = $$2.a_($$3);
         if (!$$4.a(apv.bK) && !$$5.a(apv.bK)) {
            ear $$6 = eba.a($$2, $$1.j());
            ear $$7 = eba.a($$2, $$3.j());
            return $$6 != ear.e && (!$$4.i() || $$7 != ear.e) ? bmg.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bwm $$0) {
      return !blf.a($$0);
   }

   public static void a(bwm $$0) {
      $$0.dN().a(ImmutableList.of(cdl.s, cdl.u, cdl.q, cdl.t, cdl.b));
   }

   public static cmm a() {
      return bwm.bT;
   }
}
