import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cir {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brt e = brt.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ciq $$0, azg $$1) {
      $$0.ec().a(cej.S, e.a($$1));
   }

   protected static bwh<?> a(bwh<ciq> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<ciq> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bwt(2.0F), new bye(45, 90), new byi(), new bxe(cej.P), new bxe(cej.S)));
   }

   private static void c(bwh<ciq> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(0, new bws(buq.ab)),
            Pair.of(1, new bxl($$0x -> 1.25F)),
            Pair.of(2, bzk.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cej.B))),
            Pair.of(3, bzv.a(6, 1.0F)),
            Pair.of(
               4,
               new byv(
                  ImmutableMap.of(cej.m, cek.b),
                  ImmutableList.of(Pair.of(byq.a(1.0F), 1), Pair.of(bzf.a(1.0F, 3), 1), Pair.of(new bxf(), 3), Pair.of(cal.a(buj::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cej.T, cek.b), Pair.of(cej.X, cek.b))
      );
   }

   private static void d(bwh<ciq> $$0) {
      $$0.a(
         cqm.t,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(1, new bxl($$0x -> 1.25F)),
            Pair.of(2, bzk.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cej.B))),
            Pair.of(3, bzv.a(8, 1.5F)),
            Pair.of(
               5,
               new bxm(
                  ImmutableMap.of(cej.m, cek.b),
                  ImmutableSet.of(),
                  bxm.a.a,
                  bxm.b.b,
                  ImmutableList.of(Pair.of(byq.c(0.75F), 1), Pair.of(byq.a(1.0F, true), 1), Pair.of(bzf.a(1.0F, 3), 1), Pair.of(cal.a(buj::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cej.T, cek.b), Pair.of(cej.X, cek.a))
      );
   }

   private static void e(bwh<ciq> $$0) {
      $$0.a(
         cqm.u,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(1, bzk.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cej.B))),
            Pair.of(2, bzw.a(8, 1.0F)),
            Pair.of(3, bzy.a(djm.tP)),
            Pair.of(4, new byv(ImmutableList.of(Pair.of(byq.a(1.0F), 2), Pair.of(bzf.a(1.0F, 3), 1), Pair.of(new bxf(), 2), Pair.of(cal.a(buj::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cej.T, cek.b), Pair.of(cej.Y, cek.a))
      );
   }

   private static void f(bwh<ciq> $$0) {
      $$0.a(
         cqm.q,
         ImmutableList.of(Pair.of(0, new bxz(e, avz.kr)), Pair.of(1, new bya<>(e, 2, 4, 3.5714288F, $$0x -> avz.kq, awo.bT, 0.5F, cir::a))),
         ImmutableSet.of(Pair.of(cej.O, cek.b), Pair.of(cej.r, cek.b), Pair.of(cej.S, cek.b), Pair.of(cej.X, cek.b))
      );
   }

   private static void g(bwh<ciq> $$0) {
      $$0.a(cqm.s, 0, ImmutableList.of(bzn.a(), new cis(avz.ks, avz.kn)), cej.o);
   }

   private static <E extends bvh> boolean a(E $$0, ji $$1) {
      dgg $$2 = $$0.dW();
      ji $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dwv $$4 = $$2.a_($$1);
         dwv $$5 = $$2.a_($$3);
         if (!$$4.a(awo.bT) && !$$5.a(awo.bT)) {
            etq $$6 = new etq($$0.dW(), $$0);
            eto $$7 = ett.a($$6, $$1.k());
            eto $$8 = ett.a($$6, $$3.k());
            return $$7 != eto.e && (!$$4.l() || $$8 != eto.e) ? byb.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ciq $$0) {
      return !bxa.a($$0);
   }

   public static void a(ciq $$0) {
      $$0.ec().a(ImmutableList.of(cqm.s, cqm.u, cqm.q, cqm.t, cqm.b));
   }

   public static Predicate<cwn> a() {
      return $$0 -> $$0.a(awx.ao);
   }
}
