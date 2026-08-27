import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbw {
   public static final int a = 20;
   public static final int b = 7;
   private static final blh i = blh.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final blh o = blh.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final blh p = blh.a(600, 6000);
   private static final blh q = blh.a(100, 300);
   private static final byy r = byy.a().a($$0 -> !$$0.ai().equals(bnw.W) && $$0.dM().D_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cbv $$0, awp $$1) {
      $$0.dO().a(bxl.S, o.a($$1));
      $$0.dO().a(bxl.V, p.a($$1));
   }

   protected static bpj<?> a(bpj<cbv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbv> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new bpv(2.0F), new brg(45, 90), new brk(), new bqg(bxl.P), new bqg(bxl.S), new bqg(bxl.V)));
   }

   private static void c(bpj<cbv> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(0, new bpu(bnw.W)),
            Pair.of(1, new bqn($$0x -> 1.25F)),
            Pair.of(2, bpx.a(i, 1.25F)),
            Pair.of(3, new brx(ImmutableList.of(Pair.of(brs.a(1.0F), 2), Pair.of(bsh.a(1.0F, 3), 2), Pair.of(new bqk(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bxl.W, bxm.b), Pair.of(bxl.T, bxm.b))
      );
   }

   private static void d(bpj<cbv> $$0) {
      $$0.a(
         ciy.q,
         ImmutableList.of(Pair.of(0, new brb(o, atl.kP)), Pair.of(1, new brd<>(o, 5, 5, 1.5F, $$0x -> $$0x.gq() ? atl.kK : atl.kA))),
         ImmutableSet.of(Pair.of(bxl.O, bxm.b), Pair.of(bxl.r, bxm.b), Pair.of(bxl.m, bxm.b), Pair.of(bxl.S, bxm.b))
      );
   }

   private static void e(bpj<cbv> $$0) {
      $$0.a(
         ciy.r,
         ImmutableList.of(
            Pair.of(
               0,
               new brq(
                  $$0x -> $$0x.gq() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gq() ? atl.kN : atl.kD, $$0x -> $$0x.gq() ? atl.kO : atl.kE
               )
            ),
            Pair.of(1, new brp<>($$0x -> $$0x.gq() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gq() ? atl.kM : atl.kC))
         ),
         ImmutableSet.of(Pair.of(bxl.O, bxm.b), Pair.of(bxl.r, bxm.b), Pair.of(bxl.V, bxm.b))
      );
   }

   public static void a(cbv $$0) {
      $$0.dO().a(ImmutableList.of(ciy.r, ciy.q, ciy.b));
   }

   public static csc a() {
      return csc.a(cpg.pv);
   }
}
