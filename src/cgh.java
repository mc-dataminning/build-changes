import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgh {
   public static final int a = 20;
   public static final int b = 7;
   private static final bph i = bph.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bph o = bph.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bph p = bph.a(600, 6000);
   private static final bph q = bph.a(100, 300);
   private static final cdh r = cdh.a().a($$0 -> !$$0.ak().equals(bsc.X) && $$0.dP().C_().a($$0.cK()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cgg $$0, aym $$1) {
      $$0.dS().a(cbu.S, o.a($$1));
      $$0.dS().a(cbu.V, p.a($$1));
   }

   protected static bts<?> a(bts<cgg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cgg> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new bue(2.0F), new bvp(45, 90), new bvt(), new bup(cbu.P), new bup(cbu.S), new bup(cbu.V)));
   }

   private static void c(bts<cgg> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(0, new bud(bsc.X)),
            Pair.of(1, new buw($$0x -> 1.25F)),
            Pair.of(2, bug.a(i, 1.25F)),
            Pair.of(3, new bwg(ImmutableList.of(Pair.of(bwb.a(1.0F), 2), Pair.of(bwq.a(1.0F, 3), 2), Pair.of(new but(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cbu.W, cbv.b), Pair.of(cbu.T, cbv.b))
      );
   }

   private static void d(bts<cgg> $$0) {
      $$0.a(
         cnn.q,
         ImmutableList.of(Pair.of(0, new bvk(o, avi.ld)), Pair.of(1, new bvm<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gz() ? avi.kY : avi.kO))),
         ImmutableSet.of(Pair.of(cbu.O, cbv.b), Pair.of(cbu.r, cbv.b), Pair.of(cbu.m, cbv.b), Pair.of(cbu.S, cbv.b))
      );
   }

   private static void e(bts<cgg> $$0) {
      $$0.a(
         cnn.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bvz(
                  $$0x -> $$0x.gz() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gz() ? avi.lb : avi.kR, $$0x -> $$0x.gz() ? avi.lc : avi.kS
               )
            ),
            Pair.of(1, new bvy<>($$0x -> $$0x.gz() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gz() ? avi.la : avi.kQ))
         ),
         ImmutableSet.of(Pair.of(cbu.O, cbv.b), Pair.of(cbu.r, cbv.b), Pair.of(cbu.V, cbv.b))
      );
   }

   public static void a(cgg $$0) {
      $$0.dS().a(ImmutableList.of(cnn.r, cnn.q, cnn.b));
   }

   public static Predicate<ctq> a() {
      return $$0 -> $$0.a(awf.ab);
   }
}
