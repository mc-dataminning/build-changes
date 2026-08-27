import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bjl f = bjl.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bzm $$0, auu $$1) {
      $$0.dO().a(bvm.R, f.a($$1));
   }

   protected static bnk<?> a(bnk<bzm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bzm> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bnw(2.0F), new bph(45, 90), new bpl(), new boh(bvm.O), new boh(bvm.R)));
   }

   private static void c(bnk<bzm> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(0, new bnv(bly.P, 1.0F)),
            Pair.of(1, new boo($$0x -> 1.25F)),
            Pair.of(2, bqn.a(bzn::b, $$0x -> $$0x.dO().c(bvm.B))),
            Pair.of(3, bqy.a(6, 1.0F)),
            Pair.of(
               4,
               new bpy(
                  ImmutableMap.of(bvm.m, bvn.b),
                  ImmutableList.of(Pair.of(bpt.a(1.0F), 1), Pair.of(bqi.a(1.0F, 3), 1), Pair.of(new boi(), 3), Pair.of(bro.a(blu::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvm.S, bvn.b), Pair.of(bvm.W, bvn.b))
      );
   }

   private static void d(bnk<bzm> $$0) {
      $$0.a(
         cgt.t,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(1, new boo($$0x -> 1.25F)),
            Pair.of(2, bqn.a(bzn::b, $$0x -> $$0x.dO().c(bvm.B))),
            Pair.of(3, bqy.a(8, 1.5F)),
            Pair.of(
               5,
               new bop(
                  ImmutableMap.of(bvm.m, bvn.b),
                  ImmutableSet.of(),
                  bop.a.a,
                  bop.b.b,
                  ImmutableList.of(Pair.of(bpt.c(0.75F), 1), Pair.of(bpt.a(1.0F, true), 1), Pair.of(bqi.a(1.0F, 3), 1), Pair.of(bro.a(blu::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvm.S, bvn.b), Pair.of(bvm.W, bvn.a))
      );
   }

   private static void e(bnk<bzm> $$0) {
      $$0.a(
         cgt.u,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(1, bqn.a(bzn::b, $$0x -> $$0x.dO().c(bvm.B))),
            Pair.of(2, bqz.a(8, 1.0F)),
            Pair.of(3, brb.a(cwr.tn)),
            Pair.of(4, new bpy(ImmutableList.of(Pair.of(bpt.a(1.0F), 2), Pair.of(bqi.a(1.0F, 3), 1), Pair.of(new boi(), 2), Pair.of(bro.a(blu::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bvm.S, bvn.b), Pair.of(bvm.X, bvn.a))
      );
   }

   private static void f(bnk<bzm> $$0) {
      $$0.a(
         cgt.q,
         ImmutableList.of(Pair.of(0, new bpc(f, arr.jn)), Pair.of(1, new bpd<>(f, 2, 4, 1.5F, $$0x -> arr.jm, asg.bK, 0.5F, bzn::a))),
         ImmutableSet.of(Pair.of(bvm.N, bvn.b), Pair.of(bvm.r, bvn.b), Pair.of(bvm.R, bvn.b), Pair.of(bvm.W, bvn.b))
      );
   }

   private static void g(bnk<bzm> $$0) {
      $$0.a(cgt.s, 0, ImmutableList.of(bqq.a(), new bzo(arr.jo, arr.jj)), bvm.o);
   }

   private static <E extends bmm> boolean a(E $$0, hx $$1) {
      cto $$2 = $$0.dM();
      hx $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         djg $$4 = $$2.a_($$1);
         djg $$5 = $$2.a_($$3);
         if (!$$4.a(asg.bK) && !$$5.a(asg.bK)) {
            efb $$6 = efk.a($$2, $$1.j());
            efb $$7 = efk.a($$2, $$3.j());
            return $$6 != efb.e && (!$$4.i() || $$7 != efb.e) ? bpe.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bzm $$0) {
      return !bod.a($$0);
   }

   public static void a(bzm $$0) {
      $$0.dO().a(ImmutableList.of(cgt.s, cgt.u, cgt.q, cgt.t, cgt.b));
   }

   public static cpy a() {
      return bzm.bT;
   }
}
