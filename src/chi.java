import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chi {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqh i = bqh.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqh o = bqh.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqh p = bqh.a(600, 6000);
   private static final bqh q = bqh.a(100, 300);
   private static final cei r = cei.a().a($$0 -> !$$0.ak().equals(btc.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chh $$0, azh $$1) {
      $$0.dS().a(ccv.S, o.a($$1));
      $$0.dS().a(ccv.V, p.a($$1));
   }

   protected static but<?> a(but<chh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<chh> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new bvf(2.0F), new bwq(45, 90), new bwu(), new bvq(ccv.P), new bvq(ccv.S), new bvq(ccv.V)));
   }

   private static void c(but<chh> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(0, new bve(btc.X)),
            Pair.of(1, new bvx($$0x -> 1.25F)),
            Pair.of(2, bvh.a(i, 1.25F)),
            Pair.of(3, new bxh(ImmutableList.of(Pair.of(bxc.a(1.0F), 2), Pair.of(bxr.a(1.0F, 3), 2), Pair.of(new bvu(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccv.W, ccw.b), Pair.of(ccv.T, ccw.b))
      );
   }

   private static void d(but<chh> $$0) {
      $$0.a(
         cop.q,
         ImmutableList.of(Pair.of(0, new bwl(o, awa.ld)), Pair.of(1, new bwn<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awa.kY : awa.kO))),
         ImmutableSet.of(Pair.of(ccv.O, ccw.b), Pair.of(ccv.r, ccw.b), Pair.of(ccv.m, ccw.b), Pair.of(ccv.S, ccw.b))
      );
   }

   private static void e(but<chh> $$0) {
      $$0.a(
         cop.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bxa(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awa.lb : awa.kR, $$0x -> $$0x.gA() ? awa.lc : awa.kS
               )
            ),
            Pair.of(1, new bwz<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awa.la : awa.kQ))
         ),
         ImmutableSet.of(Pair.of(ccv.O, ccw.b), Pair.of(ccv.r, ccw.b), Pair.of(ccv.V, ccw.b))
      );
   }

   public static void a(chh $$0) {
      $$0.dS().a(ImmutableList.of(cop.r, cop.q, cop.b));
   }

   public static Predicate<cur> a() {
      return $$0 -> $$0.a(awy.ab);
   }
}
