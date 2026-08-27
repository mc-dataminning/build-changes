import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbs {
   public static final int a = 20;
   public static final int b = 7;
   private static final blf i = blf.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final blf o = blf.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final blf p = blf.a(600, 6000);
   private static final blf q = blf.a(100, 300);
   private static final byu r = byu.a().a($$0 -> !$$0.ai().equals(bnu.W) && $$0.dM().D_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cbr $$0, awo $$1) {
      $$0.dO().a(bxh.S, o.a($$1));
      $$0.dO().a(bxh.V, p.a($$1));
   }

   protected static bpf<?> a(bpf<cbr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cbr> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new bpr(2.0F), new brc(45, 90), new brg(), new bqc(bxh.P), new bqc(bxh.S), new bqc(bxh.V)));
   }

   private static void c(bpf<cbr> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(0, new bpq(bnu.W)),
            Pair.of(1, new bqj($$0x -> 1.25F)),
            Pair.of(2, bpt.a(i, 1.25F)),
            Pair.of(3, new brt(ImmutableList.of(Pair.of(bro.a(1.0F), 2), Pair.of(bsd.a(1.0F, 3), 2), Pair.of(new bqg(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bxh.W, bxi.b), Pair.of(bxh.T, bxi.b))
      );
   }

   private static void d(bpf<cbr> $$0) {
      $$0.a(
         ciu.q,
         ImmutableList.of(Pair.of(0, new bqx(o, atk.kO)), Pair.of(1, new bqz<>(o, 5, 5, 1.5F, $$0x -> $$0x.gq() ? atk.kJ : atk.kz))),
         ImmutableSet.of(Pair.of(bxh.O, bxi.b), Pair.of(bxh.r, bxi.b), Pair.of(bxh.m, bxi.b), Pair.of(bxh.S, bxi.b))
      );
   }

   private static void e(bpf<cbr> $$0) {
      $$0.a(
         ciu.r,
         ImmutableList.of(
            Pair.of(
               0,
               new brm(
                  $$0x -> $$0x.gq() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gq() ? atk.kM : atk.kC, $$0x -> $$0x.gq() ? atk.kN : atk.kD
               )
            ),
            Pair.of(1, new brl<>($$0x -> $$0x.gq() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gq() ? atk.kL : atk.kB))
         ),
         ImmutableSet.of(Pair.of(bxh.O, bxi.b), Pair.of(bxh.r, bxi.b), Pair.of(bxh.V, bxi.b))
      );
   }

   public static void a(cbr $$0) {
      $$0.dO().a(ImmutableList.of(ciu.r, ciu.q, ciu.b));
   }

   public static cry a() {
      return cry.a(cpc.pv);
   }
}
