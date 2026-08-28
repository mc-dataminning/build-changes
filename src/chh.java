import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chh {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqg i = bqg.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqg o = bqg.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqg p = bqg.a(600, 6000);
   private static final bqg q = bqg.a(100, 300);
   private static final ceh r = ceh.a().a($$0 -> !$$0.ak().equals(btb.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chg $$0, azh $$1) {
      $$0.dS().a(ccu.S, o.a($$1));
      $$0.dS().a(ccu.V, p.a($$1));
   }

   protected static bus<?> a(bus<chg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<chg> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new bve(2.0F), new bwp(45, 90), new bwt(), new bvp(ccu.P), new bvp(ccu.S), new bvp(ccu.V)));
   }

   private static void c(bus<chg> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(0, new bvd(btb.X)),
            Pair.of(1, new bvw($$0x -> 1.25F)),
            Pair.of(2, bvg.a(i, 1.25F)),
            Pair.of(3, new bxg(ImmutableList.of(Pair.of(bxb.a(1.0F), 2), Pair.of(bxq.a(1.0F, 3), 2), Pair.of(new bvt(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccu.W, ccv.b), Pair.of(ccu.T, ccv.b))
      );
   }

   private static void d(bus<chg> $$0) {
      $$0.a(
         coo.q,
         ImmutableList.of(Pair.of(0, new bwk(o, awa.ld)), Pair.of(1, new bwm<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awa.kY : awa.kO))),
         ImmutableSet.of(Pair.of(ccu.O, ccv.b), Pair.of(ccu.r, ccv.b), Pair.of(ccu.m, ccv.b), Pair.of(ccu.S, ccv.b))
      );
   }

   private static void e(bus<chg> $$0) {
      $$0.a(
         coo.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwz(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awa.lb : awa.kR, $$0x -> $$0x.gA() ? awa.lc : awa.kS
               )
            ),
            Pair.of(1, new bwy<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awa.la : awa.kQ))
         ),
         ImmutableSet.of(Pair.of(ccu.O, ccv.b), Pair.of(ccu.r, ccv.b), Pair.of(ccu.V, ccv.b))
      );
   }

   public static void a(chg $$0) {
      $$0.dS().a(ImmutableList.of(coo.r, coo.q, coo.b));
   }

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awy.ab);
   }
}
