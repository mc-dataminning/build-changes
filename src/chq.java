import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chq {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqv e = bqv.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(chp $$0, azk $$1) {
      $$0.dX().a(cdi.S, e.a($$1));
   }

   protected static bvg<?> a(bvg<chp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chp> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new bvs(2.0F), new bxd(45, 90), new bxh(), new bwd(cdi.P), new bwd(cdi.S)));
   }

   private static void c(bvg<chp> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(0, new bvr(btq.R)),
            Pair.of(1, new bwk($$0x -> 1.25F)),
            Pair.of(2, byj.a(chq::b, $$0x -> $$0x.dX().c(cdi.B))),
            Pair.of(3, byu.a(6, 1.0F)),
            Pair.of(
               4,
               new bxu(
                  ImmutableMap.of(cdi.m, cdj.b),
                  ImmutableList.of(Pair.of(bxp.a(1.0F), 1), Pair.of(bye.a(1.0F, 3), 1), Pair.of(new bwe(), 3), Pair.of(bzk.a(btj::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdi.T, cdj.b), Pair.of(cdi.X, cdj.b))
      );
   }

   private static void d(bvg<chp> $$0) {
      $$0.a(
         cpg.t,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, new bwk($$0x -> 1.25F)),
            Pair.of(2, byj.a(chq::b, $$0x -> $$0x.dX().c(cdi.B))),
            Pair.of(3, byu.a(8, 1.5F)),
            Pair.of(
               5,
               new bwl(
                  ImmutableMap.of(cdi.m, cdj.b),
                  ImmutableSet.of(),
                  bwl.a.a,
                  bwl.b.b,
                  ImmutableList.of(Pair.of(bxp.c(0.75F), 1), Pair.of(bxp.a(1.0F, true), 1), Pair.of(bye.a(1.0F, 3), 1), Pair.of(bzk.a(btj::bl), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdi.T, cdj.b), Pair.of(cdi.X, cdj.a))
      );
   }

   private static void e(bvg<chp> $$0) {
      $$0.a(
         cpg.u,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, byj.a(chq::b, $$0x -> $$0x.dX().c(cdi.B))),
            Pair.of(2, byv.a(8, 1.0F)),
            Pair.of(3, byx.a(dgx.tn)),
            Pair.of(4, new bxu(ImmutableList.of(Pair.of(bxp.a(1.0F), 2), Pair.of(bye.a(1.0F, 3), 1), Pair.of(new bwe(), 2), Pair.of(bzk.a(btj::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cdi.T, cdj.b), Pair.of(cdi.Y, cdj.a))
      );
   }

   private static void f(bvg<chp> $$0) {
      $$0.a(
         cpg.q,
         ImmutableList.of(Pair.of(0, new bwy(e, awd.jS)), Pair.of(1, new bwz<>(e, 2, 4, 3.5714288F, $$0x -> awd.jR, aws.bS, 0.5F, chq::a))),
         ImmutableSet.of(Pair.of(cdi.O, cdj.b), Pair.of(cdi.r, cdj.b), Pair.of(cdi.S, cdj.b), Pair.of(cdi.X, cdj.b))
      );
   }

   private static void g(bvg<chp> $$0) {
      $$0.a(cpg.s, 0, ImmutableList.of(bym.a(), new chr(awd.jT, awd.jO)), cdi.o);
   }

   private static <E extends buh> boolean a(E $$0, je $$1) {
      dds $$2 = $$0.dS();
      je $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dua $$4 = $$2.a_($$1);
         dua $$5 = $$2.a_($$3);
         if (!$$4.a(aws.bS) && !$$5.a(aws.bS)) {
            equ $$6 = new equ($$0.dS(), $$0);
            eqs $$7 = eqx.a($$6, $$1.k());
            eqs $$8 = eqx.a($$6, $$3.k());
            return $$7 != eqs.e && (!$$4.l() || $$8 != eqs.e) ? bxa.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(chp $$0) {
      return !bvz.a($$0);
   }

   public static void a(chp $$0) {
      $$0.dX().a(ImmutableList.of(cpg.s, cpg.u, cpg.q, cpg.t, cpg.b));
   }

   public static Predicate<cvl> a() {
      return $$0 -> $$0.a(axb.al);
   }
}
