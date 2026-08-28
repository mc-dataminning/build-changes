import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chd {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqb i = bqb.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqb o = bqb.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqb p = bqb.a(600, 6000);
   private static final bqb q = bqb.a(100, 300);
   private static final ced r = ced.a().a($$0 -> !$$0.am().equals(bsw.X) && $$0.dQ().C_().a($$0.cL()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chc $$0, ayv $$1) {
      $$0.dU().a(ccq.S, o.a($$1));
      $$0.dU().a(ccq.V, p.a($$1));
   }

   protected static buo<?> a(buo<chc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<chc> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new bva(2.0F), new bwl(45, 90), new bwp(), new bvl(ccq.P), new bvl(ccq.S), new bvl(ccq.V)));
   }

   private static void c(buo<chc> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(0, new buz(bsw.X)),
            Pair.of(1, new bvs($$0x -> 1.25F)),
            Pair.of(2, bvc.a(i, 1.25F)),
            Pair.of(3, new bxc(ImmutableList.of(Pair.of(bwx.a(1.0F), 2), Pair.of(bxm.a(1.0F, 3), 2), Pair.of(new bvp(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(ccq.W, ccr.b), Pair.of(ccq.T, ccr.b))
      );
   }

   private static void d(buo<chc> $$0) {
      $$0.a(
         cok.q,
         ImmutableList.of(Pair.of(0, new bwg(o, avo.ld)), Pair.of(1, new bwi<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gw() ? avo.kY : avo.kO))),
         ImmutableSet.of(Pair.of(ccq.O, ccr.b), Pair.of(ccq.r, ccr.b), Pair.of(ccq.m, ccr.b), Pair.of(ccq.S, ccr.b))
      );
   }

   private static void e(buo<chc> $$0) {
      $$0.a(
         cok.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bwv(
                  $$0x -> $$0x.gw() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gw() ? avo.lb : avo.kR, $$0x -> $$0x.gw() ? avo.lc : avo.kS
               )
            ),
            Pair.of(1, new bwu<>($$0x -> $$0x.gw() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gw() ? avo.la : avo.kQ))
         ),
         ImmutableSet.of(Pair.of(ccq.O, ccr.b), Pair.of(ccq.r, ccr.b), Pair.of(ccq.V, ccr.b))
      );
   }

   public static void a(chc $$0) {
      $$0.dU().a(ImmutableList.of(cok.r, cok.q, cok.b));
   }

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awm.ab);
   }
}
