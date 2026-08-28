import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cku {
   public static final int a = 20;
   public static final int b = 7;
   private static final btj i = btj.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final btj o = btj.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final btj p = btj.a(600, 6000);
   private static final btj q = btj.a(100, 300);
   private static final cho r = cho.a().a(($$0, $$1) -> !$$0.aq().equals(bwj.ah) && (!$$1.O().c(dil.c) || !$$0.aq().equals(bwj.f)) && $$1.A_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ckt $$0, azt $$1) {
      $$0.eb().a(cgb.T, o.a($$1));
      $$0.eb().a(cgb.W, p.a($$1));
   }

   protected static bxz<?> a(bxz<ckt> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<ckt> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new byl(2.0F), new bzw(45, 90), new caa(), new byw(cgb.Q), new byw(cgb.T), new byw(cgb.W)));
   }

   private static void c(bxz<ckt> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(0, new byk(bwj.ah)),
            Pair.of(1, new bzd($$0x -> 1.25F)),
            Pair.of(2, byn.a(i, 1.25F)),
            Pair.of(3, new can(ImmutableList.of(Pair.of(cai.a(1.0F), 2), Pair.of(cax.a(1.0F, 3), 2), Pair.of(new bza(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cgb.X, cgc.b), Pair.of(cgb.U, cgc.b))
      );
   }

   private static void d(bxz<ckt> $$0) {
      $$0.a(
         csl.q,
         ImmutableList.of(Pair.of(0, new bzr(o, awl.lB)), Pair.of(1, new bzt<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gC() ? awl.lx : awl.lo))),
         ImmutableSet.of(Pair.of(cgb.P, cgc.b), Pair.of(cgb.s, cgc.b), Pair.of(cgb.n, cgc.b), Pair.of(cgb.T, cgc.b))
      );
   }

   private static void e(bxz<ckt> $$0) {
      $$0.a(
         csl.r,
         ImmutableList.of(
            Pair.of(0, new cag($$0x -> $$0x.gC() ? q : p, r, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.gC() ? awl.lA : awl.lr, $$0x -> awl.ls)),
            Pair.of(1, new caf<>($$0x -> $$0x.gC() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gC() ? awl.lz : awl.lq))
         ),
         ImmutableSet.of(Pair.of(cgb.P, cgc.b), Pair.of(cgb.s, cgc.b), Pair.of(cgb.W, cgc.b))
      );
   }

   public static void a(ckt $$0) {
      $$0.eb().a(ImmutableList.of(csl.r, csl.q, csl.b));
   }

   public static Predicate<cys> a() {
      return $$0 -> $$0.a(axi.ae);
   }
}
