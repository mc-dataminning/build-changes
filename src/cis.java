import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cis {
   public static final int a = 20;
   public static final int b = 7;
   private static final bro i = bro.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bro o = bro.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bro p = bro.a(600, 6000);
   private static final bro q = bro.a(100, 300);
   private static final cfr r = cfr.a().a($$0 -> !$$0.ar().equals(bul.X) && ($$0.dX().ac().b(dex.c) || !$$0.ar().equals(bul.d)) && $$0.dX().C_().a($$0.cS()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cir $$0, azs $$1) {
      $$0.ed().a(cee.S, o.a($$1));
      $$0.ed().a(cee.V, p.a($$1));
   }

   protected static bwc<?> a(bwc<cir> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cir> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new bwo(2.0F), new bxz(45, 90), new byd(), new bwz(cee.P), new bwz(cee.S), new bwz(cee.V)));
   }

   private static void c(bwc<cir> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(0, new bwn(bul.X)),
            Pair.of(1, new bxg($$0x -> 1.25F)),
            Pair.of(2, bwq.a(i, 1.25F)),
            Pair.of(3, new byq(ImmutableList.of(Pair.of(byl.a(1.0F), 2), Pair.of(bza.a(1.0F, 3), 2), Pair.of(new bxd(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cee.W, cef.b), Pair.of(cee.T, cef.b))
      );
   }

   private static void d(bwc<cir> $$0) {
      $$0.a(
         cqe.q,
         ImmutableList.of(Pair.of(0, new bxu(o, awl.lc)), Pair.of(1, new bxw<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gG() ? awl.kY : awl.kP))),
         ImmutableSet.of(Pair.of(cee.O, cef.b), Pair.of(cee.r, cef.b), Pair.of(cee.m, cef.b), Pair.of(cee.S, cef.b))
      );
   }

   private static void e(bwc<cir> $$0) {
      $$0.a(
         cqe.r,
         ImmutableList.of(
            Pair.of(0, new byj($$0x -> $$0x.gG() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gG() ? awl.lb : awl.kS, $$0x -> awl.kT)),
            Pair.of(1, new byi<>($$0x -> $$0x.gG() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gG() ? awl.la : awl.kR))
         ),
         ImmutableSet.of(Pair.of(cee.O, cef.b), Pair.of(cee.r, cef.b), Pair.of(cee.V, cef.b))
      );
   }

   public static void a(cir $$0) {
      $$0.ed().a(ImmutableList.of(cqe.r, cqe.q, cqe.b));
   }

   public static Predicate<cwb> a() {
      return $$0 -> $$0.a(axj.ae);
   }
}
