import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgs {
   public static final int a = 20;
   public static final int b = 7;
   private static final bpr i = bpr.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bpr o = bpr.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bpr p = bpr.a(600, 6000);
   private static final bpr q = bpr.a(100, 300);
   private static final cds r = cds.a().a($$0 -> !$$0.al().equals(bsm.X) && $$0.dQ().C_().a($$0.cL()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cgr $$0, ayo $$1) {
      $$0.dU().a(ccf.S, o.a($$1));
      $$0.dU().a(ccf.V, p.a($$1));
   }

   protected static bud<?> a(bud<cgr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cgr> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new bup(2.0F), new bwa(45, 90), new bwe(), new bva(ccf.P), new bva(ccf.S), new bva(ccf.V)));
   }

   private static void c(bud<cgr> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(0, new buo(bsm.X)),
            Pair.of(1, new bvh($$0x -> 1.25F)),
            Pair.of(2, bur.a(i, 1.25F)),
            Pair.of(3, new bwr(ImmutableList.of(Pair.of(bwm.a(1.0F), 2), Pair.of(bxb.a(1.0F, 3), 2), Pair.of(new bve(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccf.W, ccg.b), Pair.of(ccf.T, ccg.b))
      );
   }

   private static void d(bud<cgr> $$0) {
      $$0.a(
         cnz.q,
         ImmutableList.of(Pair.of(0, new bvv(o, avh.ld)), Pair.of(1, new bvx<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gy() ? avh.kY : avh.kO))),
         ImmutableSet.of(Pair.of(ccf.O, ccg.b), Pair.of(ccf.r, ccg.b), Pair.of(ccf.m, ccg.b), Pair.of(ccf.S, ccg.b))
      );
   }

   private static void e(bud<cgr> $$0) {
      $$0.a(
         cnz.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwk(
                  $$0x -> $$0x.gy() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gy() ? avh.lb : avh.kR, $$0x -> $$0x.gy() ? avh.lc : avh.kS
               )
            ),
            Pair.of(1, new bwj<>($$0x -> $$0x.gy() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gy() ? avh.la : avh.kQ))
         ),
         ImmutableSet.of(Pair.of(ccf.O, ccg.b), Pair.of(ccf.r, ccg.b), Pair.of(ccf.V, ccg.b))
      );
   }

   public static void a(cgr $$0) {
      $$0.dU().a(ImmutableList.of(cnz.r, cnz.q, cnz.b));
   }

   public static Predicate<cuc> a() {
      return $$0 -> $$0.a(awf.ab);
   }
}
