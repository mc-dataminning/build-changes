import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class che {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqd i = bqd.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqd o = bqd.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqd p = bqd.a(600, 6000);
   private static final bqd q = bqd.a(100, 300);
   private static final cee r = cee.a().a($$0 -> !$$0.ak().equals(bsy.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chd $$0, azf $$1) {
      $$0.dS().a(ccr.S, o.a($$1));
      $$0.dS().a(ccr.V, p.a($$1));
   }

   protected static bup<?> a(bup<chd> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<chd> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new bvb(2.0F), new bwm(45, 90), new bwq(), new bvm(ccr.P), new bvm(ccr.S), new bvm(ccr.V)));
   }

   private static void c(bup<chd> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(0, new bva(bsy.X)),
            Pair.of(1, new bvt($$0x -> 1.25F)),
            Pair.of(2, bvd.a(i, 1.25F)),
            Pair.of(3, new bxd(ImmutableList.of(Pair.of(bwy.a(1.0F), 2), Pair.of(bxn.a(1.0F, 3), 2), Pair.of(new bvq(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccr.W, ccs.b), Pair.of(ccr.T, ccs.b))
      );
   }

   private static void d(bup<chd> $$0) {
      $$0.a(
         cok.q,
         ImmutableList.of(Pair.of(0, new bwh(o, avz.ld)), Pair.of(1, new bwj<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? avz.kY : avz.kO))),
         ImmutableSet.of(Pair.of(ccr.O, ccs.b), Pair.of(ccr.r, ccs.b), Pair.of(ccr.m, ccs.b), Pair.of(ccr.S, ccs.b))
      );
   }

   private static void e(bup<chd> $$0) {
      $$0.a(
         cok.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bww(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? avz.lb : avz.kR, $$0x -> $$0x.gA() ? avz.lc : avz.kS
               )
            ),
            Pair.of(1, new bwv<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? avz.la : avz.kQ))
         ),
         ImmutableSet.of(Pair.of(ccr.O, ccs.b), Pair.of(ccr.r, ccs.b), Pair.of(ccr.V, ccs.b))
      );
   }

   public static void a(chd $$0) {
      $$0.dS().a(ImmutableList.of(cok.r, cok.q, cok.b));
   }

   public static Predicate<cun> a() {
      return $$0 -> $$0.a(awx.ab);
   }
}
