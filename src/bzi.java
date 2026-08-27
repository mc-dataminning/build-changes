import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzi {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bjg f = bjg.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bzh $$0, aup $$1) {
      $$0.dO().a(bvh.R, f.a($$1));
   }

   protected static bnf<?> a(bnf<bzh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<bzh> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bnr(2.0F), new bpc(45, 90), new bpg(), new boc(bvh.O), new boc(bvh.R)));
   }

   private static void c(bnf<bzh> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(0, new bnq(blt.P, 1.0F)),
            Pair.of(1, new boj($$0x -> 1.25F)),
            Pair.of(2, bqi.a(bzi::b, $$0x -> $$0x.dO().c(bvh.B))),
            Pair.of(3, bqt.a(6, 1.0F)),
            Pair.of(
               4,
               new bpt(
                  ImmutableMap.of(bvh.m, bvi.b),
                  ImmutableList.of(Pair.of(bpo.a(1.0F), 1), Pair.of(bqd.a(1.0F, 3), 1), Pair.of(new bod(), 3), Pair.of(brj.a(blp::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvh.S, bvi.b), Pair.of(bvh.W, bvi.b))
      );
   }

   private static void d(bnf<bzh> $$0) {
      $$0.a(
         cgn.t,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(1, new boj($$0x -> 1.25F)),
            Pair.of(2, bqi.a(bzi::b, $$0x -> $$0x.dO().c(bvh.B))),
            Pair.of(3, bqt.a(8, 1.5F)),
            Pair.of(
               5,
               new bok(
                  ImmutableMap.of(bvh.m, bvi.b),
                  ImmutableSet.of(),
                  bok.a.a,
                  bok.b.b,
                  ImmutableList.of(Pair.of(bpo.c(0.75F), 1), Pair.of(bpo.a(1.0F, true), 1), Pair.of(bqd.a(1.0F, 3), 1), Pair.of(brj.a(blp::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvh.S, bvi.b), Pair.of(bvh.W, bvi.a))
      );
   }

   private static void e(bnf<bzh> $$0) {
      $$0.a(
         cgn.u,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(1, bqi.a(bzi::b, $$0x -> $$0x.dO().c(bvh.B))),
            Pair.of(2, bqu.a(8, 1.0F)),
            Pair.of(3, bqw.a(cwl.tn)),
            Pair.of(4, new bpt(ImmutableList.of(Pair.of(bpo.a(1.0F), 2), Pair.of(bqd.a(1.0F, 3), 1), Pair.of(new bod(), 2), Pair.of(brj.a(blp::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bvh.S, bvi.b), Pair.of(bvh.X, bvi.a))
      );
   }

   private static void f(bnf<bzh> $$0) {
      $$0.a(
         cgn.q,
         ImmutableList.of(Pair.of(0, new box(f, arm.jn)), Pair.of(1, new boy<>(f, 2, 4, 1.5F, $$0x -> arm.jm, asb.bK, 0.5F, bzi::a))),
         ImmutableSet.of(Pair.of(bvh.N, bvi.b), Pair.of(bvh.r, bvi.b), Pair.of(bvh.R, bvi.b), Pair.of(bvh.W, bvi.b))
      );
   }

   private static void g(bnf<bzh> $$0) {
      $$0.a(cgn.s, 0, ImmutableList.of(bql.a(), new bzj(arm.jo, arm.jj)), bvh.o);
   }

   private static <E extends bmh> boolean a(E $$0, hx $$1) {
      cti $$2 = $$0.dM();
      hx $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dja $$4 = $$2.a_($$1);
         dja $$5 = $$2.a_($$3);
         if (!$$4.a(asb.bK) && !$$5.a(asb.bK)) {
            eev $$6 = efe.a($$2, $$1.j());
            eev $$7 = efe.a($$2, $$3.j());
            return $$6 != eev.e && (!$$4.i() || $$7 != eev.e) ? boz.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bzh $$0) {
      return !bny.a($$0);
   }

   public static void a(bzh $$0) {
      $$0.dO().a(ImmutableList.of(cgn.s, cgn.u, cgn.q, cgn.t, cgn.b));
   }

   public static cps a() {
      return bzh.bT;
   }
}
