import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciy {
   public static final int a = 20;
   public static final int b = 7;
   private static final bru i = bru.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bru o = bru.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bru p = bru.a(600, 6000);
   private static final bru q = bru.a(100, 300);
   private static final cfx r = cfx.a().a(($$0, $$1) -> !$$0.aq().equals(bur.ah) && (!$$1.O().b(dgd.c) || !$$0.aq().equals(bur.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cix $$0, azh $$1) {
      $$0.eb().a(cek.S, o.a($$1));
      $$0.eb().a(cek.V, p.a($$1));
   }

   protected static bwi<?> a(bwi<cix> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cix> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new bwu(2.0F), new byf(45, 90), new byj(), new bxf(cek.P), new bxf(cek.S), new bxf(cek.V)));
   }

   private static void c(bwi<cix> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(0, new bwt(bur.ah)),
            Pair.of(1, new bxm($$0x -> 1.25F)),
            Pair.of(2, bww.a(i, 1.25F)),
            Pair.of(3, new byw(ImmutableList.of(Pair.of(byr.a(1.0F), 2), Pair.of(bzg.a(1.0F, 3), 2), Pair.of(new bxj(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cek.W, cel.b), Pair.of(cek.T, cel.b))
      );
   }

   private static void d(bwi<cix> $$0) {
      $$0.a(
         cqn.q,
         ImmutableList.of(Pair.of(0, new bya(o, awa.lB)), Pair.of(1, new byc<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gE() ? awa.lx : awa.lo))),
         ImmutableSet.of(Pair.of(cek.O, cel.b), Pair.of(cek.r, cel.b), Pair.of(cek.m, cel.b), Pair.of(cek.S, cel.b))
      );
   }

   private static void e(bwi<cix> $$0) {
      $$0.a(
         cqn.r,
         ImmutableList.of(
            Pair.of(0, new byp($$0x -> $$0x.gE() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gE() ? awa.lA : awa.lr, $$0x -> awa.ls)),
            Pair.of(1, new byo<>($$0x -> $$0x.gE() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gE() ? awa.lz : awa.lq))
         ),
         ImmutableSet.of(Pair.of(cek.O, cel.b), Pair.of(cek.r, cel.b), Pair.of(cek.V, cel.b))
      );
   }

   public static void a(cix $$0) {
      $$0.eb().a(ImmutableList.of(cqn.r, cqn.q, cqn.b));
   }

   public static Predicate<cwo> a() {
      return $$0 -> $$0.a(awy.ae);
   }
}
