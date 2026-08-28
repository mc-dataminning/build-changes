import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chg {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqf i = bqf.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqf o = bqf.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqf p = bqf.a(600, 6000);
   private static final bqf q = bqf.a(100, 300);
   private static final ceg r = ceg.a().a($$0 -> !$$0.ak().equals(bta.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chf $$0, azh $$1) {
      $$0.dS().a(cct.S, o.a($$1));
      $$0.dS().a(cct.V, p.a($$1));
   }

   protected static bur<?> a(bur<chf> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<chf> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new bvd(2.0F), new bwo(45, 90), new bws(), new bvo(cct.P), new bvo(cct.S), new bvo(cct.V)));
   }

   private static void c(bur<chf> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(0, new bvc(bta.X)),
            Pair.of(1, new bvv($$0x -> 1.25F)),
            Pair.of(2, bvf.a(i, 1.25F)),
            Pair.of(3, new bxf(ImmutableList.of(Pair.of(bxa.a(1.0F), 2), Pair.of(bxp.a(1.0F, 3), 2), Pair.of(new bvs(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cct.W, ccu.b), Pair.of(cct.T, ccu.b))
      );
   }

   private static void d(bur<chf> $$0) {
      $$0.a(
         com.q,
         ImmutableList.of(Pair.of(0, new bwj(o, awa.ld)), Pair.of(1, new bwl<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awa.kY : awa.kO))),
         ImmutableSet.of(Pair.of(cct.O, ccu.b), Pair.of(cct.r, ccu.b), Pair.of(cct.m, ccu.b), Pair.of(cct.S, ccu.b))
      );
   }

   private static void e(bur<chf> $$0) {
      $$0.a(
         com.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwy(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awa.lb : awa.kR, $$0x -> $$0x.gA() ? awa.lc : awa.kS
               )
            ),
            Pair.of(1, new bwx<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awa.la : awa.kQ))
         ),
         ImmutableSet.of(Pair.of(cct.O, ccu.b), Pair.of(cct.r, ccu.b), Pair.of(cct.V, ccu.b))
      );
   }

   public static void a(chf $$0) {
      $$0.dS().a(ImmutableList.of(com.r, com.q, com.b));
   }

   public static Predicate<cup> a() {
      return $$0 -> $$0.a(awy.ab);
   }
}
