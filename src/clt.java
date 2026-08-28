import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clt {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bun e = bun.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cls $$0, bai $$1) {
      $$0.ec().a(chh.T, e.a($$1));
   }

   protected static bzf<?> a(bzf<cls> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<cls> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new bzr(2.0F), new cbc(45, 90), new cbg(), new cac(chh.Q), new cac(chh.T)));
   }

   private static void c(bzf<cls> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(0, new bzq(bxn.ac)),
            Pair.of(1, new caj($$0x -> 1.25F)),
            Pair.of(2, cci.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(chh.C))),
            Pair.of(3, cct.a(6, 1.0F)),
            Pair.of(
               4,
               new cbt(
                  ImmutableMap.of(chh.n, chi.b),
                  ImmutableList.of(Pair.of(cbo.a(1.0F), 1), Pair.of(ccd.a(1.0F, 3), 1), Pair.of(new cad(), 3), Pair.of(cdj.a(bxe::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(chh.U, chi.b), Pair.of(chh.Y, chi.b))
      );
   }

   private static void d(bzf<cls> $$0) {
      $$0.a(
         cuc.t,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, new caj($$0x -> 1.25F)),
            Pair.of(2, cci.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(chh.C))),
            Pair.of(3, cct.a(8, 1.5F)),
            Pair.of(
               5,
               new cak(
                  ImmutableMap.of(chh.n, chi.b),
                  ImmutableSet.of(),
                  cak.a.a,
                  cak.b.b,
                  ImmutableList.of(Pair.of(cbo.c(0.75F), 1), Pair.of(cbo.a(1.0F, true), 1), Pair.of(ccd.a(1.0F, 3), 1), Pair.of(cdj.a(bxe::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(chh.U, chi.b), Pair.of(chh.Y, chi.a))
      );
   }

   private static void e(bzf<cls> $$0) {
      $$0.a(
         cuc.u,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, cci.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(chh.C))),
            Pair.of(2, ccu.a(8, 1.0F)),
            Pair.of(3, ccw.a(dnq.tX)),
            Pair.of(4, new cbt(ImmutableList.of(Pair.of(cbo.a(1.0F), 2), Pair.of(ccd.a(1.0F, 3), 1), Pair.of(new cad(), 2), Pair.of(cdj.a(bxe::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(chh.U, chi.b), Pair.of(chh.Z, chi.a))
      );
   }

   private static void f(bzf<cls> $$0) {
      $$0.a(
         cuc.q,
         ImmutableList.of(Pair.of(0, new cax(e, awy.kv)), Pair.of(1, new cay<>(e, 2, 4, 3.5714288F, $$0x -> awy.ku, axn.bV, 0.5F, clt::a))),
         ImmutableSet.of(Pair.of(chh.P, chi.b), Pair.of(chh.s, chi.b), Pair.of(chh.T, chi.b), Pair.of(chh.Y, chi.b))
      );
   }

   private static void g(bzf<cls> $$0) {
      $$0.a(cuc.s, 0, ImmutableList.of(ccl.a(), new clw(awy.kw, awy.kr)), chh.p);
   }

   private static <E extends byh> boolean a(E $$0, iw $$1) {
      dkj $$2 = $$0.dV();
      iw $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         ebq $$4 = $$2.a_($$1);
         ebq $$5 = $$2.a_($$3);
         if (!$$4.a(axn.bV) && !$$5.a(axn.bV)) {
            eyt $$6 = new eyt($$0.dV(), $$0);
            eyr $$7 = eyw.a($$6, $$1.k());
            eyr $$8 = eyw.a($$6, $$3.k());
            return $$7 != eyr.e && (!$$4.l() || $$8 != eyr.e) ? caz.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cls $$0) {
      return !bzy.a($$0);
   }

   public static void a(cls $$0) {
      $$0.ec().a(ImmutableList.of(cuc.s, cuc.u, cuc.q, cuc.t, cuc.b));
   }

   public static Predicate<dak> a() {
      return $$0 -> $$0.a(axv.aq);
   }
}
