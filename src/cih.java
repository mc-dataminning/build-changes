import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cih {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brj e = brj.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cig $$0, azr $$1) {
      $$0.ed().a(cdz.S, e.a($$1));
   }

   protected static bvx<?> a(bvx<cig> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<cig> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bwj(2.0F), new bxu(45, 90), new bxy(), new bwu(cdz.P), new bwu(cdz.S)));
   }

   private static void c(bvx<cig> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(0, new bwi(bug.R)),
            Pair.of(1, new bxb($$0x -> 1.25F)),
            Pair.of(2, bza.a(cih::b, $$0x -> $$0x.ed().c(cdz.B))),
            Pair.of(3, bzl.a(6, 1.0F)),
            Pair.of(
               4,
               new byl(
                  ImmutableMap.of(cdz.m, cea.b),
                  ImmutableList.of(Pair.of(byg.a(1.0F), 1), Pair.of(byv.a(1.0F, 3), 1), Pair.of(new bwv(), 3), Pair.of(cab.a(btz::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdz.T, cea.b), Pair.of(cdz.X, cea.b))
      );
   }

   private static void d(bvx<cig> $$0) {
      $$0.a(
         cpz.t,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(1, new bxb($$0x -> 1.25F)),
            Pair.of(2, bza.a(cih::b, $$0x -> $$0x.ed().c(cdz.B))),
            Pair.of(3, bzl.a(8, 1.5F)),
            Pair.of(
               5,
               new bxc(
                  ImmutableMap.of(cdz.m, cea.b),
                  ImmutableSet.of(),
                  bxc.a.a,
                  bxc.b.b,
                  ImmutableList.of(Pair.of(byg.c(0.75F), 1), Pair.of(byg.a(1.0F, true), 1), Pair.of(byv.a(1.0F, 3), 1), Pair.of(cab.a(btz::bn), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdz.T, cea.b), Pair.of(cdz.X, cea.a))
      );
   }

   private static void e(bvx<cig> $$0) {
      $$0.a(
         cpz.u,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(1, bza.a(cih::b, $$0x -> $$0x.ed().c(cdz.B))),
            Pair.of(2, bzm.a(8, 1.0F)),
            Pair.of(3, bzo.a(dia.tn)),
            Pair.of(4, new byl(ImmutableList.of(Pair.of(byg.a(1.0F), 2), Pair.of(byv.a(1.0F, 3), 1), Pair.of(new bwv(), 2), Pair.of(cab.a(btz::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cdz.T, cea.b), Pair.of(cdz.Y, cea.a))
      );
   }

   private static void f(bvx<cig> $$0) {
      $$0.a(
         cpz.q,
         ImmutableList.of(Pair.of(0, new bxp(e, awk.jS)), Pair.of(1, new bxq<>(e, 2, 4, 3.5714288F, $$0x -> awk.jR, awz.bS, 0.5F, cih::a))),
         ImmutableSet.of(Pair.of(cdz.O, cea.b), Pair.of(cdz.r, cea.b), Pair.of(cdz.S, cea.b), Pair.of(cdz.X, cea.b))
      );
   }

   private static void g(bvx<cig> $$0) {
      $$0.a(cpz.s, 0, ImmutableList.of(bzd.a(), new cii(awk.jT, awk.jO)), cdz.o);
   }

   private static <E extends bux> boolean a(E $$0, jg $$1) {
      dev $$2 = $$0.dX();
      jg $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dvd $$4 = $$2.a_($$1);
         dvd $$5 = $$2.a_($$3);
         if (!$$4.a(awz.bS) && !$$5.a(awz.bS)) {
            erx $$6 = new erx($$0.dX(), $$0);
            erv $$7 = esa.a($$6, $$1.k());
            erv $$8 = esa.a($$6, $$3.k());
            return $$7 != erv.e && (!$$4.l() || $$8 != erv.e) ? bxr.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cig $$0) {
      return !bwq.a($$0);
   }

   public static void a(cig $$0) {
      $$0.ed().a(ImmutableList.of(cpz.s, cpz.u, cpz.q, cpz.t, cpz.b));
   }

   public static Predicate<cvx> a() {
      return $$0 -> $$0.a(axi.am);
   }
}
