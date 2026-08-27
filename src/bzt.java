import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzt {
   public static final int a = 20;
   public static final int b = 7;
   private static final bjl i = bjl.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bjl p = bjl.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bjl q = bjl.a(600, 6000);
   private static final bjl r = bjl.a(100, 300);
   private static final bwy s = bwy.a().a($$0 -> !$$0.ai().equals(bly.V) && $$0.dM().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bzs $$0, auu $$1) {
      $$0.dO().a(bvm.R, p.a($$1));
      $$0.dO().a(bvm.U, q.a($$1));
   }

   protected static bnk<?> a(bnk<bzs> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bzs> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), new bnw(2.0F), new bph(45, 90), new bpl(), new boh(bvm.O), new boh(bvm.R), new boh(bvm.U)));
   }

   private static void c(bnk<bzs> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(0, new bnv(bly.V, 1.0F)),
            Pair.of(1, new boo($$0x -> 1.25F)),
            Pair.of(2, bny.a(i, 1.25F)),
            Pair.of(3, new bpy(ImmutableList.of(Pair.of(bpt.a(1.0F), 2), Pair.of(bqi.a(1.0F, 3), 2), Pair.of(new bol(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bvm.V, bvn.b), Pair.of(bvm.S, bvn.b))
      );
   }

   private static void d(bnk<bzs> $$0) {
      $$0.a(
         cgt.q,
         ImmutableList.of(Pair.of(0, new bpc(p, arr.kz)), Pair.of(1, new bpe<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? arr.ku : arr.kk))),
         ImmutableSet.of(Pair.of(bvm.N, bvn.b), Pair.of(bvm.r, bvn.b), Pair.of(bvm.m, bvn.b), Pair.of(bvm.R, bvn.b))
      );
   }

   private static void e(bnk<bzs> $$0) {
      $$0.a(
         cgt.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bpr(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? arr.kx : arr.kn, $$0x -> $$0x.go() ? arr.ky : arr.ko
               )
            ),
            Pair.of(1, new bpq<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? arr.kw : arr.km))
         ),
         ImmutableSet.of(Pair.of(bvm.N, bvn.b), Pair.of(bvm.r, bvn.b), Pair.of(bvm.U, bvn.b))
      );
   }

   public static void a(bzs $$0) {
      $$0.dO().a(ImmutableList.of(cgt.r, cgt.q, cgt.b));
   }

   public static cpy a() {
      return cpy.a(cna.pt);
   }
}
