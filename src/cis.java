import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cis {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bru e = bru.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cir $$0, azh $$1) {
      $$0.eb().a(cek.S, e.a($$1));
   }

   protected static bwi<?> a(bwi<cir> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cir> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bwu(2.0F), new byf(45, 90), new byj(), new bxf(cek.P), new bxf(cek.S)));
   }

   private static void c(bwi<cir> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(0, new bwt(bur.ab)),
            Pair.of(1, new bxm($$0x -> 1.25F)),
            Pair.of(2, bzl.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cek.B))),
            Pair.of(3, bzw.a(6, 1.0F)),
            Pair.of(
               4,
               new byw(
                  ImmutableMap.of(cek.m, cel.b),
                  ImmutableList.of(Pair.of(byr.a(1.0F), 1), Pair.of(bzg.a(1.0F, 3), 1), Pair.of(new bxg(), 3), Pair.of(cam.a(buk::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cek.T, cel.b), Pair.of(cek.X, cel.b))
      );
   }

   private static void d(bwi<cir> $$0) {
      $$0.a(
         cqn.t,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, new bxm($$0x -> 1.25F)),
            Pair.of(2, bzl.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cek.B))),
            Pair.of(3, bzw.a(8, 1.5F)),
            Pair.of(
               5,
               new bxn(
                  ImmutableMap.of(cek.m, cel.b),
                  ImmutableSet.of(),
                  bxn.a.a,
                  bxn.b.b,
                  ImmutableList.of(Pair.of(byr.c(0.75F), 1), Pair.of(byr.a(1.0F, true), 1), Pair.of(bzg.a(1.0F, 3), 1), Pair.of(cam.a(buk::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cek.T, cel.b), Pair.of(cek.X, cel.a))
      );
   }

   private static void e(bwi<cir> $$0) {
      $$0.a(
         cqn.u,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, bzl.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cek.B))),
            Pair.of(2, bzx.a(8, 1.0F)),
            Pair.of(3, bzz.a(djn.tP)),
            Pair.of(4, new byw(ImmutableList.of(Pair.of(byr.a(1.0F), 2), Pair.of(bzg.a(1.0F, 3), 1), Pair.of(new bxg(), 2), Pair.of(cam.a(buk::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cek.T, cel.b), Pair.of(cek.Y, cel.a))
      );
   }

   private static void f(bwi<cir> $$0) {
      $$0.a(
         cqn.q,
         ImmutableList.of(Pair.of(0, new bya(e, awa.kr)), Pair.of(1, new byb<>(e, 2, 4, 3.5714288F, $$0x -> awa.kq, awp.bT, 0.5F, cis::a))),
         ImmutableSet.of(Pair.of(cek.O, cel.b), Pair.of(cek.r, cel.b), Pair.of(cek.S, cel.b), Pair.of(cek.X, cel.b))
      );
   }

   private static void g(bwi<cir> $$0) {
      $$0.a(cqn.s, 0, ImmutableList.of(bzo.a(), new cit(awa.ks, awa.kn)), cek.o);
   }

   private static <E extends bvi> boolean a(E $$0, ji $$1) {
      dgh $$2 = $$0.dV();
      ji $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dww $$4 = $$2.a_($$1);
         dww $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bT) && !$$5.a(awp.bT)) {
            etr $$6 = new etr($$0.dV(), $$0);
            etp $$7 = etu.a($$6, $$1.k());
            etp $$8 = etu.a($$6, $$3.k());
            return $$7 != etp.e && (!$$4.l() || $$8 != etp.e) ? byc.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cir $$0) {
      return !bxb.a($$0);
   }

   public static void a(cir $$0) {
      $$0.eb().a(ImmutableList.of(cqn.s, cqn.u, cqn.q, cqn.t, cqn.b));
   }

   public static Predicate<cwo> a() {
      return $$0 -> $$0.a(awy.ao);
   }
}
