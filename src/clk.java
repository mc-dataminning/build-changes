import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clk {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bue e = bue.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(clj $$0, azz $$1) {
      $$0.ec().a(cgy.T, e.a($$1));
   }

   protected static byw<?> a(byw<clj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<clj> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new bzi(2.0F), new cat(45, 90), new cax(), new bzt(cgy.Q), new bzt(cgy.T)));
   }

   private static void c(byw<clj> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(0, new bzh(bxe.ac)),
            Pair.of(1, new caa($$0x -> 1.25F)),
            Pair.of(2, cbz.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgy.C))),
            Pair.of(3, cck.a(6, 1.0F)),
            Pair.of(
               4,
               new cbk(
                  ImmutableMap.of(cgy.n, cgz.b),
                  ImmutableList.of(Pair.of(cbf.a(1.0F), 1), Pair.of(cbu.a(1.0F, 3), 1), Pair.of(new bzu(), 3), Pair.of(cda.a(bwv::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgy.U, cgz.b), Pair.of(cgy.Y, cgz.b))
      );
   }

   private static void d(byw<clj> $$0) {
      $$0.a(
         ctt.t,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, new caa($$0x -> 1.25F)),
            Pair.of(2, cbz.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgy.C))),
            Pair.of(3, cck.a(8, 1.5F)),
            Pair.of(
               5,
               new cab(
                  ImmutableMap.of(cgy.n, cgz.b),
                  ImmutableSet.of(),
                  cab.a.a,
                  cab.b.b,
                  ImmutableList.of(Pair.of(cbf.c(0.75F), 1), Pair.of(cbf.a(1.0F, true), 1), Pair.of(cbu.a(1.0F, 3), 1), Pair.of(cda.a(bwv::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgy.U, cgz.b), Pair.of(cgy.Y, cgz.a))
      );
   }

   private static void e(byw<clj> $$0) {
      $$0.a(
         ctt.u,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, cbz.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgy.C))),
            Pair.of(2, ccl.a(8, 1.0F)),
            Pair.of(3, ccn.a(dng.tX)),
            Pair.of(4, new cbk(ImmutableList.of(Pair.of(cbf.a(1.0F), 2), Pair.of(cbu.a(1.0F, 3), 1), Pair.of(new bzu(), 2), Pair.of(cda.a(bwv::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cgy.U, cgz.b), Pair.of(cgy.Z, cgz.a))
      );
   }

   private static void f(byw<clj> $$0) {
      $$0.a(
         ctt.q,
         ImmutableList.of(Pair.of(0, new cao(e, awr.kv)), Pair.of(1, new cap<>(e, 2, 4, 3.5714288F, $$0x -> awr.ku, axg.bV, 0.5F, clk::a))),
         ImmutableSet.of(Pair.of(cgy.P, cgz.b), Pair.of(cgy.s, cgz.b), Pair.of(cgy.T, cgz.b), Pair.of(cgy.Y, cgz.b))
      );
   }

   private static void g(byw<clj> $$0) {
      $$0.a(ctt.s, 0, ImmutableList.of(ccc.a(), new cln(awr.kw, awr.kr)), cgy.p);
   }

   private static <E extends bxy> boolean a(E $$0, iw $$1) {
      djz $$2 = $$0.dV();
      iw $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         ebg $$4 = $$2.a_($$1);
         ebg $$5 = $$2.a_($$3);
         if (!$$4.a(axg.bV) && !$$5.a(axg.bV)) {
            eyj $$6 = new eyj($$0.dV(), $$0);
            eyh $$7 = eym.a($$6, $$1.k());
            eyh $$8 = eym.a($$6, $$3.k());
            return $$7 != eyh.e && (!$$4.l() || $$8 != eyh.e) ? caq.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(clj $$0) {
      return !bzp.a($$0);
   }

   public static void a(clj $$0) {
      $$0.ec().a(ImmutableList.of(ctt.s, ctt.u, ctt.q, ctt.t, ctt.b));
   }

   public static Predicate<daa> a() {
      return $$0 -> $$0.a(axo.aq);
   }
}
