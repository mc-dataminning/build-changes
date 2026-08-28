import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciu {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brw e = brw.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cit $$0, azh $$1) {
      $$0.eb().a(cem.S, e.a($$1));
   }

   protected static bwk<?> a(bwk<cit> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<cit> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bww(2.0F), new byh(45, 90), new byl(), new bxh(cem.P), new bxh(cem.S)));
   }

   private static void c(bwk<cit> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(0, new bwv(but.ab)),
            Pair.of(1, new bxo($$0x -> 1.25F)),
            Pair.of(2, bzn.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cem.B))),
            Pair.of(3, bzy.a(6, 1.0F)),
            Pair.of(
               4,
               new byy(
                  ImmutableMap.of(cem.m, cen.b),
                  ImmutableList.of(Pair.of(byt.a(1.0F), 1), Pair.of(bzi.a(1.0F, 3), 1), Pair.of(new bxi(), 3), Pair.of(cao.a(bum::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cem.T, cen.b), Pair.of(cem.X, cen.b))
      );
   }

   private static void d(bwk<cit> $$0) {
      $$0.a(
         cqp.t,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, new bxo($$0x -> 1.25F)),
            Pair.of(2, bzn.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cem.B))),
            Pair.of(3, bzy.a(8, 1.5F)),
            Pair.of(
               5,
               new bxp(
                  ImmutableMap.of(cem.m, cen.b),
                  ImmutableSet.of(),
                  bxp.a.a,
                  bxp.b.b,
                  ImmutableList.of(Pair.of(byt.c(0.75F), 1), Pair.of(byt.a(1.0F, true), 1), Pair.of(bzi.a(1.0F, 3), 1), Pair.of(cao.a(bum::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cem.T, cen.b), Pair.of(cem.X, cen.a))
      );
   }

   private static void e(bwk<cit> $$0) {
      $$0.a(
         cqp.u,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, bzn.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cem.B))),
            Pair.of(2, bzz.a(8, 1.0F)),
            Pair.of(3, cab.a(djp.tP)),
            Pair.of(4, new byy(ImmutableList.of(Pair.of(byt.a(1.0F), 2), Pair.of(bzi.a(1.0F, 3), 1), Pair.of(new bxi(), 2), Pair.of(cao.a(bum::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cem.T, cen.b), Pair.of(cem.Y, cen.a))
      );
   }

   private static void f(bwk<cit> $$0) {
      $$0.a(
         cqp.q,
         ImmutableList.of(Pair.of(0, new byc(e, awa.kr)), Pair.of(1, new byd<>(e, 2, 4, 3.5714288F, $$0x -> awa.kq, awp.bT, 0.5F, ciu::a))),
         ImmutableSet.of(Pair.of(cem.O, cen.b), Pair.of(cem.r, cen.b), Pair.of(cem.S, cen.b), Pair.of(cem.X, cen.b))
      );
   }

   private static void g(bwk<cit> $$0) {
      $$0.a(cqp.s, 0, ImmutableList.of(bzq.a(), new civ(awa.ks, awa.kn)), cem.o);
   }

   private static <E extends bvk> boolean a(E $$0, ji $$1) {
      dgj $$2 = $$0.dV();
      ji $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dwy $$4 = $$2.a_($$1);
         dwy $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bT) && !$$5.a(awp.bT)) {
            ett $$6 = new ett($$0.dV(), $$0);
            etr $$7 = etw.a($$6, $$1.k());
            etr $$8 = etw.a($$6, $$3.k());
            return $$7 != etr.e && (!$$4.l() || $$8 != etr.e) ? bye.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cit $$0) {
      return !bxd.a($$0);
   }

   public static void a(cit $$0) {
      $$0.eb().a(ImmutableList.of(cqp.s, cqp.u, cqp.q, cqp.t, cqp.b));
   }

   public static Predicate<cwq> a() {
      return $$0 -> $$0.a(awy.ao);
   }
}
