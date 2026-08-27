import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cdw {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bnl e = bnl.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cdv $$0, axr $$1) {
      $$0.dP().a(bzr.S, e.a($$1));
   }

   protected static brp<?> a(brp<cdv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cdv> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bsb(2.0F), new btm(45, 90), new btq(), new bsm(bzr.P), new bsm(bzr.S)));
   }

   private static void c(brp<cdv> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(0, new bsa(bqb.R)),
            Pair.of(1, new bst($$0x -> 1.25F)),
            Pair.of(2, bus.a(cdw::b, $$0x -> $$0x.dP().c(bzr.B))),
            Pair.of(3, bvd.a(6, 1.0F)),
            Pair.of(
               4,
               new bud(
                  ImmutableMap.of(bzr.m, bzs.b),
                  ImmutableList.of(Pair.of(bty.a(1.0F), 1), Pair.of(bun.a(1.0F, 3), 1), Pair.of(new bsn(), 3), Pair.of(bvt.a(bpv::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bzr.T, bzs.b), Pair.of(bzr.X, bzs.b))
      );
   }

   private static void d(brp<cdv> $$0) {
      $$0.a(
         cli.t,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, new bst($$0x -> 1.25F)),
            Pair.of(2, bus.a(cdw::b, $$0x -> $$0x.dP().c(bzr.B))),
            Pair.of(3, bvd.a(8, 1.5F)),
            Pair.of(
               5,
               new bsu(
                  ImmutableMap.of(bzr.m, bzs.b),
                  ImmutableSet.of(),
                  bsu.a.a,
                  bsu.b.b,
                  ImmutableList.of(Pair.of(bty.c(0.75F), 1), Pair.of(bty.a(1.0F, true), 1), Pair.of(bun.a(1.0F, 3), 1), Pair.of(bvt.a(bpv::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bzr.T, bzs.b), Pair.of(bzr.X, bzs.a))
      );
   }

   private static void e(brp<cdv> $$0) {
      $$0.a(
         cli.u,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, bus.a(cdw::b, $$0x -> $$0x.dP().c(bzr.B))),
            Pair.of(2, bve.a(8, 1.0F)),
            Pair.of(3, bvg.a(dca.tn)),
            Pair.of(4, new bud(ImmutableList.of(Pair.of(bty.a(1.0F), 2), Pair.of(bun.a(1.0F, 3), 1), Pair.of(new bsn(), 2), Pair.of(bvt.a(bpv::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bzr.T, bzs.b), Pair.of(bzr.Y, bzs.a))
      );
   }

   private static void f(brp<cdv> $$0) {
      $$0.a(
         cli.q,
         ImmutableList.of(Pair.of(0, new bth(e, aum.jM)), Pair.of(1, new bti<>(e, 2, 4, 3.5714288F, $$0x -> aum.jL, avc.bL, 0.5F, cdw::a))),
         ImmutableSet.of(Pair.of(bzr.O, bzs.b), Pair.of(bzr.r, bzs.b), Pair.of(bzr.S, bzs.b), Pair.of(bzr.X, bzs.b))
      );
   }

   private static void g(brp<cdv> $$0) {
      $$0.a(cli.s, 0, ImmutableList.of(buv.a(), new cdx(aum.jN, aum.jI)), bzr.o);
   }

   private static <E extends bqq> boolean a(E $$0, ib $$1) {
      cyx $$2 = $$0.dM();
      ib $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         doz $$4 = $$2.a_($$1);
         doz $$5 = $$2.a_($$3);
         if (!$$4.a(avc.bL) && !$$5.a(avc.bL)) {
            ell $$6 = new ell($$0.dM(), $$0);
            elj $$7 = elo.a($$6, $$1.j());
            elj $$8 = elo.a($$6, $$3.j());
            return $$7 != elj.e && (!$$4.i() || $$8 != elj.e) ? btj.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cdv $$0) {
      return !bsi.a($$0);
   }

   public static void a(cdv $$0) {
      $$0.dP().a(ImmutableList.of(cli.s, cli.u, cli.q, cli.t, cli.b));
   }

   public static cvg a() {
      return cdv.bX;
   }
}
