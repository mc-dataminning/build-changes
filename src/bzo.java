import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzo {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bjm f = bjm.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bzn $$0, auv $$1) {
      $$0.dO().a(bvn.R, f.a($$1));
   }

   protected static bnl<?> a(bnl<bzn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzn> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bnx(2.0F), new bpi(45, 90), new bpm(), new boi(bvn.O), new boi(bvn.R)));
   }

   private static void c(bnl<bzn> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(0, new bnw(blz.P, 1.0F)),
            Pair.of(1, new bop($$0x -> 1.25F)),
            Pair.of(2, bqo.a(bzo::b, $$0x -> $$0x.dO().c(bvn.B))),
            Pair.of(3, bqz.a(6, 1.0F)),
            Pair.of(
               4,
               new bpz(
                  ImmutableMap.of(bvn.m, bvo.b),
                  ImmutableList.of(Pair.of(bpu.a(1.0F), 1), Pair.of(bqj.a(1.0F, 3), 1), Pair.of(new boj(), 3), Pair.of(brp.a(blv::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvn.S, bvo.b), Pair.of(bvn.W, bvo.b))
      );
   }

   private static void d(bnl<bzn> $$0) {
      $$0.a(
         cgu.t,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(1, new bop($$0x -> 1.25F)),
            Pair.of(2, bqo.a(bzo::b, $$0x -> $$0x.dO().c(bvn.B))),
            Pair.of(3, bqz.a(8, 1.5F)),
            Pair.of(
               5,
               new boq(
                  ImmutableMap.of(bvn.m, bvo.b),
                  ImmutableSet.of(),
                  boq.a.a,
                  boq.b.b,
                  ImmutableList.of(Pair.of(bpu.c(0.75F), 1), Pair.of(bpu.a(1.0F, true), 1), Pair.of(bqj.a(1.0F, 3), 1), Pair.of(brp.a(blv::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvn.S, bvo.b), Pair.of(bvn.W, bvo.a))
      );
   }

   private static void e(bnl<bzn> $$0) {
      $$0.a(
         cgu.u,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(1, bqo.a(bzo::b, $$0x -> $$0x.dO().c(bvn.B))),
            Pair.of(2, bra.a(8, 1.0F)),
            Pair.of(3, brc.a(cws.tn)),
            Pair.of(4, new bpz(ImmutableList.of(Pair.of(bpu.a(1.0F), 2), Pair.of(bqj.a(1.0F, 3), 1), Pair.of(new boj(), 2), Pair.of(brp.a(blv::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bvn.S, bvo.b), Pair.of(bvn.X, bvo.a))
      );
   }

   private static void f(bnl<bzn> $$0) {
      $$0.a(
         cgu.q,
         ImmutableList.of(Pair.of(0, new bpd(f, ars.jn)), Pair.of(1, new bpe<>(f, 2, 4, 1.5F, $$0x -> ars.jm, ash.bK, 0.5F, bzo::a))),
         ImmutableSet.of(Pair.of(bvn.N, bvo.b), Pair.of(bvn.r, bvo.b), Pair.of(bvn.R, bvo.b), Pair.of(bvn.W, bvo.b))
      );
   }

   private static void g(bnl<bzn> $$0) {
      $$0.a(cgu.s, 0, ImmutableList.of(bqr.a(), new bzp(ars.jo, ars.jj)), bvn.o);
   }

   private static <E extends bmn> boolean a(E $$0, hx $$1) {
      ctp $$2 = $$0.dM();
      hx $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         djh $$4 = $$2.a_($$1);
         djh $$5 = $$2.a_($$3);
         if (!$$4.a(ash.bK) && !$$5.a(ash.bK)) {
            efc $$6 = efl.a($$2, $$1.j());
            efc $$7 = efl.a($$2, $$3.j());
            return $$6 != efc.e && (!$$4.i() || $$7 != efc.e) ? bpf.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bzn $$0) {
      return !boe.a($$0);
   }

   public static void a(bzn $$0) {
      $$0.dO().a(ImmutableList.of(cgu.s, cgu.u, cgu.q, cgu.t, cgu.b));
   }

   public static cpz a() {
      return bzn.bT;
   }
}
