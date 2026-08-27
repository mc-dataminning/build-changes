import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgf {
   public static final int a = 20;
   public static final int b = 7;
   private static final bpf i = bpf.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bpf o = bpf.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bpf p = bpf.a(600, 6000);
   private static final bpf q = bpf.a(100, 300);
   private static final cdf r = cdf.a().a($$0 -> !$$0.ak().equals(bsa.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cge $$0, ayk $$1) {
      $$0.dS().a(cbs.S, o.a($$1));
      $$0.dS().a(cbs.V, p.a($$1));
   }

   protected static btq<?> a(btq<cge> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cge> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new buc(2.0F), new bvn(45, 90), new bvr(), new bun(cbs.P), new bun(cbs.S), new bun(cbs.V)));
   }

   private static void c(btq<cge> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(0, new bub(bsa.X)),
            Pair.of(1, new buu($$0x -> 1.25F)),
            Pair.of(2, bue.a(i, 1.25F)),
            Pair.of(3, new bwe(ImmutableList.of(Pair.of(bvz.a(1.0F), 2), Pair.of(bwo.a(1.0F, 3), 2), Pair.of(new bur(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cbs.W, cbt.b), Pair.of(cbs.T, cbt.b))
      );
   }

   private static void d(btq<cge> $$0) {
      $$0.a(
         cnl.q,
         ImmutableList.of(Pair.of(0, new bvi(o, avh.ld)), Pair.of(1, new bvk<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gz() ? avh.kY : avh.kO))),
         ImmutableSet.of(Pair.of(cbs.O, cbt.b), Pair.of(cbs.r, cbt.b), Pair.of(cbs.m, cbt.b), Pair.of(cbs.S, cbt.b))
      );
   }

   private static void e(btq<cge> $$0) {
      $$0.a(
         cnl.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bvx(
                  $$0x -> $$0x.gz() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gz() ? avh.lb : avh.kR, $$0x -> $$0x.gz() ? avh.lc : avh.kS
               )
            ),
            Pair.of(1, new bvw<>($$0x -> $$0x.gz() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gz() ? avh.la : avh.kQ))
         ),
         ImmutableSet.of(Pair.of(cbs.O, cbt.b), Pair.of(cbs.r, cbt.b), Pair.of(cbs.V, cbt.b))
      );
   }

   public static void a(cge $$0) {
      $$0.dS().a(ImmutableList.of(cnl.r, cnl.q, cnl.b));
   }

   public static Predicate<cto> a() {
      return $$0 -> $$0.a(awe.ab);
   }
}
