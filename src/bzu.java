import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzu {
   public static final int a = 20;
   public static final int b = 7;
   private static final bjm i = bjm.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bjm p = bjm.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bjm q = bjm.a(600, 6000);
   private static final bjm r = bjm.a(100, 300);
   private static final bwz s = bwz.a().a($$0 -> !$$0.ai().equals(blz.V) && $$0.dM().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bzt $$0, auv $$1) {
      $$0.dO().a(bvn.R, p.a($$1));
      $$0.dO().a(bvn.U, q.a($$1));
   }

   protected static bnl<?> a(bnl<bzt> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzt> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), new bnx(2.0F), new bpi(45, 90), new bpm(), new boi(bvn.O), new boi(bvn.R), new boi(bvn.U)));
   }

   private static void c(bnl<bzt> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(0, new bnw(blz.V, 1.0F)),
            Pair.of(1, new bop($$0x -> 1.25F)),
            Pair.of(2, bnz.a(i, 1.25F)),
            Pair.of(3, new bpz(ImmutableList.of(Pair.of(bpu.a(1.0F), 2), Pair.of(bqj.a(1.0F, 3), 2), Pair.of(new bom(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bvn.V, bvo.b), Pair.of(bvn.S, bvo.b))
      );
   }

   private static void d(bnl<bzt> $$0) {
      $$0.a(
         cgu.q,
         ImmutableList.of(Pair.of(0, new bpd(p, ars.kz)), Pair.of(1, new bpf<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? ars.ku : ars.kk))),
         ImmutableSet.of(Pair.of(bvn.N, bvo.b), Pair.of(bvn.r, bvo.b), Pair.of(bvn.m, bvo.b), Pair.of(bvn.R, bvo.b))
      );
   }

   private static void e(bnl<bzt> $$0) {
      $$0.a(
         cgu.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bps(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? ars.kx : ars.kn, $$0x -> $$0x.go() ? ars.ky : ars.ko
               )
            ),
            Pair.of(1, new bpr<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? ars.kw : ars.km))
         ),
         ImmutableSet.of(Pair.of(bvn.N, bvo.b), Pair.of(bvn.r, bvo.b), Pair.of(bvn.U, bvo.b))
      );
   }

   public static void a(bzt $$0) {
      $$0.dO().a(ImmutableList.of(cgu.r, cgu.q, cgu.b));
   }

   public static cpz a() {
      return cpz.a(cnb.pt);
   }
}
