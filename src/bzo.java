import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzo {
   public static final int a = 20;
   public static final int b = 7;
   private static final bjg i = bjg.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bjg p = bjg.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bjg q = bjg.a(600, 6000);
   private static final bjg r = bjg.a(100, 300);
   private static final bwt s = bwt.a().a($$0 -> !$$0.ai().equals(blt.V) && $$0.dM().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bzn $$0, aup $$1) {
      $$0.dO().a(bvh.R, p.a($$1));
      $$0.dO().a(bvh.U, q.a($$1));
   }

   protected static bnf<?> a(bnf<bzn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<bzn> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), new bnr(2.0F), new bpc(45, 90), new bpg(), new boc(bvh.O), new boc(bvh.R), new boc(bvh.U)));
   }

   private static void c(bnf<bzn> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(0, new bnq(blt.V, 1.0F)),
            Pair.of(1, new boj($$0x -> 1.25F)),
            Pair.of(2, bnt.a(i, 1.25F)),
            Pair.of(3, new bpt(ImmutableList.of(Pair.of(bpo.a(1.0F), 2), Pair.of(bqd.a(1.0F, 3), 2), Pair.of(new bog(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bvh.V, bvi.b), Pair.of(bvh.S, bvi.b))
      );
   }

   private static void d(bnf<bzn> $$0) {
      $$0.a(
         cgn.q,
         ImmutableList.of(Pair.of(0, new box(p, arm.kz)), Pair.of(1, new boz<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? arm.ku : arm.kk))),
         ImmutableSet.of(Pair.of(bvh.N, bvi.b), Pair.of(bvh.r, bvi.b), Pair.of(bvh.m, bvi.b), Pair.of(bvh.R, bvi.b))
      );
   }

   private static void e(bnf<bzn> $$0) {
      $$0.a(
         cgn.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bpm(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? arm.kx : arm.kn, $$0x -> $$0x.go() ? arm.ky : arm.ko
               )
            ),
            Pair.of(1, new bpl<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? arm.kw : arm.km))
         ),
         ImmutableSet.of(Pair.of(bvh.N, bvi.b), Pair.of(bvh.r, bvi.b), Pair.of(bvh.U, bvi.b))
      );
   }

   public static void a(bzn $$0) {
      $$0.dO().a(ImmutableList.of(cgn.r, cgn.q, cgn.b));
   }

   public static cps a() {
      return cps.a(cmu.pt);
   }
}
