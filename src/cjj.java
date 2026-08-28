import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjj {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bsl e = bsl.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cji $$0, bac $$1) {
      $$0.ec().a(cfb.S, e.a($$1));
   }

   protected static bwz<?> a(bwz<cji> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cji> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new bxl(2.0F), new byw(45, 90), new bza(), new bxw(cfb.P), new bxw(cfb.S)));
   }

   private static void c(bwz<cji> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(0, new bxk(bvi.ac)),
            Pair.of(1, new byd($$0x -> 1.25F)),
            Pair.of(2, cac.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfb.B))),
            Pair.of(3, can.a(6, 1.0F)),
            Pair.of(
               4,
               new bzn(
                  ImmutableMap.of(cfb.m, cfc.b),
                  ImmutableList.of(Pair.of(bzi.a(1.0F), 1), Pair.of(bzx.a(1.0F, 3), 1), Pair.of(new bxx(), 3), Pair.of(cbd.a(bvb::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfb.T, cfc.b), Pair.of(cfb.X, cfc.b))
      );
   }

   private static void d(bwz<cji> $$0) {
      $$0.a(
         crf.t,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, new byd($$0x -> 1.25F)),
            Pair.of(2, cac.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfb.B))),
            Pair.of(3, can.a(8, 1.5F)),
            Pair.of(
               5,
               new bye(
                  ImmutableMap.of(cfb.m, cfc.b),
                  ImmutableSet.of(),
                  bye.a.a,
                  bye.b.b,
                  ImmutableList.of(Pair.of(bzi.c(0.75F), 1), Pair.of(bzi.a(1.0F, true), 1), Pair.of(bzx.a(1.0F, 3), 1), Pair.of(cbd.a(bvb::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfb.T, cfc.b), Pair.of(cfb.X, cfc.a))
      );
   }

   private static void e(bwz<cji> $$0) {
      $$0.a(
         crf.u,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, cac.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cfb.B))),
            Pair.of(2, cao.a(8, 1.0F)),
            Pair.of(3, caq.a(dkf.tP)),
            Pair.of(4, new bzn(ImmutableList.of(Pair.of(bzi.a(1.0F), 2), Pair.of(bzx.a(1.0F, 3), 1), Pair.of(new bxx(), 2), Pair.of(cbd.a(bvb::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cfb.T, cfc.b), Pair.of(cfb.Y, cfc.a))
      );
   }

   private static void f(bwz<cji> $$0) {
      $$0.a(
         crf.q,
         ImmutableList.of(Pair.of(0, new byr(e, awv.kr)), Pair.of(1, new bys<>(e, 2, 4, 3.5714288F, $$0x -> awv.kq, axk.bT, 0.5F, cjj::a))),
         ImmutableSet.of(Pair.of(cfb.O, cfc.b), Pair.of(cfb.r, cfc.b), Pair.of(cfb.S, cfc.b), Pair.of(cfb.X, cfc.b))
      );
   }

   private static void g(bwz<cji> $$0) {
      $$0.a(crf.s, 0, ImmutableList.of(caf.a(), new cjk(awv.ks, awv.kn)), cfb.o);
   }

   private static <E extends bvz> boolean a(E $$0, jh $$1) {
      dgz $$2 = $$0.dW();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dxo $$4 = $$2.a_($$1);
         dxo $$5 = $$2.a_($$3);
         if (!$$4.a(axk.bT) && !$$5.a(axk.bT)) {
            euj $$6 = new euj($$0.dW(), $$0);
            euh $$7 = eum.a($$6, $$1.k());
            euh $$8 = eum.a($$6, $$3.k());
            return $$7 != euh.e && (!$$4.l() || $$8 != euh.e) ? byt.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cji $$0) {
      return !bxs.a($$0);
   }

   public static void a(cji $$0) {
      $$0.ec().a(ImmutableList.of(crf.s, crf.u, crf.q, crf.t, crf.b));
   }

   public static Predicate<cxg> a() {
      return $$0 -> $$0.a(axt.aq);
   }
}
